@file:JsModule("node:fs")

package node.fs


/**
 * A representation of a directory entry, which can be a file or a subdirectory
 * within the directory, as returned by reading from an `fs.Dir`. The
 * directory entry is a combination of the file name and file type pairs.
 *
 * Additionally, when {@link readdir} or {@link readdirSync} is called with
 * the `withFileTypes` option set to `true`, the resulting array is filled with `fs.Dirent` objects, rather than strings or `Buffer` s.
 * @since v10.10.0
 */

external class Dirent {
    /**
     * Returns `true` if the `fs.Dirent` object describes a regular file.
     * @since v10.10.0
     */
    fun isFile(): Boolean

    /**
     * Returns `true` if the `fs.Dirent` object describes a file system
     * directory.
     * @since v10.10.0
     */
    fun isDirectory(): Boolean

    /**
     * Returns `true` if the `fs.Dirent` object describes a block device.
     * @since v10.10.0
     */
    fun isBlockDevice(): Boolean

    /**
     * Returns `true` if the `fs.Dirent` object describes a character device.
     * @since v10.10.0
     */
    fun isCharacterDevice(): Boolean

    /**
     * Returns `true` if the `fs.Dirent` object describes a symbolic link.
     * @since v10.10.0
     */
    fun isSymbolicLink(): Boolean

    /**
     * Returns `true` if the `fs.Dirent` object describes a first-in-first-out
     * (FIFO) pipe.
     * @since v10.10.0
     */
    fun isFIFO(): Boolean

    /**
     * Returns `true` if the `fs.Dirent` object describes a socket.
     * @since v10.10.0
     */
    fun isSocket(): Boolean

    /**
     * The file name that this `fs.Dirent` object refers to. The type of this
     * value is determined by the `options.encoding` passed to {@link readdir} or {@link readdirSync}.
     * @since v10.10.0
     */
    var name: String
}
