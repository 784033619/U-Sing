package com.QST.Using.Controller;

import com.QST.Using.Etitys.Song;
import com.QST.Using.Service.SongService;
import com.QST.Using.Util.Result;
import com.QST.Using.Util.StateAndMessage.StateAndMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller(value = "songController")
@CrossOrigin
@RequestMapping(value = "song")
@ResponseBody
public class SongController {
    @Resource(name = "songService")
    private SongService songService;
    @RequestMapping(value = "getSingRankList")
    public Result getSingRankList(){
        List<Song> songs = songService.getSongRankList();
        if(songs.isEmpty()){
            return new Result(StateAndMessage.FAIL,null,null);
        }
        return new Result(StateAndMessage.SUCCESS,null,songs);
    }
}
