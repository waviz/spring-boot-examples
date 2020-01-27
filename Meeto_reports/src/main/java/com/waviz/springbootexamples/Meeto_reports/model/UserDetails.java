package com.waviz.springbootexamples.Meeto_reports.model;
import java.util.Date;
public class UserDetails{
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
  private String duration;
  private int source;
  private Long created_by;
  private Date updated_on;
  private Long updated_by;
  private int counter; 
  private Long event_id; 
  private int number_of_recipents;
public UserDetails()
  {
      super();
  }
  public UserDetails(String name, String password, String email, String first_name, String last_name, String Phone_number,boolean is_verified, 
 	int country_id, int status, Long modified_by, Date modified_on, Date created_on,int calendar_id, Long organization, Byte route_type, String sender_id, String title, String image_url, Long template, Date start_date_time,Date end_date_time, String location, String description, String reminder, String duration,int source,Long created_by,Date updated_on,Long updated_by,int counter,Long event_id,int number_of_recipents)
  {
      super();
      this.id = id;
      this.user_name = name;
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
      this.duration = duration;
      this.source = source;
      this.created_by = created_by;
      this.updated_on = updated_on;
      this.updated_by = updated_by;
      this.counter = counter;
     this.event_id =event_id;
     this.number_of_recipents = number_of_recipents;
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

  public Long getEventId() {
    return event_id;
  }
  public void setCounter(Long event_id) {
    this.event_id = event_id;
  }
  public int getNumberOfRecipents() {
    return number_of_recipents;
  }
  public void setNumberOfRecipents(int number_of_recipents) {
    this.number_of_recipents = number_of_recipents;
  }


    public static UserDetails fromId(Long id){
        UserDetails users=new UserDetails();
        users.setId(id);
        return users;
    }
}
