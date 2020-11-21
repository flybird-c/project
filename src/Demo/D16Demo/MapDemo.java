package Demo.D16Demo;

import java.util.*;

/**
 * @author EDZ
 */
public class MapDemo {
    public static void main(String[] args) {
        //-- map的创建
        Map<Integer,Integer> integerMap=new HashMap<>(16);
//-- map的赋值
        integerMap.put(1,4);
        integerMap.put(3,6);
        integerMap.put(4,4);
        integerMap.put(26,0);
        integerMap.put(9,8);
        integerMap.put(2,3);
        System.out.println(integerMap);
        //-- map的取值 根据键取值,如果键不存在 返回值为null
        System.out.println(integerMap.get(1));
        System.out.println(integerMap.get(0));
        System.out.println("+++++++++++++++");
        //-- 如果键不存在返回一个默认值
        System.out.println(integerMap.getOrDefault(100,10000));
        //-- map的替换
        integerMap.replace(26,10086);
        System.out.println(integerMap);
        //-- replace底层就是一个put,只不过在put之前要先判断下键是一定存在的
        integerMap.replace(123,124);
        System.out.println(integerMap);
        //-- 相同的键赋值第二次会把第一次赋的值覆盖掉.并返回 put方法返回被覆盖的值
        integerMap.put(1,2);
        integerMap.put(1,3);
        System.out.println(integerMap.get(1));
        //-- 第一次使用键,返回值为null
        System.out.println(integerMap.put(789,987));
//-- Map的键是唯一的!
        //-- HashSet存储元素是唯一的.利用的就是HashMap的键来存储数据.
        //类比python的字典
        Set<Integer> key=integerMap.keySet();
        System.out.println(integerMap.keySet());
        ArrayList<Integer> keyList=new ArrayList<>(key);
        Collections.sort(keyList);
        System.out.println(keyList);
    }
}
