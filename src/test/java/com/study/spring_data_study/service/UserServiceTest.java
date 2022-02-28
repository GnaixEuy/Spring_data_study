package com.study.spring_data_study.service;

import com.study.spring_data_study.dto.UserDto;
import com.study.spring_data_study.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 *
 * @author GnaixEuy
 * @date 2022/2/28
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
@SpringBootTest
@RequiredArgsConstructor(onConstructor_ = {@Lazy, @Autowired})
class UserServiceTest {

	private final UserService userService;
	private final UserMapper userMapper;

	@Test
	public void test() {
		System.out.println("奇怪");
		final List<UserDto> collect = this.userService
				.getUsers()
				.stream()
				.map(this.userMapper::userToUserDto)
				.collect(Collectors.toList());
		System.out.println("奇怪");
		collect.forEach(System.out::println);
	}

}