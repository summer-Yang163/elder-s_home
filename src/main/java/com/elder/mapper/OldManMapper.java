package com.elder.mapper;

import com.elder.pojo.OldMan;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public interface OldManMapper {

	public void add(OldMan oldMan);

	public void delete(OldMan oldMan);

	public List<OldMan> query(OldMan oldMan);

	public void update(OldMan oldMan);


}
