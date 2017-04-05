package com.elder.mapper;

import com.elder.pojo.Tip;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public interface TipMapper {

	public void add(Tip tip);

	public void delete(Tip tip);

	public List<Tip> query(Tip tip);

	public void update(Tip tip);


}
