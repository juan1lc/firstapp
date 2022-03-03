package com.bstest.newsbs.service;

import com.bstest.newsbs.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserDto> list();
}
