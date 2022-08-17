// Automatically generated - do not modify!

@file:JsModule("node:worker_threads")
@file:JsNonModule

package node.worker

/**
 * Mark an object as not transferable. If `object` occurs in the transfer list of
 * a `port.postMessage()` call, it is ignored.
 *
 * In particular, this makes sense for objects that can be cloned, rather than
 * transferred, and which are used by other objects on the sending side.
 * For example, Node.js marks the `ArrayBuffer`s it uses for its `Buffer pool` with this.
 *
 * This operation cannot be undone.
 *
 * ```js
 * const { MessageChannel, markAsUntransferable } = require('worker_threads');
 *
 * const pooledBuffer = new ArrayBuffer(8);
 * const typedArray1 = new Uint8Array(pooledBuffer);
 * const typedArray2 = new Float64Array(pooledBuffer);
 *
 * markAsUntransferable(pooledBuffer);
 *
 * const { port1 } = new MessageChannel();
 * port1.postMessage(typedArray1, [ typedArray1.buffer ]);
 *
 * // The following line prints the contents of typedArray1 -- it still owns
 * // its memory and has been cloned, not transferred. Without
 * // `markAsUntransferable()`, this would print an empty Uint8Array.
 * // typedArray2 is intact as well.
 * console.log(typedArray1);
 * console.log(typedArray2);
 * ```
 *
 * There is no equivalent to this API in browsers.
 * @since v14.5.0, v12.19.0
 */
external fun markAsUntransferable(
    o: Any,
)
