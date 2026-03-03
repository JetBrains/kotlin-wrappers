// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Displays panorama imagery in a scene. This type describes an interface and is not intended to be instantiated directly.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Panorama.html">Online Documentation</a>
 */
abstract external class Panorama {
    /**
     * Determines if the panorama will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Panorama.html#show">Online Documentation</a>
     */
    abstract var show: Boolean

    /**
     * Gets the transform of the panorama.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Panorama.html#transform">Online Documentation</a>
     */
    abstract val transform: Matrix4

    /**
     * Gets the credits of the panorama.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Panorama.html#credit">Online Documentation</a>
     */
    abstract val credit: Credit
}
