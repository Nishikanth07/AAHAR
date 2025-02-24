package com.aahar.dtos;

import com.aahar.pojos.Location;
import com.aahar.pojos.User;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessReqDTO {
	    private String messName;
	    private String address;
	    private Long locationId;
        private String description;
	    private String contactNumber;
	    private String openingHours;
	    private Long messOwnerId;  
	    
}
