package com.elder.service;

import com.elder.domain.UserDetails;
import com.elder.util.page.PageModel;


public interface UserDetailService extends BaseService<UserDetails> {

    int updateUserDetails(UserDetails userDetails);

    int deleteUserDetailsByUserDetailsId(int userDetailsId,int userId);

    int insertUserDetails(UserDetails userDetails);

}
