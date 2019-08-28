package designPattern.strategy;
/** 
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-8-14 下午3:06:23 
 * 
 * 在软件系统中有很多种方法可以实现同一个功能，比如排序算法它有冒泡排序、选择排序、快速排序、插入排序等等。这里我们有一种硬编码方法，就是讲所以的排序算法全部写在一个类中，每一种算法的具体实现对应着一个方法，然后写一个总方法通过if…else…来判断选择具体的排序算法，但是这样做存在几个问题。

      第一：如果需要增加新的算法，则需要修改源代码。

      第二：如果更新了排序算法，那么需要在客户端也需要修改代码，麻烦。

      第三：充斥着大量的if…else…语句，代码维护比较困难。

      所以为了解决这些问题，我们可以定义一些独立的类来封装不同的算法，每一个独立的类对应着一个具体的算法实现，在这里我们就将这里每一个独立的类称之为一个策略。 
 */
public interface Sort {
    public abstract int[] sort(int arr[]);

}
