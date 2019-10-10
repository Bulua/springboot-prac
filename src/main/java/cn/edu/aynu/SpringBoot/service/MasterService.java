package cn.edu.aynu.SpringBoot.service;

import cn.edu.aynu.SpringBoot.entity.Master;

public interface MasterService {

    public Master findMasterById(Integer id);

    public int insertMaster(Master master);

    public int updateMaster(Master master);

    public int deleteMasterById(Integer id);
}
