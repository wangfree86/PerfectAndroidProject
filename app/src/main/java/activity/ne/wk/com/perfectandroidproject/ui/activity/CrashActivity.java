//package activity.ne.wk.com.perfectandroidproject.ui.activity;
//
//import android.content.ClipData;
//import android.content.ClipboardManager;
//import android.view.View;
//
//import activity.ne.wk.com.perfectandroidproject.R;
//import activity.ne.wk.com.perfectandroidproject.common.MyActivity;
//import androidx.core.content.ContextCompat;
//import cat.ereza.customactivityoncrash.CustomActivityOnCrash;
//import cat.ereza.customactivityoncrash.config.CaocConfig;
//
//
///**
// * @author : wk
// * @github : https://github.com/wangfree86/PerfectAndroidProject
// * @date : 2019/12/9
// * @desc : 崩溃捕捉界面
// */
//public final class CrashActivity extends MyActivity {
//
//    private CaocConfig mConfig;
//
//    @Override
//    protected int getLayoutId() {
//        return R.layout.activity_crash;
//    }
//
//    @Override
//    protected void initView() {
//
//    }
//
//    @Override
//    protected void initData() {
//        mConfig = CustomActivityOnCrash.getConfigFromIntent(getIntent());
//        if (mConfig == null) {
//            // 这种情况永远不会发生，只要完成该活动就可以避免递归崩溃。
//            finish();
//        }
//    }
//
//    @OnClick({R.id.btn_crash_restart, R.id.btn_crash_log})
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.btn_crash_restart:
//                CustomActivityOnCrash.restartApplication(CrashActivity.this, mConfig);
//                break;
//            case R.id.btn_crash_log:
////                AlertDialog dialog = new AlertDialog.Builder(CrashActivity.this)
////                        .setTitle(R.string.crash_error_details)
////                        .setMessage(CustomActivityOnCrash.getAllErrorDetailsFromIntent(CrashActivity.this, getIntent()))
////                        .setPositiveButton(R.string.crash_close, null)
////                        .setNeutralButton(R.string.crash_copy_log, new DialogInterface.OnClickListener() {
////                            @Override
////                            public void onClick(DialogInterface dialog, int which) {
////                                copyErrorToClipboard();
////                            }
////                        })
////                        .show();
////                TextView textView = dialog.findViewById(android.R.id.message);
////                if (textView != null) {
////                    textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
////                }
//                break;
//            default:
//                break;
//        }
//    }
//
//    /**
//     * 复制报错信息到剪贴板
//     */
//    @SuppressWarnings("all")
//    private void copyErrorToClipboard() {
//        String errorInformation = CustomActivityOnCrash.getAllErrorDetailsFromIntent(CrashActivity.this, getIntent());
//        ContextCompat.getSystemService(this, ClipboardManager.class).setPrimaryClip(ClipData.newPlainText(getString(R.string.crash_error_info), errorInformation));
//    }
//}