SELECT * FROM todos.todo;
SELECT T.priority,COUNT(T.priority) as Count FROM Todo T GROUP BY T.priority;

SELECT T.priority, E.emp_name, E.role
FROM Todo_Employee TE
JOIN Todo T ON TE.todo_id=T.id
JOIN Employee E ON TE.employee_id=E.id
WHERE E.role='Architect';

SELECT T.priority AS todoPriority, COUNT(T.priority) AS count
FROM Todo_Employee TE
JOIN Todo T ON TE.todo_id=T.id
JOIN Employee E ON TE.employee_id=E.id
WHERE E.role='Architect'
GROUP BY T.priority;


SELECT T.priority AS todoPriority, COUNT(T.priority) AS count FROM Todo_Employee TE JOIN Todo T ON TE.todo_id=T.id JOIN Employee E ON TE.employee_id=E.id WHERE E.role='Architect' GROUP BY T.priority;
