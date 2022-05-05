package com.xyz.moviebooking.config.mongodb;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.xyz.moviebooking.repository")
@ComponentScan(basePackages = { "com.xyz.moviebooking.repository"})
public class MongoConfig extends AbstractMongoClientConfiguration {
    public static final String DB_NAME = "movie";
    public static final String MONGO_HOST = "127.0.0.1"; // check again
    public static final int MONGO_PORT = 27017;

    @Bean
    public com.mongodb.client.MongoClient  mongoDb(){
    	ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017/movie");
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
        return MongoClients.create(mongoClientSettings);
    }

	/*
	 * @Bean public MongoTemplate mongoTemplate() throws Exception { return new
	 * MongoTemplate(mongoDb()); }
	 */
	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return "test";
	}
}
