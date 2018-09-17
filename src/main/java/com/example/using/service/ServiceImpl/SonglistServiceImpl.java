package com.example.using.service.ServiceImpl;

import com.example.using.dao.SonglistMapper;

import com.example.using.entity.Songlist;
import com.example.using.entity.SonglistExample;
import com.example.using.service.SonglistService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("songlistService")
public class SonglistServiceImpl implements SonglistService {
    @Autowired
    private SonglistMapper songlistMapper;

    /**
     * 首页热门推荐歌单列表
     * @return
     */
    @Override
    public List<Songlist> getHotRecommend() {
        SonglistExample songlistExample = new SonglistExample();
        SonglistExample.Criteria criteria = songlistExample.createCriteria();
        songlistExample.setOrderByClause("play_times desc");
        PageHelper.startPage(1,8);
        List<Songlist> list = songlistMapper.selectByExample(songlistExample);
        return list;
    }

    /**
     * 首页热门推荐歌单更多s
     * @return
     */
    @Override
    public PageInfo<Songlist> getHotRecommendMore(int pageindex) {
        SonglistExample songlistExample = new SonglistExample();
        SonglistExample.Criteria criteria = songlistExample.createCriteria();
        songlistExample.setOrderByClause("play_times desc");
        PageHelper.startPage(pageindex,20);
        List<Songlist> list = songlistMapper.selectByExample(songlistExample);
        PageInfo<Songlist> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * 通过id找到歌单
     * @param id
     * @return
     */
    @Override
    public Songlist getSonglistById(Integer id) {
        Songlist songlist=songlistMapper.selectByPrimaryKey(id);
        return songlist;
    }
}
