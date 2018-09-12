package com.QST.Using.Service.ServiceImpl;

import com.QST.Using.Dao.SongCommentMapper;
import com.QST.Using.Etitys.SongComment;
import com.QST.Using.Etitys.SongCommentExample;
import com.QST.Using.Service.SongCommentService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value="songCommentService")
public class SongCommentServiceImpl implements SongCommentService{
    @Resource(name = "songCommentMapper")
    private SongCommentMapper songCommentMapper;
    @Override
    public List<SongComment> getSongComments() {
        SongCommentExample songComentExample = new SongCommentExample();
        songComentExample.setOrderByClause("praise_times desc");
        PageHelper.startPage(1,7);
        List<SongComment> songComments = songCommentMapper.selectByExample(songComentExample);
        return songComments;
    }
}
