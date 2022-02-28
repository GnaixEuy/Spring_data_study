package com.study.spring_data_study.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 *
 * @author GnaixEuy
 * @date 2022/2/28
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
@Data
public class UserDto implements Serializable {
	private final String id;
	private final Date createdTime;
	private final Date updatedTime;
	private final String name;
	private final String nickname;
	private final String password;
	private final String enabled;
	private final String locked;
}
