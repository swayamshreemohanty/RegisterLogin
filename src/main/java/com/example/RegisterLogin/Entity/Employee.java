package com.example.RegisterLogin.Entity;

//import org.springframework.data.annotation.Id;

import jakarta.persistence.*;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @Column(name="employee_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeid;
    
    @Column(name="employee_name", length = 255)
    private String employeename;

    @Column(name="email", length = 255)
    private String email;

    @Column(name="password", length = 255)
    private String password;


    //to make CONSTRUCTOR
    public Employee(int employeeid, String employeename, String email, String password){
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.email = email;
        this.password = password;
    }

        //Empty CONSTRUCTOR
        public Employee(){

        }

        //Get and Set method
        public int getEmployeeid(){
            return employeeid;
        }

        public void setEmployeeid(int employeeid){
            this.employeeid = employeeid;
        }

        public String getEmployeename(){
            return employeename;
        }

        public void setEmployeename(String employeename){
            this.employeename = employeename;
        }

        public String getEmail(){
            return email;
        }

        public void setEmail(String email){
            this.email = email;
        }

        public String getPassword(){
            return password;
        }

        public void setPassword(String password){
            this.password = password;
        }

        @Override
        public String toString(){
            return "Employee{" +
                    "employeeid=" + employeeid +
                    ", employeename='" + employeename + '\'' +
                    ", email='" + email + '\''+
                    ", password='" + password + '\'' +
                    '}';
        }
}
