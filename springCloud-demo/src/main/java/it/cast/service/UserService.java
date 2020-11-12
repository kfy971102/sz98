package it.cast.service;
import it.cast.mapper.UserMapper;
import it.cast.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User queryById(Long id){
        return userMapper.selectByPrimaryKey(id);
 }

}
