// Automatically generated - do not modify!

package node.fs

sealed external interface OpenDirOptions {
    var encoding: node.buffer.BufferEncoding?

    /**
     * Number of directory entries that are buffered
     * internally when reading from the directory. Higher values lead to better
     * performance but higher memory usage.
     * @default 32
     */
    var bufferSize: Number?
}
