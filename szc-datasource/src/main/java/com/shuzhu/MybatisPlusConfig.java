package com.shuzhu;

import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis-plus 组件注册
 * 1. 自动分页: PaginationInnerInterceptor
 * 2. 多租户: TenantLineInnerInterceptor
 * 3. 动态表名: DynamicTableNameInnerInterceptor
 * 4. 乐观锁: OptimisticLockerInnerInterceptor
 * 5. sql 性能规范: IllegalSQLInnerInterceptor
 * 6. 防止全表更新与删除: BlockAttackInnerInterceptor
 * <p>
 * 使用多个功能需要注意顺序关系,建议使用如下顺序
 * 多租户,动态表名
 * 分页,乐观锁
 * sql 性能规范,防止全表更新与删除
 */
@Configuration
public class MybatisPlusConfig {

    /**
     * 分页插件注册
     * @return 分页拦截器
     */
    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptor() {
        PaginationInnerInterceptor interceptor = new PaginationInnerInterceptor();
        interceptor.setMaxLimit(500L);
        return interceptor;
    }


}
