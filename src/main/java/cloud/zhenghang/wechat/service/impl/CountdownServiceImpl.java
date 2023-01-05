package cloud.zhenghang.wechat.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cloud.zhenghang.wechat.domain.Countdown;
import cloud.zhenghang.wechat.service.CountdownService;
import cloud.zhenghang.wechat.mapper.CountdownMapper;
import org.springframework.stereotype.Service;

/**
* @author gcddd
* @description 针对表【countdown】的数据库操作Service实现
* @createDate 2022-11-18 16:07:33
*/
@Service
public class CountdownServiceImpl extends ServiceImpl<CountdownMapper, Countdown>
    implements CountdownService{

}




