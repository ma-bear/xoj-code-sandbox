package com.example.xojcodesandbox.security;

/**
 * @author xq
 * @create 2024/4/5 20:43
 */

import java.security.Permission;

/**
 * 默认安全管理器
 * @author 29923
 */

// extends SecurityManager  已过时
public class DefaultSecurityManager extends SecurityManager{

    // 检查所有的权限
    @Override
    public void checkPermission(Permission perm) {
        System.out.println("默认不做任何限制");
        System.out.println(perm);
//        super.checkPermission(perm);
    }
}

