// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Provides imagery to be displayed on the surface of an ellipsoid.  This type describes an
 * interface and is not intended to be instantiated directly.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PanoramaProvider.html">Online Documentation</a>
 */
abstract external class PanoramaProvider {
    /**
     * Returns a panorama primitive.
     * @param [options] Input options to create the panorama primitive.
     * @return The panorama primitive for displaying panoramas in a scene.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PanoramaProvider.html#loadPanorama">Online Documentation</a>
     */
    abstract fun loadPanorama(options: JsAny): Panorama

    companion object {
        /**
         * Returns a panorama provider.
         * @param [options] Input options to create the panorama provider.
         * @return The panorama provider for loading panoramas into a scene.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PanoramaProvider.html#.fromUrl">Online Documentation</a>
         */
        fun fromUrl(options: JsAny): PanoramaProvider
    }
}
