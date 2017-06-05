package com.elder.service;

import com.elder.util.page.PageModel;


public interface BaseService<T> {
    PageModel<T> queryAllByPage(PageModel<T> pageModel);
}
