// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * An enum identifying the type of request. Used for finer grained logging and priority sorting.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#RequestType">Online Documentation</a>
 */

sealed external interface RequestType {
    companion object {

        /**
         * Terrain request.
         */
        val TERRAIN: RequestType

        /**
         * Imagery request.
         */
        val IMAGERY: RequestType

        /**
         * 3D Tiles request.
         */
        val TILES3D: RequestType

        /**
         * Other request.
         */
        val OTHER: RequestType
    }
}
