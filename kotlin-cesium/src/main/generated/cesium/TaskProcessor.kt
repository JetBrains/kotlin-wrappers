// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * A wrapper around a web worker that allows scheduling tasks for a given worker,
 * returning results asynchronously via a promise.
 *
 * The Worker is not constructed until a task is scheduled.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TaskProcessor.html">Online Documentation</a>
 *
 * @constructor
 * @param [workerPath] The Url to the worker. This can either be an absolute path or relative to the Cesium Workers folder.
 * @param [maximumActiveTasks] The maximum number of active tasks.  Once exceeded,
 *   scheduleTask will not queue any more tasks, allowing
 *   work to be rescheduled in future frames.
 *   Default value - [Number.POSITIVE_INFINITY]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TaskProcessor.html">Online Documentation</a>
 */
external class TaskProcessor(
    workerPath: String,
    maximumActiveTasks: Double? = definedExternally,
) {
    /**
     * Schedule a task to be processed by the web worker asynchronously.  If there are currently more
     * tasks active than the maximum set by the constructor, will immediately return undefined.
     * Otherwise, returns a promise that will resolve to the result posted back by the worker when
     * finished.
     * ```
     * const taskProcessor = new TaskProcessor('myWorkerPath');
     * const promise = taskProcessor.scheduleTask({
     *     someParameter : true,
     *     another : 'hello'
     * });
     * if (!Cesium.defined(promise)) {
     *     // too many active tasks - try again later
     * } else {
     *     promise.then(function(result) {
     *         // use the result of the task
     *     });
     * }
     * ```
     * @param [parameters] Any input data that will be posted to the worker.
     * @param [transferableObjects] An array of objects contained in parameters that should be
     *   transferred to the worker instead of copied.
     * @return Either a promise that will resolve to the result when available, or undefined
     *   if there are too many active tasks,
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TaskProcessor.html#scheduleTask">Online Documentation</a>
     */
    fun scheduleTask(
        parameters: Any,
        transferableObjects: Array<out Any>? = definedExternally,
    ): kotlin.js.Promise<Any>?

    /**
     * Posts a message to a web worker with configuration to initialize loading
     * and compiling a web assembly module asychronously, as well as an optional
     * fallback JavaScript module to use if Web Assembly is not supported.
     * @return A promise that resolves to the result when the web worker has loaded and compiled the web assembly module and is ready to process tasks.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TaskProcessor.html#initWebAssemblyModule">Online Documentation</a>
     */
    fun initWebAssemblyModule(options: InitWebAssemblyModuleOptions? = definedExternally): kotlin.js.Promise<Any>

    /**
     * @property [modulePath] The path of the web assembly JavaScript wrapper module.
     * @property [wasmBinaryFile] The path of the web assembly binary file.
     * @property [fallbackModulePath] The path of the fallback JavaScript module to use if web assembly is not supported.
     */
    interface InitWebAssemblyModuleOptions {
        var modulePath: String?
        var wasmBinaryFile: String?
        var fallbackModulePath: String?
    }

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return True if this object was destroyed; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TaskProcessor.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys this object.  This will immediately terminate the Worker.
     *
     * Once an object is destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TaskProcessor.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
