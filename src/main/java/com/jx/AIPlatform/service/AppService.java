package com.jx.AIPlatform.service;

import com.jx.AIPlatform.model.dto.app.AppQueryRequest;
import com.jx.AIPlatform.model.vo.AppVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.jx.AIPlatform.model.entity.App;

import java.util.List;

/**
 * 应用 服务层。
 *
 * @author JX
 */
public interface AppService extends IService<App> {

    /**
     * 获取应用封装类
     * @param app
     * @return
     */
    AppVO getAppVO(App app);

    /**
     * 构造应用查询条件
     * @param appQueryRequest
     * @return
     */
    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

    /**
     * 获取应用封装列表
     * @param appList
     * @return
     */
    List<AppVO> getAppVOList(List<App> appList);
}
