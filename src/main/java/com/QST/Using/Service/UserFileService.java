package com.QST.Using.Service;

public interface UserFileService {
    boolean checkExist(String fileMd5);

    String getFileName(String fileMd5);
}
