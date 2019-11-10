package com.waviz.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.waviz.jdbc.model.EventParticipant;
import com.waviz.jdbc.model.User;
import com.waviz.jdbc.model.EventParticipant;
import com.waviz.jdbc.model.Event;


public class EventParticipantMapper implements RowMapper<EventParticipant> {
	
	 @Override
	    public EventParticipant mapRow(ResultSet row, int rowNum) throws SQLException 
	    {
		 EventParticipant eventParticipant = new EventParticipant();
		 eventParticipant.setId(row.getLong("id"));
		 eventParticipant.setEvent_id(row.getLong("event_id"));
		 eventParticipant.setName(row.getString("name"));
		 eventParticipant.setPhone_number(row.getString("phone_number"));
		 eventParticipant.setCountry_code(row.getString("country_code"));
		 eventParticipant.setDisplay_number(row.getString("display_number"));
		 eventParticipant.setStatus(row.getInt("status"));
		 eventParticipant.setIs_viewed(row.getBoolean("is_viewed"));
		 eventParticipant.setNotified(row.getBoolean("notified"));
		 eventParticipant.setStatus(row.getInt("status"));
		 eventParticipant.setCreated_on(row.getDate("created_on"));
		 eventParticipant.setUpdated_on(row.getDate("updated_on"));
		 eventParticipant.setRejected(row.getBoolean("rejected"));
		 
         return eventParticipant;
}
}