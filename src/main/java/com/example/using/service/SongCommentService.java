package com.example.using.service;

import com.example.using.entity.SongComment;

import java.util.List;

public interface SongCommentService {
    List<com.example.using.entity.SongComment> getSongCommentsByPraiseTime();
    List<SongComment> getSongCommentsByCreateTime();
}
