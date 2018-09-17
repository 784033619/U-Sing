package com.example.using.service;

import com.example.using.entity.Songlist;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface SonglistService {
    public List<com.example.using.entity.Songlist> getHotRecommend();
    public PageInfo<Songlist> getHotRecommendMore(int pageindex);
}
