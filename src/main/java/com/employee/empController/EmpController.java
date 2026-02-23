package com.employee.empController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.employee.empEntity.Employee;
import com.employee.empService.EmpService;
import com.employee.exception.AgeNotFoundException;
import com.employee.exception.IdNotFoundException;
import com.employee.exception.NameNotFoundException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class EmpController {
@Autowired 
 EmpService es;
@PostMapping(value="singleobject")
public String SingleObject(@RequestBody Employee e) {
     return es.SingleObject(e);
}
@PostMapping(value="listobject")
public String listobject(@RequestBody List<Employee>e) {
	
	return es.listobject(e);
}
@GetMapping(value="getall") 
public List<Employee>getall() {
	return es.getall();
}
@GetMapping(value="getOne/{id}")
public Employee getone(@PathVariable int id) {
	return es.getone(id);
}
@PostMapping(value="deleteOne/{a}")
public String deleteone(@PathVariable int a) {
	return es.deleteone(a);
}
@GetMapping(value="getmax")
public Integer getmax() {
    return es.getmax();
}
@GetMapping(value="getname")
public List<String>getname(){
	return es.getname();
}
@GetMapping(value="secmaxob")
public Employee secmaxob() {
	return es.secmaxob();
}
@GetMapping(value="secmax")
public int secmax() {
	return es.secmax();
}
@GetMapping(value="getsalary/{a}/{b}")
public List<Employee>getsalary(@PathVariable int a,@PathVariable int b){
	return es.getsalary(a,b);
}
@GetMapping(value="getdetails/{a}")
public List<Employee>getdetails(@PathVariable String a){
	return es.getdetails(a);
}
@PutMapping(value="changename/{a}")
public String  changename(@RequestBody Employee e,@PathVariable int a) {
	return es.changename(e,a);
}
@GetMapping(value="findcount")
public Long findcount() {
	return es.findcount();
}
@GetMapping(value="gettotal")
public int gettotal() {
	return es.gettotal();
}
@GetMapping(value="/getAll")
public List<Employee> getAll() {
	return es.getAll();
}
@GetMapping(value="/getname1/{a}") 
	public List<Employee>getname1(@PathVariable String a){
	return es.getname1(a);
}
@GetMapping(value="/getdetails/{a}/{b}")
public List<Employee> getdetails(@PathVariable int a,@PathVariable int b) {
	return es.getdetails(a,b);
}

@GetMapping(value="/getname2")
public List<String> getname2() {
	return es.getname2();
}
@GetMapping(value="/getmax1")
public int getmax1() {
	return es.getmax1();
}
@GetMapping(value="getmax1ob")
	public Employee getmax1ob() {
		return es.getmax1ob();
	}
@GetMapping(value="getsecmax1")
public int getsecmax1() {
	return es.getsecmax1();
}
@GetMapping(value="getsecmax1ob")
public Employee getsecmax1ob() {
	return es.getsecmax1ob();
}
@GetMapping(value="findbyname/{a}")
public List<Employee>findbyname(@PathVariable String a){
	return es.findbyname(a);
}
@GetMapping(value="findbyname1/{a}")
public List<Employee>findbyname1(@PathVariable String a){
	return es.findbyname1(a);
}
@GetMapping(value="getallDetails")
public List<Employee>getallDetails(){
	return es.getallDetails();
}
//@GetMapping(value="/getnameonly")
//public List<String>getnameonly() {
//	return es.getnameonly();
//}
@GetMapping(value="/getname3/{a}")
public String getname3(@PathVariable String a) {
	return es.getname3(a);
}
@GetMapping(value="getname4/{a}/{b}")
public List<String> getname4(@PathVariable int a,@PathVariable int b){
	return es.getname4(a,b);
}
@GetMapping(value="/getmax2")
public int getmax2() {
	return es.getmax2();
}
@GetMapping(value="/getmax2ob")
public Employee getmax2ob() {
	return es.getmax2ob();
}
@GetMapping(value="/getsecmax2")
public int getsecmax2() {
	return es.getsecmax2();
}
@GetMapping(value="/getsecmax2ob")
public Employee getsecmax2ob() {
	return es.getsecmax2ob();
}
@GetMapping(value="findbyname2/{a}")
public List<Employee> findbyname2(@PathVariable String a) {
	return es.findbyname2(a);
}
@GetMapping(value="findbyname4/{a}")
public List<Employee>findbyname4(@PathVariable String a){
 return es.findbyname4(a);
}

//exception handling
@GetMapping(value="NameNotFoundEx/{a}")
public List<Employee>namenotfoundex(@PathVariable String a) throws NameNotFoundException{
	return es.namenotfoundex(a);
}

@GetMapping(value="IdNotFoundEx/{a}")
public List<Employee>getid(@PathVariable int a)throws IdNotFoundException{
	return es.getid(a);
}

@GetMapping(value="AgeNotFoundEx/{a}")
public List<Employee>getage(@PathVariable int a)throws AgeNotFoundException {
	return es.getage(a);
}
}

