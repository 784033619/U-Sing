package com.example.using.service;

public interface UserFileService {
    boolean checkExist(String fileMd5);

    String getFileName(String fileMd5);
}
