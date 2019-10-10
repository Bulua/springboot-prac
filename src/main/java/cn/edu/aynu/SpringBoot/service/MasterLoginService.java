package cn.edu.aynu.SpringBoot.service;

import cn.edu.aynu.SpringBoot.entity.Master;

public interface MasterLoginService {

    public Master findMasterByNameAndPassword(Master master);
}
