package com.astontech.bo;

import java.util.Date;

public class Employee extends Person{
    private int EmployeeId;
    private Date HireDate;
    private Date TermDate;
    private Date BirthDate;
    private int PersonId;
    private Date DateCreate;

    public Employee() {}

    public Employee(String FirstName, String LastName){
        this.setFirstName(FirstName);
        this.setLastName(LastName);
    }

    public Employee(String LastName){
        this.setLastName(LastName);
    }

    public void setEmployeeId(int EmployeeId){
        this.EmployeeId = EmployeeId;
    }
    public int getEmployeeId(){
        return this.EmployeeId;
    }
    public void setHireDate(Date HireDate){
        this.HireDate = HireDate;
    }
    public Date getHireDate(){
        return this.HireDate;
    }
    public void setTermDate(Date TermDate){
        this.TermDate = TermDate;
    }
    public Date getTermDate(){
        return this.TermDate;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    @Override
    public int getPersonId() {
        return PersonId;
    }

    @Override
    public void setPersonId(int personId) {
        PersonId = personId;
    }

    public Date getDateCreate() {
        return DateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        DateCreate = dateCreate;
    }
}
