import java.util.*;

class FourthTree {
    int[] tree;
    int[] lazy;
    int n;

    // Constructor
    FourthTree(int[] arr) {
        n = arr.length;
        tree = new int[4 * n];
        lazy = new int[4 * n];
        build(arr, 0, 0, n - 1);
    }

    // Build Tree
    void build(int[] arr, int node, int start, int end) {
        if (start == end) {
            tree[node] = arr[start];
        } else {
            int mid = (start + end) / 2;
            build(arr, 2 * node + 1, start, mid);
            build(arr, 2 * node + 2, mid + 1, end);
            tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
        }
    }

    // Range Update (Lazy Propagation)
    void updateRange(int node, int start, int end, int l, int r, int val) {

        // Apply pending updates
        if (lazy[node] != 0) {
            tree[node] += (end - start + 1) * lazy[node];

            if (start != end) {
                lazy[2 * node + 1] += lazy[node];
                lazy[2 * node + 2] += lazy[node];
            }

            lazy[node] = 0;
        }

        // No overlap
        if (r < start || end < l) {
            return;
        }

        // Complete overlap
        if (l <= start && end <= r) {
            tree[node] += (end - start + 1) * val;

            if (start != end) {
                lazy[2 * node + 1] += val;
                lazy[2 * node + 2] += val;
            }
            return;
        }

        // Partial overlap
        int mid = (start + end) / 2;

        updateRange(2 * node + 1, start, mid, l, r, val);
        updateRange(2 * node + 2, mid + 1, end, l, r, val);

        tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
    }

    // Range Query
    int queryRange(int node, int start, int end, int l, int r) {

        // Apply pending updates
        if (lazy[node] != 0) {
            tree[node] += (end - start + 1) * lazy[node];

            if (start != end) {
                lazy[2 * node + 1] += lazy[node];
                lazy[2 * node + 2] += lazy[node];
            }

            lazy[node] = 0;
        }

        // No overlap
        if (r < start || end < l) {
            return 0;
        }

        // Complete overlap
        if (l <= start && end <= r) {
            return tree[node];
        }

        // Partial overlap
        int mid = (start + end) / 2;

        int left = queryRange(2 * node + 1, start, mid, l, r);
        int right = queryRange(2 * node + 2, mid + 1, end, l, r);

        return left + right;
    }
}

public class SegmentTree {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 11};

        FourthTree st = new FourthTree(arr);

        // Initial Query
        System.out.println("Initial Sum (1 to 3): " +
            st.queryRange(0, 0, arr.length - 1, 1, 3));

        // Range Update: add +2 to index 1 to 4
        st.updateRange(0, 0, arr.length - 1, 1, 4, 2);

        // Query after update
        System.out.println("After Update Sum (1 to 3): " +
            st.queryRange(0, 0, arr.length - 1, 1, 3));

        System.out.println("After Update Sum (0 to 5): " +
            st.queryRange(0, 0, arr.length - 1, 0, 5));
    }
}