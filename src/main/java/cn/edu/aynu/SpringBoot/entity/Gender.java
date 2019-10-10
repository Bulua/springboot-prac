package cn.edu.aynu.SpringBoot.entity;

public enum Gender{

    MALE(1, "男"),
    FEMALE(0, "女");

    private Integer id;
    private String name;

    Gender(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Gender getGenderById(int id){
        for (Gender gender: Gender.values()){
            if (gender.getId() == id){
                return gender;
            }
        }
        return null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
