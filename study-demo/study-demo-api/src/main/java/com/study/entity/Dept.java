package com.study.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class Dept implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String dbSource;
}
