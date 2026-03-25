package com.example.demo.form;

public class ReceiveNameForm {
    
private String name;
private String age;


public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

@Override
public String toString() {
    return "ReceiveNameForm [name=" + name + ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()="
            + hashCode() + ", toString()=" + super.toString() + "]";
}

public String getAge() {
    return age;
}

public void setAge(String age) {
    this.age = age;
}



}
