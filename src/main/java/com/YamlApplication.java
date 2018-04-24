/**
 * 
 */
package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.modul.ServerProperties;

/**
 * @author abhimanyu
 *
 */
@SpringBootApplication
public class YamlApplication implements CommandLineRunner {

	@Autowired
	private ServerProperties serverProperties;

	public void run(String... args) throws Exception {
		System.out.println(serverProperties.toString());
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(YamlApplication.class, args);
	}

}