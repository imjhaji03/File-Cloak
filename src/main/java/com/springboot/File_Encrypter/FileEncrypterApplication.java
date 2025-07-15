package com.springboot.File_Encrypter;

// This is the correct import statement based on your folder structure
import com.springboot.File_Encrypter.views.Welcome;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FileEncrypterApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FileEncrypterApplication.class, args);
	}

	// This 'run' method is the entry point for your console logic.
	@Override
	public void run(String... args) throws Exception {
		// 1. Create an instance of your Welcome class.
		Welcome welcomeView = new Welcome();

		// 2. Create an infinite loop.
		// This loop will only be stopped when the user presses '0' because your
		// Welcome.java class calls System.exit(0).
		while (true) {
			welcomeView.welcomeScreen();
		}
	}
}