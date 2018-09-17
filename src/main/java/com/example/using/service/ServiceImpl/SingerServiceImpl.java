package com.example.using.service.ServiceImpl;

import com.example.using.dao.SingerMapper;
import com.example.using.entity.Singer;
import com.example.using.service.SingerService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "singerService")
public class SingerServiceImpl implements SingerService {
    @Autowired
    SingerMapper singerMapper;
    @Override
    public List<Singer> getSingerList() {
        PageHelper.startPage(1,9);
        List<Singer> singers = singerMapper.selectByExample(null);
        return singers;
    }
}
