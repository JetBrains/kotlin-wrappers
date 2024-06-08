// Automatically generated - do not modify!

package cesium.engine

/**
 * Optimization option. Used as a callback when [Cesium3DTileset.foveatedScreenSpaceError] is true to control how much to raise the screen space error for tiles outside the foveated cone,
 * interpolating between [Cesium3DTileset.foveatedMinimumScreenSpaceErrorRelaxation] and [Cesium3DTileset.maximumScreenSpaceError].
 * @param [p] The start value to interpolate.
 * @param [q] The end value to interpolate.
 * @param [time] The time of interpolation generally in the range `[0.0, 1.0]`.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#.foveatedInterpolationCallback">Online Documentation</a>
 */
typealias FoveatedInterpolationCallback = (p: Double, q: Double, time: Double) -> Double
