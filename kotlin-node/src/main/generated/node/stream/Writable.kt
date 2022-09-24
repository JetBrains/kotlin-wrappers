// Automatically generated - do not modify!

@file:JsModule("node:stream")
@file:JsNonModule

package node.stream

import node.events.Event
import node.events.EventType

open external class Writable : Stream, node.WritableStream {
    /**
     * Is `true` if it is safe to call `writable.write()`, which means
     * the stream has not been destroyed, errored or ended.
     * @since v11.4.0
     */
    override /* val */ var writable: Boolean

    /**
     * Is `true` after `writable.end()` has been called. This property
     * does not indicate whether the data has been flushed, for this use `writable.writableFinished` instead.
     * @since v12.9.0
     */
    open val writableEnded: Boolean

    /**
     * Is set to `true` immediately before the `'finish'` event is emitted.
     * @since v12.6.0
     */
    open val writableFinished: Boolean

    /**
     * Return the value of `highWaterMark` passed when creating this `Writable`.
     * @since v9.3.0
     */
    open val writableHighWaterMark: Number

    /**
     * This property contains the number of bytes (or objects) in the queue
     * ready to be written. The value provides introspection data regarding
     * the status of the `highWaterMark`.
     * @since v9.4.0
     */
    open val writableLength: Number

    /**
     * Getter for the property `objectMode` of a given `Writable` stream.
     * @since v12.3.0
     */
    open val writableObjectMode: Boolean

    /**
     * Number of times `writable.uncork()` needs to be
     * called in order to fully uncork the stream.
     * @since v13.2.0, v12.16.0
     */
    open val writableCorked: Number

    /**
     * Is `true` after `writable.destroy()` has been called.
     * @since v8.0.0
     */
    open var destroyed: Boolean

    /**
     * Is true after 'close' has been emitted.
     * @since v8.0.0
     */
    open val closed: Boolean

    /**
     * Returns error if the stream has been destroyed with an error.
     * @since v18.0.0
     */
    open val errored: Error?

    /**
     * Is `true` if the stream's buffer has been full and stream will emit 'drain'.
     * @since v15.2.0, v14.17.0
     */
    open val writableNeedDrain: Boolean

    constructor(opts: WritableOptions = definedExternally)

    open fun _write(
        chunk: Any,
        encoding: node.buffer.BufferEncoding,
        callback: (error: Error?) -> Unit,
    )

    // HIDDEN METHOD START
    /*
    _writev?(
        chunks: Array<{
            chunk: any;
            encoding: BufferEncoding;
        }>,
        callback: (error?: Error | null) => void
    ): void
    */
    // HIDDEN METHOD END

    open var _construct: ((callback: (error: Error?) -> Unit) -> Unit)?
    open fun _destroy(
        error: Error?,
        callback: (error: Error?) -> Unit,
    )

    open fun _final(callback: (error: Error?) -> Unit)

    /**
     * The `writable.write()` method writes some data to the stream, and calls the
     * supplied `callback` once the data has been fully handled. If an error
     * occurs, the `callback` will be called with the error as its
     * first argument. The `callback` is called asynchronously and before `'error'` is
     * emitted.
     *
     * The return value is `true` if the internal buffer is less than the`highWaterMark` configured when the stream was created after admitting `chunk`.
     * If `false` is returned, further attempts to write data to the stream should
     * stop until the `'drain'` event is emitted.
     *
     * While a stream is not draining, calls to `write()` will buffer `chunk`, and
     * return false. Once all currently buffered chunks are drained (accepted for
     * delivery by the operating system), the `'drain'` event will be emitted.
     * Once `write()` returns false, do not write more chunks
     * until the `'drain'` event is emitted. While calling `write()` on a stream that
     * is not draining is allowed, Node.js will buffer all written chunks until
     * maximum memory usage occurs, at which point it will abort unconditionally.
     * Even before it aborts, high memory usage will cause poor garbage collector
     * performance and high RSS (which is not typically released back to the system,
     * even after the memory is no longer required). Since TCP sockets may never
     * drain if the remote peer does not read the data, writing a socket that is
     * not draining may lead to a remotely exploitable vulnerability.
     *
     * Writing data while the stream is not draining is particularly
     * problematic for a `Transform`, because the `Transform` streams are paused
     * by default until they are piped or a `'data'` or `'readable'` event handler
     * is added.
     *
     * If the data to be written can be generated or fetched on demand, it is
     * recommended to encapsulate the logic into a `Readable` and use {@link pipe}. However, if calling `write()` is preferred, it is
     * possible to respect backpressure and avoid memory issues using the `'drain'` event:
     *
     * ```js
     * function write(data, cb) {
     *   if (!stream.write(data)) {
     *     stream.once('drain', cb);
     *   } else {
     *     process.nextTick(cb);
     *   }
     * }
     *
     * // Wait for cb to be called before doing any other write.
     * write('hello', () => {
     *   console.log('Write completed, do more writes now.');
     * });
     * ```
     *
     * A `Writable` stream in object mode will always ignore the `encoding` argument.
     * @since v0.9.4
     * @param chunk Optional data to write. For streams not operating in object mode, `chunk` must be a string, `Buffer` or `Uint8Array`. For object mode streams, `chunk` may be any
     * JavaScript value other than `null`.
     * @param [encoding='utf8'] The encoding, if `chunk` is a string.
     * @param callback Callback for when this chunk of data is flushed.
     * @return `false` if the stream wishes for the calling code to wait for the `'drain'` event to be emitted before continuing to write additional data; otherwise `true`.
     */
    override fun write(
        chunk: Any,
        callback: (error: Error?) -> Unit,
    ): Boolean

    override fun write(
        str: String,
        encoding: node.buffer.BufferEncoding,
        callback: (error: Error?) -> Unit,
    ): Boolean

    /**
     * The `writable.setDefaultEncoding()` method sets the default `encoding` for a `Writable` stream.
     * @since v0.11.15
     * @param encoding The new default encoding
     */
    open fun setDefaultEncoding(encoding: node.buffer.BufferEncoding) /* : this */

    /**
     * Calling the `writable.end()` method signals that no more data will be written
     * to the `Writable`. The optional `chunk` and `encoding` arguments allow one
     * final additional chunk of data to be written immediately before closing the
     * stream.
     *
     * Calling the {@link write} method after calling {@link end} will raise an error.
     *
     * ```js
     * // Write 'hello, ' and then end with 'world!'.
     * const fs = require('fs');
     * const file = fs.createWriteStream('example.txt');
     * file.write('hello, ');
     * file.end('world!');
     * // Writing more now is not allowed!
     * ```
     * @since v0.9.4
     * @param chunk Optional data to write. For streams not operating in object mode, `chunk` must be a string, `Buffer` or `Uint8Array`. For object mode streams, `chunk` may be any
     * JavaScript value other than `null`.
     * @param encoding The encoding if `chunk` is a string
     * @param callback Callback for when the stream is finished.
     */
    override fun end(callback: () -> Unit) /* : this */
    override fun end(
        chunk: Any,
        callback: () -> Unit,
    ) /* : this */

    override fun end(
        str: String,
        encoding: node.buffer.BufferEncoding,
        callback: () -> Unit,
    ) /* : this */

    /**
     * The `writable.cork()` method forces all written data to be buffered in memory.
     * The buffered data will be flushed when either the {@link uncork} or {@link end} methods are called.
     *
     * The primary intent of `writable.cork()` is to accommodate a situation in which
     * several small chunks are written to the stream in rapid succession. Instead of
     * immediately forwarding them to the underlying destination, `writable.cork()`buffers all the chunks until `writable.uncork()` is called, which will pass them
     * all to `writable._writev()`, if present. This prevents a head-of-line blocking
     * situation where data is being buffered while waiting for the first small chunk
     * to be processed. However, use of `writable.cork()` without implementing`writable._writev()` may have an adverse effect on throughput.
     *
     * See also: `writable.uncork()`, `writable._writev()`.
     * @since v0.11.2
     */
    open fun cork()

    /**
     * The `writable.uncork()` method flushes all data buffered since {@link cork} was called.
     *
     * When using `writable.cork()` and `writable.uncork()` to manage the buffering
     * of writes to a stream, defer calls to `writable.uncork()` using`process.nextTick()`. Doing so allows batching of all`writable.write()` calls that occur within a given Node.js event
     * loop phase.
     *
     * ```js
     * stream.cork();
     * stream.write('some ');
     * stream.write('data ');
     * process.nextTick(() => stream.uncork());
     * ```
     *
     * If the `writable.cork()` method is called multiple times on a stream, the
     * same number of calls to `writable.uncork()` must be called to flush the buffered
     * data.
     *
     * ```js
     * stream.cork();
     * stream.write('some ');
     * stream.cork();
     * stream.write('data ');
     * process.nextTick(() => {
     *   stream.uncork();
     *   // The data will not be flushed until uncork() is called a second time.
     *   stream.uncork();
     * });
     * ```
     *
     * See also: `writable.cork()`.
     * @since v0.11.2
     */
    open fun uncork()

    /**
     * Destroy the stream. Optionally emit an `'error'` event, and emit a `'close'`event (unless `emitClose` is set to `false`). After this call, the writable
     * stream has ended and subsequent calls to `write()` or `end()` will result in
     * an `ERR_STREAM_DESTROYED` error.
     * This is a destructive and immediate way to destroy a stream. Previous calls to`write()` may not have drained, and may trigger an `ERR_STREAM_DESTROYED` error.
     * Use `end()` instead of destroy if data should flush before close, or wait for
     * the `'drain'` event before destroying the stream.
     *
     * Once `destroy()` has been called any further calls will be a no-op and no
     * further errors except from `_destroy()` may be emitted as `'error'`.
     *
     * Implementors should not override this method,
     * but instead implement `writable._destroy()`.
     * @since v8.0.0
     * @param error Optional, an error to emit with `'error'` event.
     */
    open fun destroy(error: Error = definedExternally) /* : this */

    /**
     * Event emitter
     * The defined events on documents including:
     * 1. close
     * 2. drain
     * 3. error
     * 4. finish
     * 5. pipe
     * 6. unpipe
     */
    open fun addListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    open fun addListener(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    open fun addListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    open fun addListener(
        event: Event.FINISH,
        listener: () -> Unit,
    ) /* : this */

    open fun addListener(
        event: Event.PIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    open fun addListener(
        event: Event.UNPIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun addListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    open fun emit(event: Event.CLOSE): Boolean
    open fun emit(event: Event.DRAIN): Boolean
    open fun emit(
        event: Event.ERROR,
        err: Error,
    ): Boolean

    open fun emit(event: Event.FINISH): Boolean
    open fun emit(
        event: Event.PIPE,
        src: Readable,
    ): Boolean

    open fun emit(
        event: Event.UNPIPE,
        src: Readable,
    ): Boolean

    override fun emit(
        event: EventType,
        vararg args: Any,
    ): Boolean

    open fun on(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    open fun on(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    open fun on(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    open fun on(
        event: Event.FINISH,
        listener: () -> Unit,
    ) /* : this */

    open fun on(
        event: Event.PIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    open fun on(
        event: Event.UNPIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun on(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    open fun once(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    open fun once(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    open fun once(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    open fun once(
        event: Event.FINISH,
        listener: () -> Unit,
    ) /* : this */

    open fun once(
        event: Event.PIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    open fun once(
        event: Event.UNPIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun once(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    open fun prependListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    open fun prependListener(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    open fun prependListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    open fun prependListener(
        event: Event.FINISH,
        listener: () -> Unit,
    ) /* : this */

    open fun prependListener(
        event: Event.PIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    open fun prependListener(
        event: Event.UNPIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun prependListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    open fun prependOnceListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    open fun prependOnceListener(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    open fun prependOnceListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    open fun prependOnceListener(
        event: Event.FINISH,
        listener: () -> Unit,
    ) /* : this */

    open fun prependOnceListener(
        event: Event.PIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    open fun prependOnceListener(
        event: Event.UNPIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    open fun removeListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    open fun removeListener(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    open fun removeListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    open fun removeListener(
        event: Event.FINISH,
        listener: () -> Unit,
    ) /* : this */

    open fun removeListener(
        event: Event.PIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    open fun removeListener(
        event: Event.UNPIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun removeListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    companion object {
        /**
         * A utility method for creating a `Writable` from a web `WritableStream`.
         * @since v17.0.0
         * @experimental
         */
        fun fromWeb(
            writableStream: node.stream.web.WritableStream,
            options: WritableOptions = definedExternally,
        ): Writable

        /**
         * A utility method for creating a web `WritableStream` from a `Writable`.
         * @since v17.0.0
         * @experimental
         */
        fun toWeb(streamWritable: Writable): node.stream.web.WritableStream
    }
}
