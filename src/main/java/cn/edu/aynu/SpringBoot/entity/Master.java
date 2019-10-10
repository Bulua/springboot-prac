package cn.edu.aynu.SpringBoot.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Master implements Serializable {

    private Integer id;

    private String name;

    private String password;
}
