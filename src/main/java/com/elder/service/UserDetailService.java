package com.elder.service;

import com.elder.domain.UserDetails;
import com.elder.util.page.PageModel;

/**
 * Created by jsf on 2017/5/24.
 */
public interface UserDetailService extends BaseService<UserDetails> {

    int updateUserDetails(UserDetails userDetails);

    int deleteUserDetailsByUserDetailsId(int userDetailsId,int userId);

    int insertUserDetails(UserDetails userDetails);

}
