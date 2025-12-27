// Automatically generated - do not modify!

@file:JsModule("node:worker_threads")

package node.workerThreads

/**
 * Mark an object as not cloneable. If `object` is used as `message` in
 * a `port.postMessage()` call, an error is thrown. This is a no-op if `object` is a
 * primitive value.
 *
 * This has no effect on `ArrayBuffer`, or any `Buffer` like objects.
 *
 * This operation cannot be undone.
 *
 * ```js
 * const { markAsUncloneable } = require('node:worker_threads');
 *
 * const anyObject = { foo: 'bar' };
 * markAsUncloneable(anyObject);
 * const { port1 } = new MessageChannel();
 * try {
 *   // This will throw an error, because anyObject is not cloneable.
 *   port1.postMessage(anyObject)
 * } catch (error) {
 *   // error.name === 'DataCloneError'
 * }
 * ```
 *
 * There is no equivalent to this API in browsers.
 * @since v22.10.0
 */
external fun markAsUncloneable(value: Any)
