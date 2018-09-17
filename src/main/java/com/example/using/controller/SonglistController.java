package com.example.using.controller;

import com.example.using.entity.Songlist;
import com.example.using.service.SonglistService;
import com.example.using.util.Result;
import com.example.using.util.StateAndMessage.StateAndMessage;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller("songlistController")
@CrossOrigin
@ResponseBody
@RequestMapping("/songlist")
public class SonglistController {
    @Resource(name = "songlistService")
    private SonglistService songlistService;

    /**
     * 首页热门推荐歌单列表
     * @return
     */
    @RequestMapping("getHotsonglist")
    public Result getHotsonglist(){
        List<Songlist> list = songlistService.getHotRecommend();
        Result result = new Result();
        if(list.isEmpty()){
            result.setState(StateAndMessage.FAIL);
        }else{
            result.setState(StateAndMessage.SUCCESS);
            result.setData(list);
        }
        return result;
    }

    /**
     * 首页热门推荐歌单更多s
     * @return
     */
    @RequestMapping("getHotRecommendMore")
    public Result getHotRecommendMore(Integer pageindex){
        PageInfo<Songlist> list = songlistService.getHotRecommendMore(pageindex);
        Result result = new Result();
        if(list.getList().isEmpty()){
            result.setState(StateAndMessage.FAIL);
        }else{
            result.setState(StateAndMessage.SUCCESS);
            result.setData(list);
        }
        return result;
    }
    @RequestMapping("getSonglistById")
        public Result getSonglistById(@RequestParam Integer id){
        System.out.println(id);
        Songlist songlist = songlistService.getSonglistById(id);
        System.out.println(songlist);
        Result result = new Result();
        if(null==songlist){
            result.setState(StateAndMessage.FAIL);
        }else{
            result.setState(StateAndMessage.SUCCESS);
            result.setData(songlist);
        }
        return result;
    }
}
