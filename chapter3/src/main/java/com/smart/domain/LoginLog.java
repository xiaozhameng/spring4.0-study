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
public class LoginLog implements Serializable{
	private int loginLogId;

	private int userId;

	private String ip;

	private Date loginDate;
}
