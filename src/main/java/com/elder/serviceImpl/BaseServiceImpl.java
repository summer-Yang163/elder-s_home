package com.elder.serviceImpl;

import com.elder.service.BaseService;
import com.elder.util.exception.MessageException;
import com.elder.util.page.PageModel;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jsf on 2017/5/23.
 */
@Service
public abstract class BaseServiceImpl<T> implements BaseService<T> {


    protected PageModel<T> finalPageModel = new PageModel<T>();


    @Override
    public PageModel<T> queryAllByPage(PageModel<T> initialPageModel) {
        if (initialPageModel == null) {
            throw new MessageException("无法进行分页");
        } else {
            finalPageModel.setCurrentPage(initialPageModel.getCurrentPage());
            finalPageModel.setPageSize(initialPageModel.getPageSize());
            finalPageModel.setTotalPage(initialPageModel.getTotalPage());
            int currentTotalCount = initialPageModel.currentTotalCount(initialPageModel.getCurrentPage());
            List<T> tList = executeQueryAllByPage(currentTotalCount, initialPageModel.getPageSize());
            int totalRows = queryTotalRows();
            finalPageModel.setTotalRows(totalRows);
            finalPageModel.setDataList(tList);

        }
        return finalPageModel;
    }

    public abstract List<T> executeQueryAllByPage(int currentTotalCount, int pageSize);

    public abstract List<T> executeQueryAll();

    public abstract int queryTotalRows();

}
