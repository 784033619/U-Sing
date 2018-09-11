package com.QST.Using.Controller;

import com.QST.Using.Etitys.Songlist;
import com.QST.Using.Service.SonglistService;
import com.QST.Using.Util.Result;
import com.QST.Using.Util.StateAndMessage.StateAndMessage;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
