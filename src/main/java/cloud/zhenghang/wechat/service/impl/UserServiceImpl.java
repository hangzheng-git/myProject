package cloud.zhenghang.wechat.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cloud.zhenghang.wechat.domain.User;
import cloud.zhenghang.wechat.service.UserService;
import cloud.zhenghang.wechat.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author gcddd
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-11-18 16:07:33
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




