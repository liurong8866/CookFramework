package com.cook.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cook.mapper.UserInfoMapper;
import com.cook.domain.UserInfo;
import com.cook.service.IUserInfoService;

/**
 * 用户Service业务层处理
 * 
 * @author cook studio
 * @date 2021-02-26
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService 
{
    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 查询用户
     * 
     * @param id 用户ID
     * @return 用户
     */
    @Override
    public UserInfo selectUserInfoById(String id)
    {
        return userInfoMapper.selectUserInfoById(id);
    }

    /**
     * 查询用户列表
     * 
     * @param userInfo 用户
     * @return 用户
     */
    @Override
    public List<UserInfo> selectUserInfoList(UserInfo userInfo)
    {
        return userInfoMapper.selectUserInfoList(userInfo);
    }

    /**
     * 新增用户
     * 
     * @param userInfo 用户
     * @return 结果
     */
    @Override
    public int insertUserInfo(UserInfo userInfo)
    {
        return userInfoMapper.insertUserInfo(userInfo);
    }

    /**
     * 修改用户
     * 
     * @param userInfo 用户
     * @return 结果
     */
    @Override
    public int updateUserInfo(UserInfo userInfo)
    {
        return userInfoMapper.updateUserInfo(userInfo);
    }

    /**
     * 批量删除用户
     * 
     * @param ids 需要删除的用户ID
     * @return 结果
     */
    @Override
    public int deleteUserInfoByIds(String[] ids)
    {
        return userInfoMapper.deleteUserInfoByIds(ids);
    }

    /**
     * 删除用户信息
     * 
     * @param id 用户ID
     * @return 结果
     */
    @Override
    public int deleteUserInfoById(String id)
    {
        return userInfoMapper.deleteUserInfoById(id);
    }
}
