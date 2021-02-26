package com.cook.mapper;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.cook.domain.UserInfo;

/**
 * 用户Mapper接口
 * 
 * @author cook studio
 * @date 2021-02-26
 */
@Repository
public interface UserInfoMapper 
{
    /**
     * 查询用户
     * 
     * @param id 用户ID
     * @return 用户
     */
    public UserInfo selectUserInfoById(String id);

    /**
     * 查询用户列表
     * 
     * @param userInfo 用户
     * @return 用户集合
     */
    public List<UserInfo> selectUserInfoList(UserInfo userInfo);

    /**
     * 新增用户
     * 
     * @param userInfo 用户
     * @return 结果
     */
    public int insertUserInfo(UserInfo userInfo);

    /**
     * 修改用户
     * 
     * @param userInfo 用户
     * @return 结果
     */
    public int updateUserInfo(UserInfo userInfo);

    /**
     * 删除用户
     * 
     * @param id 用户ID
     * @return 结果
     */
    public int deleteUserInfoById(String id);

    /**
     * 批量删除用户
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteUserInfoByIds(String[] ids);
}
