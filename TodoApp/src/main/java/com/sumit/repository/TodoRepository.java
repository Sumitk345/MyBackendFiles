package com.sumit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sumit.dto.EmployeePriority;
import com.sumit.dto.TodoProrityCount;
import com.sumit.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer>{

	@Query(value="SELECT T.priority as todos,COUNT(T.priority) as count FROM Todo T GROUP BY T.priority",nativeQuery = true)
	public List<TodoProrityCount> findCountByPriority();
	
	//@Query(value = "SELECT t.priority as priority , e.emp_name as employees \r\n"+ "FROM todo_employee te\r\n"+ "join todo t on te.todo_id = t.id\r\n"+ "join employee e on te.employee_id = e.id GROUP BY t.priority ",nativeQuery = true)
	@Query(value = "SELECT t.priority AS priority, GROUP_CONCAT(e.emp_name SEPARATOR ',') AS employees " +
            "FROM todo_employee te " +
            "JOIN todo t ON te.todo_id = t.id " +
            "JOIN employee e ON te.employee_id = e.id " +
            "GROUP BY t.priority", nativeQuery = true)
	public List<EmployeePriority> findemployeeBypriority();
	
	@Query(value = "SELECT t.priority AS priority, GROUP_CONCAT(e.emp_name SEPARATOR ',') AS employees " +
            "FROM todo_employee te " +
            "JOIN todo t ON te.todo_id = t.id " +
            "JOIN employee e ON te.employee_id = e.id " +
            "WHERE t.priority = :priority " +
            "GROUP BY t.priority", nativeQuery = true)
	public List<EmployeePriority> findemployeeBypriorityName(@Param("priority") String priority);
}
