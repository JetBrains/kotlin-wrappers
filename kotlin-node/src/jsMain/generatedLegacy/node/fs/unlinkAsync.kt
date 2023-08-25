// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")

package node.fs

import js.core.Void
import js.promise.Promise

/**
 * If `path` refers to a symbolic link, then the link is removed without affecting
 * the file or directory to which that link refers. If the `path` refers to a file
 * path that is not a symbolic link, the file is deleted. See the POSIX [`unlink(2)`](http://man7.org/linux/man-pages/man2/unlink.2.html) documentation for more detail.
 * @since v10.0.0
 * @return Fulfills with `undefined` upon success.
 */
@JsName("unlink")
external fun unlinkAsync(
    path: PathLike,
): Promise<Void>
