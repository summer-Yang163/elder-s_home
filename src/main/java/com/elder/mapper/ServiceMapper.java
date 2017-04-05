package com.elder.mapper;

import com.elder.pojo.Service;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public interface ServiceMapper {

	public void add(Service service);

	public void delete(Service service);

	public List<Service> query(Service service);

	public void update(Service service);


}
