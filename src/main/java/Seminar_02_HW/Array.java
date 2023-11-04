package Seminar_02_HW;

public class Array {
    private int[] array;
    private View view;

    public Array(View view, int N) {
        this.view = view;
        this.array = view.generateArray(N);
    }

    public int[] getArray() {
        return array;
    }

    public int countEvens() {
        if (this.array == null) {
            return 0;
        }
        int evens = 0;
        int arrayLength = this.array.length;
        for (int i = 0; i < arrayLength; i++) {
            if (this.array[i] % 2 == 0) {
                evens++;
            }
        }
        return evens;
    }

    public int diffMinMax() {
        if (this.array == null) {
            return 0;
        }
        int min = array[0];
        int max = array[0];
        int arrayLength = this.array.length;
        if (arrayLength == 0) {
            return 0;
        }
        for (int i = 0; i < arrayLength; i++) {
            if (this.array[i] > max) {
                max = this.array[i];
            }
            if (this.array[i] < min) {
                min = this.array[i];
            }
        }
        return max - min;
    }

    public boolean searchAdjacentElements() {
        int arrayLength = this.array.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (array[i] == array[j] + 1 || array[i] == array[j] - 1 || array[i] == 0 || array[j] == 0) {
                    return true;
                }
            }
        }
        return false;

    }
}
