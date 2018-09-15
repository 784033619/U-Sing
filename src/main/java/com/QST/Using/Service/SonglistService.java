package com.QST.Using.Service;

import com.QST.Using.Etitys.Songlist;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface SonglistService {
    public List<Songlist> getHotRecommend();
    public PageInfo<Songlist> getHotRecommendMore(int pageindex);
    public Songlist getSonglistById(Integer id);
}
