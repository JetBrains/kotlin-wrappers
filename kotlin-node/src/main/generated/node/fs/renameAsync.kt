// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")
@file:JsNonModule

package node.fs

import js.core.Void
import kotlin.js.Promise

/**
 * Renames `oldPath` to `newPath`.
 * @since v10.0.0
 * @return Fulfills with `undefined` upon success.
 */
@JsName("rename")
external fun renameAsync(
    oldPath: PathLike,
    newPath: PathLike,
): Promise<Void>
