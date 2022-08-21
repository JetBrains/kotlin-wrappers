// Automatically generated - do not modify!

@file:JsModule("node:fs")
@file:JsNonModule

package node.fs

import node.ErrnoException
import node.events.Event
import node.stream.Readable

external class ReadStream : Readable {
    fun close(callback: (error: ErrnoException?) -> Unit = definedExternally)

    /**
     * The number of bytes that have been read so far.
     * @since v6.4.0
     */
    var bytesRead: Number

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
    override fun addListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ): ReadStream

    fun addListener(
        event: Event.DATA,
        listener: Any, /* (chunk: Any /* Buffer | string */) -> Unit */
    ): ReadStream

    override fun addListener(
        event: Event.END,
        listener: () -> Unit,
    ): ReadStream

    override fun addListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ): ReadStream

    fun addListener(
        event: Event.OPEN,
        listener: (fd: Number) -> Unit,
    ): ReadStream

    override fun addListener(
        event: Event.PAUSE,
        listener: () -> Unit,
    ): ReadStream

    override fun addListener(
        event: Event.READABLE,
        listener: () -> Unit,
    ): ReadStream

    fun addListener(
        event: Event.READY,
        listener: () -> Unit,
    ): ReadStream

    override fun addListener(
        event: Event.RESUME,
        listener: () -> Unit,
    ): ReadStream

    override fun addListener(
        event: String, /* | Symbol */
        listener: Function<Unit>,
    ): ReadStream

    override fun on(
        event: Event.CLOSE,
        listener: () -> Unit,
    ): ReadStream

    fun on(
        event: Event.DATA,
        listener: Any, /* (chunk: Any /* Buffer | string */) -> Unit */
    ): ReadStream

    override fun on(
        event: Event.END,
        listener: () -> Unit,
    ): ReadStream

    override fun on(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ): ReadStream

    fun on(
        event: Event.OPEN,
        listener: (fd: Number) -> Unit,
    ): ReadStream

    override fun on(
        event: Event.PAUSE,
        listener: () -> Unit,
    ): ReadStream

    override fun on(
        event: Event.READABLE,
        listener: () -> Unit,
    ): ReadStream

    fun on(
        event: Event.READY,
        listener: () -> Unit,
    ): ReadStream

    override fun on(
        event: Event.RESUME,
        listener: () -> Unit,
    ): ReadStream

    override fun on(
        event: String, /* | Symbol */
        listener: Function<Unit>,
    ): ReadStream

    override fun once(
        event: Event.CLOSE,
        listener: () -> Unit,
    ): ReadStream

    fun once(
        event: Event.DATA,
        listener: Any, /* (chunk: Any /* Buffer | string */) -> Unit */
    ): ReadStream

    override fun once(
        event: Event.END,
        listener: () -> Unit,
    ): ReadStream

    override fun once(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ): ReadStream

    fun once(
        event: Event.OPEN,
        listener: (fd: Number) -> Unit,
    ): ReadStream

    override fun once(
        event: Event.PAUSE,
        listener: () -> Unit,
    ): ReadStream

    override fun once(
        event: Event.READABLE,
        listener: () -> Unit,
    ): ReadStream

    fun once(
        event: Event.READY,
        listener: () -> Unit,
    ): ReadStream

    override fun once(
        event: Event.RESUME,
        listener: () -> Unit,
    ): ReadStream

    override fun once(
        event: String, /* | Symbol */
        listener: Function<Unit>,
    ): ReadStream

    override fun prependListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ): ReadStream

    fun prependListener(
        event: Event.DATA,
        listener: Any, /* (chunk: Any /* Buffer | string */) -> Unit */
    ): ReadStream

    override fun prependListener(
        event: Event.END,
        listener: () -> Unit,
    ): ReadStream

    override fun prependListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ): ReadStream

    fun prependListener(
        event: Event.OPEN,
        listener: (fd: Number) -> Unit,
    ): ReadStream

    override fun prependListener(
        event: Event.PAUSE,
        listener: () -> Unit,
    ): ReadStream

    override fun prependListener(
        event: Event.READABLE,
        listener: () -> Unit,
    ): ReadStream

    fun prependListener(
        event: Event.READY,
        listener: () -> Unit,
    ): ReadStream

    override fun prependListener(
        event: Event.RESUME,
        listener: () -> Unit,
    ): ReadStream

    override fun prependListener(
        event: String, /* | Symbol */
        listener: Function<Unit>,
    ): ReadStream

    override fun prependOnceListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ): ReadStream

    fun prependOnceListener(
        event: Event.DATA,
        listener: Any, /* (chunk: Any /* Buffer | string */) -> Unit */
    ): ReadStream

    override fun prependOnceListener(
        event: Event.END,
        listener: () -> Unit,
    ): ReadStream

    override fun prependOnceListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ): ReadStream

    fun prependOnceListener(
        event: Event.OPEN,
        listener: (fd: Number) -> Unit,
    ): ReadStream

    override fun prependOnceListener(
        event: Event.PAUSE,
        listener: () -> Unit,
    ): ReadStream

    override fun prependOnceListener(
        event: Event.READABLE,
        listener: () -> Unit,
    ): ReadStream

    fun prependOnceListener(
        event: Event.READY,
        listener: () -> Unit,
    ): ReadStream

    override fun prependOnceListener(
        event: Event.RESUME,
        listener: () -> Unit,
    ): ReadStream

    override fun prependOnceListener(
        event: String, /* | Symbol */
        listener: Function<Unit>,
    ): ReadStream
}
