package com.techprimers.security.securitydbexample;


import com.techprimers.security.securitydbexample.model.Role;
import com.techprimers.security.securitydbexample.model.User;
import com.techprimers.security.securitydbexample.repository.UsersRepository;
import com.techprimers.security.securitydbexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;
import java.util.TreeSet;

@SpringBootApplication
public class SecurityDbExampleApplication {



	public static void main(String[] args) {



		SpringApplication.run(SecurityDbExampleApplication.class, args);
	}
}
