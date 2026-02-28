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
 * import {
 *   Worker,
 *   isMainThread,
 *   setEnvironmentData,
 *   getEnvironmentData,
 * } from 'node:worker_threads';
 *
 * if (isMainThread) {
 *   setEnvironmentData('Hello', 'World!');
 *   const worker = new Worker(new URL(import.meta.url));
 * } else {
 *   console.log(getEnvironmentData('Hello'));  // Prints 'World!'.
 * }
 * ```
 * @since v15.12.0, v14.18.0
 * @param key Any arbitrary, cloneable JavaScript value that can be used as a {@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Map Map} key.
 */
external fun getEnvironmentData(key: Serializable): Serializable
