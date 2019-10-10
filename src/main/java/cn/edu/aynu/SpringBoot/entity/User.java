package cn.edu.aynu.SpringBoot.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private Integer id;

    private String username;

    private Gender gender;

    private String telephone;

    private String email;

    private Integer mId;

}
