package cloud.zhenghang.wechat.mapper;

import cloud.zhenghang.wechat.domain.Countdown;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author gcddd
* @description 针对表【countdown】的数据库操作Mapper
* @createDate 2022-11-18 16:07:33
* @Entity cloud.zhenghang.wechat.domain.Countdown
*/
@Mapper
public interface CountdownMapper extends BaseMapper<Countdown> {

}




