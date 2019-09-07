package com.cg.hcs.service;

import com.cg.hcs.dto.DiagnosticCenter;
import com.cg.hcs.dto.Test;
import com.cg.hcs.dto.User;

public interface UserService {
	public void addCenter(DiagnosticCenter center);
	public void updateCenter(DiagnosticCenter center);
	public void removeCenter(DiagnosticCenter center);
	public void addTest(Test test);
	public void updateTest(Test test);
	public void removeTest(Test test);
	public void approveAppointment();
	public String makeAppointment(User user,Diagnostic center,Test test,String datetime);
	public void showDetails(User user);
}
