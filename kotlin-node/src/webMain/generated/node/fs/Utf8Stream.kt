// Automatically generated - do not modify!

@file:JsModule("node:fs")

package node.fs

import node.events.EventEmitter

/**
 * An optimized UTF-8 stream writer that allows for flushing all the internal
 * buffering on demand. It handles `EAGAIN` errors correctly, allowing for
 * customization, for example, by dropping content if the disk is busy.
 * @since v24.6.0
 * @experimental
 */
external class Utf8Stream : EventEmitter {
    constructor (options: Utf8StreamOptions)

    /**
     * Whether the stream is appending to the file or truncating it.
     */
    val append: Boolean

    /**
     * The type of data that can be written to the stream. Supported
     * values are `'utf8'` or `'buffer'`.
     * @default 'utf8'
     */
    val contentMode: Utf8StreamContentMode

    /**
     * Close the stream immediately, without flushing the internal buffer.
     */
    fun destroy()

    /**
     * Close the stream gracefully, flushing the internal buffer before closing.
     */
    fun end()

    /**
     * The file descriptor that is being written to.
     */
    val fd: Double

    /**
     * The file that is being written to.
     */
    val file: String

    /**
     * Writes the current buffer to the file if a write was not in progress. Do
     * nothing if `minLength` is zero or if it is already writing.
     */
    fun flush(callback: (err: js.errors.JsError?) -> Unit)

    /**
     * Flushes the buffered data synchronously. This is a costly operation.
     */
    fun flushSync()

    /**
     * Whether the stream is performing a `fs.fsyncSync()` after every
     * write operation.
     */
    val fsync: Boolean

    /**
     * The maximum length of the internal buffer. If a write
     * operation would cause the buffer to exceed `maxLength`, the data written is
     * dropped and a drop event is emitted with the dropped data.
     */
    val maxLength: Double

    /**
     * The minimum length of the internal buffer that is required to be
     * full before flushing.
     */
    val minLength: Double

    /**
     * Whether the stream should ensure that the directory for the
     * `dest` file exists. If `true`, it will create the directory if it does not
     * exist.
     * @default false
     */
    val mkdir: Boolean

    /**
     * The mode of the file that is being written to.
     */
    val mode: Any // number | string

    /**
     * The number of milliseconds between flushes. If set to `0`, no
     * periodic flushes will be performed.
     */
    val periodicFlush: Double

    /**
     * Reopen the file in place, useful for log rotation.
     * @param file A path to a file to be written to (mode
     * controlled by the append option).
     */
    fun reopen(file: PathLike)

    /**
     * Whether the stream is writing synchronously or asynchronously.
     */
    val sync: Boolean

    /**
     * When the `options.contentMode` is set to `'utf8'` when the stream is created,
     * the `data` argument must be a string. If the `contentMode` is set to `'buffer'`,
     * the `data` argument must be a `Buffer`.
     * @param data The data to write.
     */
    fun write(data: String): Boolean

    /**
     * When the `options.contentMode` is set to `'utf8'` when the stream is created,
     * the `data` argument must be a string. If the `contentMode` is set to `'buffer'`,
     * the `data` argument must be a `Buffer`.
     * @param data The data to write.
     */
    fun write(data: node.buffer.Buffer<*>): Boolean

    /**
     * Whether the stream is currently writing data to the file.
     */
    val writing: Boolean

    /**
     * events.EventEmitter
     *   1. change
     *   2. close
     *   3. error
     */

    fun addListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */) // this

    fun on(event: String, listener: Function<Unit> /* (...args: any[]) => void */) // this

    fun once(event: String, listener: Function<Unit> /* (...args: any[]) => void */) // this

    fun prependListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */) // this

    fun prependOnceListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */) // this

    @web.events.JsEvent("close")
    val closeEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("drain")
    val drainEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("drop")
    val dropEvent: node.events.EventInstance<js.array.Tuple1<Any /* string | Buffer */>>

    @web.events.JsEvent("error")
    val errorEvent: node.events.EventInstance<js.array.Tuple1<js.errors.JsError>>

    @web.events.JsEvent("finish")
    val finishEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("ready")
    val readyEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("write")
    val writeEvent: node.events.EventInstance<js.array.Tuple1<Double>>
}
