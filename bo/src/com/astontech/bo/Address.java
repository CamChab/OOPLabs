package com.astontech.bo;

import java.sql.Date;

public class Address extends BaseBO{
    private int AddressId;
    private int ClientId;
    private int PersonId;
    private EntityType AddressType;
    private int AddressNumber;
    private String Street;
    private String Street02;
    private String City;
    private int StateId;
    private int CountryId;
    private Date DateCreate;

    public Address(){}
    public Address(int id){
        this.AddressId = id;
    }

    public int getAddressId() {
        return AddressId;
    }

    public void setAddressId(int addressId) {
        AddressId = addressId;
    }

    public int getClientId() {
        return ClientId;
    }

    public void setClientId(int clientId) {
        ClientId = clientId;
    }

    public int getPersonId() {
        return PersonId;
    }

    public void setPersonId(int personId) {
        PersonId = personId;
    }

    public int getAddressNumber() {
        return AddressNumber;
    }

    public void setAddressNumber(int addressNumber) {
        AddressNumber = addressNumber;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getStreet02() {
        return Street02;
    }

    public void setStreet02(String street02) {
        Street02 = street02;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getStateId() {
        return StateId;
    }

    public void setStateId(int stateId) {
        StateId = stateId;
    }

    public int getCountryId() {
        return CountryId;
    }

    public void setCountryId(int countryId) {
        CountryId = countryId;
    }

    public Date getDateCreate() {
        return DateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        DateCreate = dateCreate;
    }
    public String GetFullAddress(){
        return this.AddressNumber+" "+this.Street+" "+this.City+" "+this.StateId;
    }

    public EntityType getAddressType() {
        return AddressType;
    }

    public void setAddressType(EntityType addressType) {
        AddressType = addressType;
    }
}
