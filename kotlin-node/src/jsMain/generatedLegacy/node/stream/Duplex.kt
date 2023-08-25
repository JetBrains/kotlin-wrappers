// Automatically generated - do not modify!

@file:JsModule("node:stream")

package node.stream

import node.events.Event
import node.events.EventType

open external class Duplex : Readable /* , Writable */ {
    open val writable: Boolean
    open val writableEnded: Boolean
    open val writableFinished: Boolean
    open val writableHighWaterMark: Number
    open val writableLength: Number
    open val writableObjectMode: Boolean
    open val writableCorked: Number
    open val writableNeedDrain: Boolean
    override val closed: Boolean
    override val errored: Error?

    /**
     * If `false` then the stream will automatically end the writable side when the
     * readable side ends. Set initially by the `allowHalfOpen` constructor option,
     * which defaults to `false`.
     *
     * This can be changed manually to change the half-open behavior of an existing`Duplex` stream instance, but must be changed before the `'end'` event is
     * emitted.
     * @since v0.9.4
     */
    open var allowHalfOpen: Boolean

    constructor(opts: DuplexOptions = definedExternally)

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

    override fun _destroy(
        error: Error?,
        callback: (error: Error?) -> Unit,
    )

    open fun _final(callback: (error: Error?) -> Unit)
    open fun write(
        chunk: Any,
        encoding: node.buffer.BufferEncoding = definedExternally,
        callback: (error: Error?) -> Unit = definedExternally,
    ): Boolean

    open fun write(
        chunk: Any,
        callback: (error: Error?) -> Unit = definedExternally,
    ): Boolean

    open fun setDefaultEncoding(encoding: node.buffer.BufferEncoding) /* : this */
    open fun end(callback: () -> Unit = definedExternally) /* : this */
    open fun end(
        chunk: Any,
        callback: () -> Unit = definedExternally,
    ) /* : this */

    open fun end(
        chunk: Any,
        encoding: node.buffer.BufferEncoding = definedExternally,
        callback: () -> Unit = definedExternally,
    ) /* : this */

    open fun cork()
    open fun uncork()

    /**
     * Event emitter
     * The defined events on documents including:
     * 1.  close
     * 2.  data
     * 3.  drain
     * 4.  end
     * 5.  error
     * 6.  finish
     * 7.  pause
     * 8.  pipe
     * 9.  readable
     * 10. resume
     * 11. unpipe
     */
    override fun addListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    override fun addListener(
        event: Event.DATA,
        listener: (chunk: Any) -> Unit,
    ) /* : this */

    open fun addListener(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    override fun addListener(
        event: Event.END,
        listener: () -> Unit,
    ) /* : this */

    override fun addListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    open fun addListener(
        event: Event.FINISH,
        listener: () -> Unit,
    ) /* : this */

    override fun addListener(
        event: Event.PAUSE,
        listener: () -> Unit,
    ) /* : this */

    open fun addListener(
        event: Event.PIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun addListener(
        event: Event.READABLE,
        listener: () -> Unit,
    ) /* : this */

    override fun addListener(
        event: Event.RESUME,
        listener: () -> Unit,
    ) /* : this */

    open fun addListener(
        event: Event.UNPIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun addListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    override fun emit(event: Event.CLOSE): Boolean
    override fun emit(
        event: Event.DATA,
        chunk: Any,
    ): Boolean

    open fun emit(event: Event.DRAIN): Boolean
    override fun emit(event: Event.END): Boolean
    override fun emit(
        event: Event.ERROR,
        err: Error,
    ): Boolean

    open fun emit(event: Event.FINISH): Boolean
    override fun emit(event: Event.PAUSE): Boolean
    open fun emit(
        event: Event.PIPE,
        src: Readable,
    ): Boolean

    override fun emit(event: Event.READABLE): Boolean
    override fun emit(event: Event.RESUME): Boolean
    open fun emit(
        event: Event.UNPIPE,
        src: Readable,
    ): Boolean

    override fun emit(
        event: EventType,
        vararg args: Any,
    ): Boolean

    override fun on(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    override fun on(
        event: Event.DATA,
        listener: (chunk: Any) -> Unit,
    ) /* : this */

    open fun on(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    override fun on(
        event: Event.END,
        listener: () -> Unit,
    ) /* : this */

    override fun on(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    open fun on(
        event: Event.FINISH,
        listener: () -> Unit,
    ) /* : this */

    override fun on(
        event: Event.PAUSE,
        listener: () -> Unit,
    ) /* : this */

    open fun on(
        event: Event.PIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun on(
        event: Event.READABLE,
        listener: () -> Unit,
    ) /* : this */

    override fun on(
        event: Event.RESUME,
        listener: () -> Unit,
    ) /* : this */

    open fun on(
        event: Event.UNPIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun on(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    override fun once(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    override fun once(
        event: Event.DATA,
        listener: (chunk: Any) -> Unit,
    ) /* : this */

    open fun once(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    override fun once(
        event: Event.END,
        listener: () -> Unit,
    ) /* : this */

    override fun once(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    open fun once(
        event: Event.FINISH,
        listener: () -> Unit,
    ) /* : this */

    override fun once(
        event: Event.PAUSE,
        listener: () -> Unit,
    ) /* : this */

    open fun once(
        event: Event.PIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun once(
        event: Event.READABLE,
        listener: () -> Unit,
    ) /* : this */

    override fun once(
        event: Event.RESUME,
        listener: () -> Unit,
    ) /* : this */

    open fun once(
        event: Event.UNPIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun once(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    override fun prependListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    override fun prependListener(
        event: Event.DATA,
        listener: (chunk: Any) -> Unit,
    ) /* : this */

    open fun prependListener(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    override fun prependListener(
        event: Event.END,
        listener: () -> Unit,
    ) /* : this */

    override fun prependListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    open fun prependListener(
        event: Event.FINISH,
        listener: () -> Unit,
    ) /* : this */

    override fun prependListener(
        event: Event.PAUSE,
        listener: () -> Unit,
    ) /* : this */

    open fun prependListener(
        event: Event.PIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun prependListener(
        event: Event.READABLE,
        listener: () -> Unit,
    ) /* : this */

    override fun prependListener(
        event: Event.RESUME,
        listener: () -> Unit,
    ) /* : this */

    open fun prependListener(
        event: Event.UNPIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun prependListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    override fun prependOnceListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: Event.DATA,
        listener: (chunk: Any) -> Unit,
    ) /* : this */

    open fun prependOnceListener(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: Event.END,
        listener: () -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    open fun prependOnceListener(
        event: Event.FINISH,
        listener: () -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: Event.PAUSE,
        listener: () -> Unit,
    ) /* : this */

    open fun prependOnceListener(
        event: Event.PIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: Event.READABLE,
        listener: () -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: Event.RESUME,
        listener: () -> Unit,
    ) /* : this */

    open fun prependOnceListener(
        event: Event.UNPIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    override fun removeListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    override fun removeListener(
        event: Event.DATA,
        listener: (chunk: Any) -> Unit,
    ) /* : this */

    open fun removeListener(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    override fun removeListener(
        event: Event.END,
        listener: () -> Unit,
    ) /* : this */

    override fun removeListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    open fun removeListener(
        event: Event.FINISH,
        listener: () -> Unit,
    ) /* : this */

    override fun removeListener(
        event: Event.PAUSE,
        listener: () -> Unit,
    ) /* : this */

    open fun removeListener(
        event: Event.PIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun removeListener(
        event: Event.READABLE,
        listener: () -> Unit,
    ) /* : this */

    override fun removeListener(
        event: Event.RESUME,
        listener: () -> Unit,
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
         * A utility method for creating duplex streams.
         *
         * - `Stream` converts writable stream into writable `Duplex` and readable stream
         *   to `Duplex`.
         * - `Blob` converts into readable `Duplex`.
         * - `string` converts into readable `Duplex`.
         * - `ArrayBuffer` converts into readable `Duplex`.
         * - `AsyncIterable` converts into a readable `Duplex`. Cannot yield `null`.
         * - `AsyncGeneratorFunction` converts into a readable/writable transform
         *   `Duplex`. Must take a source `AsyncIterable` as first parameter. Cannot yield
         *   `null`.
         * - `AsyncFunction` converts into a writable `Duplex`. Must return
         *   either `null` or `undefined`
         * - `Object ({ writable, readable })` converts `readable` and
         *   `writable` into `Stream` and then combines them into `Duplex` where the
         *   `Duplex` will write to the `writable` and read from the `readable`.
         * - `Promise` converts into readable `Duplex`. Value `null` is ignored.
         *
         * @since v16.8.0
         */
        fun from(src: Any /* Stream | NodeBlob | ArrayBuffer | string | Iterable<any> | AsyncIterable<any> | AsyncGeneratorFunction | Promise<any> | Object */): Duplex
    }
}
