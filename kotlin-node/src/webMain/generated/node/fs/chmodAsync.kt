// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")

package node.fs

/**
 * Changes the permissions of a file.
 * @since v10.0.0
 * @return Fulfills with `undefined` upon success.
 */
@JsName("chmod")
external fun chmodAsync(
    path: PathLike,
    mode: Mode,
): js.promise.Promise<js.core.Void>
