package com.lenora.sla_core;

import org.springframework.boot.SpringApplication;

public class TestSlaCoreApplication {

	public static void main(String[] args) {
		SpringApplication.from(SlaCoreApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
