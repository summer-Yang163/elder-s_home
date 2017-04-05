package com.elder.mapper;

import com.elder.pojo.Community;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public interface CommunityMapper {

	public void add(Community community);

	public void delete(Community community);

	public List<Community> query(Community community);

	public void update(Community community);


}
