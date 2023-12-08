package com.ogh.support.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bH\u0002J\u001e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bJ\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\u00a8\u0006\u0015"}, d2 = {"Lcom/ogh/support/util/InstructionsUtils;", "", "()V", "checkInstallOrDown", "", "context", "Landroid/content/Context;", "url", "", "download", "getActivityClassName", "Ljava/lang/Class;", "className", "goLocationActivity", "intentUrl", "jumpIntention", "type", "", "action", "requestPermission", "CheckInstallTask", "app_debug"})
public final class InstructionsUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.ogh.support.util.InstructionsUtils INSTANCE = null;
    
    private InstructionsUtils() {
        super();
    }
    
    /**
     * @param type   操作类别:  0、跳转本地 1、打开外部浏览器 2、通知栏下载APK或打开app 3、打开指定QQ 4、分享文本
     * @param action 跳转意图: 根据type变动，可能是本地activity或者浏览器之类的
     */
    public final void jumpIntention(@org.jetbrains.annotations.NotNull
    android.content.Context context, int type, @org.jetbrains.annotations.NotNull
    java.lang.String action) {
    }
    
    /**
     * 申请权限
     */
    private final void requestPermission(android.content.Context context, java.lang.String url) {
    }
    
    /**
     * 通过service下载apk
     *
     * @param url 下载地址
     */
    public final void download(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
    
    /**
     * 未安装则下载,已安装则打开
     *
     * @param url 里面可能包含包名和下载地址
     */
    public final void checkInstallOrDown(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
    
    /**
     * 主要用于后台控制跳转本地
     * intentUrl举例: TaskActivity?ID=1&NAME=小明  意思就是跳转到TaskDetailActivity，然后带了ID和NAME，两个参数
     */
    private final void goLocationActivity(android.content.Context context, java.lang.String intentUrl) {
    }
    
    /**
     * 查找本地是否有这个class
     */
    private final java.lang.Class<?> getActivityClassName(java.lang.String className) {
        return null;
    }
    
    /**
     * 检测是否安装(异步任务)
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ%\u0010\u000f\u001a\u00020\u00032\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0011\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0014\u00a2\u0006\u0002\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lcom/ogh/support/util/InstructionsUtils$CheckInstallTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "context", "Landroid/content/Context;", "packageName", "", "downUrl", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "getDownUrl", "()Ljava/lang/String;", "getPackageName", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/lang/Boolean;", "onPostExecute", "", "s", "(Ljava/lang/Boolean;)V", "app_debug"})
    static final class CheckInstallTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Boolean> {
        @org.jetbrains.annotations.NotNull
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String packageName = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String downUrl = null;
        
        public CheckInstallTask(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String packageName, @org.jetbrains.annotations.NotNull
        java.lang.String downUrl) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPackageName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDownUrl() {
            return null;
        }
        
        @java.lang.Override
        protected void onPostExecute(@org.jetbrains.annotations.Nullable
        java.lang.Boolean s) {
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        protected java.lang.Boolean doInBackground(@org.jetbrains.annotations.NotNull
        java.lang.Void... params) {
            return null;
        }
    }
}