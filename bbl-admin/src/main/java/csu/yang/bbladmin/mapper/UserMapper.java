package csu.yang.bbladmin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import csu.yang.bbladmin.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
* @author AMDYES
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-10-16 14:52:06
* @Entity generator.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {
    //根据每个人的role字段查找
    @Select("SELECT * FROM user WHERE user_id = #{id}")
    public User getUserById(Integer id);
}




