package br.com.microservice.ImageUploadMicroserviceWithAmazonS3;

import com.amazonaws.services.s3.model.Bucket;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S3withspringApp {

	public static void main(String[] args) {

		String bucket_name = "create-bucket";
		Bucket b = createBucket(bucket_name);

	}

}
