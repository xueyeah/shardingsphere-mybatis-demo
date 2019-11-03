package com.ljxie.shardingmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.qianq.shardingmybatis.mapper")
@SpringBootApplication
public class ShardingMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShardingMybatisApplication.class, args);
	}

}
