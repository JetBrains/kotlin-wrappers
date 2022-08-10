// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")
@file:JsNonModule

package node.fs

import kotlinx.js.Void
import kotlin.js.Promise

/**
 * Changes the access and modification times of a file in the same way as `fsPromises.utimes()`, with the difference that if the path refers to a
 * symbolic link, then the link is not dereferenced: instead, the timestamps of
 * the symbolic link itself are changed.
 * @since v14.5.0, v12.19.0
 * @return Fulfills with `undefined` upon success.
 */
@JsName("utimes")
external fun utimesAsync(
    path: PathLike,
    atime: Any, /* string | number | Date */
    mtime: Any, /* string | number | Date */
): Promise<Void>
