package com.elder.service;

import com.elder.domain.OldMan;


public interface OldManService extends BaseService<OldMan> {

    int deleteOldManByOldId(int oldId);

    int updateOldMan(OldMan oldMan);

    int insertOldMan(OldMan oldMan);
}
