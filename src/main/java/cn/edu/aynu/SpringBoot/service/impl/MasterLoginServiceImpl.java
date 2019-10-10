package cn.edu.aynu.SpringBoot.service.impl;

import cn.edu.aynu.SpringBoot.entity.Master;
import cn.edu.aynu.SpringBoot.mapper.MasterLoginMapper;
import cn.edu.aynu.SpringBoot.service.MasterLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MasterLoginServiceImpl implements MasterLoginService {

    @Autowired
    private MasterLoginMapper masterLoginMapper;

    @Override
    public Master findMasterByNameAndPassword(Master master) {
        return masterLoginMapper.findMasterByNameAndPassword(master);
    }
}
