package com.elder.mapper;

import com.elder.pojo.ServiceUser;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public interface ServiceUserMapper {

	public void add(ServiceUser serviceUser);

	public void delete(ServiceUser serviceUser);

	public List<ServiceUser> query(ServiceUser serviceUser);

	public void update(ServiceUser serviceUser);


}
