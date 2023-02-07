// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

import web.html.HTMLCanvasElement

/**
 * Aggregates input events. For example, suppose the following inputs are received between frames:
 * left mouse button down, mouse move, mouse move, left mouse button up. These events will be aggregated into
 * one event with a start and end position of the mouse.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CameraEventAggregator.html">Online Documentation</a>
 *
 * @constructor
 * @param [canvas] The element to handle events for.
 *   Default value - `document`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CameraEventAggregator.html">Online Documentation</a>
 */
external class CameraEventAggregator(canvas: HTMLCanvasElement? = definedExternally) {
    /**
     * Gets the current mouse position.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CameraEventAggregator.html#currentMousePosition">Online Documentation</a>
     */
    var currentMousePosition: Cartesian2

    /**
     * Gets whether any mouse button is down, a touch has started, or the wheel has been moved.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CameraEventAggregator.html#anyButtonDown">Online Documentation</a>
     */
    var anyButtonDown: Boolean

    /**
     * Gets if a mouse button down or touch has started and has been moved.
     * @param [type] The camera event type.
     * @param [modifier] The keyboard modifier.
     * @return Returns `true` if a mouse button down or touch has started and has been moved; otherwise, `false`
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CameraEventAggregator.html#isMoving">Online Documentation</a>
     */
    fun isMoving(
        type: CameraEventType,
        modifier: KeyboardEventModifier? = definedExternally,
    ): Boolean

    /**
     * Gets the aggregated start and end position of the current event.
     * @param [type] The camera event type.
     * @param [modifier] The keyboard modifier.
     * @return An object with two [Cartesian2] properties: `startPosition` and `endPosition`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CameraEventAggregator.html#getMovement">Online Documentation</a>
     */
    fun getMovement(
        type: CameraEventType,
        modifier: KeyboardEventModifier? = definedExternally,
    ): Any

    /**
     * Gets the start and end position of the last move event (not the aggregated event).
     * @param [type] The camera event type.
     * @param [modifier] The keyboard modifier.
     * @return An object with two [Cartesian2] properties: `startPosition` and `endPosition` or `undefined`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CameraEventAggregator.html#getLastMovement">Online Documentation</a>
     */
    fun getLastMovement(
        type: CameraEventType,
        modifier: KeyboardEventModifier? = definedExternally,
    ): Any?

    /**
     * Gets whether the mouse button is down or a touch has started.
     * @param [type] The camera event type.
     * @param [modifier] The keyboard modifier.
     * @return Whether the mouse button is down or a touch has started.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CameraEventAggregator.html#isButtonDown">Online Documentation</a>
     */
    fun isButtonDown(
        type: CameraEventType,
        modifier: KeyboardEventModifier? = definedExternally,
    ): Boolean

    /**
     * Gets the mouse position that started the aggregation.
     * @param [type] The camera event type.
     * @param [modifier] The keyboard modifier.
     * @return The mouse position.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CameraEventAggregator.html#getStartMousePosition">Online Documentation</a>
     */
    fun getStartMousePosition(
        type: CameraEventType,
        modifier: KeyboardEventModifier? = definedExternally,
    ): Cartesian2

    /**
     * Gets the time the button was pressed or the touch was started.
     * @param [type] The camera event type.
     * @param [modifier] The keyboard modifier.
     * @return The time the button was pressed or the touch was started.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CameraEventAggregator.html#getButtonPressTime">Online Documentation</a>
     */
    fun getButtonPressTime(
        type: CameraEventType,
        modifier: KeyboardEventModifier? = definedExternally,
    ): kotlin.js.Date

    /**
     * Gets the time the button was released or the touch was ended.
     * @param [type] The camera event type.
     * @param [modifier] The keyboard modifier.
     * @return The time the button was released or the touch was ended.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CameraEventAggregator.html#getButtonReleaseTime">Online Documentation</a>
     */
    fun getButtonReleaseTime(
        type: CameraEventType,
        modifier: KeyboardEventModifier? = definedExternally,
    ): kotlin.js.Date

    /**
     * Signals that all of the events have been handled and the aggregator should be reset to handle new events.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CameraEventAggregator.html#reset">Online Documentation</a>
     */
    fun reset()

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CameraEventAggregator.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Removes mouse listeners held by this object.
     *
     * Once an object is destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.  Therefore,
     * assign the return value (`undefined`) to the object as done in the example.
     * ```
     * handler = handler && handler.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CameraEventAggregator.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
