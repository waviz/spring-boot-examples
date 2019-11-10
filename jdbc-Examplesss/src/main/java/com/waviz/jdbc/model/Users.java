package com.waviz.jdbc.model;

import java.util.Date;


public class Users {
  private Long id;
  private String user_name;
  private String password;
  private String email;
  private String first_name;
  private String last_name;
  private String phone_number;
  private boolean is_verified;
  private int otp;
  private int country_id;
  private int status;
  private Long modified_by;
  private Date modified_on;
  private Date created_on;
  private int calendar_id;
  private Long organization;
  private Byte route_type;
  private String sender_id;
  private String title;
  private String image_url;
  private Long template;
  private Date start_date_time;
  private Date end_date_time;
  private String location;
  private String description;
  private String reminder;
 // private Byte status;
  private String duration;
  private int source;
 // private Date created_on;
  private Long created_by;
  private Date updated_on;
  private Long updated_by;
  private int counter;
 // private Long id;
  private Long event_id;
  private String name;
  private String sender_number;
  private String country_code;
  private String display_number;
 // private int status;
  private boolean is_viewed;
  private boolean notified;
 // private Date created_on;
 // private Date updated_on;
  private boolean rejected;
  private Long number_of_recipents;
  private int event_rejected;
  
  
public Users()
  {
      super();
  }
  public Users(String user_name, String password, String email, String first_name, String last_name, String Phone_number,boolean is_verified, 
	int country_id, int status, Long modified_by, Date modified_on, Date created_on,int calendar_id, Long organization, Byte route_type, String sender_id, String title, String image_url, Long template, 
	  Date start_date_time,Date end_date_time, String location, String description, String reminder,
	  String duration,int source,Long created_by,Date updated_on,Long updated_by,int counter
	  ,String sender_number,String name,String country_code, String display_number,boolean is_viewed, boolean notified,boolean rejected,Long number_of_recipents,int event_rejected)
  {
      super();
      this.id = id;
      this.user_name = user_name;
      this.password = password;
      this.email = email;
      this.first_name = first_name;
      this.last_name = last_name;
      this.phone_number = phone_number;
      this.is_verified = is_verified;
      this.otp = otp;
      this.country_id = country_id;
      this.status = status;
      this.modified_by = modified_by;
      this.modified_on = modified_on;
      this.created_on = created_on;
      this.calendar_id = calendar_id;
      this.organization = organization;
      this.route_type = route_type;
      this.sender_id = sender_id;
      this.title = title;
      this.image_url = image_url;
      this.template = template;
      this.start_date_time = start_date_time;
      this.end_date_time = end_date_time;
      this.location = location;
      this.status = status;
      this.description = description;
      this.reminder = reminder;
    //  this.created_on = created_on;
     // this.status = status;
      this.duration = duration;
      this.source = source;
      this.created_by = created_by;
      this.updated_on = updated_on;
      this.updated_by = updated_by;
      this.counter = counter;
      this.event_id = event_id;
      this.name = name;
      this.sender_number = sender_number;
      this.country_code = country_code;
      this.display_number = display_number;
      this.is_viewed = is_viewed;
      this.notified = notified;
      this.rejected = rejected;
      this.number_of_recipents = number_of_recipents;
      this.event_rejected = event_rejected;
      
  }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Long getModified_by() {
        return modified_by;
    }

    public void setModified_by(Long modified_by) {
        this.modified_by = modified_by;
    }

    public Date getModified_on() {
        return modified_on;
    }

    public void setModified_on(Date modified_on) {
        this.modified_on = modified_on;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }

   

    public boolean getIs_verified() {
        return is_verified;
    }

    public void setIs_verified(boolean is_verified) {
       this.is_verified = is_verified;
    }

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }
    public int getCalendar_id() {
		return calendar_id;
	}
	public void setCalendar_id(int calendar_id) {
		this.calendar_id = calendar_id;
	}
	public Long getOrganization() {
		return organization;
	}
	public void setOrganization(Long organization) {
		this.organization = organization;
	}
	public Byte getRoute_type() {
		return route_type;
	}
	public void setRoute_type(Byte route_type) {
		this.route_type = route_type;
	}
	public String getSender_id() {
		return sender_id;
	}
	public void setSender_id(String sender_id) {
		this.sender_id = sender_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public Long getTemplate() {
		return template;
	}
	public void setTemplate(Long template) {
		this.template = template;
	}
	public Date getStart_date_time() {
		return start_date_time;
	}
	public void setStart_date_time(Date start_date_time) {
		this.start_date_time = start_date_time;
	}
	public Date getEnd_date_time() {
		return end_date_time;
	}
	public void setEnd_date_time(Date end_date_time) {
		this.end_date_time = end_date_time;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getReminder() {
		return reminder;
	}
	public void setReminder(String reminder) {
		this.reminder = reminder;
	}

	/*
	 * public Byte getStatus() { return status; } public void setStatus(Byte status)
	 * { this.status = status; }
	 */
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getSource() {
		return source;
	}
	public void setSource(int source) {
		this.source = source;
	}

	/*
	 * public Date getCreated_on() { return created_on; } public void
	 * setCreated_on(Date created_on) { this.created_on = created_on; }
	 */
	public Long getCreated_by() {
		return created_by;
	}
	public void setCreated_by(Long created_by) {
		this.created_by = created_by;
	}
	public Date getUpdated_on() {
		return updated_on;
	}
	public void setUpdated_on(Date updated_on) {
		this.updated_on = updated_on;
	}
	public Long getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(Long updated_by) {
		this.updated_by = updated_by;
	}
	
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
    public Long getEvent_id() {
		return event_id;
	}
	public void setEvent_id(Long event_id) {
		this.event_id = event_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSender_number() {
		return sender_number;
	}
	public void setSender_number(String sender_number) {
		this.sender_number = sender_number;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getDisplay_number() {
		return display_number;
	}
	public void setDisplay_number(String display_number) {
		this.display_number = display_number;
	}
	public boolean isIs_viewed() {
		return is_viewed;
	}
	public void setIs_viewed(boolean is_viewed) {
		this.is_viewed = is_viewed;
	}
	public boolean isNotified() {
		return notified;
	}
	public void setNotified(boolean notified) {
		this.notified = notified;
	}
	public boolean isRejected() {
		return rejected;
	}
	public void setRejected(boolean rejected) {
		this.rejected = rejected;
	}
	public Long getNumber_of_recipents() {
		return number_of_recipents;
	}
	public void setNumber_of_recipents(Long number_of_recipents) {
		this.number_of_recipents = number_of_recipents;
	}
	public int getEvent_rejected() {
		return event_rejected;
	}
	public void setEvent_rejected(int event_rejected) {
		this.event_rejected = event_rejected;
	}
	public static Users fromId(Long id){
        Users users=new Users();
        users.setId(id);
        return users;
    }
}
