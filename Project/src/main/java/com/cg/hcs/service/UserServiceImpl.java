package com.cg.hcs.service;

import com.cg.hcs.dao.UserDao;
import com.cg.hcs.dao.UserDaoImpl;
import com.cg.hcs.dto.DiagnosticCenter;
import com.cg.hcs.dto.Test;
import com.cg.hcs.dto.User;

public class UserServiceImpl implements UserService{

	UserDao userdao=new UserDaoImpl();
	public void addCenter(DiagnosticCenter center) {
		// TODO Auto-generated method stub
		userdao.addCenter(center);
		
	}

	public void updateCenter(DiagnosticCenter center) {
		// TODO Auto-generated method stub
		userdao.updateCenter(center);
		
	}

	public void removeCenter(DiagnosticCenter center) {
		// TODO Auto-generated method stub
		userdao.removeCenter(center);
		
	}

	public void addTest(Test test) {
		// TODO Auto-generated method stub
		userdao.addTest(test);
		
	}

	public void updateTest(Test test) {
		// TODO Auto-generated method stub
		
	}

	public void removeTest(Test test) {
		// TODO Auto-generated method stub
		
	}

	public void approveAppointment() {
		// TODO Auto-generated method stub
		
	}

	public String makeAppointment(User user, DiagnosticCenter center, Test test, String datetime) {
		// TODO Auto-generated method stub
		return null;
	}

	public void showDetails(User user) {
		// TODO Auto-generated method stub
		
	}

	}
