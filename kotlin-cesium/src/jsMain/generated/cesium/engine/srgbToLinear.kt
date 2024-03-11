// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium.engine

/**
 * Converts the value from sRGB color space to linear color space.
 * ```
 * const srgbColor = [0.5, 0.5, 0.5];
 * const linearColor = srgbColor.map(function (c) {
 *     return srgbToLinear(c);
 * });
 * ```
 * @param [value] The color value in sRGB color space.
 * @return Returns the color value in linear color space.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#srgbToLinear">Online Documentation</a>
 */
external fun srgbToLinear(value: Double): Double
