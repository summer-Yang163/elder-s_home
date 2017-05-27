package com.elder.service;

import com.elder.domain.OldMan;

/**
 * Created by jsf on 2017/5/27.
 */
public interface OldManService extends BaseService<OldMan> {

    int deleteOldManByOldId(int oldId);

    int updateOldMan(OldMan oldMan);

    int insertOldMan(OldMan oldMan);
}
