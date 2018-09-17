package com.example.using.controller;
import com.example.using.entity.SongComment;
import com.example.using.service.SongCommentService;
import com.example.using.util.Result;
import com.example.using.util.StateAndMessage.StateAndMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller(value = "songCommentController")
@CrossOrigin
@RequestMapping(value = "song")
@ResponseBody
public class SongCommentController {
    @Resource(name = "songCommentService")
    private SongCommentService commentService;
    @RequestMapping(value = "getCommentsByPraiseTime")
    public Result getCommentsByPraiseTime(){
        List<SongComment> songComments = commentService.getSongCommentsByPraiseTime();
        if(songComments.isEmpty()){
            return new Result(StateAndMessage.FAIL,null,null);
        }
        return new Result(StateAndMessage.SUCCESS,null,songComments);
    }
    @RequestMapping(value = "getCommentsByCreateTime")
    public Result getCommentsByCreateTime(){
        List<SongComment> songComments = commentService.getSongCommentsByCreateTime();
        if(songComments.isEmpty()){
            return new Result(StateAndMessage.FAIL,null,null);
        }
        return new Result(StateAndMessage.SUCCESS,null,songComments);
    }
}
