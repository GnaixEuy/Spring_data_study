package com.study.spring_data_study.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.security.SecureRandom;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 *
 * @author GnaixEuy
 * @date 2022/2/28
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "user")
@Table(name = "user")
public class User extends BaseEntity{

	@ToString.Include
	private  String name;

	@ToString.Include
	private String nickname;

	@ToString.Include
	private  String password;

	@ToString.Include
	private String telephone;

	@ToString.Include
	private String enabled;

	@ToString.Include
	private String locked;


}
