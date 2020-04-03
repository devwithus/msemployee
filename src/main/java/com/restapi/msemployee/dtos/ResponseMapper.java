package com.restapi.msemployee.dtos;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.restapi.msemployee.web.ResponseError;

public class ResponseMapper {

	public static ResponseEntity<Object> errorToEntity(ResponseError err,HttpStatus status) {
		return new ResponseEntity<Object>(err,status);
	}
}
