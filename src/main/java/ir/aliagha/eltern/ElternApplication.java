package ir.aliagha.eltern;

import ir.aliagha.eltern.service.Process;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElternApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElternApplication.class, args);
		Process process = new Process();
		process.print();
	}
}
