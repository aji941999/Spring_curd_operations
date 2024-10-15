package com.Curd_operation_spring_serives;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Curd_operation_spring_entity.user;
import com.Curd_operation_spring_repository.user_repository;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class userserives_imp implements user_serives {
@Autowired
private user_repository repo;
	@Override
	public user creatuser(user a) {
		
		return  repo.save(a);
	}

	@Override
	public user getuserbyid(long b) {
		// TODO Auto-generated method stub
		Optional<user> optionaluser=repo.findById(b);
		return optionaluser.get();
	}

	@Override
	public List<user> getalluser() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public user updateuser(user d) {
		// TODO Auto-generated method stub
		user exesting =repo.findById(d.getId()).get();
		exesting. setEmail("aa@gmail.com");
		return repo.save(exesting);
	}

	@Override
	public void deletuser(long e) {
		// TODO Auto-generated method stub
		 repo.deleteById(e);
		
	}

	

}
