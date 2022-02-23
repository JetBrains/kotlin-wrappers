// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * This enumerated type is used in determining where, relative to the frustum, an
 * object is located. The object can either be fully contained within the frustum (INSIDE),
 * partially inside the frustum and partially outside (INTERSECTING), or somewhere entirely
 * outside of the frustum's 6 planes (OUTSIDE).
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#Intersect">Online Documentation</a>
 */

external enum class Intersect {

    /**
     * Represents that an object is not contained within the frustum.
     */
    OUTSIDE,

    /**
     * Represents that an object intersects one of the frustum's planes.
     */
    INTERSECTING,

    /**
     * Represents that an object is fully within the frustum.
     */
    INSIDE,

    ;

}
