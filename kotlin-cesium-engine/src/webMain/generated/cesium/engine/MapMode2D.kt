// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Describes how the map will operate in 2D.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#MapMode2D">Online Documentation</a>
 */
sealed /* enum */
external interface MapMode2D {
    companion object {

        /**
         * The 2D map can be rotated about the z axis.
         *
         * Value - `0`
         */
        val ROTATE: MapMode2D

        /**
         * The 2D map can be scrolled infinitely in the horizontal direction.
         *
         * Value - `1`
         */
        val INFINITE_SCROLL: MapMode2D
    }
}
