// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * Represents the position relative to the terrain.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#HeightReference">Online Documentation</a>
 */
sealed external interface HeightReference {
    companion object {

        /**
         * The position is absolute.
         */
        val NONE: HeightReference

        /**
         * The position is clamped to the terrain.
         */
        val CLAMP_TO_GROUND: HeightReference

        /**
         * The position height is the height above the terrain.
         */
        val RELATIVE_TO_GROUND: HeightReference
    }
}
