package com.employee.empEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_details")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
   private String name;
   private int age;
   private boolean gender;
   private int height;
   private float experience; 
   private int salary;
   public int getId() {
	return id;
   }
   public void setId(int id) {
	this.id = id;
   }
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   public int getAge() {
	return age;
   }
   public void setAge(int age) {
	this.age = age;
   }
   public boolean isGender() {
	return gender;
   }
   public void setGender(boolean gender) {
	this.gender = gender;
   }
   public int getHeight() {
	return height;
   }
   public void setHeight(int height) {
	this.height = height;
   }
   public float getExperience() {
	return experience;
   }
   public void setExperience(float experience) {
	this.experience = experience;
   }
   public int getSalary() {
	return salary;
   }
   public void setSalary(int salary) {
	this.salary = salary;
   }
   @Override
   public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", height=" + height
			+ ", experience=" + experience + ", salary=" + salary + "]";
   }
   
}
