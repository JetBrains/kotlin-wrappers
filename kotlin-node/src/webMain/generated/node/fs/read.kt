// Automatically generated - do not modify!

@file:JsModule("node:fs")

package node.fs

import node.buffer.NonSharedBuffer

/**
 * Read data from the file specified by `fd`.
 *
 * The callback is given the three arguments, `(err, bytesRead, buffer)`.
 *
 * If the file is not modified concurrently, the end-of-file is reached when the
 * number of bytes read is zero.
 *
 * If this method is invoked as its `util.promisify()` ed version, it returns
 * a promise for an `Object` with `bytesRead` and `buffer` properties.
 * @since v0.0.2
 * @param buffer The buffer that the data will be written to.
 * @param offset The position in `buffer` to write the data to.
 * @param length The number of bytes to read.
 * @param position Specifies where to begin reading from in the file. If `position` is `null` or `-1 `, data will be read from the current file position, and the file position will be updated. If
 * `position` is an integer, the file position will be unchanged.
 */
external fun <TBuffer : js.buffer.ArrayBufferView<*>> read(
    fd: Number,
    buffer: TBuffer,
    offset: Number,
    length: Number,
    position: ReadPosition?,
    callback: (err: node.ErrnoException?, bytesRead: Double, buffer: TBuffer) -> Unit,
)

/**
 * Similar to the above `fs.read` function, this version takes an optional `options` object.
 * If not otherwise specified in an `options` object,
 * `buffer` defaults to `Buffer.alloc(16384)`,
 * `offset` defaults to `0`,
 * `length` defaults to `buffer.byteLength`, `- offset` as of Node 17.6.0
 * `position` defaults to `null`
 * @since v12.17.0, 13.11.0
 */
external fun <TBuffer : js.buffer.ArrayBufferView<*> /* default is NonSharedBuffer */> read(
    fd: Number,
    options: ReadOptionsWithBuffer<TBuffer>,
    callback: (err: node.ErrnoException?, bytesRead: Double, buffer: TBuffer) -> Unit,
)

external fun <TBuffer : js.buffer.ArrayBufferView<*>> read(
    fd: Number,
    buffer: TBuffer,
    options: ReadOptions,
    callback: (err: node.ErrnoException?, bytesRead: Double, buffer: TBuffer) -> Unit,
)

external fun <TBuffer : js.buffer.ArrayBufferView<*>> read(
    fd: Number,
    buffer: TBuffer,
    callback: (err: node.ErrnoException?, bytesRead: Double, buffer: TBuffer) -> Unit,
)

external fun read(
    fd: Number,
    callback: (err: node.ErrnoException?, bytesRead: Double, buffer: NonSharedBuffer) -> Unit,
)
