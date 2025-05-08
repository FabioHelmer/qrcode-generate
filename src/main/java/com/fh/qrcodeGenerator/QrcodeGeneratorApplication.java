package com.fh.qrcodeGenerator;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition(
		info = @Info(
				title = "QR Code Generator API",
				version = "1.0",
				description = "API para geração de QR Codes"
		)
)
@SpringBootApplication
public class QrcodeGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(QrcodeGeneratorApplication.class, args);
	}

}
