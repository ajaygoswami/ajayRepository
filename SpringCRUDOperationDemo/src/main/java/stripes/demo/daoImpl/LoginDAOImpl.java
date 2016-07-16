package stripes.demo.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import stripes.demo.action.factory.BaseJdbcDAO;
import stripes.demo.action.user.User;
import stripes.demo.dao.LoginDAO;

public class LoginDAOImpl extends BaseJdbcDAO implements LoginDAO {
	/*
	 * Holds instance of AuthenticationMapper
	 */
	private final AuthenticationMapper authenticationMapper=new AuthenticationMapper();
	/*
	 * (non-Javadoc)
	 * @see stripes.demo.dao.LoginDAO#authenticateUser(java.lang.String, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public User authenticateUser(String userId, String password) {
		User user1 = new User();
		String sql = "select * from USERMGTUSERS where username='" + userId + "' and password='" + password + "'";
		
		List<User> loggingUser = getJdbcTemplate().query(sql, authenticationMapper); 

	
		if (loggingUser.size() == 0) {
			user1.setMsg("User does not Exist");

		} else {
			user1 = loggingUser.get(0);
		}

		return user1;
	}

	private class AuthenticationMapper implements RowMapper {

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			
			user.setUsername(rs.getString("username"));
		
			return user;
		}
	

	}

}
