package kr.lee.exhome.dao;

import org.apache.ibatis.annotations.Param;

import kr.lee.exhome.vo.AccountVo;

public interface AccountDao {
	public AccountVo getAccount(String id);
	public void setAccount(@Param("accountVo")AccountVo accountVo);

}