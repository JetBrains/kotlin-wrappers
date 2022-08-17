// Automatically generated - do not modify!

@file:JsModule("node:worker_threads")
@file:JsNonModule

package node.worker

/**
 * Transfer a `MessagePort` to a different `vm` Context. The original `port`object is rendered unusable, and the returned `MessagePort` instance
 * takes its place.
 *
 * The returned `MessagePort` is an object in the target context and
 * inherits from its global `Object` class. Objects passed to the [`port.onmessage()`](https://developer.mozilla.org/en-US/docs/Web/API/MessagePort/onmessage) listener are also created in the
 * target context
 * and inherit from its global `Object` class.
 *
 * However, the created `MessagePort` no longer inherits from [`EventTarget`](https://developer.mozilla.org/en-US/docs/Web/API/EventTarget), and only
 * [`port.onmessage()`](https://developer.mozilla.org/en-US/docs/Web/API/MessagePort/onmessage) can be used to receive
 * events using it.
 * @since v11.13.0
 * @param port The message port to transfer.
 * @param contextifiedSandbox A `contextified` object as returned by the `vm.createContext()` method.
 */
external fun moveMessagePortToContext(
    port: MessagePort,
    contextifiedSandbox: dynamic, /* Context */
): MessagePort
