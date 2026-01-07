import datastructs.linkedlist.LinkedList;
import sort.SelectionSort;

void main() {
    Integer[] nums = {2, 33, 1, 6, 5, 699, 322, 12};
    SelectionSort.sort(nums);
    System.out.println(Arrays.toString(nums));
}