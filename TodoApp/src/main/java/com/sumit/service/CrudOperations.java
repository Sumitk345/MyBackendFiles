package com.sumit.service;

import java.util.List;

public interface CrudOperations<T> {

	public T saveobject(T object);
	public List<T> fetchAllRecords();
	public T getSingleRecord(int id);
	public T modifyDbRecordById(int id, T object);
	public void deleteRecordById(int id);
}
