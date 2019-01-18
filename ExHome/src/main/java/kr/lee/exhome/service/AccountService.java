package kr.lee.exhome.service;

import kr.lee.exhome.vo.AccountVo;

public interface AccountService {
	public AccountVo getAccount(String id);
	boolean signup(AccountVo accountVo);

}
