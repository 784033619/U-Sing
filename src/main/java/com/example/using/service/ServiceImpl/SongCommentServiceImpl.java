package com.example.using.service.ServiceImpl;

import com.example.using.dao.SongCommentMapper;
import com.example.using.entity.SongComment;
import com.example.using.entity.SongCommentExample;
import com.example.using.service.SongCommentService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value="songCommentService")
public class SongCommentServiceImpl implements SongCommentService{
    @Autowired
    private SongCommentMapper songCommentMapper;
    @Autowired
    private SongCommentExample songCommentExample;
    @Override
    public List<SongComment> getSongCommentsByPraiseTime() {
        SongCommentExample songComentExample = new SongCommentExample();
        songComentExample.setOrderByClause("praise_times desc");
        PageHelper.startPage(1,4);
        List<SongComment> songComments = songCommentMapper.selectByExample(songComentExample);
        return songComments;
    }

    @Override
    public List<SongComment> getSongCommentsByCreateTime() {
        songCommentExample.setOrderByClause("create_time desc");
        PageHelper.startPage(1,5);
        List<SongComment> songComments = songCommentMapper.selectByExample(songCommentExample);
        return songComments;
    }
}
