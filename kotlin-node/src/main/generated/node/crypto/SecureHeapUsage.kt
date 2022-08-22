// Automatically generated - do not modify!

package node.crypto

sealed external interface SecureHeapUsage {
    /**
     * The total allocated secure heap size as specified using the `--secure-heap=n` command-line flag.
     */
    var total: Number

    /**
     * The minimum allocation from the secure heap as specified using the `--secure-heap-min` command-line flag.
     */
    var min: Number

    /**
     * The total number of bytes currently allocated from the secure heap.
     */
    var used: Number

    /**
     * The calculated ratio of `used` to `total` allocated bytes.
     */
    var utilization: Number
}
