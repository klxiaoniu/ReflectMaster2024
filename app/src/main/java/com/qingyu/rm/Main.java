package com.qingyu.rm;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Process;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import com.qingyu.rm.reflect.data.Constants;
import com.qingyu.rm.widget.SwipeRefreshLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import p000.AsyncTaskC0006;
import p000.AsyncTaskC0177;
import p000.C0001;
import p000.C0005;
import p000.C0011;
import p000.C0012;
import p000.C0016;
import p000.C0018;
import p000.C0024;
import p000.C0027;
import p000.C0028;
import p000.C0097;
import p000.C0153;

import com.qingyu.rm.util.ToastUtils;

import p000.DialogInterfaceOnClickListenerC0002;
import p000.DialogInterfaceOnClickListenerC0017;
import p000.DialogInterfaceOnDismissListenerC0003;
import p000.HandlerC0184;
import p000.ViewOnClickListenerC0004;
import p000.ViewOnClickListenerC0013;
import p000.ViewOnClickListenerC0014;
import p000.ViewOnClickListenerC0015;
import p000.ViewOnClickListenerC0025;
import p000.ViewOnClickListenerC0026;

/* loaded from: classes.dex */
public class Main extends Activity implements AdapterView.OnItemClickListener {

    /* renamed from: ́ */
    public SwipeRefreshLayout f0;

    /* renamed from: ۥ */
    public ListView f1;

    /* renamed from: ۦ */
    public boolean f2 = false;

    /* renamed from: ۬ */
    public SharedPreferences f3;

    /* renamed from: 　́ */
    public AlertDialog f4;

    /* renamed from: 　ۥ */
    private long f5;

    /* renamed from: 　ۦ */
    public EditText f6;

    /* renamed from: 　۬ */
    public List<String> f7;

