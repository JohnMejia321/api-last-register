package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.CqlSessionFactoryBean;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories
public class CassandraConfig extends AbstractCassandraConfiguration {

    @Value("${spring.data.cassandra.contact-points}")
    private String contactPoint;

    private int port=9042;

    @Value("${spring.data.cassandra.keyspace-name}")
    private String keyspaceName;



    @Override
    protected String getKeyspaceName() {
        return keyspaceName;
    }

    @Override
    protected int getPort() {
        return port;
    }

    @Override
    protected String getContactPoints() {
        return contactPoint;
    }





    @Override
    public CqlSessionFactoryBean cassandraSession() {
        CqlSessionFactoryBean cqlSessionFactoryBean = super.cassandraSession();
        return cqlSessionFactoryBean;
    }




}



