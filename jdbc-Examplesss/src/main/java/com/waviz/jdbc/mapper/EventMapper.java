package com.waviz.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import com.waviz.jdbc.model.User;
import com.waviz.jdbc.model.Event;
import com.waviz.jdbc.model.EventParticipant;

public class EventMapper implements RowMapper<Event> {
	
	 @Override
	    public Event mapRow(ResultSet row, int rowNum) throws SQLException 
	    {
		 Event event = new Event();
		 event.setId(row.getLong("id"));
		 event.setCalendar_id(row.getInt("calendar_id"));
		 event.setOrganization(row.getLong("organization"));
		 event.setRoute_type(row.getByte("route_type"));
		 event.setSender_id(row.getString("sender_id"));
		 event.setTitle(row.getString("title"));
		 event.setImage_url(row.getString("image_url"));
		 event.setTemplate(row.getLong("template"));
		 event.setStart_date_time(row.getDate("start_date_time"));
		 event.setEnd_date_ime(row.getDate("end_date_ime"));
		 event.setLocation(row.getString("location"));
		 event.setDescription(row.getString("description"));
		 event.setReminder(row.getString("reminder"));
		 event.setStatus(row.getByte("status"));
		 event.setDuration(row.getString("duration"));
		 event.setSource(row.getInt("source"));
		 event.setCreated_on(row.getDate("created_on"));
		 event.setCreated_by(row.getLong("created_by"));
		 event.setUpdated_on(row.getDate("updated_on"));
		 event.setUpdated_by(row.getLong("updated_by"));
		 
        return event;
}

}
