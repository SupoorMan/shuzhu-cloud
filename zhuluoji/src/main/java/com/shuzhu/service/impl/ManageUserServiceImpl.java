package com.shuzhu.service.impl;

import com.shuzhu.entity.ManageUser;
import com.shuzhu.mapper.ManageUserMapper;
import com.shuzhu.service.ManageUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台管理用户 服务实现类
 * </p>
 *
 * @author Poor
 * @since 2022-12-12
 */
@Service
public class ManageUserServiceImpl extends ServiceImpl<ManageUserMapper, ManageUser> implements ManageUserService {

}
