package com.jx.AIPlatform.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.jx.AIPlatform.model.entity.App;
import com.jx.AIPlatform.mapper.AppMapper;
import com.jx.AIPlatform.service.AppService;
import org.springframework.stereotype.Service;

/**
 * 应用 服务层实现。
 *
 * @author JX
 */
@Service
public class AppServiceImpl extends ServiceImpl<AppMapper, App>  implements AppService{

}
