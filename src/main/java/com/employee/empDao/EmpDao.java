package com.employee.empDao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.employee.empEntity.Employee;
import com.employee.empRepository.empRepository;

@Repository
public class EmpDao {
@Autowired
empRepository er;
public String SingleObject(Employee e) {
	  er.save(e);
	  return "save Successfully";
}
public String listobject( List<Employee>e) { 
	er.saveAll(e);
	return "objects are saved succesfully";
}
public List<Employee>getall() {
	return er.findAll();
}
public Employee getone( int id) {
     Employee b=er.findById(id).get();
     return b;

}
public String deleteone( int a) {
	er.deleteById(a);
	return "Deleted successfully";
}
public String  changename(Employee e,int a) {
  Employee n=er.findById(a).get();
  n.setName(e.getName());
  er.save(n);
  return "Updated successfully";
}
public List<Employee> getAll() {
	return er.getAll();
}
public List<Employee> getname1(String a){
	return er.getname1(a);
}
public List<Employee> getdetails(int a,int b){
	return er.getdetails(a, b);
}
public List<String> getname2(){
	return er.getname2();
}
public int getmax1() {
	return er.getmax1();
}
public Employee getmax1ob() {
	return er.getmax1ob();
}
public int getsecmax1() {
	return er.getsecmax1();
}
public Employee getsecmax1ob() {
	return er.getsecmax1ob();
}
public List<Employee>findbyname(String a) {
	return er.findbyname(a);
}
public List<Employee>findbyname1(String a){
	return er.findbyname1(a);
}
public List<Employee>getallDetails() {
	return er.getallDetails();
}
//public List<String>getnameonly() {
	//return er.getnameonly();
// }
public String getname3(String a) {
	return er.getname3(a);
}
public List<String> getname4(int a,int b){
	return er.getname4(a, b);
}
public int getmax2() {
	return er.getmax2();
}
public Employee getmax2ob() {
	return er.getmax2ob();
}
public int getsecmax2() {
	return er.getsecmax2();
}
public Employee getsecmax2ob() {
	return er.getsecmax2ob();
}
public List<Employee> findbyname2(String a) {
	return er.findbyname2(a);
}
public List<Employee> findbyname4(String a){
	return er.findbyname4(a);
}

//exception handling
public List<Employee> namenotfoundex(String a){
	return er.namenotfoundex(a);
}
public List<Employee>getid(int a){
	return er.getid(a);
}
public List<Employee>getage(int a){
	return er.getage(a);
}
}
