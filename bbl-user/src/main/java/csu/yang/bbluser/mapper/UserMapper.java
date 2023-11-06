package csu.yang.bbluser.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import csu.yang.bbluser.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserMapper extends BaseMapper<User> {
    //根据每个人的role字段查找
    @Select("SELECT * FROM user WHERE user_id = #{id}")
    public User getUserById(Integer id);
}




