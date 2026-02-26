// Automatically generated - do not modify!

package node.events

/**
 * The `NodeEventTarget` is a Node.js-specific extension to `EventTarget`
 * that emulates a subset of the `EventEmitter` API.
 * @since v14.5.0
 */
@Suppress("INTERFACE_WITH_SUPERCLASS")
sealed external interface NodeEventTarget : web.events.EventTarget {
    /**
     * Node.js-specific extension to the `EventTarget` class that emulates the
     * equivalent `EventEmitter` API. The only difference between `addListener()` and
     * `addEventListener()` is that `addListener()` will return a reference to the
     * `EventTarget`.
     * @since v14.5.0
     */
    fun addListener(type: String, listener: (arg: Any?) -> Unit) // this

    /**
     * Node.js-specific extension to the `EventTarget` class that dispatches the
     * `arg` to the list of handlers for `type`.
     * @since v15.2.0
     * @returns `true` if event listeners registered for the `type` exist,
     * otherwise `false`.
     */
    fun emit(
        type: String,
        arg: Any?,
    ): Boolean

    /**
     * Node.js-specific extension to the `EventTarget` class that returns an array
     * of event `type` names for which event listeners are registered.
     * @since 14.5.0
     */
    fun eventNames(): js.array.ReadonlyArray<String>

    /**
     * Node.js-specific extension to the `EventTarget` class that returns the number
     * of event listeners registered for the `type`.
     * @since v14.5.0
     */
    fun listenerCount(type: String): Double

    /**
     * Node.js-specific extension to the `EventTarget` class that sets the number
     * of max event listeners as `n`.
     * @since v14.5.0
     */
    fun setMaxListeners(n: Number)

    /**
     * Node.js-specific extension to the `EventTarget` class that returns the number
     * of max event listeners.
     * @since v14.5.0
     */
    fun getMaxListeners(): Double

    /**
     * Node.js-specific alias for `eventTarget.removeEventListener()`.
     * @since v14.5.0
     */
    fun off(
        type: String,
        listener: (arg: Any?) -> Unit,
        options: web.events.EventListenerOptions = definedExternally,
    ) // this

    /**
     * Node.js-specific alias for `eventTarget.addEventListener()`.
     * @since v14.5.0
     */
    fun on(type: String, listener: (arg: Any?) -> Unit) // this

    /**
     * Node.js-specific extension to the `EventTarget` class that adds a `once`
     * listener for the given event `type`. This is equivalent to calling `on`
     * with the `once` option set to `true`.
     * @since v14.5.0
     */
    fun once(type: String, listener: (arg: Any?) -> Unit) // this

    /**
     * Node.js-specific extension to the `EventTarget` class. If `type` is specified,
     * removes all registered listeners for `type`, otherwise removes all registered
     * listeners.
     * @since v14.5.0
     */
    fun removeAllListeners(type: String = definedExternally) // this

    /**
     * Node.js-specific extension to the `EventTarget` class that removes the
     * `listener` for the given `type`. The only difference between `removeListener()`
     * and `removeEventListener()` is that `removeListener()` will return a reference
     * to the `EventTarget`.
     * @since v14.5.0
     */
    fun removeListener(
        type: String,
        listener: (arg: Any?) -> Unit,
        options: web.events.EventListenerOptions = definedExternally,
    ) // this
}
