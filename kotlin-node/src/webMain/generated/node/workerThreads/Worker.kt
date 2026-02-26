// Automatically generated - do not modify!

@file:JsModule("node:worker_threads")

package node.workerThreads

import node.events.EventEmitter
import node.stream.Readable
import node.stream.Writable
import node.v8.CPUProfileHandle
import node.v8.HeapInfo
import node.v8.HeapProfileHandle
import web.url.URL

/**
 * The `Worker` class represents an independent JavaScript execution thread.
 * Most Node.js APIs are available inside of it.
 *
 * Notable differences inside a Worker environment are:
 *
 * * The `process.stdin`, `process.stdout`, and `process.stderr` streams may be redirected by the parent thread.
 * * The `import { isMainThread } from 'node:worker_threads'` variable is set to `false`.
 * * The `import { parentPort } from 'node:worker_threads'` message port is available.
 * * `process.exit()` does not stop the whole program, just the single thread,
 * and `process.abort()` is not available.
 * * `process.chdir()` and `process` methods that set group or user ids
 * are not available.
 * * `process.env` is a copy of the parent thread's environment variables,
 * unless otherwise specified. Changes to one copy are not visible in other
 * threads, and are not visible to native add-ons (unless `worker.SHARE_ENV` is passed as the `env` option to the `Worker` constructor). On Windows, unlike the main thread, a copy of the
 * environment variables operates in a case-sensitive manner.
 * * `process.title` cannot be modified.
 * * Signals are not delivered through `process.on('...')`.
 * * Execution may stop at any point as a result of `worker.terminate()` being invoked.
 * * IPC channels from parent processes are not accessible.
 * * The `trace_events` module is not supported.
 * * Native add-ons can only be loaded from multiple threads if they fulfill `certain conditions`.
 *
 * Creating `Worker` instances inside of other `Worker`s is possible.
 *
 * Like [Web Workers](https://developer.mozilla.org/en-US/docs/Web/API/Web_Workers_API) and the `node:cluster module`, two-way communication
 * can be achieved through inter-thread message passing. Internally, a `Worker` has
 * a built-in pair of `MessagePort` s that are already associated with each
 * other when the `Worker` is created. While the `MessagePort` object on the parent
 * side is not directly exposed, its functionalities are exposed through `worker.postMessage()` and the `worker.on('message')` event
 * on the `Worker` object for the parent thread.
 *
 * To create custom messaging channels (which is encouraged over using the default
 * global channel because it facilitates separation of concerns), users can create
 * a `MessageChannel` object on either thread and pass one of the`MessagePort`s on that `MessageChannel` to the other thread through a
 * pre-existing channel, such as the global one.
 *
 * See `port.postMessage()` for more information on how messages are passed,
 * and what kind of JavaScript values can be successfully transported through
 * the thread barrier.
 *
 * ```js
 * import assert from 'node:assert';
 * import {
 *   Worker, MessageChannel, MessagePort, isMainThread, parentPort,
 * } from 'node:worker_threads';
 * if (isMainThread) {
 *   const worker = new Worker(__filename);
 *   const subChannel = new MessageChannel();
 *   worker.postMessage({ hereIsYourPort: subChannel.port1 }, [subChannel.port1]);
 *   subChannel.port2.on('message', (value) => {
 *     console.log('received:', value);
 *   });
 * } else {
 *   parentPort.once('message', (value) => {
 *     assert(value.hereIsYourPort instanceof MessagePort);
 *     value.hereIsYourPort.postMessage('the worker is sending this');
 *     value.hereIsYourPort.close();
 *   });
 * }
 * ```
 * @since v10.5.0
 */
