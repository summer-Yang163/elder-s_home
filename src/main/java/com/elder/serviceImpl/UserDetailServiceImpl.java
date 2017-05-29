package com.elder.serviceImpl;

import com.elder.domain.User;
import com.elder.domain.UserDetails;
import com.elder.enums.IsHideEnums;
import com.elder.mapper.UserDetailsMapper;
import com.elder.mapper.UserMapper;
import com.elder.service.UserDetailService;
import com.elder.util.page.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jsf on 2017/5/24.
 */
@Service
public class UserDetailServiceImpl extends BaseServiceImpl<UserDetails> implements UserDetailService {
    @Autowired
    private UserDetailsMapper userDetailsMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDetails> executeQueryAllByPage(int currentTotalCount, int pageSize) {
        List<UserDetails> userDetailsList = userDetailsMapper.executeQueryAllByPage(IsHideEnums.NOHIDE.getIsHide(), currentTotalCount, pageSize);
        for (UserDetails userDetails : userDetailsList) {
            userDetails.setUserDetatilsUser(userDetails.loadUserDetatilsUser());
        }
        return userDetailsList;
    }

    @Override
    public List<UserDetails> executeQueryAll() {
        return null;
    }

    //isHide,1是，2否
    @Override
    public int queryTotalRows() {
        int totalRows = userDetailsMapper.queryTotalRows(IsHideEnums.NOHIDE.getIsHide());
        return totalRows;
    }

    @Override
    public int updateUserDetails(UserDetails userDetails) {
        int i = userDetailsMapper.updateByPrimaryKey(userDetails);
        return i;
    }

    @Override
    public int deleteUserDetailsByUserDetailsId(int userDetailsId, int userId) {
        UserDetails userDetails = userDetailsMapper.selectByPrimaryKey(userDetailsId);
        userDetails.setIsHide(IsHideEnums.YESHIDE.getIsHide());
        userDetailsMapper.updateByPrimaryKey(userDetails);
        User user = userDetails.loadUserDetatilsUser();
        user.setIsHide(IsHideEnums.YESHIDE.getIsHide());
        userMapper.updateByPrimaryKey(user);
        return userDetails.getIsHide();
    }

    @Override
    public int insertUserDetails(UserDetails userDetails) {
        int i = userDetailsMapper.insert(userDetails);
        return i;
    }
}