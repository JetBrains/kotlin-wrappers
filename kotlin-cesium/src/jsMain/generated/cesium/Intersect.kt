// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * This enumerated type is used in determining where, relative to the frustum, an
 * object is located. The object can either be fully contained within the frustum (INSIDE),
 * partially inside the frustum and partially outside (INTERSECTING), or somewhere entirely
 * outside of the frustum's 6 planes (OUTSIDE).
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#Intersect">Online Documentation</a>
 */
sealed external interface Intersect {
    companion object {

        /**
         * Represents that an object is not contained within the frustum.
         */
        val OUTSIDE: Intersect

        /**
         * Represents that an object intersects one of the frustum's planes.
         */
        val INTERSECTING: Intersect

        /**
         * Represents that an object is fully within the frustum.
         */
        val INSIDE: Intersect
    }
}
