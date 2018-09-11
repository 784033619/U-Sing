package com.QST.Using.Service.ServiceImpl;

import com.QST.Using.Dao.SongMapper;
import com.QST.Using.Etitys.Song;
import com.QST.Using.Etitys.SongExample;
import com.QST.Using.Service.SongService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "songService")
public class SongServiceImpl implements SongService {
    @Resource(name = "songMapper")
    private SongMapper songMapper;
    @Override
    public List<Song> getSongRankList() {
        SongExample songExample = new SongExample();
        songExample.setOrderByClause("play_times desc");
        PageHelper.startPage(1,7);
        List<Song> songs = songMapper.selectByExample(songExample);
        PageInfo<Song> pageInfo = new PageInfo<Song>(songs);
        return songs;
    }
}
