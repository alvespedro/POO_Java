/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula9;

/**
 *
 * @author palves
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    
    public Person (String name,int age, String gender){
       this.setName(name);
       this.setAge(age);
       this.setGender(gender);
    }
    
    //Getters Method
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    
    //Setters Method
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void happyBirthday(){
        this.setAge(this.getAge()+1);
    }
}
