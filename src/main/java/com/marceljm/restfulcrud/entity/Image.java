package com.marceljm.restfulcrud.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "image")
public class Image {

	@Id
	private Long id;

}
