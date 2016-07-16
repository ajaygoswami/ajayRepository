package stripes.demo.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import stripes.demo.Constants.QueryConstants;
import stripes.demo.action.factory.BaseJdbcDAO;
import stripes.demo.action.user.User;
import stripes.demo.dao.RegisterDAO;

public class RegisterDAOImpl extends BaseJdbcDAO implements RegisterDAO {

	@Override
	public String registerUser(User user) {
		
		
		Object[] params = new Object[] { user.getUsername(), user.getPassword(), user.getContact().getEmail(),
				user.getContact().getFirstName(), user.getContact().getMiddleName(), user.getContact().getLastName(),
				user.getContact().getMobNo() };
		int[] types = new int[] { Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR,
				Types.VARCHAR, Types.INTEGER };
		int row = getJdbcTemplate().update(QueryConstants.INSERTNEWUSER, params, types);
		String mgs = +row + "row inserted";
		return mgs;
	}
/*
 * To check whether user already exists
 */
	@Override
	public Boolean isUserExist(String username) {
		Boolean userExists=false;
		String sql="select username from usermgtusers where username='"+username+"'";
		@SuppressWarnings("unchecked")
		List<String> count=getJdbcTemplate().query(sql,new RowMapper(){

			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
			
				return rs.getString("username");
			}
			
		});
		if(count.size()!=0){
			userExists=true;
		}
		return userExists;
	}
	

}
