package com.ogh.support.util;

/**
 * 微信分享工具类
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\rJ&\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\r\u00a8\u0006\u0014"}, d2 = {"Lcom/ogh/support/util/WeChatShareUtils;", "", "()V", "bmpToByteArray", "", "bm", "Landroid/graphics/Bitmap;", "buildTransaction", "", "type", "shareWeChatImg", "", "bitmap", "", "shareWeChatTxt", "content", "shareWeChatUrl", "title", "desc", "url", "app_debug"})
public final class WeChatShareUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.ogh.support.util.WeChatShareUtils INSTANCE = null;
    
    private WeChatShareUtils() {
        super();
    }
    
    /**
     * 分享微信文本
     *
     * @param type 0：分享到好友  1：分享到朋友圈
     */
    public final void shareWeChatTxt(@org.jetbrains.annotations.NotNull
    java.lang.String content, int type) {
    }
    
    /**
     * 发起app网页分享
     *
     * @param type 0：分享到好友  1：分享到朋友圈
     */
    public final void shareWeChatUrl(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String url, int type) {
    }
    
    /**
     * 发起图片分享
     *
     * @param type 0：分享到好友  1：分享到朋友圈
     */
    public final void shareWeChatImg(@org.jetbrains.annotations.NotNull
    android.graphics.Bitmap bitmap, int type) {
    }
    
    private final byte[] bmpToByteArray(android.graphics.Bitmap bm) {
        return null;
    }
    
    private final java.lang.String buildTransaction(java.lang.String type) {
        return null;
    }
}