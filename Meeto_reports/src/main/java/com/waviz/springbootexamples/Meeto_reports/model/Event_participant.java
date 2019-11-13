package com.waviz.springbootexamples.Meeto_reports.model;
import java.util.Date;


public class Event_participant {

  private Long id;
  private int event_id;
  private String name;
  private String phone_number;

  private String country_code;

  private String display_number;

  private int status;

  private boolean is_viewed;

  private Date created_on;

  private Date updated_on;

  private boolean rejected;
  private int count;

  public Event_participant()
 {
     super();
 }
 
public Event_participant(Long id,int event_id,String name,String phone_number,String country_code,String display_number,int status,boolean is_viewed,Date created_on,Date updated_on,boolean rejected,int count)
 {
  super();
  this.id = id;
  this.event_id = event_id;
  this.name = name;
  this.phone_number = phone_number;
  this.country_code = country_code;
  this.display_number= display_number;
  this.status = status;
  this.is_viewed=is_viewed;
  this.created_on =  created_on;
  this.updated_on =  updated_on;
  this.rejected = rejected;
  this.count = count;
 }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getEvent() {
        return event_id;
    }

    public void setEvent(int eventId) {
        event_id = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public void setPhoneNumber(String phoneNumber) {
        phone_number = phoneNumber;
    }

    public String getCountryCode() {
        return country_code;
    }

    public void setCountryCode(String countryCode) {
        country_code = countryCode;
    }

    public String getDisplayNumber() {
        return display_number;
    }

    public void setDisplayNumber(String displayNumber) {
        display_number = displayNumber;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreatedOn() {
        return created_on;
    }

    public void setCreatedOn(Date createdOn) {
        this.created_on = createdOn;
    }

    public Date getUpdatedOn() {
        return updated_on;
    }

    public void setUpdatedOn(Date updatedOn) {
        updated_on = updatedOn;
    }

    public boolean isViewed() {
        return is_viewed;
    }

    public void setViewed(boolean viewed) {
        is_viewed = viewed;
    }

    public boolean isRejected() {
        return rejected;
    }

    public void setRejected(boolean rejected) {
        this.rejected = rejected;
    }
    
    public int getCount() {
        return count;
    }

    public void setCount(int count){
        this.count = count;
    }


      /* public static Event_participant fromId(Long id){
      Event_participant event_participant=new Event_participant();
       event_participant.setId(id);
       return Event_participant;
   }*/





}
