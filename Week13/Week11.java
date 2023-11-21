import java.util.List;

public class Week11 {

  /** sortGeneric. */
  public static <T extends Comparable<T>> List<T> sortGeneric(List<T> list) {
    int length = list.toArray().length;
    for (int i = 0; i < length - 1; i++) {
      for (int j = i + 1; j < length; j++) {
        if (list.get(i)
            .compareTo(list.get(j)) > 0) {
          T tmp = list.get(i);
          list.set(i, list.get(j));
          list.set(j, tmp);
        }
      }
    }
    return list;
  }
}