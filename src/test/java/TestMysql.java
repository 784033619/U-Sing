import com.QST.Using.Dao.SingerMapper;
import com.QST.Using.Dao.UserMapper;
import com.QST.Using.Etitys.Singer;
import com.QST.Using.Etitys.SingerExample;
import com.QST.Using.Etitys.User;
import com.QST.Using.Etitys.UserExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestMysql {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring/applicationContext.xml");
//        UserMapper userMapper = (UserMapper) context.getBean("userMapper");
//        User user = userMapper.selectByPrimaryKey(1);
//        System.out.println(user);
        SingerMapper singerMapper = (SingerMapper) context.getBean("singerMapper");
        PageHelper.startPage(1,1);
//        SingerExample singerExample = new SingerExample();
        List<Singer> list = singerMapper.selectByExample(null);
//        PageInfo<Singer> pageInfo = new PageInfo<>(list);
        System.out.println(list.size());
    }
}
