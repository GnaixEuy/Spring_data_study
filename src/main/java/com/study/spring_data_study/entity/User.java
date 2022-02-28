package com.study.spring_data_study.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

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
@ToString(onlyExplicitlyIncluded = true)
@Entity(name = "user")
@Table(name = "user")
public class User extends BaseEntity{

	@ToString.Include
	@Column(name = "username")
	private  String username;

	@ToString.Include
	@Column(name = "nickname")
	private String nickname;

	@ToString.Include
	@Column(name = "password")
	private  String password;

	@ToString.Include
	@Column(name = "enabled")
	private String enabled;

	@ToString.Include
	@Column(name = "locked")
	private String locked;


}
