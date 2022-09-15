// Automatically generated - do not modify!

@file:JsModule("node:stream")
@file:JsNonModule

package node.stream

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
        fun from(src: Any /* Stream | Blob | ArrayBuffer | string | Iterable<any> | AsyncIterable<any> | AsyncGeneratorFunction | Promise<any> | Object */): Duplex
    }
}
