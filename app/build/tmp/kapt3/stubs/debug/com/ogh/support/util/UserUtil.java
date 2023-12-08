package com.ogh.support.util;

/**
 * @describe 用户操作工具类
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004\u00a8\u0006\f"}, d2 = {"Lcom/ogh/support/util/UserUtil;", "", "()V", "getToken", "", "kotlin.jvm.PlatformType", "isLogin", "", "logout", "", "setToken", "token", "app_debug"})
public final class UserUtil {
    @org.jetbrains.annotations.NotNull
    public static final com.ogh.support.util.UserUtil INSTANCE = null;
    
    private UserUtil() {
        super();
    }
    
    /**
     * 获取token
     */
    public final java.lang.String getToken() {
        return null;
    }
    
    /**
     * 设置token
     */
    public final void setToken(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
    }
    
    /**
     * 判断用户是否登录
     * 目前是根据token来判断
     */
    public final boolean isLogin() {
        return false;
    }
    
    /**
     * 退出登录
     */
    public final void logout() {
    }
}