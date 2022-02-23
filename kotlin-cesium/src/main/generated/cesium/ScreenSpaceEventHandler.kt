// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Handles user input events. Custom functions can be added to be executed on
 * when the user enters input.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceEventHandler.html">Online Documentation</a>
 *
 * @constructor
 * @param [element] The element to add events to.
 *   Default value - `document`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceEventHandler.html">Online Documentation</a>
 */
external class ScreenSpaceEventHandler(element: org.w3c.dom.HTMLCanvasElement? = definedExternally) {
    /**
     * Set a function to be executed on an input event.
     * @param [action] Function to be executed when the input event occurs.
     * @param [type] The ScreenSpaceEventType of input event.
     * @param [modifier] A KeyboardEventModifier key that is held when a `type`
     *   event occurs.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceEventHandler.html#setInputAction">Online Documentation</a>
     */
    fun setInputAction(
        action: Function<*>,
        type: Double,
        modifier: Double? = definedExternally,
    )

    /**
     * Returns the function to be executed on an input event.
     * @param [type] The ScreenSpaceEventType of input event.
     * @param [modifier] A KeyboardEventModifier key that is held when a `type`
     *   event occurs.
     * @return The function to be executed on an input event.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceEventHandler.html#getInputAction">Online Documentation</a>
     */
    fun getInputAction(
        type: Double,
        modifier: Double? = definedExternally,
    ): Function<*>

    /**
     * Removes the function to be executed on an input event.
     * @param [type] The ScreenSpaceEventType of input event.
     * @param [modifier] A KeyboardEventModifier key that is held when a `type`
     *   event occurs.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceEventHandler.html#removeInputAction">Online Documentation</a>
     */
    fun removeInputAction(
        type: Double,
        modifier: Double? = definedExternally,
    )

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceEventHandler.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Removes listeners held by this object.
     *
     * Once an object is destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.  Therefore,
     * assign the return value (`undefined`) to the object as done in the example.
     * ```
     * handler = handler && handler.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceEventHandler.html#destroy">Online Documentation</a>
     */
    fun destroy()

    companion object {
        /**
         * The amount of time, in milliseconds, that mouse events will be disabled after
         * receiving any touch events, such that any emulated mouse events will be ignored.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceEventHandler.html#.mouseEmulationIgnoreMilliseconds">Online Documentation</a>
         */
        var mouseEmulationIgnoreMilliseconds: Double

        /**
         * The amount of time, in milliseconds, before a touch on the screen becomes a
         * touch and hold.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceEventHandler.html#.touchHoldDelayMilliseconds">Online Documentation</a>
         */
        var touchHoldDelayMilliseconds: Double
    }
}