external class Worker : EventEmitter {
    /**
     * @param filename  The path to the Worker’s main script or module.
     *                  Must be either an absolute path or a relative path (i.e. relative to the current working directory) starting with ./ or ../,
     *                  or a WHATWG URL object using file: protocol. If options.eval is true, this is a string containing JavaScript code rather than a path.
     */
    constructor (filename: String, options: WorkerOptions = definedExternally)

    /**
     * @param filename  The path to the Worker’s main script or module.
     *                  Must be either an absolute path or a relative path (i.e. relative to the current working directory) starting with ./ or ../,
     *                  or a WHATWG URL object using file: protocol. If options.eval is true, this is a string containing JavaScript code rather than a path.
     */
    constructor (filename: URL, options: WorkerOptions = definedExternally)

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
     * it is available as `import { threadId } from 'node:worker_threads'`.
     * This value is unique for each `Worker` instance inside a single process.
     * @since v10.5.0
     */
    val threadId: Double

    /**
     * A string identifier for the referenced thread or null if the thread is not running.
     * Inside the worker thread, it is available as `require('node:worker_threads').threadName`.
     * @since v24.6.0
     */
    val threadName: String?

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
     * Send a message to the worker that is received via `require('node:worker_threads').parentPort.on('message')`.
     * See `port.postMessage()` for more details.
     * @since v10.5.0
     */
    fun postMessage(
        value: Any?,
        transferList: js.array.ReadonlyArray<Transferable> = definedExternally,
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
     * active handle in the event system. If the worker is already `unref()`ed calling `unref()` again has no effect.
     * @since v10.5.0
     */
    fun unref()

    /**
     * Stop all JavaScript execution in the worker thread as soon as possible.
     * Returns a Promise for the exit code that is fulfilled when the `'exit' event` is emitted.
     * @since v10.5.0
     */
    @JsName("terminate")
    fun terminateAsync(): js.promise.Promise<Double>

    @seskar.js.JsAsync
    suspend fun terminate(): Double

    /**
     * This method returns a `Promise` that will resolve to an object identical to `process.threadCpuUsage()`,
     * or reject with an `ERR_WORKER_NOT_RUNNING` error if the worker is no longer running.
     * This methods allows the statistics to be observed from outside the actual thread.
     * @since v24.6.0
     */
    @JsName("cpuUsage")
    fun cpuUsageAsync(prev: node.process.CpuUsage = definedExternally): js.promise.Promise<node.process.CpuUsage>

    @seskar.js.JsAsync
    suspend fun cpuUsage(prev: node.process.CpuUsage = definedExternally): node.process.CpuUsage

    /**
     * Returns a readable stream for a V8 snapshot of the current state of the Worker.
     * See `v8.getHeapSnapshot()` for more details.
     *
     * If the Worker thread is no longer running, which may occur before the `'exit' event` is emitted, the returned `Promise` is rejected
     * immediately with an `ERR_WORKER_NOT_RUNNING` error.
     * @since v13.9.0, v12.17.0
     * @return A promise for a Readable Stream containing a V8 heap snapshot
     */
    @JsName("getHeapSnapshot")
    fun getHeapSnapshotAsync(): js.promise.Promise<Readable>

    @seskar.js.JsAsync
    suspend fun getHeapSnapshot(): Readable

    /**
     * This method returns a `Promise` that will resolve to an object identical to `v8.getHeapStatistics()`,
     * or reject with an `ERR_WORKER_NOT_RUNNING` error if the worker is no longer running.
     * This methods allows the statistics to be observed from outside the actual thread.
     * @since v24.0.0
     */
    @JsName("getHeapStatistics")
    fun getHeapStatisticsAsync(): js.promise.Promise<HeapInfo>

    @seskar.js.JsAsync
    suspend fun getHeapStatistics(): HeapInfo

    /**
     * Starting a CPU profile then return a Promise that fulfills with an error
     * or an `CPUProfileHandle` object. This API supports `await using` syntax.
     *
     * ```js
     * const { Worker } = require('node:worker_threads');
     *
     * const worker = new Worker(`
     *   const { parentPort } = require('worker_threads');
     *   parentPort.on('message', () => {});
     *   `, { eval: true });
     *
     * worker.on('online', async () => {
     *   const handle = await worker.startCpuProfile();
     *   const profile = await handle.stop();
     *   console.log(profile);
     *   worker.terminate();
     * });
     * ```
     *
     * `await using` example.
     *
     * ```js
     * const { Worker } = require('node:worker_threads');
     *
     * const w = new Worker(`
     *   const { parentPort } = require('node:worker_threads');
     *   parentPort.on('message', () => {});
     *   `, { eval: true });
     *
     * w.on('online', async () => {
     *   // Stop profile automatically when return and profile will be discarded
     *   await using handle = await w.startCpuProfile();
     * });
     * ```
     * @since v24.8.0
     */
    @JsName("startCpuProfile")
    fun startCpuProfileAsync(): js.promise.Promise<CPUProfileHandle>

    @seskar.js.JsAsync
    suspend fun startCpuProfile(): CPUProfileHandle

    /**
     * Starting a Heap profile then return a Promise that fulfills with an error
     * or an `HeapProfileHandle` object. This API supports `await using` syntax.
     *
     * ```js
     * const { Worker } = require('node:worker_threads');
     *
     * const worker = new Worker(`
     *   const { parentPort } = require('worker_threads');
     *   parentPort.on('message', () => {});
     *   `, { eval: true });
     *
     * worker.on('online', async () => {
     *   const handle = await worker.startHeapProfile();
     *   const profile = await handle.stop();
     *   console.log(profile);
     *   worker.terminate();
     * });
     * ```
     *
     * `await using` example.
     *
     * ```js
     * const { Worker } = require('node:worker_threads');
     *
     * const w = new Worker(`
     *   const { parentPort } = require('node:worker_threads');
     *   parentPort.on('message', () => {});
     *   `, { eval: true });
     *
     * w.on('online', async () => {
     *   // Stop profile automatically when return and profile will be discarded
     *   await using handle = await w.startHeapProfile();
     * });
     * ```
     */
    @JsName("startHeapProfile")
    fun startHeapProfileAsync(): js.promise.Promise<HeapProfileHandle>

    @seskar.js.JsAsync
    suspend fun startHeapProfile(): HeapProfileHandle

    fun addListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */) // this

    fun addListener(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */) // this

    fun emit(
        event: String,
        vararg args: Any?,
    ): Boolean

    fun emit(
        event: js.symbol.Symbol,
        vararg args: Any?,
    ): Boolean

    fun on(event: String, listener: Function<Unit> /* (...args: any[]) => void */) // this

    fun on(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */) // this

    fun once(event: String, listener: Function<Unit> /* (...args: any[]) => void */) // this

    fun once(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */) // this

    fun prependListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */) // this

    fun prependListener(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */) // this

    fun prependOnceListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */) // this

    fun prependOnceListener(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */) // this

    fun removeListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */) // this

    fun removeListener(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */) // this

    fun off(event: String, listener: Function<Unit> /* (...args: any[]) => void */) // this

    fun off(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */) // this

    @web.events.JsEvent("error")
    val errorEvent: node.events.EventInstance<js.array.Tuple1<js.errors.JsError>>

    @web.events.JsEvent("exit")
    val exitEvent: node.events.EventInstance<js.array.Tuple1<Double>>

    @web.events.JsEvent("message")
    val messageEvent: node.events.EventInstance<js.array.Tuple1<Any?>>

    @web.events.JsEvent("messageerror")
    val messageerrorEvent: node.events.EventInstance<js.array.Tuple1<js.errors.JsError>>

    @web.events.JsEvent("online")
    val onlineEvent: node.events.EventInstance<js.array.Tuple>
}
