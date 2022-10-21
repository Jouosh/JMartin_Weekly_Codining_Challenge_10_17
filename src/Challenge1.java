import java.util.*;

public class Challenge1 {

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list1.add((int) (Math.random() * 20));
            list2.add((int) (Math.random() * 20));
        }

        list1.add(4);
        list2.add(4);

        System.out.println(list1);
        System.out.println(list2);

        int intersection = findIntersection(list1, list2);
        System.out.println(intersection);
    }

    //Had a hard time with this one, so I figure I'll show my two wrong answers
    //Constant space, O(n^2) time
    public static int findIntersection(LinkedList<Integer> list1, LinkedList<Integer> list2) {

        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))) {
                return list1.get(i);
            }
        }
        throw new RuntimeException("Lists does not intersect");
    }

    //O(n) space, O(n + m) time
//    public static int findIntersection(LinkedList<Integer> list1, LinkedList<Integer> list2) {
//
//        Set<Integer> intersectionSet = new HashSet<>();
//
//        for (int i = 0; i < list1.size(); i++) {
//            intersectionSet.add(list1.get(i));
//        }
//
//        for (int i = 0; i < list2.size(); i++) {
//            if (intersectionSet.contains(list2.get(i))) {
//                return list2.get(i);
//            }
//        }
//
//        throw new RuntimeException("Lists do no intersect");
//
//    }
}
