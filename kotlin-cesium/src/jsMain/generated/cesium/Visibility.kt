// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * This enumerated type is used in determining to what extent an object, the occludee,
 * is visible during horizon culling. An occluder may fully block an occludee, in which case
 * it has no visibility, may partially block an occludee from view, or may not block it at all,
 * leading to full visibility.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#Visibility">Online Documentation</a>
 */

sealed external interface Visibility {
    companion object {

        /**
         * Represents that no part of an object is visible.
         */
        val NONE: Visibility

        /**
         * Represents that part, but not all, of an object is visible
         */
        val PARTIAL: Visibility

        /**
         * Represents that an object is visible in its entirety.
         */
        val FULL: Visibility
    }
}
