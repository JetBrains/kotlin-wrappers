// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Winding order defines the order of vertices for a triangle to be considered front-facing.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#WindingOrder">Online Documentation</a>
 */
sealed external interface WindingOrder {
    companion object {

        /**
         * Vertices are in clockwise order.
         */
        val CLOCKWISE: WindingOrder

        /**
         * Vertices are in counter-clockwise order.
         */
        val COUNTER_CLOCKWISE: WindingOrder
    }
}
