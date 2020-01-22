package pack;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.dao.*;
import java.sql.SQLException;
import java.util.*;

import org.springframework.dao.*;


public class StudentDao {
private JdbcTemplate jdbcTemplate;


public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
{
	this.jdbcTemplate=jdbcTemplate;
}

	public int saveStudent(Student e){  
		 String query="insert into student values('"+e.getSid()+"','"+e.getName()+"')";  
	   return jdbcTemplate.update(query);  
	}
	
	public int updateStudent(Student e){  
	    String query="update student set sname='"+e.getName()+"' where sid='"+e.getSid()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	
	public int deleteStudent(Student e){  
	    String query="delete from student where sid='"+e.getSid()+"' ";  
	    return jdbcTemplate.update(query);  
	} 

	public List<Student>getAllStudents()
	{
		return jdbcTemplate.query("select * from student",new ResultSetExtractor<List<Student>>(){
	  
			@Override
			public List<Student>extractData(java.sql.ResultSet rs) throws SQLException,DataAccessException{
			List<Student>list=new ArrayList<Student>();
			while(rs.next())
			{
				Student e=new Student();
				e.setSid(rs.getInt(1));
				
				e.setName(rs.getString(2));
				list.add(e);
			}
			return list;
				
			}
			
		});
	
	
	}
}
