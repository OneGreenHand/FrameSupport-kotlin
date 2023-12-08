package com.ogh.support.util;

/**
 * description: 跳转三方地图工具类
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J6\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fJN\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fJ@\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\f\u00a8\u0006!"}, d2 = {"Lcom/ogh/support/util/OpenMapUtil;", "", "()V", "isInstallBaiduMap", "", "isInstallGaoDeMap", "isInstallTencentMap", "openBaiduMap", "", "context", "Landroid/content/Context;", "sName", "", "sLatlng", "eName", "eLatlng", "mode", "openGaoDeMap", "slat", "slon", "sname", "dlat", "dlon", "dname", "dev", "t", "openTencentMap", "type", "from", "fromcoord", "to", "tocoord", "referer", "app_debug"})
public final class OpenMapUtil {
    @org.jetbrains.annotations.NotNull
    public static final com.ogh.support.util.OpenMapUtil INSTANCE = null;
    
    private OpenMapUtil() {
        super();
    }
    
    /**
     * *
     * 是否安装百度地图
     */
    public final boolean isInstallBaiduMap() {
        return false;
    }
    
    /**
     * 是否安装高德地图
     */
    public final boolean isInstallGaoDeMap() {
        return false;
    }
    
    /**
     * *
     * 是否安装腾讯地图
     */
    public final boolean isInstallTencentMap() {
        return false;
    }
    
    /**
     * 打开腾讯地图
     * 参考http://lbs.qq.com/uri_v1/guide-mobile-navAndRoute.html
     *
     * @param context
     * @param type      路线规划方式参数: bus 或 drive 或 walk 或 bike
     * @param from      起点名称: 鼓楼
     * @param fromcoord 起点坐标: 39.907380,116.388501
     * @param to        终点名称: 奥林匹克森林公园
     * @param tocoord   终点坐标: 40.010024,116.392239
     * @param referer   请填写开发者key
     */
    public final void openTencentMap(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    java.lang.String from, @org.jetbrains.annotations.NotNull
    java.lang.String fromcoord, @org.jetbrains.annotations.NotNull
    java.lang.String to, @org.jetbrains.annotations.NotNull
    java.lang.String tocoord, @org.jetbrains.annotations.Nullable
    java.lang.String referer) {
    }
    
    /**
     * 打开高德地图
     * 参考https://lbs.amap.com/api/amap-mobile/guide/android/route
     *
     * @param context
     * @param slat    起点纬度。如果不填写此参数则自动将用户当前位置设为起点纬度。
     * @param slon    起点经度。如果不填写此参数则自动将用户当前位置设为起点经度。
     * @param sname   起点名称
     * @param dlat    终点纬度
     * @param dlon    终点经度
     * @param dname   终点名称
     * @param dev     起终点是否偏移(0:lat 和 lon 是已经加密后的,不需要国测加密; 1:需要国测加密)
     * @param t       t = 0（驾车）= 1（公交）= 2（步行）= 3（骑行）= 4（火车）= 5（长途客车）（骑行仅在V788以上版本支持）
     */
    public final void openGaoDeMap(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String slat, @org.jetbrains.annotations.NotNull
    java.lang.String slon, @org.jetbrains.annotations.NotNull
    java.lang.String sname, @org.jetbrains.annotations.NotNull
    java.lang.String dlat, @org.jetbrains.annotations.NotNull
    java.lang.String dlon, @org.jetbrains.annotations.NotNull
    java.lang.String dname, @org.jetbrains.annotations.NotNull
    java.lang.String dev, @org.jetbrains.annotations.NotNull
    java.lang.String t) {
    }
    
    /**
     * 打开百度地图
     * http://lbsyun.baidu.com/index.php?title=uri/api/android
     *
     * @param context
     * @param sName   起点名称: 天安门
     * @param sLatlng 起点经纬度: 39.98871,116.43234
     * @param eName   终点名称: 对外经贸大学
     * @param eLatlng 终点经纬度: 39.98871,116.43234
     * @param mode    导航模式: transit 或 driving 或 walking 或 riding
     */
    public final void openBaiduMap(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String sName, @org.jetbrains.annotations.NotNull
    java.lang.String sLatlng, @org.jetbrains.annotations.NotNull
    java.lang.String eName, @org.jetbrains.annotations.NotNull
    java.lang.String eLatlng, @org.jetbrains.annotations.NotNull
    java.lang.String mode) {
    }
}