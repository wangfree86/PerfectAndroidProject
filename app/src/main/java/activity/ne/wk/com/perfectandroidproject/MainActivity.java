package activity.ne.wk.com.perfectandroidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme); //切换正常主题
        setContentView(R.layout.activity_main);
    }

//    //同步get请求
//    private void getSync() throws Exception
//    {
//        new Thread(new Runnable()
//        {
//            @Override
//            public void run()
//            {
//                try
//                {
//                    request=new Request.Builder()  //请求对象，设置的参数详细要看源码解释
//                            .url(BASE_URL)    //这里的url参数值是自己访问的api
//                            .build();
//                    Response response = null;   //建立一个响应对象，一开始置为null
//                    Call call = client.newCall(request); //开始申请，发送网络请求。
//                    response = call.execute();
//                    if (response.isSuccessful()) {
//
//                        Log.d("kwwl", "response.code()==" + response.code());
//                        Log.d("kwwl", "response.message()==" + response.message());
//                        Log.d("kwwl", "res==" + response.body().string());
////                        text.setText("同步请求成功");
//                        //此时的代码执行在子线程，修改UI的操作请使用handler跳转到UI线程。
//                    }
//                    else
//                    {
//                        text.setText("同步请求失败");
//                        Log.d("Fail","get请求失败");
//                    }
//                }
//                catch (Exception e)
//                {
//                    e.printStackTrace();
//                }
//
//            }
//        }).start();
//    }


}
