// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Style options for corners.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#CornerType">Online Documentation</a>
 */
sealed /* enum */
external interface CornerType {
    companion object {

        /**
         * Corner has a smooth edge.
         *
         * Value - `0`
         */
        val ROUNDED: CornerType

        /**
         * Corner point is the intersection of adjacent edges.
         *
         * Value - `1`
         */
        val MITERED: CornerType

        /**
         * Corner is clipped.
         *
         * Value - `2`
         */
        val BEVELED: CornerType
    }
}
