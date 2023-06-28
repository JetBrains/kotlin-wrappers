// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")

package node.fs

import js.core.Void
import js.promise.Promise

/**
 * Removes files and directories (modeled on the standard POSIX `rm` utility).
 * @since v14.14.0
 * @return Fulfills with `undefined` upon success.
 */
@JsName("rm")
external fun rmAsync(
    path: PathLike,
    options: RmOptions = definedExternally,
): Promise<Void>
