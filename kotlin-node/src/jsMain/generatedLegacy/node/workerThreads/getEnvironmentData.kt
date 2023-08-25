// Automatically generated - do not modify!

@file:JsModule("node:worker_threads")

package node.workerThreads

/**
 * Within a worker thread, `worker.getEnvironmentData()` returns a clone
 * of data passed to the spawning thread's `worker.setEnvironmentData()`.
 * Every new `Worker` receives its own copy of the environment data
 * automatically.
 *
 * ```js
 * const {
 *   Worker,
 *   isMainThread,
 *   setEnvironmentData,
 *   getEnvironmentData,
 * } = require('worker_threads');
 *
 * if (isMainThread) {
 *   setEnvironmentData('Hello', 'World!');
 *   const worker = new Worker(__filename);
 * } else {
 *   console.log(getEnvironmentData('Hello'));  // Prints 'World!'.
 * }
 * ```
 * @since v15.12.0, v14.18.0
 * @param key Any arbitrary, cloneable JavaScript value that can be used as a {Map} key.
 */
external fun getEnvironmentData(
    key: Serializable,
): Serializable
