// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * An enum identifying the type of request. Used for finer grained logging and priority sorting.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#RequestType">Online Documentation</a>
 */
sealed /* enum */
external interface RequestType {
    companion object {

        /**
         * Terrain request.
         *
         * Value - `0`
         */
        val TERRAIN: RequestType

        /**
         * Imagery request.
         *
         * Value - `1`
         */
        val IMAGERY: RequestType

        /**
         * 3D Tiles request.
         *
         * Value - `2`
         */
        val TILES3D: RequestType

        /**
         * Other request.
         *
         * Value - `3`
         */
        val OTHER: RequestType
    }
}
