package com.ogh.support.util;

/**
 * 图片处理类
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u001e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cJ\u001e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cJ\u001e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cJ\u001e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cJ\u001e\u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cJ\u001e\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001c\u00a8\u0006\""}, d2 = {"Lcom/ogh/support/util/GlideImageUtil;", "", "()V", "clearImageAllCache", "", "context", "Landroid/content/Context;", "clearImageDiskCache", "clearImageMemoryCache", "deleteFolderFile", "filePath", "", "deleteThisPath", "", "getCacheSize", "getFolderSize", "", "file", "Ljava/io/File;", "getFormatSize", "size", "", "getRequestOptions", "Lcom/bumptech/glide/request/RequestOptions;", "isDestroy", "showGif2Image", "url", "view", "Landroid/widget/ImageView;", "showGifImage", "showImage", "showImageNoCache", "showWrapImage", "showWrapImage2", "app_debug"})
public final class GlideImageUtil {
    @org.jetbrains.annotations.NotNull
    public static final com.ogh.support.util.GlideImageUtil INSTANCE = null;
    
    private GlideImageUtil() {
        super();
    }
    
    /**
     * 判断宿主是否存活
     */
    private final boolean isDestroy(android.content.Context context) {
        return false;
    }
    
    /**
     * 加载图片
     */
    public final void showImage(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    android.widget.ImageView view) {
    }
    
    /**
     * 播放Gif图
     */
    public final void showGifImage(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    android.widget.ImageView view) {
    }
    
    /**
     * 播放Gif图
     */
    public final void showGif2Image(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    android.widget.ImageView view) {
    }
    
    /**
     * 加载图片(跳过缓存,一般是频繁更换的图片)
     */
    public final void showImageNoCache(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    android.widget.ImageView view) {
    }
    
    /**
     * 等比例缩放图片
     */
    public final void showWrapImage(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    android.widget.ImageView view) {
    }
    
    /**
     * 等比例缩放图片
     */
    public final void showWrapImage2(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    android.widget.ImageView view) {
    }
    
    private final com.bumptech.glide.request.RequestOptions getRequestOptions() {
        return null;
    }
    
    /**
     * 清除图片磁盘缓存
     */
    private final void clearImageDiskCache(android.content.Context context) {
    }
    
    /**
     * 清除图片内存缓存
     */
    private final void clearImageMemoryCache(android.content.Context context) {
    }
    
    /**
     * 清除图片所有缓存
     */
    public final void clearImageAllCache(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    /**
     * 获取Glide造成的缓存大小
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCacheSize(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    /**
     * 获取指定文件夹内所有文件大小的和
     */
    private final long getFolderSize(java.io.File file) {
        return 0L;
    }
    
    /**
     * 删除指定目录下的文件，这里用于缓存的删除
     */
    private final void deleteFolderFile(java.lang.String filePath, boolean deleteThisPath) {
    }
    
    /**
     * 格式化单位
     */
    private final java.lang.String getFormatSize(double size) {
        return null;
    }
}