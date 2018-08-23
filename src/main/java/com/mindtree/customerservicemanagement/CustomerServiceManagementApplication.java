package com.mindtree.customerservicemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@EnableCaching
@ComponentScan(basePackages = "com.mindtree.customerservicemanagement")
@SpringBootApplication
public class CustomerServiceManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceManagementApplication.class, args);

	}

}
