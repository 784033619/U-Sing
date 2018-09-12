package com.QST.Using.Service.ServiceImpl;

import com.QST.Using.Service.UserFileService;
import org.springframework.stereotype.Service;

@Service(value = "userFileService")
public class UserFileServiceImpl implements UserFileService {

    @Override
    public boolean checkExist(String fileMd5) {

        return false;
    }

    @Override
    public String getFileName(String fileMd5) {
        return null;
    }

    @Override
    public void addUserFile(String username, String filename, String fileMd5) {

    }
}
