package com.smart.domain;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginLog implements Serializable{
	private static final long serialVersionUID = -3551597448138045227L;

	private int loginLogId;

	private int userId;

	private String ip;

	private Date loginDate;
}
