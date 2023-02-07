// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")

package node.fs

import js.core.Void
import kotlin.js.Promise

/**
 * Changes the ownership on a symbolic link.
 * @since v10.0.0
 * @return Fulfills with `undefined` upon success.
 */
@JsName("lchown")
external fun lchownAsync(
    path: PathLike,
    uid: Number,
    gid: Number,
): Promise<Void>
