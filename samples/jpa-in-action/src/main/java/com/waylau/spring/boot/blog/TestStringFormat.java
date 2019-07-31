package com.waylau.spring.boot.blog;

public class TestStringFormat {

    public static void main(String[] args) {
            //日期与时间类型（x代表不同的日期与时间转换符%tx
            String str=null;
            str=String.format("Hi,%s", "王力");//字符串类型
            System.out.println(str);
            str=String.format("Hi,%s:%s.%s", "王南","王力","王张");//字符串类型
            System.out.println(str);
            System.out.printf("字母a的大写是：%c %n", 'A');//%c字符类型  %n换行符
            System.out.printf("3>7的结果是：%b %n", 3>7);//%b布尔类型
            System.out.printf("1000的一半是：%d %n", 1000/2);//%d整数类型(十进制)
            System.out.printf("100的16进制数是：%x %n", 100);//整数类型（十六进制）
            System.out.printf("100的8进制数是：%o %n", 100);//整数类型（八进制）
            System.out.printf("50元的书打8.5折扣是：%f 元%n", 50*0.85);//浮点类型
            System.out.printf("上面价格的16进制数是：%a %n", 50*0.85);//十六进制浮点类型
            System.out.printf("上面价格的指数表示：%e %n", 50*0.85);//指数类型
            System.out.printf("上面价格的指数和浮点数结果的长度较短的是：%g %n", 50*0.85);
            System.out.printf("上面的折扣是%d%% %n", 85);
            System.out.printf("字母A的散列码是：%h %n", 'A');
    }
}
