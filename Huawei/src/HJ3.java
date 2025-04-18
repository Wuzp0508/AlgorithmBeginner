import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class HJ3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        TreeSet<Integer> set = new TreeSet<>();
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            set.add(in.nextInt());
        }
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}