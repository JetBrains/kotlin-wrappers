// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import web.dom.Element

/**
 * The Timeline is a widget for displaying and controlling the current scene time.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Timeline.html">Online Documentation</a>
 *
 * @constructor
 * @property [container] The parent HTML container node for this widget.
 * @param [clock] The clock to use.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Timeline.html">Online Documentation</a>
 */
external class Timeline(
    var container: Element,
    clock: Clock,
) {
    /**
     * @return true if the object has been destroyed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Timeline.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the widget.  Should be called if permanently
     * removing the widget from layout.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Timeline.html#destroy">Online Documentation</a>
     */
    fun destroy()

    /**
     * Sets the view to the provided times.
     * @param [startTime] The start time.
     * @param [stopTime] The stop time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Timeline.html#zoomTo">Online Documentation</a>
     */
    fun zoomTo(
        startTime: JulianDate,
        stopTime: JulianDate,
    )

    /**
     * Resizes the widget to match the container size.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Timeline.html#resize">Online Documentation</a>
     */
    fun resize()
}
