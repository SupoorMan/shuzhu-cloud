package com.shuzhu.service.impl;

import com.shuzhu.entity.AppletUser;
import com.shuzhu.mapper.AppletUserMapper;
import com.shuzhu.service.AppletUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 小程序用户表 服务实现类
 * </p>
 *
 * @author Poor
 * @since 2022-12-12
 */
@Service
public class AppletUserServiceImpl extends ServiceImpl<AppletUserMapper, AppletUser> implements AppletUserService {

}