    /* renamed from: 　　 */
    public C0001 f8;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Constants.context = this;
        new C0097(this, (Dialog) null);
        try {
            this.f3 = getSharedPreferences("rm", 1);
        } catch (Throwable th) {
            this.f3 = getSharedPreferences("rm", 0);
        }
        if (!isModuleActive()) {
            new AlertDialog.Builder(this).setTitle("温馨提示").setMessage("您尚未激活此模块，核心功能将无法使用！").setPositiveButton("我知道了", (DialogInterface.OnClickListener) null).setNeutralButton("模块管理", new DialogInterfaceOnClickListenerC0017(this)).create().show();
        }
        setContentView(R.layout.activity_main);
        this.f1 = (ListView) findViewById(R.id.id0006);
        this.f1.setTextFilterEnabled(true);
        this.f1.setOnItemClickListener(this);
        this.f0 = (SwipeRefreshLayout) findViewById(R.id.id0005);
        SwipeRefreshLayout swipeRefreshLayout = this.f0;
        swipeRefreshLayout.m21();
        Resources resources = swipeRefreshLayout.getResources();
        int color = resources.getColor(R.color.color0001);
        int color2 = resources.getColor(R.color.color0002);
        int color3 = resources.getColor(R.color.color0003);
        int color4 = resources.getColor(R.color.color0004);
        C0153 c0153 = swipeRefreshLayout.f58;
        c0153.f382 = color;
        c0153.f381 = color2;
        c0153.f379 = color3;
        c0153.f378 = color4;
        this.f0.setOnRefreshListener(new C0018(this));
        this.f6 = (EditText) findViewById(R.id.id0004);
        this.f1.requestFocus();
        this.f6.addTextChangedListener(new C0016(this));
        try {
            Class.forName("android.os.AsyncTask");
            new AsyncTaskC0006(this).execute(getPackageManager());
        } catch (Exception e) {
            HandlerC0184.m102(this, e);
        }
        if (this.f3.getBoolean(Constants.ZDJCGX.value, true)) {
            AsyncTaskC0177.m97(this, Constants.WYWZ.value);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        Constants.context = this;
        super.onResume();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        HashMap hashMap = (HashMap) adapterView.getItemAtPosition(i);
        String str = (String) hashMap.get("name");
        boolean contains = (this.f7 == null || this.f7.size() == 0) ? false : this.f7.contains(str);
        View inflate = getLayoutInflater().inflate(R.layout.dialog_options, (ViewGroup) null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        TextView textView = (TextView) inflate.findViewById(R.id.id0007);
        if (contains) {
            textView.setText("取消选择这个软件");
        }
        textView.setOnClickListener(new ViewOnClickListenerC0013(this, contains, str));
        inflate.findViewById(R.id.id0008).setOnClickListener(new ViewOnClickListenerC0015(this, str));
        inflate.findViewById(R.id.id0009).setOnClickListener(new ViewOnClickListenerC0014(this, str));
        inflate.findViewById(R.id.id000a).setOnClickListener(new ViewOnClickListenerC0004(this));
        builder.setTitle((String) hashMap.get("label")).setView(inflate);
        this.f4 = builder.show();
        this.f4.setOnDismissListener(new DialogInterfaceOnDismissListenerC0003(this));
    }

    /* renamed from: ۬ */
    public final void m1() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f7.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(",");
        }
        this.f3.edit().putString(Constants.YXZ.value, sb.toString()).apply();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu0000, menu);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        return true;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.id001a) { /* 2131230746 */
            View inflate = getLayoutInflater().inflate(R.layout.dialog_settings, (ViewGroup) null);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("设置");
            Switch r0 = (Switch) inflate.findViewById(R.id.id000c);
            r0.setChecked(this.f3.getBoolean(Constants.XSJD.value, false));
            r0.setOnCheckedChangeListener(new C0005(this));
            Switch r02 = (Switch) inflate.findViewById(R.id.id000e);
            r02.setChecked(this.f3.getBoolean(Constants.XSXTYY.value, false));
            r02.setOnCheckedChangeListener(new C0012(this));
            Switch r03 = (Switch) inflate.findViewById(R.id.id0010);
            r03.setChecked(this.f3.getBoolean(Constants.BKRZSC.value, false));
            r03.setOnCheckedChangeListener(new C0011(this));
            Switch r04 = (Switch) inflate.findViewById(R.id.sw_anti_antixp);
            r04.setChecked(this.f3.getBoolean(Constants.FJYXP.value, false));
            r04.setOnCheckedChangeListener(new C0028(this));
            Switch r05 = (Switch) inflate.findViewById(R.id.id0014);
            r05.setChecked(this.f3.getBoolean(Constants.XZWJX.value, false));
            r05.setOnCheckedChangeListener(new C0027(this));
            Switch r06 = (Switch) inflate.findViewById(R.id.id0016);
            r06.setChecked(this.f3.getBoolean(Constants.ZDJCGX.value, true));
            r06.setOnCheckedChangeListener(new C0024(this));
            EditText editText = (EditText) inflate.findViewById(R.id.id0017);
            editText.setHint("窗口大小");
            editText.setText(String.valueOf(this.f3.getInt(Constants.CKDX.value, 1200)));
            inflate.findViewById(R.id.id0018).setOnClickListener(new ViewOnClickListenerC0026(this, editText));
            inflate.findViewById(R.id.id0019).setOnClickListener(new ViewOnClickListenerC0025(this, editText));
            builder.setView(inflate).setPositiveButton("完成", (DialogInterface.OnClickListener) null).create().show();
        } else if (itemId == R.id.id001b) { /* 2131230747 */
            AsyncTaskC0177.m98(this, Constants.WYWZ.value, true);
        } else if (itemId == R.id.id001c) { /* 2131230748 */
            new AlertDialog.Builder(this).setIcon(R.mipmap.mipmap0000).setTitle("关于").setMessage(R.string.str0001).setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) null).setNeutralButton("联系清羽", new DialogInterfaceOnClickListenerC0002(this)).create().show();
        } else if (itemId == R.id.id001d) { /* 2131230749 */
            finish();
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (System.currentTimeMillis() - this.f5 > 2000) {
            ToastUtils.show("再按一次返回键退出！");
            this.f5 = System.currentTimeMillis();
        } else {
            finish();
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 25) {
            return super.onKeyDown(i, keyEvent);
        }
        new C0097(this, (Dialog) null);
        return false;
    }

    private final boolean isModuleActive() {
        return false;
    }

    /* renamed from: ́ */
    public final void m0() {
        this.f7 = new ArrayList();
        String string = this.f3.getString(Constants.YXZ.value, null);
        if (string != null) {
            String[] split = string.split(",");
            for (String str : split) {
                this.f7.add(str);
            }
        }
    }
}
