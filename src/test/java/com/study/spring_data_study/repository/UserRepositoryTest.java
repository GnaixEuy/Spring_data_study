package com.study.spring_data_study.repository;

import com.study.spring_data_study.entity.User;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.PageRequest;

import java.util.ArrayList;
import java.util.List;


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
	void insert(){
		List<User> users = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			users.add(new User("username"+i,"nikename"+i,"password"+i,Boolean.FALSE,Boolean.FALSE));
		}
		users = this.userRepository.saveAll(users);
		users.forEach(Assertions::assertNotNull);
	}


	@Test
	void findById() {
	}

	@Test
	void findAll() {
		this.userRepository
				.findAll()
				.forEach(Assertions::assertNotNull);
	}

	@Test
	void testFindAll() {
		this.userRepository.findAll(PageRequest.of(1, 3))
				.getContent()
				.forEach(System.out::println);
	}
}