package Z2;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
class Zadanie2 {
    static<T> void print(Iterable<T> t) {
            String str = "";
            str +=  "[";
            for (T e: t) str += e.toString() + ",";
            str = str.substring(0, str.length() - 1);
            str += "]";

            System.out.println(str);
        }
        public static void main(String[] args) {
            List<String> l1 = new ArrayList<>();
            l1.add("a"); l1.add("b"); l1.add("c");

            Stack<Integer> l2 = new Stack<>();
            l2.add(3); l2.add(4); l2.add(5);

            print(l1);
            print(l2);
        }
    }