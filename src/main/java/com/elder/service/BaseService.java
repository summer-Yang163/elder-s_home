package com.elder.service;

import com.elder.util.page.PageModel;

/**
 * Created by jsf on 2017/5/23.
 */
public interface BaseService<T> {
    PageModel<T> queryAllByPage(PageModel<T> pageModel);
}
