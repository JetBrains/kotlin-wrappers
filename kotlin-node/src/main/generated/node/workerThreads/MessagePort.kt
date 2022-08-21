// Automatically generated - do not modify!

@file:JsModule("node:worker_threads")
@file:JsNonModule

package node.workerThreads

import kotlinx.js.ReadonlyArray
import node.events.Event

external class MessagePort : node.events.EventEmitter {
    /**
     * Disables further sending of messages on either side of the connection.
     * This method can be called when no further communication will happen over this`MessagePort`.
     *
     * The `'close' event` is emitted on both `MessagePort` instances that
     * are part of the channel.
     * @since v10.5.0
     */
    fun close()

    /**
     * Sends a JavaScript value to the receiving side of this channel.`value` is transferred in a way which is compatible with
     * the [HTML structured clone algorithm](https://developer.mozilla.org/en-US/docs/Web/API/Web_Workers_API/Structured_clone_algorithm).
     *
     * In particular, the significant differences to `JSON` are:
     *
     * * `value` may contain circular references.
     * * `value` may contain instances of builtin JS types such as `RegExp`s,`BigInt`s, `Map`s, `Set`s, etc.
     * * `value` may contain typed arrays, both using `ArrayBuffer`s
     * and `SharedArrayBuffer`s.
     * * `value` may contain [`WebAssembly.Module`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Module) instances.
     * * `value` may not contain native (C++-backed) objects other than:
     *
     * ```js
     * const { MessageChannel } = require('worker_threads');
     * const { port1, port2 } = new MessageChannel();
     *
     * port1.on('message', (message) => console.log(message));
     *
     * const circularData = {};
     * circularData.foo = circularData;
     * // Prints: { foo: [Circular] }
     * port2.postMessage(circularData);
     * ```
     *
     * `transferList` may be a list of [`ArrayBuffer`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer), `MessagePort` and `FileHandle` objects.
     * After transferring, they are not usable on the sending side of the channel
     * anymore (even if they are not contained in `value`). Unlike with `child processes`, transferring handles such as network sockets is currently
     * not supported.
     *
     * If `value` contains [`SharedArrayBuffer`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/SharedArrayBuffer) instances, those are accessible
     * from either thread. They cannot be listed in `transferList`.
     *
     * `value` may still contain `ArrayBuffer` instances that are not in`transferList`; in that case, the underlying memory is copied rather than moved.
     *
     * ```js
     * const { MessageChannel } = require('worker_threads');
     * const { port1, port2 } = new MessageChannel();
     *
     * port1.on('message', (message) => console.log(message));
     *
     * const uint8Array = new Uint8Array([ 1, 2, 3, 4 ]);
     * // This posts a copy of `uint8Array`:
     * port2.postMessage(uint8Array);
     * // This does not copy data, but renders `uint8Array` unusable:
     * port2.postMessage(uint8Array, [ uint8Array.buffer ]);
     *
     * // The memory for the `sharedUint8Array` is accessible from both the
     * // original and the copy received by `.on('message')`:
     * const sharedUint8Array = new Uint8Array(new SharedArrayBuffer(4));
     * port2.postMessage(sharedUint8Array);
     *
     * // This transfers a freshly created message port to the receiver.
     * // This can be used, for example, to create communication channels between
     * // multiple `Worker` threads that are children of the same parent thread.
     * const otherChannel = new MessageChannel();
     * port2.postMessage({ port: otherChannel.port1 }, [ otherChannel.port1 ]);
     * ```
     *
     * The message object is cloned immediately, and can be modified after
     * posting without having side effects.
     *
     * For more information on the serialization and deserialization mechanisms
     * behind this API, see the `serialization API of the v8 module`.
     * @since v10.5.0
     */
    fun postMessage(
        value: Any,
        transferList: ReadonlyArray<TransferListItem> = definedExternally,
    )

    /**
     * Opposite of `unref()`. Calling `ref()` on a previously `unref()`ed port does _not_ let the program exit if it's the only active handle left (the default
     * behavior). If the port is `ref()`ed, calling `ref()` again has no effect.
     *
     * If listeners are attached or removed using `.on('message')`, the port
     * is `ref()`ed and `unref()`ed automatically depending on whether
     * listeners for the event exist.
     * @since v10.5.0
     */
    fun ref()

    /**
     * Calling `unref()` on a port allows the thread to exit if this is the only
     * active handle in the event system. If the port is already `unref()`ed calling`unref()` again has no effect.
     *
     * If listeners are attached or removed using `.on('message')`, the port is`ref()`ed and `unref()`ed automatically depending on whether
     * listeners for the event exist.
     * @since v10.5.0
     */
    fun unref()

    /**
     * Starts receiving messages on this `MessagePort`. When using this port
     * as an event emitter, this is called automatically once `'message'`listeners are attached.
     *
     * This method exists for parity with the Web `MessagePort` API. In Node.js,
     * it is only useful for ignoring messages when no event listener is present.
     * Node.js also diverges in its handling of `.onmessage`. Setting it
     * automatically calls `.start()`, but unsetting it lets messages queue up
     * until a new handler is set or the port is discarded.
     * @since v10.5.0
     */
    fun start()
    fun addListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ): MessagePort

    fun addListener(
        event: Event.MESSAGE,
        listener: (value: Any) -> Unit,
    ): MessagePort

    fun addListener(
        event: Event.MESSAGE_ERROR,
        listener: (error: Error) -> Unit,
    ): MessagePort

    override fun addListener(
        event: String, /* | Symbol */
        listener: Function<Unit>,
    ): MessagePort

    fun emit(event: Event.CLOSE): Boolean
    fun emit(
        event: Event.MESSAGE,
        value: Any,
    ): Boolean

    fun emit(
        event: Event.MESSAGE_ERROR,
        error: Error,
    ): Boolean

    override fun emit(
        event: String, /* | Symbol */
        vararg args: Any,
    ): Boolean

    fun on(
        event: Event.CLOSE,
        listener: () -> Unit,
    ): MessagePort

    fun on(
        event: Event.MESSAGE,
        listener: (value: Any) -> Unit,
    ): MessagePort

    fun on(
        event: Event.MESSAGE_ERROR,
        listener: (error: Error) -> Unit,
    ): MessagePort

    override fun on(
        event: String, /* | Symbol */
        listener: Function<Unit>,
    ): MessagePort

    fun once(
        event: Event.CLOSE,
        listener: () -> Unit,
    ): MessagePort

    fun once(
        event: Event.MESSAGE,
        listener: (value: Any) -> Unit,
    ): MessagePort

    fun once(
        event: Event.MESSAGE_ERROR,
        listener: (error: Error) -> Unit,
    ): MessagePort

    override fun once(
        event: String, /* | Symbol */
        listener: Function<Unit>,
    ): MessagePort

    fun prependListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ): MessagePort

    fun prependListener(
        event: Event.MESSAGE,
        listener: (value: Any) -> Unit,
    ): MessagePort

    fun prependListener(
        event: Event.MESSAGE_ERROR,
        listener: (error: Error) -> Unit,
    ): MessagePort

    override fun prependListener(
        event: String, /* | Symbol */
        listener: Function<Unit>,
    ): MessagePort

    fun prependOnceListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ): MessagePort

    fun prependOnceListener(
        event: Event.MESSAGE,
        listener: (value: Any) -> Unit,
    ): MessagePort

    fun prependOnceListener(
        event: Event.MESSAGE_ERROR,
        listener: (error: Error) -> Unit,
    ): MessagePort

    override fun prependOnceListener(
        event: String, /* | Symbol */
        listener: Function<Unit>,
    ): MessagePort

    fun removeListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ): MessagePort

    fun removeListener(
        event: Event.MESSAGE,
        listener: (value: Any) -> Unit,
    ): MessagePort

    fun removeListener(
        event: Event.MESSAGE_ERROR,
        listener: (error: Error) -> Unit,
    ): MessagePort

    override fun removeListener(
        event: String, /* | Symbol */
        listener: Function<Unit>,
    ): MessagePort

    fun off(
        event: Event.CLOSE,
        listener: () -> Unit,
    ): MessagePort

    fun off(
        event: Event.MESSAGE,
        listener: (value: Any) -> Unit,
    ): MessagePort

    fun off(
        event: Event.MESSAGE_ERROR,
        listener: (error: Error) -> Unit,
    ): MessagePort

    override fun off(
        event: String, /* | Symbol */
        listener: Function<Unit>,
    ): MessagePort
}
