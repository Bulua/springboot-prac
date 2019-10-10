package cn.edu.aynu.SpringBoot.mapper;

import cn.edu.aynu.SpringBoot.entity.Master;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MasterLoginMapper {

    public Master findMasterByNameAndPassword(Master master);
}
