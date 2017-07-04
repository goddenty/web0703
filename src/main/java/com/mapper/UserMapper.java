package com.mapper;

import com.bean.User;

public interface UserMapper {
	/**
	 * 根据ID查询用户信息
	 * @param id
	 * @return
	 */
	public User getUserById(Integer id);
	public User getUserByUsername(String username);
	

}
