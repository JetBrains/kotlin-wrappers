package node.fs

import node.events.EventEmitter


@Suppress("INTERFACE_WITH_SUPERCLASS")

sealed external interface FSWatcher : EventEmitter {
    /**
     * Stop watching for changes on the given `fs.FSWatcher`. Once stopped, the `fs.FSWatcher` object is no longer usable.
     * @since v0.5.8
     */
    fun close(): Unit

    /**
     * events.EventEmitter
     *   1. change
     *   2. error
     */
    fun addListener(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */
    fun addListener(
        event: FSWatcherEvent.CHANGE,
        listener: (eventType: String, filename: Any /* string | Buffer */) -> Unit,
    ): Unit /* this */

    fun addListener(event: FSWatcherEvent.ERROR, listener: (error: Throwable /* JsError */) -> Unit): Unit /* this */
    fun addListener(event: FSWatcherEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun on(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */
    fun on(
        event: FSWatcherEvent.CHANGE,
        listener: (eventType: String, filename: Any /* string | Buffer */) -> Unit,
    ): Unit /* this */

    fun on(event: FSWatcherEvent.ERROR, listener: (error: Throwable /* JsError */) -> Unit): Unit /* this */
    fun on(event: FSWatcherEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun once(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */
    fun once(
        event: FSWatcherEvent.CHANGE,
        listener: (eventType: String, filename: Any /* string | Buffer */) -> Unit,
    ): Unit /* this */

    fun once(event: FSWatcherEvent.ERROR, listener: (error: Throwable /* JsError */) -> Unit): Unit /* this */
    fun once(event: FSWatcherEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun prependListener(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */
    fun prependListener(
        event: FSWatcherEvent.CHANGE,
        listener: (eventType: String, filename: Any /* string | Buffer */) -> Unit,
    ): Unit /* this */

    fun prependListener(
        event: FSWatcherEvent.ERROR,
        listener: (error: Throwable /* JsError */) -> Unit,
    ): Unit /* this */

    fun prependListener(event: FSWatcherEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */
    fun prependOnceListener(
        event: FSWatcherEvent.CHANGE,
        listener: (eventType: String, filename: Any /* string | Buffer */) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(
        event: FSWatcherEvent.ERROR,
        listener: (error: Throwable /* JsError */) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(event: FSWatcherEvent.CLOSE, listener: () -> Unit): Unit /* this */
}
