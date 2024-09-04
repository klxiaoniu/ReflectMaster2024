package p000;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.qingyu.rm.Main;
import com.qingyu.rm.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: /CKP */
/* renamed from: ̀ۥ */
/* loaded from: classes.dex */
public final class C0001 extends BaseAdapter implements Filterable {

    /* renamed from: ́ */
    ArrayList<HashMap<String, Object>> f90;

    /* renamed from: ۥ */
    final /* synthetic */ Main f91;

    /* renamed from: ۦ */
    ArrayList<HashMap<String, Object>> f92;

    /* renamed from: ۬ */
    List<String> f93;

    private PackageManager pm;

    public C0001(Main main, ArrayList<HashMap<String, Object>> arrayList) {
        this.f91 = main;
        this.f90 = arrayList;
        this.f92 = arrayList;
        this.pm = main.getPackageManager();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if (this.f92 == null) {
            return 0;
        }
        return this.f92.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f92.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        TextView textView;
        TextView textView2;
        TextView textView3;
        boolean z;
        byte b = 0;
        if (view == null) {
            view = LayoutInflater.from(this.f91).inflate(R.layout.layout_item, (ViewGroup) null);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.id0000);
            TextView textView4 = (TextView) view.findViewById(R.id.id0001);
            TextView textView5 = (TextView) view.findViewById(R.id.id0002);
            textView = (TextView) view.findViewById(R.id.id0003);
            C0009 c0009 = new C0009(this, b);
            c0009.f164 = imageView2;
            c0009.f161 = textView4;
            c0009.f163 = textView5;
            c0009.f162 = textView;
            view.setTag(c0009);
            textView2 = textView5;
            textView3 = textView4;
            imageView = imageView2;
        } else {
            C0009 c00092 = (C0009) view.getTag();
            imageView = c00092.f164;
            TextView textView6 = c00092.f161;
            TextView textView7 = c00092.f163;
            textView = c00092.f162;
            textView2 = textView7;
            textView3 = textView6;
        }
        HashMap<String, Object> hashMap = this.f92.get(i);
        if (imageView != null) {
            Log.i("List", "load item");
            Drawable icon = (Drawable) hashMap.get("icon");
            if (icon == null) {
                ApplicationInfo info;
                try {
                    info = pm.getApplicationInfo((String) Objects.requireNonNull(hashMap.get("name")), 0);
                    icon = info.loadIcon(imageView.getContext().getPackageManager());
                    hashMap.put("icon", icon);
                } catch (Exception ignored) {
                }
            }
            imageView.setImageDrawable(icon);
        }
        if (textView3 != null) {
            textView3.setText((String) hashMap.get("label"));
        }
        if (textView2 != null) {
            if (this.f93 != null) {
                Iterator<String> it = this.f93.iterator();
                z = false;
                while (it.hasNext()) {
                    z = it.next().equals((String) hashMap.get("name")) ? true : z;
                }
            } else {
                z = false;
            }
            if (z) {
                textView2.setText("已选择");
                textView2.setTextColor(-65536);
            } else {
                textView2.setText("");
            }
        }
        if (textView != null) {
            textView.setText((String) hashMap.get("name"));
        }
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new C0010(this);
    }
}
