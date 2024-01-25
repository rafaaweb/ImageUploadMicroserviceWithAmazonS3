package br.com.microservice.ImageUploadMicroserviceWithAmazonS3;

import com.amazonaws.services.s3.model.Bucket;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Paths;

import static br.com.microservice.ImageUploadMicroserviceWithAmazonS3.Service.BucketServices.createBucket;
import static br.com.microservice.ImageUploadMicroserviceWithAmazonS3.Service.BucketServices.listOfBuckets;
import static br.com.microservice.ImageUploadMicroserviceWithAmazonS3.Service.ObjectServices.listObjects;
import static br.com.microservice.ImageUploadMicroserviceWithAmazonS3.Service.ObjectServices.uploadObject;

@SpringBootApplication
public class S3withspringApp {

	public static void main(String[] args){
		//bucket creation
		String bucket_name = "bucket_test";
		Bucket b = createBucket(bucket_name);
		System.out.println("Creating the bucket " + bucket_name+"\n");
		if (b == null)
			System.out.println("Erro ao criar o bucket!\n");
		else
			System.out.println("Done");

		listOfBuckets(); //list of buckets
		String imagePath = "index.jpeg";
		uploadObject(b.getName(),imagePath); //upload an image
		System.out.println(Paths.get(imagePath).getFileName().toString());


		listObjects(bucket_name);
	}

}
