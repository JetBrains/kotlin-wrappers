// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A generic utility class for managing subscribers for a particular event.
 * This class is usually instantiated inside of a container class and
 * exposed as a property for others to subscribe to.
 * ```
 * MyObject.prototype.myListener = function(arg1, arg2) {
 *     this.myArg1Copy = arg1;
 *     this.myArg2Copy = arg2;
 * }
 *
 * const myObjectInstance = new MyObject();
 * const evt = new Event();
 * evt.addEventListener(MyObject.prototype.myListener, myObjectInstance);
 * evt.raiseEvent('1', '2');
 * evt.removeEventListener(MyObject.prototype.myListener);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Event.html">Online Documentation</a>
 */
external class Event {
    /**
     * The number of listeners currently subscribed to the event.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Event.html#numberOfListeners">Online Documentation</a>
     */
    val numberOfListeners: Int

    /**
     * Registers a callback function to be executed whenever the event is raised.
     * An optional scope can be provided to serve as the `this` pointer
     * in which the function will execute.
     * @param [listener] The function to be executed when the event is raised.
     * @param [scope] An optional object scope to serve as the `this`
     *   pointer in which the listener function will execute.
     * @return A function that will remove this event listener when invoked.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Event.html#addEventListener">Online Documentation</a>
     */
    fun addEventListener(
        listener: () -> Unit,
        scope: Any? = definedExternally,
    ): RemoveCallback

    /**
     * Unregisters a previously registered callback.
     * @param [listener] The function to be unregistered.
     * @param [scope] The scope that was originally passed to addEventListener.
     * @return `true` if the listener was removed; `false` if the listener and scope are not registered with the event.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Event.html#removeEventListener">Online Documentation</a>
     */
    fun removeEventListener(
        listener: () -> Unit,
        scope: Any? = definedExternally,
    ): Boolean

    /**
     * Raises the event by calling each registered listener with all supplied arguments.
     * @param [arguments] This method takes any number of parameters and passes them through to the listener functions.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Event.html#raiseEvent">Online Documentation</a>
     */
    fun raiseEvent(vararg arguments: Any)
}

/**
 * A function that removes a listener.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Event.html#.RemoveCallback">Online Documentation</a>
 */
typealias RemoveCallback = () -> Unit
