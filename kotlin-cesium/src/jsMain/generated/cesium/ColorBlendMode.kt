// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * Defines different modes for blending between a target color and a primitive's source color.
 *
 * HIGHLIGHT multiplies the source color by the target color
 * REPLACE replaces the source color with the target color
 * MIX blends the source color and target color together
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#ColorBlendMode">Online Documentation</a>
 */

sealed external interface ColorBlendMode {
    companion object {

        val HIGHLIGHT: ColorBlendMode

        val REPLACE: ColorBlendMode

        val MIX: ColorBlendMode
    }
}
