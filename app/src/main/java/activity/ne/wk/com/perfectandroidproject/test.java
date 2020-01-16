package activity.ne.wk.com.perfectandroidproject;

/**
 * @author : wk
 * @github :
 * @date : 2020/1/9
 * @desc :
 */
public class test {


}

 class TestInstance {

    private static volatile TestInstance mInstance;

    public static TestInstance getInstance() {       //1
        if (mInstance == null) {                     //2
            synchronized (TestInstance.class) {      //3
                if (mInstance == null) {             //4
                    mInstance = new TestInstance(); //5
                }
            }
        }
        return mInstance;
    }
}
//假如没有用volatile，并发情况下会出现问题，线程A执行到注释5 new TestInstance() 的时候，分为如下几个几步操作：
//
//        分配内存
//        初始化对象
//        mInstance 指向内存
//
//        这时候如果发生指令重排，执行顺序是132，执行到第3的时候，线程B刚好进来了，并且执行到注释2，这时候判断mInstance 不为空，直接使用一个未初始化的对象。所以使用volatile关键字来禁止指令重排序。
