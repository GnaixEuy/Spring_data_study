package com.study.spring_data_study.service.impl;

import com.study.spring_data_study.entity.User;
import com.study.spring_data_study.repository.UserRepository;
import com.study.spring_data_study.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 *
 * @author GnaixEuy
 * @date 2022/2/28
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	@Override
	public List<User> getUsers() {
		return  this.userRepository.findAll();
	}
}
