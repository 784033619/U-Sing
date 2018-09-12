package com.QST.Using.Controller;

        import com.QST.Using.Etitys.SongComment;
        import com.QST.Using.Service.SongCommentService;
        import com.QST.Using.Util.Result;
        import com.QST.Using.Util.StateAndMessage.StateAndMessage;
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
    @RequestMapping(value = "getComments")
    public Result getSingRankList(){
        List<SongComment> songComments = commentService.getSongComments();
        System.out.println(songComments.size());
        if(songComments.isEmpty()){
            return new Result(StateAndMessage.FAIL,null,null);
        }
        return new Result(StateAndMessage.SUCCESS,null,songComments);
    }
}
