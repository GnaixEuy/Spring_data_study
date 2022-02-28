package com.study.spring_data_study.repository;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;

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
class UserRepositoryTest {

	private final UserRepository userRepository;

	@Test
	public void select(){
		System.out.println("222");
		this.userRepository.findAll().forEach(System.out::println);
	}

}