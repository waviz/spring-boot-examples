package com.waviz.jdbc.model;

import java.util.Date;
import java.util.List;
public class Event {

	private Long id;
	private int calendar_id;
	private Long organization;
	private Byte route_type;
    private String sender_id;
    private String title;
    private String image_url;
    private Long template;
	private Date start_date_time;
	private Date end_date_ime;
	private String location;
	private String description;
	private String reminder;
	private Byte status;
	private String duration;
	private int source;
	private Date created_on;
	private Long created_by;
	private Date updated_on;
	private Long updated_by;
	
	
	 public Event()
	  {
	      super();
	  }
	  public Event(int calendar_id, Long organization, Byte route_type, String sender_id, String title, String image_url, Long template, 
			  Date start_date_time, String location, String description, String reminder, Byte status,
			  String duration,int source,Date created_on,Long created_by,Date updated_on,Long updated_by)
	  {
	      super();
	      this.id = id;
	      this.calendar_id = calendar_id;
	      this.organization = organization;
	      this.route_type = route_type;
	      this.sender_id = sender_id;
	      this.title = title;
	      this.image_url = image_url;
	      this.template = template;
	      this.start_date_time = start_date_time;
	      this.location = location;
	      this.status = status;
	      this.description = description;
	      this.reminder = reminder;
	      this.created_on = created_on;
	      this.status = status;
	      this.duration = duration;
	      this.source = source;
	      this.created_by = created_by;
	      this.updated_on = updated_on;
	      this.updated_by = updated_by;
	     
    }
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Date getEnd_date_ime() {
		return end_date_ime;
	}
	public void setEnd_date_ime(Date end_date_ime) {
		this.end_date_ime = end_date_ime;
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
	public Byte getStatus() {
		return status;
	}
	public void setStatus(Byte status) {
		this.status = status;
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
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
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
}

