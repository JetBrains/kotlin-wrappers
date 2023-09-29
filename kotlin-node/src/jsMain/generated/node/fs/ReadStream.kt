@file:JsModule("node:fs")

package node.fs


/**
 * Instances of `fs.ReadStream` are created and returned using the {@link createReadStream} function.
 * @since v0.1.93
 */

external class ReadStream : node.stream.Readable {
    fun close(callback: (err: node.ErrnoException? /* use undefined for default */) -> Unit = definedExternally): Unit

    /**
     * The number of bytes that have been read so far.
     * @since v6.4.0
     */
    var bytesRead: Double

    /**
     * The path to the file the stream is reading from as specified in the first
     * argument to `fs.createReadStream()`. If `path` is passed as a string, then`readStream.path` will be a string. If `path` is passed as a `Buffer`, then`readStream.path` will be a
     * `Buffer`. If `fd` is specified, then`readStream.path` will be `undefined`.
     * @since v0.1.93
     */
    var path: Any /* string | Buffer */

    /**
     * This property is `true` if the underlying file has not been opened yet,
     * i.e. before the `'ready'` event is emitted.
     * @since v11.2.0, v10.16.0
     */
    var pending: Boolean

    /**
     * events.EventEmitter
     *   1. open
     *   2. close
     *   3. ready
     */
    fun addListener(event: ReadStreamEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun addListener(event: ReadStreamEvent.DATA, listener: (chunk: Any /* Buffer | string */) -> Unit): Unit /* this */
    fun addListener(event: ReadStreamEvent.END, listener: () -> Unit): Unit /* this */
    fun addListener(event: ReadStreamEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun addListener(event: ReadStreamEvent.OPEN, listener: (fd: Double) -> Unit): Unit /* this */
    fun addListener(event: ReadStreamEvent.PAUSE, listener: () -> Unit): Unit /* this */
    fun addListener(event: ReadStreamEvent.READABLE, listener: () -> Unit): Unit /* this */
    fun addListener(event: ReadStreamEvent.READY, listener: () -> Unit): Unit /* this */
    fun addListener(event: ReadStreamEvent.RESUME, listener: () -> Unit): Unit /* this */
    fun addListener(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */

    fun addListener(event: js.core.Symbol, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */
    fun on(event: ReadStreamEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun on(event: ReadStreamEvent.DATA, listener: (chunk: Any /* Buffer | string */) -> Unit): Unit /* this */
    fun on(event: ReadStreamEvent.END, listener: () -> Unit): Unit /* this */
    fun on(event: ReadStreamEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun on(event: ReadStreamEvent.OPEN, listener: (fd: Double) -> Unit): Unit /* this */
    fun on(event: ReadStreamEvent.PAUSE, listener: () -> Unit): Unit /* this */
    fun on(event: ReadStreamEvent.READABLE, listener: () -> Unit): Unit /* this */
    fun on(event: ReadStreamEvent.READY, listener: () -> Unit): Unit /* this */
    fun on(event: ReadStreamEvent.RESUME, listener: () -> Unit): Unit /* this */
    fun on(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */

    fun on(event: js.core.Symbol, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */
    fun once(event: ReadStreamEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun once(event: ReadStreamEvent.DATA, listener: (chunk: Any /* Buffer | string */) -> Unit): Unit /* this */
    fun once(event: ReadStreamEvent.END, listener: () -> Unit): Unit /* this */
    fun once(event: ReadStreamEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun once(event: ReadStreamEvent.OPEN, listener: (fd: Double) -> Unit): Unit /* this */
    fun once(event: ReadStreamEvent.PAUSE, listener: () -> Unit): Unit /* this */
    fun once(event: ReadStreamEvent.READABLE, listener: () -> Unit): Unit /* this */
    fun once(event: ReadStreamEvent.READY, listener: () -> Unit): Unit /* this */
    fun once(event: ReadStreamEvent.RESUME, listener: () -> Unit): Unit /* this */
    fun once(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */

    fun once(event: js.core.Symbol, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */
    fun prependListener(event: ReadStreamEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun prependListener(
        event: ReadStreamEvent.DATA,
        listener: (chunk: Any /* Buffer | string */) -> Unit,
    ): Unit /* this */

    fun prependListener(event: ReadStreamEvent.END, listener: () -> Unit): Unit /* this */
    fun prependListener(event: ReadStreamEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun prependListener(event: ReadStreamEvent.OPEN, listener: (fd: Double) -> Unit): Unit /* this */
    fun prependListener(event: ReadStreamEvent.PAUSE, listener: () -> Unit): Unit /* this */
    fun prependListener(event: ReadStreamEvent.READABLE, listener: () -> Unit): Unit /* this */
    fun prependListener(event: ReadStreamEvent.READY, listener: () -> Unit): Unit /* this */
    fun prependListener(event: ReadStreamEvent.RESUME, listener: () -> Unit): Unit /* this */
    fun prependListener(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */

    fun prependListener(event: js.core.Symbol, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */
    fun prependOnceListener(event: ReadStreamEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(
        event: ReadStreamEvent.DATA,
        listener: (chunk: Any /* Buffer | string */) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(event: ReadStreamEvent.END, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(
        event: ReadStreamEvent.ERROR,
        listener: (err: Throwable /* JsError */) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(event: ReadStreamEvent.OPEN, listener: (fd: Double) -> Unit): Unit /* this */
    fun prependOnceListener(event: ReadStreamEvent.PAUSE, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: ReadStreamEvent.READABLE, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: ReadStreamEvent.READY, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: ReadStreamEvent.RESUME, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */

    fun prependOnceListener(
        event: js.core.Symbol,
        listener: Function<Any?>, /* (...args: any[]) => void */
    ): Unit /* this */
}
