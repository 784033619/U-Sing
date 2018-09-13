package com.QST.Using.Service;

import com.QST.Using.Etitys.SongComment;

import java.util.List;

public interface SongCommentService {
    List<SongComment> getSongCommentsByPraiseTime();
    List<SongComment> getSongCommentsByCreateTime();
}
