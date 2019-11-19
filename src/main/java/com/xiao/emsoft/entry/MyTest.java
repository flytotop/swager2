package com.xiao.emsoft.entry;

        import lombok.Data;

/**
 * @Auther: xhf
 * @Date: 2019-11-18 11:10
 * @Description:
 */
@Data
public class MyTest {
    private String name;

    public static void main(String[] args) {
        MyTest myTest=new MyTest();
        myTest.toString();
    }
}
