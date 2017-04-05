package com.elder.mapper;

import com.elder.pojo.Admin;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public interface AdminMapper {

	public void add(Admin admin);

	public void delete(Admin admin);

	public List<Admin> query(Admin admin);

	public void update(Admin admin);


}
