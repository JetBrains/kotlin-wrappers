// Automatically generated - do not modify!

package node.fs

@seskar.js.JsAsync
external suspend fun appendFile(
    path: PathLike,
    data: String,
): js.void.Void

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
@seskar.js.JsAsync
external suspend fun appendFile(
    path: PathLike,
    data: String,
    options: (AppendFileAsyncOptions)? = definedExternally,
): js.void.Void

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
@seskar.js.JsAsync
external suspend fun appendFile(
    path: PathLike,
    data: String,
    options: node.buffer.BufferEncoding? = definedExternally,
): js.void.Void

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
@seskar.js.JsAsync
external suspend fun appendFile(
    path: PathLike,
    data: js.buffer.ArrayBufferView<*>,
): js.void.Void

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
@seskar.js.JsAsync
external suspend fun appendFile(
    path: PathLike,
    data: js.buffer.ArrayBufferView<*>,
    options: (AppendFileAsyncOptions)? = definedExternally,
): js.void.Void

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
@seskar.js.JsAsync
external suspend fun appendFile(
    path: PathLike,
    data: js.buffer.ArrayBufferView<*>,
    options: node.buffer.BufferEncoding? = definedExternally,
): js.void.Void

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
@seskar.js.JsAsync
external suspend fun appendFile(
    path: PathLike,
    data: js.iterable.JsIterable<Any /* string | NodeJS.ArrayBufferView */>,
): js.void.Void

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
@seskar.js.JsAsync
external suspend fun appendFile(
    path: PathLike,
    data: js.iterable.JsIterable<Any /* string | NodeJS.ArrayBufferView */>,
    options: (AppendFileAsyncOptions)? = definedExternally,
): js.void.Void

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
@seskar.js.JsAsync
external suspend fun appendFile(
    path: PathLike,
    data: js.iterable.JsIterable<Any /* string | NodeJS.ArrayBufferView */>,
    options: node.buffer.BufferEncoding? = definedExternally,
): js.void.Void

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
@seskar.js.JsAsync
external suspend fun appendFile(
    path: PathLike,
    data: js.iterable.AsyncIterable<Any /* string | NodeJS.ArrayBufferView */>,
): js.void.Void

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
@seskar.js.JsAsync
external suspend fun appendFile(
    path: PathLike,
    data: js.iterable.AsyncIterable<Any /* string | NodeJS.ArrayBufferView */>,
    options: (AppendFileAsyncOptions)? = definedExternally,
): js.void.Void

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
@seskar.js.JsAsync
external suspend fun appendFile(
    path: PathLike,
    data: js.iterable.AsyncIterable<Any /* string | NodeJS.ArrayBufferView */>,
    options: node.buffer.BufferEncoding? = definedExternally,
): js.void.Void

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
@seskar.js.JsAsync
external suspend fun appendFile(
    path: FileHandle,
    data: String,
): js.void.Void

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
@seskar.js.JsAsync
external suspend fun appendFile(
    path: FileHandle,
    data: String,
    options: (AppendFileAsyncOptions)? = definedExternally,
): js.void.Void

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
@seskar.js.JsAsync
external suspend fun appendFile(
    path: FileHandle,
    data: String,
    options: node.buffer.BufferEncoding? = definedExternally,
): js.void.Void

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
@seskar.js.JsAsync
external suspend fun appendFile(
    path: FileHandle,
    data: js.buffer.ArrayBufferView<*>,
): js.void.Void

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
@seskar.js.JsAsync
external suspend fun appendFile(
    path: FileHandle,
    data: js.buffer.ArrayBufferView<*>,
    options: (AppendFileAsyncOptions)? = definedExternally,
): js.void.Void

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
@seskar.js.JsAsync
external suspend fun appendFile(
    path: FileHandle,
    data: js.buffer.ArrayBufferView<*>,
    options: node.buffer.BufferEncoding? = definedExternally,
): js.void.Void

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
@seskar.js.JsAsync
external suspend fun appendFile(
    path: FileHandle,
    data: js.iterable.JsIterable<Any /* string | NodeJS.ArrayBufferView */>,
): js.void.Void

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
@seskar.js.JsAsync
external suspend fun appendFile(
    path: FileHandle,
    data: js.iterable.JsIterable<Any /* string | NodeJS.ArrayBufferView */>,
    options: (AppendFileAsyncOptions)? = definedExternally,
): js.void.Void

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
@seskar.js.JsAsync
external suspend fun appendFile(
    path: FileHandle,
    data: js.iterable.JsIterable<Any /* string | NodeJS.ArrayBufferView */>,
    options: node.buffer.BufferEncoding? = definedExternally,
): js.void.Void

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
@seskar.js.JsAsync
external suspend fun appendFile(
    path: FileHandle,
    data: js.iterable.AsyncIterable<Any /* string | NodeJS.ArrayBufferView */>,
): js.void.Void

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
@seskar.js.JsAsync
external suspend fun appendFile(
    path: FileHandle,
    data: js.iterable.AsyncIterable<Any /* string | NodeJS.ArrayBufferView */>,
    options: (AppendFileAsyncOptions)? = definedExternally,
): js.void.Void

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
@seskar.js.JsAsync
external suspend fun appendFile(
    path: FileHandle,
    data: js.iterable.AsyncIterable<Any /* string | NodeJS.ArrayBufferView */>,
    options: node.buffer.BufferEncoding? = definedExternally,
): js.void.Void
