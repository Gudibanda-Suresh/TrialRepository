package com.suresh.customerdatamanagement.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ResponseStructure<T>
{

	private Integer statusCode;
	private T date;
	private String message;
	private LocalDateTime timeStamp;
	
}
