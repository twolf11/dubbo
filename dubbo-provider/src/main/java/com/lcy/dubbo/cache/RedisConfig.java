package com.lcy.dubbo.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedisPool;

import java.util.ArrayList;

@Configuration
public class RedisConfig {

    private static final Logger logger = LoggerFactory.getLogger(RedisConfig.class);


    @Value("${spring.redis.database}")
    private Integer database;
    @Value("${spring.redis.host}")
    private String host;
    @Value("${spring.redis.port}")
    private Integer port;
    @Value("${spring.redis.password}")
    private String password;
    @Value("${spring.redis.ssl}")
    private boolean ssl;
    @Value("${spring.redis.timeout}")
    private Integer timeout;
    @Value("${spring.redis.jedis.pool.max-active}")
    private Integer maxActive;
    @Value("${spring.redis.jedis.pool.max-wait}")
    private Integer maxWait;
    @Value("${spring.redis.jedis.pool.max-idle}")
    private Integer maxIdel;
    @Value("${spring.redis.jedis.pool.min-idle}")
    private Integer minIdel;

    @Bean
    public ShardedJedisPool shardedJedisPool() {
        //配置连接池
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        // 最大建立连接等待时间
        jedisPoolConfig.setMaxWaitMillis(maxWait);
        // 逐出连接的最小空闲时间 默认1800000毫秒(30分钟)
        // jedisPoolConfig.setMinEvictableIdleTimeMillis(1800000);
        // 每次逐出检查时 逐出的最大数目 如果为负数就是 : 1/abs(n), 默认3
        jedisPoolConfig.setNumTestsPerEvictionRun(3);
        // 逐出扫描的时间间隔(毫秒) 如果为负数,则不运行逐出线程, 默认-1
        jedisPoolConfig.setTimeBetweenEvictionRunsMillis(-1);
        // 是否在从池中取出连接前进行检验,如果检验失败,则从池中去除连接并尝试取出另一个
        jedisPoolConfig.setTestOnBorrow(true);
        // 在空闲时检查有效性, 默认false
        jedisPoolConfig.setTestWhileIdle(false);
        //连接池最大连接数
        jedisPoolConfig.setMaxTotal(maxActive);
        //连接池中的最大空闲连接
        jedisPoolConfig.setMaxIdle(maxIdel);
        //连接池中的最小空闲连接
        jedisPoolConfig.setMinIdle(minIdel);
        ArrayList<JedisShardInfo> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            JedisShardInfo jedisShardInfo = new JedisShardInfo(host, port);
            //设置连接超时时间
            jedisShardInfo.setConnectionTimeout(timeout);
            //设置连接密码
            jedisShardInfo.setPassword(password);
            arrayList.add(jedisShardInfo);
        }
        ShardedJedisPool shardedJedisPool = new ShardedJedisPool(jedisPoolConfig, arrayList);
        logger.info("shardedJedisPool缓存池注入成功");
        return shardedJedisPool;
    }

}
