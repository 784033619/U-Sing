package com.QST.Using.Service.ServiceImpl;

import com.QST.Using.Dao.SonglistMapper;
import com.QST.Using.Etitys.Songlist;
import com.QST.Using.Etitys.SonglistExample;
import com.QST.Using.Service.SonglistService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SonglistServiceImpl implements SonglistService {
    @Resource(name = "songlistMapper")
    private SonglistMapper songlistMapper;

    /**
     * 首页热歌榜查询歌单列表
     * @return
     */
    @Override
    public List<Songlist> getHotsonglist() {
//        SonglistExample songlistExample = new SonglistExample();
//        SonglistExample.Criteria criteria = songlistExample.createCriteria();
//        songlistExample.setOrderByClause("play_times desc");
        return null;
    }
}
