package p000;

import android.app.ProgressDialog;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.widget.EditText;
import android.widget.ListAdapter;

import com.qingyu.rm.Main;
import com.qingyu.rm.reflect.data.Constants;
import com.qingyu.rm.R;
import com.qingyu.rm.util.ToastUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: /CKP */
/* renamed from: ́́ */
/* loaded from: classes.dex */
public final class AsyncTaskC0006 extends AsyncTask<Object, C0022, ArrayList<HashMap<String, Object>>> {

    /* renamed from: ́ */
    final /* synthetic */ Main f133;

    /* renamed from: ۬ */
    ProgressDialog f134;

    public AsyncTaskC0006(Main main) {
        this.f133 = main;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onCancelled(ArrayList<HashMap<String, Object>> arrayList) {
        ArrayList<HashMap<String, Object>> arrayList2 = arrayList;
        super.onCancelled(arrayList2);
        ToastUtils.show("已取消加载！");
        if (arrayList2 == null || arrayList2.size() == 0) {
            return;
        }
        if (this.f134 != null && this.f134.isShowing()) {
            this.f134.dismiss();
        }
        Collections.sort(arrayList2, new C0023(this));
        this.f133.f8 = new C0001(this.f133, arrayList2);
        this.f133.f1.setAdapter((ListAdapter) this.f133.f8);
        this.f133.f8.f93 = this.f133.f7;
        if (this.f133.f8 != null) {
            this.f133.f8.getFilter().filter(((EditText) this.f133.findViewById(R.id.id0004)).getEditableText().toString().trim());
        }
        if (this.f133.f0 != null && this.f133.f0.f48) {
            this.f133.f0.setRefreshing(false);
        }
        this.f133.f2 = false;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(ArrayList<HashMap<String, Object>> arrayList) {
        ArrayList<HashMap<String, Object>> arrayList2 = arrayList;
        super.onPostExecute(arrayList2);
        if (this.f134 != null && this.f134.isShowing()) {
            this.f134.dismiss();
        }
        Collections.sort(arrayList2, new C0007(this));
        this.f133.f8 = new C0001(this.f133, arrayList2);
        this.f133.f1.setAdapter((ListAdapter) this.f133.f8);
        this.f133.f8.f93 = this.f133.f7;
        if (this.f133.f8 != null) {
            this.f133.f8.getFilter().filter(((EditText) this.f133.findViewById(R.id.id0004)).getEditableText().toString().trim());
        }
        if (this.f133.f0 != null && this.f133.f0.f48) {
            this.f133.f0.setRefreshing(false);
        }
        this.f133.f2 = false;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onProgressUpdate(C0022[] c0022Arr) {
        C0022[] c0022Arr2 = c0022Arr;
        super.onProgressUpdate(c0022Arr2);
        C0022 c0022 = c0022Arr2[0];
        ProgressDialog progressDialog = this.f134;
        progressDialog.setMessage(c0022.f311);
        progressDialog.setMax(c0022.f310);
        progressDialog.setProgress(c0022.f308);
        if (progressDialog.isShowing()) {
            return;
        }
        progressDialog.show();
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        super.onPreExecute();
        if (!this.f133.f2) {
            this.f133.f0.setRefreshing(true);
        }
        this.f134 = new ProgressDialog(this.f133);
        this.f134.setTitle("正在加载应用");
        this.f134.setCancelable(false);
        this.f134.setProgressStyle(1);
        this.f134.setProgressNumberFormat("%d/%d");
        this.f134.setButton("取消", new DialogInterfaceOnClickListenerC0008(this));
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ ArrayList<HashMap<String, Object>> doInBackground(Object[] objArr) {
        PackageManager packageManager = (PackageManager) objArr[0];
        List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
        ArrayList<HashMap<String, Object>> arrayList = new ArrayList<>();
        int size = installedPackages.size();
        C0022 c0022 = new C0022(this, (byte) 0);
        c0022.f310 = size;
        boolean z = this.f133.f3.getBoolean(Constants.XSJD.value, false);
        boolean z2 = this.f133.f3.getBoolean(Constants.XSXTYY.value, false);
        for (int i = 0; i < size && !isCancelled(); i++) {
            PackageInfo packageInfo = installedPackages.get(i);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            String charSequence = applicationInfo.loadLabel(packageManager).toString();
            if ((z2 || (applicationInfo.flags & 1) <= 0) && !applicationInfo.packageName.equals(Constants.BM.value)) {
                if (z && !this.f133.f2) {
                    c0022.f311 = charSequence;
                    c0022.f308 = i + 1;
                    publishProgress(c0022);
                }
                HashMap<String, Object> hashMap = new HashMap<>();
//                hashMap.put("icon", applicationInfo.loadIcon(packageManager));
                hashMap.put("label", charSequence);
                hashMap.put("name", applicationInfo.packageName);
                hashMap.put("time", packageInfo.lastUpdateTime);
                arrayList.add(hashMap);
            }
        }
        this.f133.m0();
        return arrayList;
    }
}
