package com.elder.mapper;

import com.elder.pojo.User;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public interface UserMapper {

	public void add(User user);

	public void delete(User user);

	public List<User> query(User user);

	public void update(User user);


}
