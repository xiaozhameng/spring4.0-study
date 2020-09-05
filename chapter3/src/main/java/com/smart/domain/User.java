package com.smart.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{
	private int userId;

	private String userName;

	private String password;

	private int credits;

	private String lastIp;

	private Date lastVisit;
}
