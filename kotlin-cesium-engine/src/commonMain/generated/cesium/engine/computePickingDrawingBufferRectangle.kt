// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Compute the rectangle that describes the part of the drawing buffer
 * that is relevant for picking.
 * @param [drawingBufferHeight] The height of the drawing buffer
 * @param [position] The position inside the drawing buffer
 * @param [width] The width of the rectangle, assumed to
 *   be an odd integer number, default : 3.0
 * @param [height] The height of the rectangle. If unspecified,
 *   height will default to the value of `width`
 * @param [result] The result rectangle
 * @return The result rectangle
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#computePickingDrawingBufferRectangle">Online Documentation</a>
 */
external fun computePickingDrawingBufferRectangle(
    drawingBufferHeight: Double,
    position: Cartesian2,
    width: Double?,
    height: Double?,
    result: BoundingRectangle,
): BoundingRectangle
