package com.xyz.moviebooking.config.mongodb;

import com.mongodb.Mongo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.io.IOException;



//@Configuration
//@Profile({ "dev", "default" })
//@ComponentScan(basePackages = { "com.xyz.moviebooking.service" })
//@EnableMongoRepositories(basePackages = "com.xyz.moviebooking.repository")
public class EmbeddedDataSourceConfig {

//    @Bean(destroyMethod = "close")
//    public Mongo mongo() throws IOException {
//        return new EmbeddedMongoBuilder().build();
//    }
//
//    @Bean
//    public MongoTemplate mongoTemplate(Mongo mongo){
//        return new MongoTemplate(mongo, "blog");
//    }

}