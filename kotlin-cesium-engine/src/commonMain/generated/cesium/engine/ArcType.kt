// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * ArcType defines the path that should be taken connecting vertices.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#ArcType">Online Documentation</a>
 */
sealed external interface ArcType {
    companion object {

        /**
         * Straight line that does not conform to the surface of the ellipsoid.
         */
        val NONE: ArcType

        /**
         * Follow geodesic path.
         */
        val GEODESIC: ArcType

        /**
         * Follow rhumb or loxodrome path.
         */
        val RHUMB: ArcType
    }
}
