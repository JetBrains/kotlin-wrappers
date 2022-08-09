// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")
@file:JsNonModule

package node.fs

import kotlinx.js.Void
import kotlin.js.Promise

/**
 * Changes the permissions of a file.
 * @since v10.0.0
 * @return Fulfills with `undefined` upon success.
 */
@JsName("chmod")
external fun chmodAsync(
    path: PathLike,
    mode: Mode,
): Promise<Void>
