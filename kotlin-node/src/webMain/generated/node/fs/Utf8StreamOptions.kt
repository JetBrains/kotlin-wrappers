// Automatically generated - do not modify!

package node.fs

sealed external interface Utf8StreamOptions {
    /**
     * Appends writes to dest file instead of truncating it.
     * @default true
     */
    var append: Boolean?

    /**
     * Which type of data you can send to the write
     * function, supported values are `'utf8'` or `'buffer'`.
     * @default 'utf8'
     */
    var contentMode: Utf8StreamOptionsContentMode?

    /**
     * A path to a file to be written to (mode controlled by the
     * append option).
     */
    var dest: String?

    /**
     * A file descriptor, something that is returned by `fs.open()`
     * or `fs.openSync()`.
     */
    var fd: Double?

    /**
     * An object that has the same API as the `fs` module, useful
     * for mocking, testing, or customizing the behavior of the stream.
     */
    var fs: Any?

    /**
     * Perform a `fs.fsyncSync()` every time a write is
     * completed.
     */
    var fsync: Boolean?

    /**
     * The maximum length of the internal buffer. If a write
     * operation would cause the buffer to exceed `maxLength`, the data written is
     * dropped and a drop event is emitted with the dropped data
     */
    var maxLength: Double?

    /**
     * The maximum number of bytes that can be written;
     * @default 16384
     */
    var maxWrite: Double?

    /**
     * The minimum length of the internal buffer that is
     * required to be full before flushing.
     */
    var minLength: Double?

    /**
     * Ensure directory for `dest` file exists when true.
     * @default false
     */
    var mkdir: Boolean?

    /**
     * Specify the creating file mode (see `fs.open()`).
     */
    var mode: Any? // number | string | undefined

    /**
     * Calls flush every `periodicFlush` milliseconds.
     */
    var periodicFlush: Double?

    /**
     * A function that will be called when `write()`,
     * `writeSync()`, or `flushSync()` encounters an `EAGAIN` or `EBUSY` error.
     * If the return value is `true` the operation will be retried, otherwise it
     * will bubble the error. The `err` is the error that caused this function to
     * be called, `writeBufferLen` is the length of the buffer that was written,
     * and `remainingBufferLen` is the length of the remaining buffer that the
     * stream did not try to write.
     */
    var retryEAGAIN: ((err: js.errors.JsError?, writeBufferLen: Number, remainingBufferLen: Number) -> Boolean)?

    /**
     * Perform writes synchronously.
     */
    var sync: Boolean?
}
