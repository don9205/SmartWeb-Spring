package kr.green.spring.service;

import kr.green.spring.vo.AccountVo;

public interface AccountService {
	public AccountVo getAccount(String id);
<<<<<<< Updated upstream
	
	public boolean signup(AccountVo accountVo);
	
	public AccountVo signin(String id, String pw);
=======

	public boolean signup(AccountVo accountVo);
>>>>>>> Stashed changes

	
}