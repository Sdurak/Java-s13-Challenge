package model;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String password;
    private String email;
    private String[] healthplans;


    public Employee(int id, String fullName, String password, String email,String [] healthplans){
        this.id=id;
        this.fullName=fullName;
        this.password=password;
        this.email=email;
        this.healthplans=healthplans;
    }

    public int getId() {
        return id;
    }
    public String getFullName(){
        return fullName;
    }
    public String getPassword(){
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void addHealthplan(int index, String name) {
        try {
            if (healthplans[index] == null) {
                healthplans[index] = name;
            } else {
                System.out.println("İlgili index için atama yapılmış");
            }
        } catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Olmayan index için atama yapıldı" +index);
        }
    }
    public String toString(){
        return "Fullname: "+ fullName + "healthplans " + Arrays.toString(healthplans);
    }
}
