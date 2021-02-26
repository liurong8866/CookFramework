package com.cook.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cook.common.annotation.Log;
import com.cook.common.core.controller.BaseController;
import com.cook.common.domain.AjaxResult;
import com.cook.common.enums.BusinessType;
import com.cook.domain.UserInfo;
import com.cook.service.IUserInfoService;
import com.cook.common.utils.poi.ExcelUtil;
import com.cook.common.core.page.TableDataInfo;

/**
 * 用户Controller
 * 
 * @author cook studio
 * @date 2021-02-26
 */
@RestController
@RequestMapping("/service/info")
public class UserInfoController extends BaseController
{
    @Autowired
    private IUserInfoService userInfoService;

    /**
     * 查询用户列表
     */
    @PreAuthorize("@ss.hasPermi('service:info:list')")
    @GetMapping("/list")
    public TableDataInfo list(UserInfo userInfo)
    {
        startPage();
        List<UserInfo> list = userInfoService.selectUserInfoList(userInfo);
        return getDataTable(list);
    }

    /**
     * 导出用户列表
     */
    @PreAuthorize("@ss.hasPermi('service:info:export')")
    @Log(title = "用户", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(UserInfo userInfo)
    {
        List<UserInfo> list = userInfoService.selectUserInfoList(userInfo);
        ExcelUtil<UserInfo> util = new ExcelUtil<UserInfo>(UserInfo.class);
        return util.exportExcel(list, "info");
    }

    /**
     * 获取用户详细信息
     */
    @PreAuthorize("@ss.hasPermi('service:info:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return AjaxResult.success(userInfoService.selectUserInfoById(id));
    }

    /**
     * 新增用户
     */
    @PreAuthorize("@ss.hasPermi('service:info:add')")
    @Log(title = "用户", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserInfo userInfo)
    {
        return toAjax(userInfoService.insertUserInfo(userInfo));
    }

    /**
     * 修改用户
     */
    @PreAuthorize("@ss.hasPermi('service:info:edit')")
    @Log(title = "用户", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserInfo userInfo)
    {
        return toAjax(userInfoService.updateUserInfo(userInfo));
    }

    /**
     * 删除用户
     */
    @PreAuthorize("@ss.hasPermi('service:info:remove')")
    @Log(title = "用户", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(userInfoService.deleteUserInfoByIds(ids));
    }
}
