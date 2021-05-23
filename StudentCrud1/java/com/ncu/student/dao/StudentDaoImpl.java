package com.ncu.student.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;


import com.ncu.student.models.Student;

class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setId(rs.getString(1));
		student.setCourse(rs.getString(2));
		student.setDept(rs.getString(3));
		student.setName(rs.getString(4));
        return student;
	}
	
}

public class StudentDaoImpl implements StudentDao {
	
	 private JdbcTemplate jdbcTemplate;
	    // JdbcTemplate setter
	    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	    {
	        this.jdbcTemplate = jdbcTemplate;
	    }

	public void saveStudent(Student student) {
		String sql = "insert into students values(?,?,?,?)";

        jdbcTemplate.update(sql, new Object[]
        { student.getId(), student.getCourse(), student.getDept(), student.getName() });
		
	}

	public Student getStudentById(String id) {
		 String sql = "select * from students where id=?";
		 Student student = (Student) jdbcTemplate.queryForObject(sql, new Object[]
			        { id }, new StudentRowMapper());

//						public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//							Employee employee = new Employee();
//			                employee.setId(rs.getInt(1));
//			                employee.setAge(rs.getInt(2));
//			                employee.setDept(rs.getString(3));
//			                employee.setName(rs.getString(4));
//			                return employee;
//						}
//			 
//			 
//			        });
		return student;
			        
			           
		
		 
		
	}

	public void updateStudent(Student student) {
		String sql = "update students set course =?, dept=?,name=? where id=?";
        jdbcTemplate.update(sql, new Object[]
        { student.getCourse(), student.getDept(), student.getName(), student.getId() });
		
	}

	public void deleteStudent(String id) {
		String sql = "delete from students where id=?";
        jdbcTemplate.update(sql, new Object[]
        { id });
	}

	public List<Student> getAllStudents() {
		String sql = "select * from students";

        List<Student> studentList = jdbcTemplate.query(sql, new ResultSetExtractor<List<Student>>(){

			public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
				 List<Student> list = new ArrayList<Student>();
	                while (rs.next())
	                {
	                	Student student = new Student();
	                	student.setId(rs.getString(1));
	                	student.setCourse(rs.getString(2));
	                	student.setDept(rs.getString(3));
		                student.setName(rs.getString(4));
	                    list.add(student);
	                }
	                return list;
			}
        });
			
        
        return studentList;
		
	}

	

	}





