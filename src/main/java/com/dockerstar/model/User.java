package com.dockerstar.model;

public class User {
    private Integer id;
    private String name;
    private Integer age;

    public User(Integer id ,String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    User(){}

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        if(age>18) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Возраст не может быть меньше 18");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
