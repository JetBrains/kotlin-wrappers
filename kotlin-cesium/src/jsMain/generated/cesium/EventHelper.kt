// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A convenience object that simplifies the common pattern of attaching event listeners
 * to several events, then removing all those listeners at once later, for example, in
 * a destroy method.
 * ```
 * const helper = new EventHelper();
 *
 * helper.add(someObject.event, listener1, this);
 * helper.add(otherObject.event, listener2, this);
 *
 * // later...
 * helper.removeAll();
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EventHelper.html">Online Documentation</a>
 */
external class EventHelper {
    /**
     * Adds a listener to an event, and records the registration to be cleaned up later.
     * @param [event] The event to attach to.
     * @param [listener] The function to be executed when the event is raised.
     * @param [scope] An optional object scope to serve as the `this`
     *   pointer in which the listener function will execute.
     * @return A function that will remove this event listener when invoked.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EventHelper.html#add">Online Documentation</a>
     */
    fun add(
        event: DefaultEvent,
        listener: () -> Unit,
        scope: Any? = definedExternally,
    ): RemoveCallback

    /**
     * Unregisters all previously added listeners.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EventHelper.html#removeAll">Online Documentation</a>
     */
    fun removeAll()
}
