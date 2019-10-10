package cn.edu.aynu.SpringBoot.service.impl;

import cn.edu.aynu.SpringBoot.entity.Master;
import cn.edu.aynu.SpringBoot.mapper.MasterMapper;
import cn.edu.aynu.SpringBoot.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MasterServiceImpl implements MasterService {

    @Autowired
    private MasterMapper masterMapper = null;

    @Override
    public Master findMasterById(Integer id) {
        return masterMapper.findMasterById(id);
    }

    @Override
    public int insertMaster(Master master) {
        return masterMapper.insertMaster(master);
    }

    @Override
    public int updateMaster(Master master) {
        return masterMapper.updateMaster(master);
    }

    @Override
    public int deleteMasterById(Integer id) {
        return masterMapper.deleteMasterById(id);
    }
}
