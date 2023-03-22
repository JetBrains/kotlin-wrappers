// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * The encoding that is used for a heightmap
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#HeightmapEncoding">Online Documentation</a>
 */
sealed external interface HeightmapEncoding {
    companion object {

        /**
         * No encoding
         */
        val NONE: HeightmapEncoding

        /**
         * LERC encoding
         */
        val LERC: HeightmapEncoding
    }
}
