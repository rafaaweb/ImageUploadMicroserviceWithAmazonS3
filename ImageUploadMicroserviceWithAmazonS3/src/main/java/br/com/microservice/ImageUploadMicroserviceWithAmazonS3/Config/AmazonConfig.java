package br.com.microservice.ImageUploadMicroserviceWithAmazonS3.Config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AmazonConfig {

    //Enter information to access the account
     private static final String ACCESS_KEY = "accesskey";
     private static final String SECRET_KEY = "secretkey";

     @Bean
    public static AmazonS3 s3WithCredentials(){
         AWSCredentials credentials = new BasicAWSCredentials(ACCESS_KEY, SECRET_KEY);
         return AmazonS3ClientBuilder
                 .standard()
                 .withRegion(Regions.SA_EAST_1)
                 .withCredentials(new AWSStaticCredentialsProvider(credentials))
                 .build();
     }
}
