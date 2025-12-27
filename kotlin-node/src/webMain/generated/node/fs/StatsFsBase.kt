// Automatically generated - do not modify!

package node.fs

sealed external interface StatsFsBase<T> {
    /** Type of file system. */
    var type: T

    /**  Optimal transfer block size. */
    var bsize: T

    /**  Total data blocks in file system. */
    var blocks: T

    /** Free blocks in file system. */
    var bfree: T

    /** Available blocks for unprivileged users */
    var bavail: T

    /** Total file nodes in file system. */
    var files: T

    /** Free file nodes in file system. */
    var ffree: T
}
