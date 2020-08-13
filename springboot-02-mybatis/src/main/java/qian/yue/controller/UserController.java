package qian.yue.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import qian.yue.mapper.UserMapper;
import qian.yue.pojo.User;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        List<User> userList=userMapper.queryUserList();
        for (User user:userList){
            System.out.println(user);
        }
        return userList;
    }
}
