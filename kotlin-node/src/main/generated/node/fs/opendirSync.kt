// Automatically generated - do not modify!

@file:JsModule("node:fs")
@file:JsNonModule

package node.fs

/**
 * Synchronously open a directory. See [`opendir(3)`](http://man7.org/linux/man-pages/man3/opendir.3.html).
 *
 * Creates an `fs.Dir`, which contains all further functions for reading from
 * and cleaning up the directory.
 *
 * The `encoding` option sets the encoding for the `path` while opening the
 * directory and subsequent read operations.
 * @since v12.12.0
 */
external fun opendirSync(
    path: PathLike,
    options: OpenDirOptions = definedExternally,
): Dir
