package com.shuzhu.service;

import com.shuzhu.entity.AppletUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 小程序用户表 服务类
 * </p>
 *
 * @author Poor
 * @since 2022-12-09
 */
public interface AppletUserService extends IService<AppletUser> {

    AppletUser findByField(AppletUser appletUser);

}
