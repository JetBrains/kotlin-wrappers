// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * Defines how per-feature colors set from the Cesium API or declarative styling blend with the source colors from
 * the original feature, e.g. glTF material or per-point color in the tile.
 *
 * When `REPLACE` or `MIX` are used and the source color is a glTF material, the technique must assign the
 * `_3DTILESDIFFUSE` semantic to the diffuse color parameter. Otherwise only `HIGHLIGHT` is supported.
 *
 * A feature whose color evaluates to white (1.0, 1.0, 1.0) is always rendered without color blending, regardless of the
 * tileset's color blend mode.
 *
 * ```
 * "techniques": {
 *   "technique0": {
 *     "parameters": {
 *       "diffuse": {
 *         "semantic": "_3DTILESDIFFUSE",
 *         "type": 35666
 *       }
 *     }
 *   }
 * }
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#Cesium3DTileColorBlendMode">Online Documentation</a>
 */

external enum class Cesium3DTileColorBlendMode {

    /**
     * Multiplies the source color by the feature color.
     */
    HIGHLIGHT,

    /**
     * Replaces the source color with the feature color.
     */
    REPLACE,

    /**
     * Blends the source color and feature color together.
     */
    MIX,

    ;

}
