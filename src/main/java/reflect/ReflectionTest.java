package reflect;

import java.lang.reflect.Method;

/**
 * Created by nick on 2021/3/11.
 */
public class ReflectionTest {

    public static void main(String[] args) {
        try {
            Class<?> wSum = Class.forName("reflect.Sum");
            Object object=wSum.newInstance();

            //protected方法通过反射也拿不到，那么反射的意义是什么呢？
            Method wSumMethod=wSum.getMethod("fun",int.class);

            System.out.println(wSumMethod.invoke(object,1));
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
