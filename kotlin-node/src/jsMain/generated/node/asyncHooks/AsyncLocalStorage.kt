// Automatically generated - do not modify!

@file:JsModule("node:async_hooks")

package node.asyncHooks

external class AsyncLocalStorage<T> {
    /**
     * Disables the instance of `AsyncLocalStorage`. All subsequent calls
     * to `asyncLocalStorage.getStore()` will return `undefined` until`asyncLocalStorage.run()` or `asyncLocalStorage.enterWith()` is called again.
     *
     * When calling `asyncLocalStorage.disable()`, all current contexts linked to the
     * instance will be exited.
     *
     * Calling `asyncLocalStorage.disable()` is required before the`asyncLocalStorage` can be garbage collected. This does not apply to stores
     * provided by the `asyncLocalStorage`, as those objects are garbage collected
     * along with the corresponding async resources.
     *
     * Use this method when the `asyncLocalStorage` is not in use anymore
     * in the current process.
     * @since v13.10.0, v12.17.0
     * @experimental
     */
    fun disable()

    /**
     * Returns the current store.
     * If called outside of an asynchronous context initialized by
     * calling `asyncLocalStorage.run()` or `asyncLocalStorage.enterWith()`, it
     * returns `undefined`.
     * @since v13.10.0, v12.17.0
     */
    fun getStore(): T

    /**
     * Runs a function synchronously within a context and returns its
     * return value. The store is not accessible outside of the callback function.
     * The store is accessible to any asynchronous operations created within the
     * callback.
     *
     * The optional `args` are passed to the callback function.
     *
     * If the callback function throws an error, the error is thrown by `run()` too.
     * The stacktrace is not impacted by this call and the context is exited.
     *
     * Example:
     *
     * ```js
     * const store = { id: 2 };
     * try {
     *   asyncLocalStorage.run(store, () => {
     *     asyncLocalStorage.getStore(); // Returns the store object
     *     setTimeout(() => {
     *       asyncLocalStorage.getStore(); // Returns the store object
     *     }, 200);
     *     throw new Error();
     *   });
     * } catch (e) {
     *   asyncLocalStorage.getStore(); // Returns undefined
     *   // The error will be caught here
     * }
     * ```
     * @since v13.10.0, v12.17.0
     */
    fun <R, TArg : Any> run(
        store: T,
        callback: Function<R>, /* ...args: TArgs */
        vararg args: TArg,
    ): R

    /**
     * Runs a function synchronously outside of a context and returns its
     * return value. The store is not accessible within the callback function or
     * the asynchronous operations created within the callback. Any `getStore()`call done within the callback function will always return `undefined`.
     *
     * The optional `args` are passed to the callback function.
     *
     * If the callback function throws an error, the error is thrown by `exit()` too.
     * The stacktrace is not impacted by this call and the context is re-entered.
     *
     * Example:
     *
     * ```js
     * // Within a call to run
     * try {
     *   asyncLocalStorage.getStore(); // Returns the store object or value
     *   asyncLocalStorage.exit(() => {
     *     asyncLocalStorage.getStore(); // Returns undefined
     *     throw new Error();
     *   });
     * } catch (e) {
     *   asyncLocalStorage.getStore(); // Returns the same object or value
     *   // The error will be caught here
     * }
     * ```
     * @since v13.10.0, v12.17.0
     * @experimental
     */
    fun <R, TArg : Any> exit(
        callback: Function<R>, /* ...args: TArgs */
        vararg args: TArg,
    ): R

    /**
     * Transitions into the context for the remainder of the current
     * synchronous execution and then persists the store through any following
     * asynchronous calls.
     *
     * Example:
     *
     * ```js
     * const store = { id: 1 };
     * // Replaces previous store with the given store object
     * asyncLocalStorage.enterWith(store);
     * asyncLocalStorage.getStore(); // Returns the store object
     * someAsyncOperation(() => {
     *   asyncLocalStorage.getStore(); // Returns the same object
     * });
     * ```
     *
     * This transition will continue for the _entire_ synchronous execution.
     * This means that if, for example, the context is entered within an event
     * handler subsequent event handlers will also run within that context unless
     * specifically bound to another context with an `AsyncResource`. That is why`run()` should be preferred over `enterWith()` unless there are strong reasons
     * to use the latter method.
     *
     * ```js
     * const store = { id: 1 };
     *
     * emitter.on('my-event', () => {
     *   asyncLocalStorage.enterWith(store);
     * });
     * emitter.on('my-event', () => {
     *   asyncLocalStorage.getStore(); // Returns the same object
     * });
     *
     * asyncLocalStorage.getStore(); // Returns undefined
     * emitter.emit('my-event');
     * asyncLocalStorage.getStore(); // Returns the same object
     * ```
     * @since v13.11.0, v12.17.0
     * @experimental
     */
    fun enterWith(store: T)
}
