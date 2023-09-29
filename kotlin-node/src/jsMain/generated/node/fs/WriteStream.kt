@file:JsModule("node:fs")

package node.fs


/**
 * * Extends `stream.Writable`
 *
 * Instances of `fs.WriteStream` are created and returned using the {@link createWriteStream} function.
 * @since v0.1.93
 */

external class WriteStream : node.stream.Writable {
    /**
     * Closes `writeStream`. Optionally accepts a
     * callback that will be executed once the `writeStream`is closed.
     * @since v0.9.4
     */
    fun close(callback: (err: node.ErrnoException? /* use undefined for default */) -> Unit = definedExternally): Unit

    /**
     * The number of bytes written so far. Does not include data that is still queued
     * for writing.
     * @since v0.4.7
     */
    var bytesWritten: Double

    /**
     * The path to the file the stream is writing to as specified in the first
     * argument to {@link createWriteStream}. If `path` is passed as a string, then`writeStream.path` will be a string. If `path` is passed as a `Buffer`, then`writeStream.path` will be a
     * `Buffer`.
     * @since v0.1.93
     */
    var path: Any /* string | Buffer */

    /**
     * This property is `true` if the underlying file has not been opened yet,
     * i.e. before the `'ready'` event is emitted.
     * @since v11.2.0
     */
    var pending: Boolean

    /**
     * events.EventEmitter
     *   1. open
     *   2. close
     *   3. ready
     */
    fun addListener(event: WriteStreamEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun addListener(event: WriteStreamEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun addListener(event: WriteStreamEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun addListener(event: WriteStreamEvent.FINISH, listener: () -> Unit): Unit /* this */
    fun addListener(event: WriteStreamEvent.OPEN, listener: (fd: Double) -> Unit): Unit /* this */
    fun addListener(event: WriteStreamEvent.PIPE, listener: (src: node.stream.Readable) -> Unit): Unit /* this */
    fun addListener(event: WriteStreamEvent.READY, listener: () -> Unit): Unit /* this */
    fun addListener(event: WriteStreamEvent.UNPIPE, listener: (src: node.stream.Readable) -> Unit): Unit /* this */
    fun addListener(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */

    fun addListener(event: js.core.Symbol, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */
    fun on(event: WriteStreamEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun on(event: WriteStreamEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun on(event: WriteStreamEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun on(event: WriteStreamEvent.FINISH, listener: () -> Unit): Unit /* this */
    fun on(event: WriteStreamEvent.OPEN, listener: (fd: Double) -> Unit): Unit /* this */
    fun on(event: WriteStreamEvent.PIPE, listener: (src: node.stream.Readable) -> Unit): Unit /* this */
    fun on(event: WriteStreamEvent.READY, listener: () -> Unit): Unit /* this */
    fun on(event: WriteStreamEvent.UNPIPE, listener: (src: node.stream.Readable) -> Unit): Unit /* this */
    fun on(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */

    fun on(event: js.core.Symbol, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */
    fun once(event: WriteStreamEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun once(event: WriteStreamEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun once(event: WriteStreamEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun once(event: WriteStreamEvent.FINISH, listener: () -> Unit): Unit /* this */
    fun once(event: WriteStreamEvent.OPEN, listener: (fd: Double) -> Unit): Unit /* this */
    fun once(event: WriteStreamEvent.PIPE, listener: (src: node.stream.Readable) -> Unit): Unit /* this */
    fun once(event: WriteStreamEvent.READY, listener: () -> Unit): Unit /* this */
    fun once(event: WriteStreamEvent.UNPIPE, listener: (src: node.stream.Readable) -> Unit): Unit /* this */
    fun once(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */

    fun once(event: js.core.Symbol, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */
    fun prependListener(event: WriteStreamEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun prependListener(event: WriteStreamEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun prependListener(
        event: WriteStreamEvent.ERROR,
        listener: (err: Throwable /* JsError */) -> Unit,
    ): Unit /* this */

    fun prependListener(event: WriteStreamEvent.FINISH, listener: () -> Unit): Unit /* this */
    fun prependListener(event: WriteStreamEvent.OPEN, listener: (fd: Double) -> Unit): Unit /* this */
    fun prependListener(event: WriteStreamEvent.PIPE, listener: (src: node.stream.Readable) -> Unit): Unit /* this */
    fun prependListener(event: WriteStreamEvent.READY, listener: () -> Unit): Unit /* this */
    fun prependListener(event: WriteStreamEvent.UNPIPE, listener: (src: node.stream.Readable) -> Unit): Unit /* this */
    fun prependListener(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */

    fun prependListener(event: js.core.Symbol, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */
    fun prependOnceListener(event: WriteStreamEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: WriteStreamEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(
        event: WriteStreamEvent.ERROR,
        listener: (err: Throwable /* JsError */) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(event: WriteStreamEvent.FINISH, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: WriteStreamEvent.OPEN, listener: (fd: Double) -> Unit): Unit /* this */
    fun prependOnceListener(
        event: WriteStreamEvent.PIPE,
        listener: (src: node.stream.Readable) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(event: WriteStreamEvent.READY, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(
        event: WriteStreamEvent.UNPIPE,
        listener: (src: node.stream.Readable) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */

    fun prependOnceListener(
        event: js.core.Symbol,
        listener: Function<Any?>, /* (...args: any[]) => void */
    ): Unit /* this */
}
