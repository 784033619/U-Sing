package com.example.using.service.ServiceImpl;

import com.example.using.dao.SongMapper;

import com.example.using.entity.Song;
import com.example.using.entity.SongExample;
import com.example.using.service.SongService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "songService")
public class SongServiceImpl implements SongService {
    @Autowired
    private SongMapper songMapper;
    @Autowired
    private SongExample songExample;
    @Override
    public List<Song> getSongRankList() {
        songExample.clear();
        songExample.setOrderByClause("play_times desc");
        PageHelper.startPage(1,7);
        List<Song> songs = songMapper.selectByExample(songExample);
        PageInfo<Song> pageInfo = new PageInfo<Song>(songs);
        return songs;
    }
}
