package org.home.Exception;

public class ExceptionTest {
    /**
     * 1.先执行try中的代码，如果try中的代码出错了，则执行catch中的代码，否则继续执行try中的代码直到结束，finally的代码是不管有没有异常都会执行。
     * 2.常见的异常：Error和Exception Error中分为内存溢出和栈溢出，Exception 中分为IOException和RuntimeException IO分为EOF和fileNotFound
     * RuntimeException 分为NullPointerException ArrayIndexOutOfBoundsException UnknownTypeException ClassNotFoundException
     * 3.finally final  首先 finally作用于try catch异常抛出中 表示总是执行 ，final用于声明属性和方法和类 分别表示 属性不变，方法不可覆盖，类不可被继承
     * 4.catch是try catch不可缺少的一部分，但是可以多个 当try中遇到异常之后，执行catch中的内容 catch(Exception e)多个存在的时候 顺序有影响，会优先选择最匹配的进行判断，当子类在父类之后的时候会报错
     */
}
