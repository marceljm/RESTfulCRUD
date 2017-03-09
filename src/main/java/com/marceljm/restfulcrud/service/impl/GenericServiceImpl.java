package com.marceljm.restfulcrud.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.service.spi.InjectService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marceljm.restfulcrud.persistence.GenericDAO;
import com.marceljm.restfulcrud.service.GenericService;

@Service
public class GenericServiceImpl<T> implements GenericService<T> {

	@Inject
	private GenericDAO<T> dao;

	@Override
	public List<T> select(Class<T> clazz) {
		return dao.select(clazz);
	}

	@Override
	public List<T> select(Class<T> clazz, String column) {
		return dao.select(clazz, column);
	}

	@Override
	public T select(Class<T> clazz, Long id) {
		return dao.select(clazz, id);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void insert(T t) {
		dao.insert(t);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void update(T t) {
		dao.update(t);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void delete(T t) {
		dao.delete(t);
	}

}
