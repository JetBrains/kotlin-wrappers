@file:JsModule("node:fs/promises")

package node.fs

import js.promise.Promise
import js.typedarrays.Uint8Array

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
    path: PathLike,
    data: String,
    options: (AppendFileAsyncOptions)? = definedExternally,
): Promise<Unit>


@JsName("appendFile")
external fun appendFileAsync(
    path: PathLike,
    data: String,
    options: node.buffer.BufferEncoding? = definedExternally,
): Promise<Unit>


@JsName("appendFile")
external fun appendFileAsync(
    path: PathLike,
    data: Uint8Array,
    options: (AppendFileAsyncOptions)? = definedExternally,
): Promise<Unit>


@JsName("appendFile")
external fun appendFileAsync(
    path: PathLike,
    data: Uint8Array,
    options: node.buffer.BufferEncoding? = definedExternally,
): Promise<Unit>


@JsName("appendFile")
external fun appendFileAsync(
    path: FileHandle,
    data: String,
    options: (AppendFileAsyncOptions)? = definedExternally,
): Promise<Unit>


@JsName("appendFile")
external fun appendFileAsync(
    path: FileHandle,
    data: String,
    options: node.buffer.BufferEncoding? = definedExternally,
): Promise<Unit>


@JsName("appendFile")
external fun appendFileAsync(
    path: FileHandle,
    data: Uint8Array,
    options: (AppendFileAsyncOptions)? = definedExternally,
): Promise<Unit>


@JsName("appendFile")
external fun appendFileAsync(
    path: FileHandle,
    data: Uint8Array,
    options: node.buffer.BufferEncoding? = definedExternally,
): Promise<Unit>
