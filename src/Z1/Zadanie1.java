package Z1;
import java.time.LocalTime;
import java.util.Arrays;

class Zadanie1 {
    public static void main(String[] args) {
        System.out.println(ArrayUtil.isSorted(new Integer[]{4, 4, 5}));
        System.out.println(ArrayUtil.isSorted(new Integer[]{4, 5, 4}));
        System.out.println(ArrayUtil.isSorted(new String[]{"a", "b", "c"}));
        System.out.println(ArrayUtil.isSorted(new String[]{"b", "a", "c"}));
        var lt1 = LocalTime.now(); var lt2 = LocalTime.now().plusMinutes(123);
        System.out.println(ArrayUtil.isSorted(new LocalTime[]{lt1, lt1, lt2}));
        System.out.println(ArrayUtil.isSorted(new LocalTime[]{lt1, lt2, lt1}));
    }
}

class ArrayUtil{
    static  <T extends Comparable> boolean isSorted(T[] t){
        var t2= Arrays.copyOf(t,t.length);
        Arrays.sort(t2);

        for (int i = 0; i< t.length; i++)
            if (t[i].compareTo(t2[i]) != 0)
                return false;
        return true;
    }
}