class RoutePlanner {
    HuntRoute[] routes;
    int size;

    public RoutePlanner(int capacity) {
        routes = new HuntRoute[capacity];
        size = 0;
    }

    public void addRoute(HuntRoute route) {
        if (size < routes.length) {
            routes[size] = route;
            size++;
        }
    }

    // MergeSort from start
    public void sortRoutes() {
        mergeSort(0, size - 1);
    }

    private void mergeSort(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(left, mid);
            mergeSort(mid + 1, right);
            merge(left, mid, right);
        }
    }
    // Merging left and right sites which score is smaller use k, k is new array for after merge
    private void merge(int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        // Create two arrays for left and right side
        HuntRoute[] Left = new HuntRoute[n1];
        HuntRoute[] Right = new HuntRoute[n2];

        for (int i = 0; i < n1; i++)
            Left[i] = routes[left + i];
        for (int j = 0; j < n2; j++)
            Right[j] = routes[mid + 1 + j];

        int i = 0 ;
        int j = 0;
        // k = left meaning start from k's left site
        int k = left;
        while (i < n1 && j < n2) {
            if (Left[i].distance <= Right[j].distance) {
                routes[k] = Left[i];
                i++;
            } else {
                routes[k] = Right[j];
                j++;
            }
            k++;
        }
        // Merging for leftovers of left
        while (i < n1) {
            routes[k] = Left[i];
            i++;
            k++;
        }
        // Merging for leftovers of right
        while (j < n2) {
            routes[k] = Right[j];
            j++;
            k++;
        }
    }

    public void printRoutes() {
        for (int i = 0; i < size; i++) {
            System.out.println(routes[i]);
        }
    }
}