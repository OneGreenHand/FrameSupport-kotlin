package com.ogh.support.view.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\u0002\u0010\tB+\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/ogh/support/view/adapter/TabLayoutFragmentPagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "activity", "Landroidx/fragment/app/FragmentActivity;", "fragments", "", "Landroidx/fragment/app/Fragment;", "titles", "", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;Ljava/util/List;)V", "fragment", "(Landroidx/fragment/app/Fragment;Ljava/util/List;Ljava/util/List;)V", "mFragments", "createFragment", "position", "", "getItemCount", "app_debug"})
public final class TabLayoutFragmentPagerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    @org.jetbrains.annotations.NotNull
    private java.util.List<? extends androidx.fragment.app.Fragment> mFragments;
    @org.jetbrains.annotations.NotNull
    private java.util.List<java.lang.String> titles;
    
    public TabLayoutFragmentPagerAdapter(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull
    java.util.List<? extends androidx.fragment.app.Fragment> fragments, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> titles) {
        super(null);
    }
    
    public TabLayoutFragmentPagerAdapter(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull
    java.util.List<? extends androidx.fragment.app.Fragment> fragments, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> titles) {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.fragment.app.Fragment createFragment(int position) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
}