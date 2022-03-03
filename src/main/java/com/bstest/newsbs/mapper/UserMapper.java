package com.bstest.newsbs.mapper;

import com.bstest.newsbs.dto.UserDto;
import com.bstest.newsbs.entity.User;
import com.bstest.newsbs.vo.UserVo;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface UserMapper {
    UserDto toDto(User user);

    UserVo toVo(UserDto userDto);
}
