// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Style options for corners.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#CornerType">Online Documentation</a>
 */
sealed external interface CornerType {
    companion object {

        /**
         * Corner has a smooth edge.
         */
        val ROUNDED: CornerType

        /**
         * Corner point is the intersection of adjacent edges.
         */
        val MITERED: CornerType

        /**
         * Corner is clipped.
         */
        val BEVELED: CornerType
    }
}
