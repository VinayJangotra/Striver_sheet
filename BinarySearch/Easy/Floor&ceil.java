int celi = findCeiling(a,n,x);

int floor = findFloor(a,n,x);

int sol[] = new int[2];//array of size 2 has been created to store the value of floor and celi 

sol[0] = floor;

sol[1] = celi;

return sol;

}



static int findFloor(int[] arr, int n, int x) {

int low = 0, high = n - 1;

int ans = -1;



while (low <= high) {

    int mid = low+(high-low) / 2;

    if (arr[mid] == x) {

        return arr[mid]; // return the target if it's the middle element

    } else if (arr[mid] <= x) {       // may be  answer 

        ans = arr[mid];

        low = mid + 1;

    } else {

        high = mid - 1;

    }

}

return ans;

}



static int findCeiling(int[] arr, int n, int x) {

int low = 0, high = n - 1;

int ans = -1;



while (low <= high) {

    int mid = low+(high-low) / 2;

    if (arr[mid] == x) {

        return arr[mid]; // return the target if it's the middle element

    } else if (arr[mid] >= x) {

        ans = arr[mid];

        high = mid - 1;

    } else {

        low = mid + 1;

    }

}

return ans;

}