// Automatically generated - do not modify!

@file:JsModule("node:fs")
@file:JsNonModule

package node.fs

/**
 * Unlike the 16 kb default `highWaterMark` for a `stream.Readable`, the stream
 * returned by this method has a default `highWaterMark` of 64 kb.
 *
 * `options` can include `start` and `end` values to read a range of bytes from
 * the file instead of the entire file. Both `start` and `end` are inclusive and
 * start counting at 0, allowed values are in the
 * \[0, [`Number.MAX_SAFE_INTEGER`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/MAX_SAFE_INTEGER)\] range. If `fd` is specified and `start` is
 * omitted or `undefined`, `fs.createReadStream()` reads sequentially from the
 * current file position. The `encoding` can be any one of those accepted by `Buffer`.
 *
 * If `fd` is specified, `ReadStream` will ignore the `path` argument and will use
 * the specified file descriptor. This means that no `'open'` event will be
 * emitted. `fd` should be blocking; non-blocking `fd`s should be passed to `net.Socket`.
 *
 * If `fd` points to a character device that only supports blocking reads
 * (such as keyboard or sound card), read operations do not finish until data is
 * available. This can prevent the process from exiting and the stream from
 * closing naturally.
 *
 * By default, the stream will emit a `'close'` event after it has been
 * destroyed.  Set the `emitClose` option to `false` to change this behavior.
 *
 * By providing the `fs` option, it is possible to override the corresponding `fs`implementations for `open`, `read`, and `close`. When providing the `fs` option,
 * an override for `read` is required. If no `fd` is provided, an override for`open` is also required. If `autoClose` is `true`, an override for `close` is
 * also required.
 *
 * ```js
 * import { createReadStream } from 'fs';
 *
 * // Create a stream from some character device.
 * const stream = createReadStream('/dev/input/event0');
 * setTimeout(() => {
 *   stream.close(); // This may not close the stream.
 *   // Artificially marking end-of-stream, as if the underlying resource had
 *   // indicated end-of-file by itself, allows the stream to close.
 *   // This does not cancel pending read operations, and if there is such an
 *   // operation, the process may still not be able to exit successfully
 *   // until it finishes.
 *   stream.push(null);
 *   stream.read(0);
 * }, 100);
 * ```
 *
 * If `autoClose` is false, then the file descriptor won't be closed, even if
 * there's an error. It is the application's responsibility to close it and make
 * sure there's no file descriptor leak. If `autoClose` is set to true (default
 * behavior), on `'error'` or `'end'` the file descriptor will be closed
 * automatically.
 *
 * `mode` sets the file mode (permission and sticky bits), but only if the
 * file was created.
 *
 * An example to read the last 10 bytes of a file which is 100 bytes long:
 *
 * ```js
 * import { createReadStream } from 'fs';
 *
 * createReadStream('sample.txt', { start: 90, end: 99 });
 * ```
 *
 * If `options` is a string, then it specifies the encoding.
 * @since v0.1.31
 */
external fun createReadStream(
    path: PathLike,
    options: Any /* BufferEncoding | ReadStreamOptions */ = definedExternally,
): ReadStream
