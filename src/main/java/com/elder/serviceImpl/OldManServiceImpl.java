package com.elder.serviceImpl;

import com.elder.domain.OldMan;
import com.elder.enums.IsHideEnums;
import com.elder.mapper.OldManMapper;
import com.elder.service.OldManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OldManServiceImpl extends BaseServiceImpl<OldMan> implements OldManService {
    @Autowired
    private OldManMapper oldManMapper;

    @Override
    public List<OldMan> executeQueryAllByPage(int currentTotalCount, int pageSize) {
        List<OldMan> oldManList=oldManMapper.executeQueryAllByPage(IsHideEnums.NOHIDE.getIsHide(),currentTotalCount,pageSize);
        return oldManList;
    }

    @Override
    public List<OldMan> executeQueryAll() {
        return null;
    }

    @Override
    public int queryTotalRows() {
        int totalRows = oldManMapper.queryTotalRows(IsHideEnums.NOHIDE.getIsHide());
        return totalRows;
    }

    @Override
    public int deleteOldManByOldId(int oldId) {
        OldMan oldMan=oldManMapper.selectByPrimaryKey(oldId);
        if(oldMan!=null){
            oldMan.setIsHide(IsHideEnums.YESHIDE.getIsHide());
            oldManMapper.updateByPrimaryKey(oldMan);
        }
        return oldMan.getIsHide();
    }

    @Override
    public int updateOldMan(OldMan oldMan) {
        int i=oldManMapper.updateByPrimaryKey(oldMan);
        return i;
    }

    @Override
    public int insertOldMan(OldMan oldMan) {
        oldMan.setIsHide(IsHideEnums.NOHIDE.getIsHide());
        int i=oldManMapper.insert(oldMan);
        return i;
    }
}
