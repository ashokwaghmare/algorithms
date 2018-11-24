package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

    List<Integer> quickSort(List<Integer> list) {
        List<Integer> empty = new ArrayList<Integer>();
        List<Integer> head = new ArrayList<Integer>();
        List<Integer> more = new ArrayList<Integer>();
        if(list.size() == 0)
            return empty;
        else if(list.size() == 1 ) {
            head.add(list.get(0));
            return head;
        } else {
            int pivot = list.get(0);
            head.add(pivot);
            list.remove(0);
            more.addAll(quickSort(list.stream().filter(ele -> ele <= pivot).collect(Collectors.toList())));
            more.addAll(head);
            more.addAll(quickSort(list.stream().filter(ele -> ele > pivot).collect(Collectors.toList())));
            return more;
        }
    }
}
