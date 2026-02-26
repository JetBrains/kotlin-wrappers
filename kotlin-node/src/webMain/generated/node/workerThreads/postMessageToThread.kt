// Automatically generated - do not modify!

@file:JsModule("node:worker_threads")

package node.workerThreads

/**
 * Sends a value to another worker, identified by its thread ID.
 * @param threadId The target thread ID. If the thread ID is invalid, a `ERR_WORKER_MESSAGING_FAILED` error will be thrown.
 * If the target thread ID is the current thread ID, a `ERR_WORKER_MESSAGING_SAME_THREAD` error will be thrown.
 * @param value The value to send.
 * @param transferList If one or more `MessagePort`-like objects are passed in value, a `transferList` is required for those items
 * or `ERR_MISSING_MESSAGE_PORT_IN_TRANSFER_LIST` is thrown. See `port.postMessage()` for more information.
 * @param timeout Time to wait for the message to be delivered in milliseconds. By default it's `undefined`, which means wait forever.
 * If the operation times out, a `ERR_WORKER_MESSAGING_TIMEOUT` error is thrown.
 * @since v22.5.0
 */
@JsName("postMessageToThread")
external fun postMessageToThreadAsync(
    threadId: Number,
    value: Any?,
    timeout: Number = definedExternally,
): js.promise.Promise<js.core.Void>

@JsName("postMessageToThread")
external fun postMessageToThreadAsync(
    threadId: Number,
    value: Any?,
    transferList: js.array.ReadonlyArray<Transferable>,
    timeout: Number = definedExternally,
): js.promise.Promise<js.core.Void>
