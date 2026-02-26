// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")

package node.fs

/**
 * Changes the ownership of a file.
 * @since v10.0.0
 * @return Fulfills with `undefined` upon success.
 */
@JsName("chown")
external fun chownAsync(
    path: PathLike,
    uid: Number,
    gid: Number,
): js.promise.Promise<js.core.Void>
