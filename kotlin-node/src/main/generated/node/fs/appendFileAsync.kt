// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")
@file:JsNonModule

package node.fs

import kotlinx.js.Void
import kotlin.js.Promise

/**
 * Asynchronously append data to a file, creating the file if it does not yet
 * exist. `data` can be a string or a `Buffer`.
 *
 * If `options` is a string, then it specifies the `encoding`.
 *
 * The `mode` option only affects the newly created file. See `fs.open()` for more details.
 *
 * The `path` may be specified as a `FileHandle` that has been opened
 * for appending (using `fsPromises.open()`).
 * @since v10.0.0
 * @param path filename or {FileHandle}
 * @return Fulfills with `undefined` upon success.
 */
@JsName("appendFile")
external fun appendFileAsync(
    path: Any, /* PathLike | FileHandle */
    data: Any, /* string | Uint8Array */
    options: Any? /* (ObjectEncodingOptions & FlagAndOpenMode) | BufferEncoding */ = definedExternally,
): Promise<Void>
