package com.QST.Using.Controller;

import com.QST.Using.Etitys.Singer;
import com.QST.Using.Service.SingerService;
import com.QST.Using.Util.Result;
import com.QST.Using.Util.StateAndMessage.StateAndMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller(value = "singerContraller")
@CrossOrigin
@RequestMapping(value = "singer")
public class SingerController {
    @Resource(name = "singerService")
    private SingerService singerService;

    /**
     * 获得歌手列表
     * @return
     */
    @RequestMapping(value = "getSingerList")
    @ResponseBody
    public Result getSingerList(){
        List<Singer> singers = singerService.getSingerList();
        System.out.println(singers);
        if(singers.isEmpty()){
            return  new Result(StateAndMessage.FAIL,null,null);
        }
        return new Result(StateAndMessage.SUCCESS,null,null);
    }
}
