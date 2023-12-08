package com.ogh.support.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u001a\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002J0\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J0\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004\u00a8\u0006\u0017"}, d2 = {"Lcom/ogh/support/util/ImageSaveUtil;", "", "()V", "createDir", "", "file", "Ljava/io/File;", "createFile", "isDeleteOldFile", "isEmptyBitmap", "bitmap", "Landroid/graphics/Bitmap;", "isGranted", "context", "Landroid/content/Context;", "save", "format", "Landroid/graphics/Bitmap$CompressFormat;", "quality", "", "recycle", "saveAlbum", "Landroid/net/Uri;", "app_debug"})
public final class ImageSaveUtil {
    @org.jetbrains.annotations.NotNull
    public static final com.ogh.support.util.ImageSaveUtil INSTANCE = null;
    
    private ImageSaveUtil() {
        super();
    }
    
    /**
     * 保存图片到公共目录
     * 29 以下，需要提前申请文件读写权限
     * 29及29以上的，不需要权限
     * 保存的文件在 DCIM 目录下
     *
     * @param context 上下文
     * @param bitmap  需要保存的bitmap
     * @param format  图片格式
     * @param quality 压缩的图片质量
     * @param recycle 完成以后，是否回收Bitmap，建议为true
     * @return 文件的 uri
     */
    @org.jetbrains.annotations.Nullable
    public final android.net.Uri saveAlbum(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull
    android.graphics.Bitmap.CompressFormat format, int quality, boolean recycle) {
        return null;
    }
    
    private final boolean save(android.graphics.Bitmap bitmap, java.io.File file, android.graphics.Bitmap.CompressFormat format, int quality, boolean recycle) {
        return false;
    }
    
    private final boolean isEmptyBitmap(android.graphics.Bitmap bitmap) {
        return false;
    }
    
    private final boolean createFile(java.io.File file, boolean isDeleteOldFile) {
        return false;
    }
    
    private final boolean createDir(java.io.File file) {
        return false;
    }
    
    private final boolean isGranted(android.content.Context context) {
        return false;
    }
}