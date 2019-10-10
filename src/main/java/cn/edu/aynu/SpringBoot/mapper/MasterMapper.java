package cn.edu.aynu.SpringBoot.mapper;

import cn.edu.aynu.SpringBoot.entity.Master;
import org.apache.ibatis.annotations.*;

@Mapper
public interface MasterMapper {

    @Select("select * from master where id=#{id}")
    public Master findMasterById(Integer id);

    @Insert(
            "insert into master(name, password) " +
                    "values(#{name}, #{password})"
    )
    public int insertMaster(Master master);

    @Update("update master set name=#{name}, password=#{password} where id=#{id}")
    public int updateMaster(Master master);

    @Delete("delete from master where id=#{id}")
    public int deleteMasterById(Integer id);

}
