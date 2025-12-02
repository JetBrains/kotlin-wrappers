// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Setup needed before picking.
 * @param [windowPosition] Window coordinates to perform picking on.
 * @param [drawingBufferRectangle] The output drawing buffer recangle.
 * @param [width] Width of the pick rectangle.
 *   Default value - `3`
 * @param [height] Height of the pick rectangle.
 *   Default value - `3`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#pickBegin">Online Documentation</a>
 */
external fun pickBegin(
    scene: Scene,
    windowPosition: Cartesian2,
    drawingBufferRectangle: BoundingRectangle,
    width: Double? = definedExternally,
    height: Double? = definedExternally,
)
