package com.example.xojcodesandbox.security;

/**
 * @author xq
 * @create 2024/4/5 20:48
 */

import java.security.Permission;

/**
 * 禁用所有权限安全管理器
 * @author 29923
 */

// extends SecurityManager  已过时
public class DenySecurityManager extends SecurityManager{

//    // 检查所有的权限
    @Override
    public void checkPermission(Permission perm) {
        throw new SecurityException("权限异常：" + perm.toString());
    }
}
