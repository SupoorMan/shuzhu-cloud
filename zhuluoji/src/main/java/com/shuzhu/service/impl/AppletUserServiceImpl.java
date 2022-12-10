package com.shuzhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.shuzhu.entity.AppletUser;
import com.shuzhu.mapper.AppletUserMapper;
import com.shuzhu.service.AppletUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shuzhu.util.StringUtil;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 小程序用户表 服务实现类
 * </p>
 *
 * @author Poor
 * @since 2022-12-09
 */
@Service
public class AppletUserServiceImpl extends ServiceImpl<AppletUserMapper, AppletUser> implements AppletUserService {

    @Override
    public AppletUser findByField(AppletUser appletUser) {
        LambdaQueryWrapper<AppletUser> wrapper = Wrappers.lambdaQuery();
        if (StringUtil.isNotEmpty(appletUser.getPhone())) {
            wrapper.eq(AppletUser::getPhone, appletUser.getPhone());
        }
        return this.getOne(wrapper);
    }
}
