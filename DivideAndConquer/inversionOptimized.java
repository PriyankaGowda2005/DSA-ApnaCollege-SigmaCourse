package DivideAndConquer;

public class inversionOptimized {

    public static int merge(int arr[], int left, int mid, int right) {

        int i = left;
        int j = mid;
        int k = 0;
        int invCount = 0;

        int temp[] = new int[(right - left + 1)];

        while (i < mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i); // Count inversions
            }
        }

        while (i < mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }

        return invCount;
    }

    public static int mergeSort(int arr[], int left, int right) {
        int invCount = 0;

        if (left < right) {
            int mid = (left + right) / 2;

            invCount += mergeSort(arr, left, mid);
            invCount += mergeSort(arr, mid + 1, right);
            invCount += merge(arr, left, mid + 1, right);
        }

        return invCount;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 20, 6, 4, 5 };
        System.out.println("Inversion Count = " + mergeSort(arr, 0, arr.length - 1));
    }
}
