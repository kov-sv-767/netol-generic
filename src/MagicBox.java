import java.util.Random;

public class MagicBox<T> {
    protected T[] items;

    public MagicBox(int maxItems) {
        this.items = (T[]) new Object[maxItems];
    }

    int filled = 0;

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                filled += 1;
                return true;
            }
        }
        return false;
    }
    Random random = new Random();
    int randomInt;
    public T pick() {

        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Коробка не заполнена, осталось заполнить " + (items.length - filled) + " ячеек.");
    //            continue;
            } else {
                randomInt = random.nextInt(items.length);
                System.out.println("Коробка заполнена. Случайный элемент из коробки: " + items[randomInt]);
                System.out.println();

            }return items[randomInt];
        }
        return items[randomInt];
    }
}

