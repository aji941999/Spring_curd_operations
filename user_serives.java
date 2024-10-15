package com.Curd_operation_spring_serives;

import java.util.List;

import com.Curd_operation_spring_entity.user;

public interface user_serives {
	user creatuser(user a);
	user getuserbyid(long b);
	List<user>getalluser();
	user updateuser(user c);
	void deletuser(long d);
	

}
