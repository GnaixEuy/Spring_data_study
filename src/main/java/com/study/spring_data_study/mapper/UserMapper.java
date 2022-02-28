package com.study.spring_data_study.mapper;

import com.study.spring_data_study.dto.UserDto;
import com.study.spring_data_study.entity.User;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 *
 * @author GnaixEuy
 * @date 2022/2/28
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
@Mapper(componentModel = "spring")
public interface UserMapper {

	User userDtoToUser(UserDto userDto);

	UserDto userToUserDto(User user);

	@BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
	void updateUserFromUserDto(UserDto userDto, @MappingTarget User user);

}
