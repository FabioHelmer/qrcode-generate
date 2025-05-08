package com.fh.qrcodeGenerator.service;

import com.fh.qrcodeGenerator.dtos.QrCodeGenerateResponse;
import com.fh.qrcodeGenerator.ports.StorangePort;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;


@Service
public class QrCodeGeneratorService {

    private final StorangePort storange;


    public QrCodeGeneratorService(StorangePort storange) {
        this.storange = storange;
    }

    public QrCodeGenerateResponse generateAndUploadQrCode(String text) throws WriterException, IOException {

        //gerar qrcode
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, 200, 200);

        ByteArrayOutputStream pngOutPutStream = new ByteArrayOutputStream();
        MatrixToImageWriter.writeToStream(bitMatrix, "PNG", pngOutPutStream);
        byte[] pngQrcode = pngOutPutStream.toByteArray();

        //upload
        String url = storange.uploadFile(pngQrcode, UUID.randomUUID().toString(), "image/png");

        return new QrCodeGenerateResponse(url);

    }

}
