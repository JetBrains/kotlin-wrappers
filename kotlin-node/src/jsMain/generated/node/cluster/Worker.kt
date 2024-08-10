// Generated by Karakum - do not modify it manually!

@file:JsModule("node:cluster")

package node.cluster

import node.events.EventEmitter

/**
 * A `Worker` object contains all public information and method about a worker.
 * In the primary it can be obtained using `cluster.workers`. In a worker
 * it can be obtained using `cluster.worker`.
 * @since v0.7.0
 */
external class Worker : EventEmitter {
    /**
     * Each new worker is given its own unique id, this id is stored in the `id`.
     *
     * While a worker is alive, this is the key that indexes it in `cluster.workers`.
     * @since v0.8.0
     */
    var id: Double

    /**
     * All workers are created using [`child_process.fork()`](https://nodejs.org/docs/latest-v20.x/api/child_process.html#child_processforkmodulepath-args-options), the returned object
     * from this function is stored as `.process`. In a worker, the global `process` is stored.
     *
     * See: [Child Process module](https://nodejs.org/docs/latest-v20.x/api/child_process.html#child_processforkmodulepath-args-options).
     *
     * Workers will call `process.exit(0)` if the `'disconnect'` event occurs
     * on `process` and `.exitedAfterDisconnect` is not `true`. This protects against
     * accidental disconnection.
     * @since v0.7.0
     */
    var process: node.childProcess.ChildProcess

    /**
     * Send a message to a worker or primary, optionally with a handle.
     *
     * In the primary, this sends a message to a specific worker. It is identical to [`ChildProcess.send()`](https://nodejs.org/docs/latest-v20.x/api/child_process.html#subprocesssendmessage-sendhandle-options-callback).
     *
     * In a worker, this sends a message to the primary. It is identical to `process.send()`.
     *
     * This example will echo back all messages from the primary:
     *
     * ```js
     * if (cluster.isPrimary) {
     *   const worker = cluster.fork();
     *   worker.send('hi there');
     *
     * } else if (cluster.isWorker) {
     *   process.on('message', (msg) => {
     *     process.send(msg);
     *   });
     * }
     * ```
     * @since v0.7.0
     * @param options The `options` argument, if present, is an object used to parameterize the sending of certain types of handles.
     */
    fun send(
        message: node.childProcess.Serializable,
        callback: (error: Throwable /* JsError */?) -> Unit = definedExternally,
    ): Boolean

    fun send(
        message: node.childProcess.Serializable,
        sendHandle: node.childProcess.SendHandle,
        callback: (error: Throwable /* JsError */?) -> Unit = definedExternally,
    ): Boolean

    fun send(
        message: node.childProcess.Serializable,
        sendHandle: node.childProcess.SendHandle,
        options: node.childProcess.MessageOptions = definedExternally,
        callback: (error: Throwable /* JsError */?) -> Unit = definedExternally,
    ): Boolean

    /**
     * This function will kill the worker. In the primary worker, it does this by
     * disconnecting the `worker.process`, and once disconnected, killing with `signal`. In the worker, it does it by killing the process with `signal`.
     *
     * The `kill()` function kills the worker process without waiting for a graceful
     * disconnect, it has the same behavior as `worker.process.kill()`.
     *
     * This method is aliased as `worker.destroy()` for backwards compatibility.
     *
     * In a worker, `process.kill()` exists, but it is not this function;
     * it is [`kill()`](https://nodejs.org/docs/latest-v20.x/api/process.html#processkillpid-signal).
     * @since v0.9.12
     * @param [signal='SIGTERM'] Name of the kill signal to send to the worker process.
     */
    fun kill(signal: String = definedExternally): Unit
    fun destroy(signal: String = definedExternally): Unit

    /**
     * In a worker, this function will close all servers, wait for the `'close'` event
     * on those servers, and then disconnect the IPC channel.
     *
     * In the primary, an internal message is sent to the worker causing it to call `.disconnect()` on itself.
     *
     * Causes `.exitedAfterDisconnect` to be set.
     *
     * After a server is closed, it will no longer accept new connections,
     * but connections may be accepted by any other listening worker. Existing
     * connections will be allowed to close as usual. When no more connections exist,
     * see `server.close()`, the IPC channel to the worker will close allowing it
     * to die gracefully.
     *
     * The above applies _only_ to server connections, client connections are not
     * automatically closed by workers, and disconnect does not wait for them to close
     * before exiting.
     *
     * In a worker, `process.disconnect` exists, but it is not this function;
     * it is `disconnect()`.
     *
     * Because long living server connections may block workers from disconnecting, it
     * may be useful to send a message, so application specific actions may be taken to
     * close them. It also may be useful to implement a timeout, killing a worker if
     * the `'disconnect'` event has not been emitted after some time.
     *
     * ```js
     * if (cluster.isPrimary) {
     *   const worker = cluster.fork();
     *   let timeout;
     *
     *   worker.on('listening', (address) => {
     *     worker.send('shutdown');
     *     worker.disconnect();
     *     timeout = setTimeout(() => {
     *       worker.kill();
     *     }, 2000);
     *   });
     *
     *   worker.on('disconnect', () => {
     *     clearTimeout(timeout);
     *   });
     *
     * } else if (cluster.isWorker) {
     *   const net = require('node:net');
     *   const server = net.createServer((socket) => {
     *     // Connections never end
     *   });
     *
     *   server.listen(8000);
     *
     *   process.on('message', (msg) => {
     *     if (msg === 'shutdown') {
     *       // Initiate graceful close of any connections to server
     *     }
     *   });
     * }
     * ```
     * @since v0.7.7
     * @return A reference to `worker`.
     */
    fun disconnect(): Unit

    /**
     * This function returns `true` if the worker is connected to its primary via its
     * IPC channel, `false` otherwise. A worker is connected to its primary after it
     * has been created. It is disconnected after the `'disconnect'` event is emitted.
     * @since v0.11.14
     */
    fun isConnected(): Boolean

    /**
     * This function returns `true` if the worker's process has terminated (either
     * because of exiting or being signaled). Otherwise, it returns `false`.
     *
     * ```js
     * import cluster from 'node:cluster';
     * import http from 'node:http';
     * import { availableParallelism } from 'node:os';
     * import process from 'node:process';
     *
     * const numCPUs = availableParallelism();
     *
     * if (cluster.isPrimary) {
     *   console.log(`Primary ${process.pid} is running`);
     *
     *   // Fork workers.
     *   for (let i = 0; i < numCPUs; i++) {
     *     cluster.fork();
     *   }
     *
     *   cluster.on('fork', (worker) => {
     *     console.log('worker is dead:', worker.isDead());
     *   });
     *
     *   cluster.on('exit', (worker, code, signal) => {
     *     console.log('worker is dead:', worker.isDead());
     *   });
     * } else {
     *   // Workers can share any TCP connection. In this case, it is an HTTP server.
     *   http.createServer((req, res) => {
     *     res.writeHead(200);
     *     res.end(`Current process\n ${process.pid}`);
     *     process.kill(process.pid);
     *   }).listen(8000);
     * }
     * ```
     * @since v0.11.14
     */
    fun isDead(): Boolean

    /**
     * This property is `true` if the worker exited due to `.disconnect()`.
     * If the worker exited any other way, it is `false`. If the
     * worker has not exited, it is `undefined`.
     *
     * The boolean `worker.exitedAfterDisconnect` allows distinguishing between
     * voluntary and accidental exit, the primary may choose not to respawn a worker
     * based on this value.
     *
     * ```js
     * cluster.on('exit', (worker, code, signal) => {
     *   if (worker.exitedAfterDisconnect === true) {
     *     console.log('Oh, it was just voluntary – no need to worry');
     *   }
     * });
     *
     * // kill worker
     * worker.kill();
     * ```
     * @since v6.0.0
     */
    var exitedAfterDisconnect: Boolean

    /**
     * events.EventEmitter
     *   1. disconnect
     *   2. error
     *   3. exit
     *   4. listening
     *   5. message
     *   6. online
     */
    fun addListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun addListener(event: WorkerEvent.DISCONNECT, listener: () -> Unit): Unit /* this */
    fun addListener(event: WorkerEvent.ERROR, listener: (error: Throwable /* JsError */) -> Unit): Unit /* this */
    fun addListener(event: WorkerEvent.EXIT, listener: (code: Double, signal: String) -> Unit): Unit /* this */
    fun addListener(event: WorkerEvent.LISTENING, listener: (address: Address) -> Unit): Unit /* this */
    fun addListener(
        event: WorkerEvent.MESSAGE,
        listener: (message: Any?, handle: Any /* net.Socket | net.Server */) -> Unit,
    ): Unit /* this */// the handle is a net.Socket or net.Server object, or undefined.

    fun addListener(event: WorkerEvent.ONLINE, listener: () -> Unit): Unit /* this */
    fun emit(event: String, vararg args: Any?): Boolean

    fun emit(event: js.symbol.Symbol, vararg args: Any?): Boolean
    fun emit(event: WorkerEvent.DISCONNECT): Boolean
    fun emit(event: WorkerEvent.ERROR, error: Throwable /* JsError */): Boolean
    fun emit(event: WorkerEvent.EXIT, code: Number, signal: String): Boolean
    fun emit(event: WorkerEvent.LISTENING, address: Address): Boolean
    fun emit(event: WorkerEvent.MESSAGE, message: Any?, handle: node.net.Socket): Boolean

    fun emit(event: WorkerEvent.MESSAGE, message: Any?, handle: node.net.Server): Boolean
    fun emit(event: WorkerEvent.ONLINE): Boolean
    fun on(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun on(event: WorkerEvent.DISCONNECT, listener: () -> Unit): Unit /* this */
    fun on(event: WorkerEvent.ERROR, listener: (error: Throwable /* JsError */) -> Unit): Unit /* this */
    fun on(event: WorkerEvent.EXIT, listener: (code: Double, signal: String) -> Unit): Unit /* this */
    fun on(event: WorkerEvent.LISTENING, listener: (address: Address) -> Unit): Unit /* this */
    fun on(
        event: WorkerEvent.MESSAGE,
        listener: (message: Any?, handle: Any /* net.Socket | net.Server */) -> Unit,
    ): Unit /* this */// the handle is a net.Socket or net.Server object, or undefined.

    fun on(event: WorkerEvent.ONLINE, listener: () -> Unit): Unit /* this */
    fun once(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun once(event: WorkerEvent.DISCONNECT, listener: () -> Unit): Unit /* this */
    fun once(event: WorkerEvent.ERROR, listener: (error: Throwable /* JsError */) -> Unit): Unit /* this */
    fun once(event: WorkerEvent.EXIT, listener: (code: Double, signal: String) -> Unit): Unit /* this */
    fun once(event: WorkerEvent.LISTENING, listener: (address: Address) -> Unit): Unit /* this */
    fun once(
        event: WorkerEvent.MESSAGE,
        listener: (message: Any?, handle: Any /* net.Socket | net.Server */) -> Unit,
    ): Unit /* this */// the handle is a net.Socket or net.Server object, or undefined.

    fun once(event: WorkerEvent.ONLINE, listener: () -> Unit): Unit /* this */
    fun prependListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun prependListener(event: WorkerEvent.DISCONNECT, listener: () -> Unit): Unit /* this */
    fun prependListener(event: WorkerEvent.ERROR, listener: (error: Throwable /* JsError */) -> Unit): Unit /* this */
    fun prependListener(event: WorkerEvent.EXIT, listener: (code: Double, signal: String) -> Unit): Unit /* this */
    fun prependListener(event: WorkerEvent.LISTENING, listener: (address: Address) -> Unit): Unit /* this */
    fun prependListener(
        event: WorkerEvent.MESSAGE,
        listener: (message: Any?, handle: Any /* net.Socket | net.Server */) -> Unit,
    ): Unit /* this */// the handle is a net.Socket or net.Server object, or undefined.

    fun prependListener(event: WorkerEvent.ONLINE, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun prependOnceListener(event: WorkerEvent.DISCONNECT, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(
        event: WorkerEvent.ERROR,
        listener: (error: Throwable /* JsError */) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(event: WorkerEvent.EXIT, listener: (code: Double, signal: String) -> Unit): Unit /* this */
    fun prependOnceListener(event: WorkerEvent.LISTENING, listener: (address: Address) -> Unit): Unit /* this */
    fun prependOnceListener(
        event: WorkerEvent.MESSAGE,
        listener: (message: Any?, handle: Any /* net.Socket | net.Server */) -> Unit,
    ): Unit /* this */// the handle is a net.Socket or net.Server object, or undefined.

    fun prependOnceListener(event: WorkerEvent.ONLINE, listener: () -> Unit): Unit /* this */
}
