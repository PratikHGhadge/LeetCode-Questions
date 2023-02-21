class NumArray {
    int[] tree;
    int n;
    public NumArray(int[] arr) {
        n = arr.length;
        tree = new int[4 * n];
        buildTree(arr, 0, n - 1, 0);
    }
    
    public void update(int i, int val) {
        updateHelper(i, val, 0, n - 1, 0);
    }
    
    public int sumRange(int left, int right) {
        return queryHelper(left, right, 0, n - 1, 0);
    }
    
    
    public void updateHelper(int i, int val, int start, int end, int index) {
        if (start == end) {
            tree[index] = val;
            return;
        }
        int mid = (start + end) / 2;
        if (i <= mid) {
            updateHelper(i, val, start, mid, index * 2 + 1);
        } else {
            updateHelper(i, val, mid + 1, end, index * 2 + 2);
        }
        tree[index] = tree[index * 2 + 1] + tree[index * 2 + 2];
    }
    
    public int queryHelper(int left, int right, int start, int end, int index) {
        if (left <= start && right >= end) {
            return tree[index];
        }
        if (left > end || right < start) {
            return 0;
        }
        int mid = (start + end) / 2;
        return queryHelper(left, right, start, mid, index * 2 + 1) + queryHelper(left, right, mid + 1, end, index * 2 + 2);
    }
    
    private void buildTree(int[] arr, int start, int end, int index) {
        if (start == end) {
            tree[index] = arr[start];
            return;
        }
        int mid = (start + end) / 2;
        buildTree(arr, start, mid, index * 2 + 1);
        buildTree(arr, mid + 1, end, index * 2 + 2);
        tree[index] = tree[index * 2 + 1] + tree[index * 2 + 2];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */