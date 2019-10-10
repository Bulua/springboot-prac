package cn.edu.aynu.SpringBoot.controller;

import cn.edu.aynu.SpringBoot.entity.Master;
import cn.edu.aynu.SpringBoot.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//@Controller和@ResponseBody结合体
@RestController
public class MasterController {

    @Autowired
    private MasterService masterService;

    @GetMapping("/master/{id}")
    @Cacheable(cacheNames = {"master"}, key = "#id")
    public Master findMasterById(@PathVariable("id") Integer id){
        return masterService.findMasterById(id);
    }

}
