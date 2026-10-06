// Automatically generated - do not modify!

@file:JsModule("@cesium/core")

package cesium.core

/**
 * Functions for computing vertically-exaggerated heights and positions.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VerticalExaggeration.html">Online Documentation</a>
 */
external object VerticalExaggeration {
    /**
     * Scales a height relative to an offset.
     * @param [height] The height.
     * @param [scale] A scalar used to exaggerate the terrain. If the value is 1.0 there will be no effect.
     * @param [relativeHeight] The height relative to which terrain is exaggerated. If the value is 0.0 terrain will be exaggerated relative to the ellipsoid surface.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VerticalExaggeration.html#.getHeight">Online Documentation</a>
     */
    fun getHeight(
        height: Double,
        scale: Double,
        relativeHeight: Double,
    )

    /**
     * Scales a position by exaggeration.
     * @param [position] The position.
     * @param [ellipsoid] The ellipsoid.
     * @param [verticalExaggeration] A scalar used to exaggerate the terrain. If the value is 1.0 there will be no effect.
     * @param [verticalExaggerationRelativeHeight] The height relative to which terrain is exaggerated. If the value is 0.0 terrain will be exaggerated relative to the ellipsoid surface.
     * @param [result] The object onto which to store the result.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VerticalExaggeration.html#.getPosition">Online Documentation</a>
     */
    fun getPosition(
        position: Cartesian3,
        ellipsoid: Ellipsoid,
        verticalExaggeration: Double,
        verticalExaggerationRelativeHeight: Double,
        result: Cartesian3? = definedExternally,
    )
}
