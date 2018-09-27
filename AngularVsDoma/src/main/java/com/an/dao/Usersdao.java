package com.an.dao;

import java.util.List;

 
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.beans.factory.annotation.Configurable;

import com.an.model.Users;

@ConfigAutowireable
@Dao
public interface Usersdao {
	@Select
	List<Users> selectAllUsers();
	
	@Select
	void selectabc(); 
}
