package com.elder.serviceImpl;

import com.elder.domain.UserDetails;
import com.elder.mapper.UserDetailsMapper;
import com.elder.service.UserDetailService;
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

    @Override
    public List<UserDetails> executeQueryAllByPage(int currentTotalCount, int pageSize) {
        List<UserDetails> userDetailsList=userDetailsMapper.executeQueryAllByPage(currentTotalCount,pageSize);
        for(UserDetails userDetails:userDetailsList){
            userDetails.setUserDetatilsUser(userDetails.loadUserDetatilsUser());
        }
        return userDetailsList;
    }

    @Override
    public int queryTotalRows() {
        int totalRows=userDetailsMapper.queryTotalRows();
        return totalRows;
    }

    @Override
    public int updateUserDetails(UserDetails userDetails) {
        int i=userDetailsMapper.updateByPrimaryKey(userDetails);
        return i;
    }

    @Override
    public int deleteUserDetailsByUserDetailsId(int userDetailsId) {
        int i=userDetailsMapper.deleteByPrimaryKey(userDetailsId);
        return i;
    }

    @Override
    public int insertUserDetails(UserDetails userDetails) {
        int i=userDetailsMapper.insert(userDetails);
        return i;
    }
}