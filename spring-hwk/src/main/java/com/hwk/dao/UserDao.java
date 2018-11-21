package com.hwk.dao;

import org.apache.ibatis.annotations.Select;

public interface UserDao {

	@Select("select * from t_user")
	void list(String param);
}
