import com.AnalyzeSystem.dao.*;
import com.AnalyzeSystem.model.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class main {

    public static void main(String args[]){

        User user=new User();
        user.setSequenceId("123");//注意给的sequenceId必须在AccessList表中，否则插入会失败，因为有外键关系
        user.setUserName("myname");
        user.setPassword("mypassword");
        user.setUserId("123");
        UserDao userDao=UserDao.getInstance();//!!!获得dao对象

        userDao.insertUser(user);//将user插入表中,可能会失败抛出sql异常
        userDao.updateName("123","newName");//修改user的名字
        User user1=userDao.selectUserById("123");//根据id获得一个User对象
        userDao.deleteUser("123");//根据id删除user

        userDao.commit();//!!一定要commit，否则数据库不会有任何改动
        userDao.close();//最好close,不close会出现什么后果我也不清楚
    }
}
