// Automatically generated - do not modify!

@file:JsModule("node:worker_threads")

package node.workerThreads

import js.core.ReadonlyArray
import js.promise.Promise
import node.events.Event
import node.events.EventType
import node.stream.Readable
import node.stream.Writable

external class Worker : node.events.EventEmitter {
    /**
     * If `stdin: true` was passed to the `Worker` constructor, this is a
     * writable stream. The data written to this stream will be made available in
     * the worker thread as `process.stdin`.
     * @since v10.5.0
     */
    val stdin: Writable?

    /**
     * This is a readable stream which contains data written to `process.stdout` inside the worker thread. If `stdout: true` was not passed to the `Worker` constructor, then data is piped to the
     * parent thread's `process.stdout` stream.
     * @since v10.5.0
     */
    val stdout: Readable

    /**
     * This is a readable stream which contains data written to `process.stderr` inside the worker thread. If `stderr: true` was not passed to the `Worker` constructor, then data is piped to the
     * parent thread's `process.stderr` stream.
     * @since v10.5.0
     */
    val stderr: Readable

    /**
     * An integer identifier for the referenced thread. Inside the worker thread,
     * it is available as `require('worker_threads').threadId`.
     * This value is unique for each `Worker` instance inside a single process.
     * @since v10.5.0
     */
    val threadId: Number

    /**
     * Provides the set of JS engine resource constraints for this Worker thread.
     * If the `resourceLimits` option was passed to the `Worker` constructor,
     * this matches its values.
     *
     * If the worker has stopped, the return value is an empty object.
     * @since v13.2.0, v12.16.0
     */
    val resourceLimits: ResourceLimits?

    /**
     * An object that can be used to query performance information from a worker
     * instance. Similar to `perf_hooks.performance`.
     * @since v15.1.0, v14.17.0, v12.22.0
     */
    val performance: WorkerPerformance

    /**
     * @param filename  The path to the Worker’s main script or module.
     *                  Must be either an absolute path or a relative path (i.e. relative to the current working directory) starting with ./ or ../,
     *                  or a WHATWG URL object using file: protocol. If options.eval is true, this is a string containing JavaScript code rather than a path.
     */
    constructor(
        filename: Any, /* string | URL */
        options: WorkerOptions = definedExternally,
    )

    /**
     * Send a message to the worker that is received via `require('worker_threads').parentPort.on('message')`.
     * See `port.postMessage()` for more details.
     * @since v10.5.0
     */
    fun postMessage(
        value: Any,
        transferList: ReadonlyArray<TransferListItem> = definedExternally,
    )

    /**
     * Opposite of `unref()`, calling `ref()` on a previously `unref()`ed worker does _not_ let the program exit if it's the only active handle left (the default
     * behavior). If the worker is `ref()`ed, calling `ref()` again has
     * no effect.
     * @since v10.5.0
     */
    fun ref()

    /**
     * Calling `unref()` on a worker allows the thread to exit if this is the only
     * active handle in the event system. If the worker is already `unref()`ed calling`unref()` again has no effect.
     * @since v10.5.0
     */
    fun unref()

    /**
     * Stop all JavaScript execution in the worker thread as soon as possible.
     * Returns a Promise for the exit code that is fulfilled when the `'exit' event` is emitted.
     * @since v10.5.0
     */
    fun terminate(): Promise<Number>

    /**
     * Returns a readable stream for a V8 snapshot of the current state of the Worker.
     * See `v8.getHeapSnapshot()` for more details.
     *
     * If the Worker thread is no longer running, which may occur before the `'exit' event` is emitted, the returned `Promise` is rejected
     * immediately with an `ERR_WORKER_NOT_RUNNING` error.
     * @since v13.9.0, v12.17.0
     * @return A promise for a Readable Stream containing a V8 heap snapshot
     */
    fun getHeapSnapshot(): Promise<Readable>
    fun addListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    fun addListener(
        event: Event.EXIT,
        listener: (exitCode: Number) -> Unit,
    ) /* : this */

    fun addListener(
        event: Event.MESSAGE,
        listener: (value: Any) -> Unit,
    ) /* : this */

    fun addListener(
        event: Event.MESSAGE_ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    fun addListener(
        event: Event.ONLINE,
        listener: () -> Unit,
    ) /* : this */

    override fun addListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    fun emit(
        event: Event.ERROR,
        err: Error,
    ): Boolean

    fun emit(
        event: Event.EXIT,
        exitCode: Number,
    ): Boolean

    fun emit(
        event: Event.MESSAGE,
        value: Any,
    ): Boolean

    fun emit(
        event: Event.MESSAGE_ERROR,
        error: Error,
    ): Boolean

    fun emit(event: Event.ONLINE): Boolean
    override fun emit(
        event: EventType,
        vararg args: Any,
    ): Boolean

    fun on(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    fun on(
        event: Event.EXIT,
        listener: (exitCode: Number) -> Unit,
    ) /* : this */

    fun on(
        event: Event.MESSAGE,
        listener: (value: Any) -> Unit,
    ) /* : this */

    fun on(
        event: Event.MESSAGE_ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    fun on(
        event: Event.ONLINE,
        listener: () -> Unit,
    ) /* : this */

    override fun on(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    fun once(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    fun once(
        event: Event.EXIT,
        listener: (exitCode: Number) -> Unit,
    ) /* : this */

    fun once(
        event: Event.MESSAGE,
        listener: (value: Any) -> Unit,
    ) /* : this */

    fun once(
        event: Event.MESSAGE_ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    fun once(
        event: Event.ONLINE,
        listener: () -> Unit,
    ) /* : this */

    override fun once(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    fun prependListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    fun prependListener(
        event: Event.EXIT,
        listener: (exitCode: Number) -> Unit,
    ) /* : this */

    fun prependListener(
        event: Event.MESSAGE,
        listener: (value: Any) -> Unit,
    ) /* : this */

    fun prependListener(
        event: Event.MESSAGE_ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    fun prependListener(
        event: Event.ONLINE,
        listener: () -> Unit,
    ) /* : this */

    override fun prependListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    fun prependOnceListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    fun prependOnceListener(
        event: Event.EXIT,
        listener: (exitCode: Number) -> Unit,
    ) /* : this */

    fun prependOnceListener(
        event: Event.MESSAGE,
        listener: (value: Any) -> Unit,
    ) /* : this */

    fun prependOnceListener(
        event: Event.MESSAGE_ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    fun prependOnceListener(
        event: Event.ONLINE,
        listener: () -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    fun removeListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    fun removeListener(
        event: Event.EXIT,
        listener: (exitCode: Number) -> Unit,
    ) /* : this */

    fun removeListener(
        event: Event.MESSAGE,
        listener: (value: Any) -> Unit,
    ) /* : this */

    fun removeListener(
        event: Event.MESSAGE_ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    fun removeListener(
        event: Event.ONLINE,
        listener: () -> Unit,
    ) /* : this */

    override fun removeListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    fun off(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    fun off(
        event: Event.EXIT,
        listener: (exitCode: Number) -> Unit,
    ) /* : this */

    fun off(
        event: Event.MESSAGE,
        listener: (value: Any) -> Unit,
    ) /* : this */

    fun off(
        event: Event.MESSAGE_ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    fun off(
        event: Event.ONLINE,
        listener: () -> Unit,
    ) /* : this */

    override fun off(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */
}
