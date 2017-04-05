package com.elder.mapper;

import com.elder.pojo.News;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public interface NewsMapper {

	public void add(News news);

	public void delete(News news);

	public List<News> query(News news);

	public void update(News news);


}
