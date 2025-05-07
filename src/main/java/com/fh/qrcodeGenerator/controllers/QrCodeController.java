package com.fh.qrcodeGenerator.controllers;


import com.fh.qrcodeGenerator.dtos.QrCodeGenerateRequest;
import com.fh.qrcodeGenerator.dtos.QrCodeGenerateResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    @PostMapping
    public ResponseEntity<QrCodeGenerateResponse> generate(@RequestBody QrCodeGenerateRequest request) {
        return ResponseEntity.ok(new QrCodeGenerateResponse("teste"));
    }
}
