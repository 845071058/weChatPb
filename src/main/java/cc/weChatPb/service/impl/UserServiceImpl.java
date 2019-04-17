package cc.weChatPb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cc.weChatPb.entity.User;
import cc.weChatPb.mapper.UserMapper;
import cc.weChatPb.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	public List<User> findAllUser() {
		return userMapper.findAllUser();
	}

}
