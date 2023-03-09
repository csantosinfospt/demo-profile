package com.example.profile.demoprofle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProfleApplication implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(DemoProfleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoProfleApplication.class, args);
	}

	@Value("${application.name}")
	private String applicationName;

	@Value("${user}")
	private String username;
	@Override
	public void run(String... args) throws Exception {
		log.info("Application name: {}, Username: {}", applicationName, username);
		for(int i=0; i<5; i++ ){
			try{
				if(i%2==0)
				{
					//This will create exception if number divisible by 0
					System.out.println(1/0);
				}
				else
				{
					System.out.println(i);
				}
			}
			catch(Exception e){
				System.out.println("Exception ocuured for index "+i+" and exception is "+e.getMessage());
			}
		}
	}
}
