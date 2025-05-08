package com.fh.qrcodeGenerator.ports;

public interface StorangePort {

    String uploadFile(byte[] fileData, String fileName, String contentType);

}
