package com.QST.Using.Service.ServiceImpl;

import com.QST.Using.Dao.SingerMapper;
import com.QST.Using.Etitys.Singer;
import com.QST.Using.Service.SingerService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "singerService")
public class SingerServiceImpl implements SingerService {
    @Resource(name = "singerMapper")
    private SingerMapper singerMapper;
    @Override
    public List<Singer> getSingerList() {
        PageHelper.startPage(1,9);
        List<Singer> singers = singerMapper.selectByExample(null);
        return singers;
    }
}
