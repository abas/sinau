package io.github.abas.sinaudev;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.OnNavigationItemSelectedListener;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.DrawerLayout.DrawerListener;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import io.github.abas.sinaudev.R.id;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class MainActivity extends AppCompatActivity implements OnNavigationItemSelectedListener {
    private HashMap _$_findViewCache;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(2131361820);
        this.setSupportActionBar((Toolbar)this._$_findCachedViewById(id.toolbar));
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle((Activity)this, (DrawerLayout)this._$_findCachedViewById(id.drawer_layout), (Toolbar)this._$_findCachedViewById(id.toolbar), 2131558474, 2131558473);
        ((DrawerLayout)this._$_findCachedViewById(id.drawer_layout)).addDrawerListener((DrawerListener)toggle);
        toggle.syncState();
        ((NavigationView)this._$_findCachedViewById(id.nav_view)).setNavigationItemSelectedListener((OnNavigationItemSelectedListener)this);
    }

    public void onBackPressed() {
        System.gc();
        System.exit(0);
    }

    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkParameterIsNotNull(menu, "menu");
        this.getMenuInflater().inflate(2131427329, menu);
        return true;
    }

    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkParameterIsNotNull(item, "item");
        switch(item.getItemId()) {
            case 2131230744:
            return true;
            default:
            return super.onOptionsItemSelected(item);
        }
    }

    public boolean onNavigationItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkParameterIsNotNull(item, "item");
        switch(item.getItemId()) {
            case 2131230752:
            System.exit(0);
            case 2131230726:
            case 2131230823:
            case 2131230827:
            default:
            ((DrawerLayout)this._$_findCachedViewById(id.drawer_layout)).closeDrawer(8388611);
            return true;
        }
    }

    public View _$_findCachedViewById(int var1) {
        if(this._$_findViewCache == null) {
        this._$_findViewCache = new HashMap();
    }

        View var2 = (View)this._$_findViewCache.get(Integer.valueOf(var1));
        if(var2 == null) {
            var2 = this.findViewById(var1);
            this._$_findViewCache.put(Integer.valueOf(var1), var2);
        }

        return var2;
    }

    public void _$_clearFindViewByIdCache() {
        if(this._$_findViewCache != null) {
        this._$_findViewCache.clear();
    }

    }
}
