// Automatically generated - do not modify!

@file:JsModule("node:fs")

package node.fs

/**
 * `options` may also include a `start` option to allow writing data at some
 * position past the beginning of the file, allowed values are in the
 * \[0, [`Number.MAX_SAFE_INTEGER`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/MAX_SAFE_INTEGER)\] range. Modifying a file rather than
 * replacing it may require the `flags` option to be set to `r+` rather than the
 * default `w`. The `encoding` can be any one of those accepted by `Buffer`.
 *
 * If `autoClose` is set to true (default behavior) on `'error'` or `'finish'`the file descriptor will be closed automatically. If `autoClose` is false,
 * then the file descriptor won't be closed, even if there's an error.
 * It is the application's responsibility to close it and make sure there's no
 * file descriptor leak.
 *
 * By default, the stream will emit a `'close'` event after it has been
 * destroyed.  Set the `emitClose` option to `false` to change this behavior.
 *
 * By providing the `fs` option it is possible to override the corresponding `fs`implementations for `open`, `write`, `writev` and `close`. Overriding `write()`without `writev()` can reduce
 * performance as some optimizations (`_writev()`)
 * will be disabled. When providing the `fs` option, overrides for at least one of`write` and `writev` are required. If no `fd` option is supplied, an override
 * for `open` is also required. If `autoClose` is `true`, an override for `close`is also required.
 *
 * Like `fs.ReadStream`, if `fd` is specified, `fs.WriteStream` will ignore the`path` argument and will use the specified file descriptor. This means that no`'open'` event will be
 * emitted. `fd` should be blocking; non-blocking `fd`s
 * should be passed to `net.Socket`.
 *
 * If `options` is a string, then it specifies the encoding.
 * @since v0.1.31
 */
external fun createWriteStream(
    path: PathLike,
    options: Any /* BufferEncoding | StreamOptions */ = definedExternally,
): WriteStream
