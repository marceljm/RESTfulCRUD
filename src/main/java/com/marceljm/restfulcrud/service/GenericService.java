package com.marceljm.restfulcrud.service;

import java.util.List;

public interface GenericService<T> {

	public List<T> select(Class<T> clazz);

	public List<T> select(Class<T> clazz, String column);

	public T select(Class<T> clazz, Long id);

	public void insert(T t);

	public void update(T t);

	public void delete(T t);

}
