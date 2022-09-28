// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

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
external class ScreenSpaceEventHandler(element: dom.html.HTMLCanvasElement? = definedExternally) {
    /**
     * Set a function to be executed on an input event.
     * @param [action] Function to be executed when the input event occurs.
     * @param [type] The ScreenSpaceEventType of input event.
     * @param [modifier] A KeyboardEventModifier key that is held when a `type`
     *   event occurs.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceEventHandler.html#setInputAction">Online Documentation</a>
     */
    fun setInputAction(
        action: dynamic,
        type: ScreenSpaceEventType,
        modifier: KeyboardEventModifier? = definedExternally,
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
        type: ScreenSpaceEventType,
        modifier: KeyboardEventModifier? = definedExternally,
    ): dynamic

    /**
     * Removes the function to be executed on an input event.
     * @param [type] The ScreenSpaceEventType of input event.
     * @param [modifier] A KeyboardEventModifier key that is held when a `type`
     *   event occurs.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceEventHandler.html#removeInputAction">Online Documentation</a>
     */
    fun removeInputAction(
        type: ScreenSpaceEventType,
        modifier: KeyboardEventModifier? = definedExternally,
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

    /**
     * An Event that occurs at a single position on screen.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceEventHandler.html#.PositionedEvent">Online Documentation</a>
     */
    interface PositionedEvent {
        var position: Cartesian2
    }

    /**
     * An Event that starts at one position and ends at another.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceEventHandler.html#.MotionEvent">Online Documentation</a>
     */
    interface MotionEvent {
        var startPosition: Cartesian2
        var endPosition: Cartesian2
    }

    /**
     * An Event that occurs at a two positions on screen.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceEventHandler.html#.TwoPointEvent">Online Documentation</a>
     */
    interface TwoPointEvent {
        var position1: Cartesian2
        var position2: Cartesian2
    }

    /**
     * An Event that starts at a two positions on screen and moves to two other positions.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceEventHandler.html#.TwoPointMotionEvent">Online Documentation</a>
     */
    interface TwoPointMotionEvent {
        var position1: Cartesian2
        var position2: Cartesian2
        var previousPosition1: Cartesian2
        var previousPosition2: Cartesian2
    }

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

/**
 * @param [event] The event which triggered the listener
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceEventHandler.html#.PositionedEventCallback">Online Documentation</a>
 */
typealias PositionedEventCallback = (event: ScreenSpaceEventHandler.PositionedEvent) -> Unit

/**
 * @param [event] The event which triggered the listener
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceEventHandler.html#.MotionEventCallback">Online Documentation</a>
 */
typealias MotionEventCallback = (event: ScreenSpaceEventHandler.MotionEvent) -> Unit

/**
 * @param [event] The event which triggered the listener
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceEventHandler.html#.TwoPointEventCallback">Online Documentation</a>
 */
typealias TwoPointEventCallback = (event: ScreenSpaceEventHandler.TwoPointEvent) -> Unit

/**
 * @param [event] The event which triggered the listener
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceEventHandler.html#.TwoPointMotionEventCallback">Online Documentation</a>
 */
typealias TwoPointMotionEventCallback = (event: ScreenSpaceEventHandler.TwoPointMotionEvent) -> Unit

/**
 * @param [delta] The amount that the mouse wheel moved
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceEventHandler.html#.WheelEventCallback">Online Documentation</a>
 */
typealias WheelEventCallback = (delta: Double) -> Unit
