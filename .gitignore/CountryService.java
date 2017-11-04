package com.app1.SpringBoot;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountryService {
 
 static HashMap<Integer,Country> countryIdMap=getCountryIdMap();
 
 
 public CountryService() {
  super();
 
  if(countryIdMap==null)
  {
   countryIdMap=new HashMap();
   countryIdMap.put("1", "john","Johny","john@gmail.com",123456,20/01/1996);
   countryIdMap.put("2", "john1","Johny1","john1@gmail.com",123455,20/02/1996);
   countryIdMap.put("3", "john2","Johny","john2@gmail.com",123454,20/03/199);
   countryIdMap.put("4", "john3","Johny","john3@gmail.com",123453,20/04/1996);
  }
 }
 
 public List getAllCountries()
 {
  List countries = new ArrayList(countryIdMap.values());
  return countries;
 }
 
 public Country getCountry(int id)
 {
  Country country= countryIdMap.get(id);
  return country;
 }
 public Country addCountry(Country country)
 {
  country.setId(countryIdMap.size()+1);
  countryIdMap.put(country.getId(), country);
  return country;
 }
 
 public Country updateCountry(Country country)
 {
  if(country.getId()<=0)
   return null;
  countryIdMap.put(country.getId(), country);
  return country;
 
 }
 public void deleteCountry(int id)
 {
  countryIdMap.remove(id);
 }
 
 public static HashMap<Integer, Country> getCountryIdMap() {
  return countryIdMap;
 }
}
 




