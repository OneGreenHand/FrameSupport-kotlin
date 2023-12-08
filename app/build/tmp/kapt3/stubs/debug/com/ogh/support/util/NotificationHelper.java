package com.ogh.support.util;

/**
 * 下载通知栏适配(8.0用这个)
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0007J\b\u0010\u0011\u001a\u00020\fH\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\u0006\u0010\u0017\u001a\u00020\u000eJ\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/ogh/support/util/NotificationHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "CHANNEL_ID", "", "CHANNEL_NAME", "NOTIFICATION_ID", "", "mContext", "manager", "Landroid/app/NotificationManager;", "cancel", "", "downloadComplete", "fileName", "getManager", "getNotification", "Landroid/app/Notification;", "getNotify", "Landroid/app/Notification$Builder;", "content", "showNotification", "updateProgress", "progress", "app_debug"})
public final class NotificationHelper {
    @org.jetbrains.annotations.Nullable
    private android.app.NotificationManager manager;
    @org.jetbrains.annotations.NotNull
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CHANNEL_ID = "DownloadService";
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CHANNEL_NAME = "\u4e0b\u8f7d\u66f4\u65b0";
    private final int NOTIFICATION_ID = 1;
    
    public NotificationHelper(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    private final android.app.Notification.Builder getNotify(java.lang.String content) {
        return null;
    }
    
    private final android.app.NotificationManager getManager() {
        return null;
    }
    
    /**
     * 取消通知栏
     */
    public final void cancel() {
    }
    
    /**
     * 显示通知栏
     */
    public final void showNotification() {
    }
    
    /**
     * 获取 Notification
     */
    @org.jetbrains.annotations.NotNull
    public final android.app.Notification getNotification() {
        return null;
    }
    
    /**
     * 不断调用次方法通知通知栏更新进度条
     */
    public final void updateProgress(int progress) {
    }
    
    /**
     * 下载完成后，设置通知栏可以点击
     */
    @android.annotation.SuppressLint(value = {"UnspecifiedImmutableFlag"})
    public final void downloadComplete(@org.jetbrains.annotations.Nullable
    java.lang.String fileName) {
    }
}