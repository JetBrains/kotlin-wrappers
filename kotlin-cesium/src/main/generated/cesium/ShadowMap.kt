// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * <div class="notice">
 * Use [Viewer.shadowMap] to get the scene's shadow map. Do not construct this directly.
 * </div>
 *
 * The normalOffset bias pushes the shadows forward slightly, and may be disabled
 * for applications that require ultra precise shadows.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShadowMap.html">Online Documentation</a>
 */
sealed external class ShadowMap {
    /**
     * Determines the darkness of the shadows.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShadowMap.html#darkness">Online Documentation</a>
     */
    var darkness: Double

    /**
     * Determines whether shadows start to fade out once the light gets closer to the horizon.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShadowMap.html#fadingEnabled">Online Documentation</a>
     */
    var fadingEnabled: Boolean

    /**
     * Determines the maximum distance of the shadow map. Only applicable for cascaded shadows. Larger distances may result in lower quality shadows.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShadowMap.html#maximumDistance">Online Documentation</a>
     */
    var maximumDistance: Double

    /**
     * Determines if the shadow map will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShadowMap.html#enabled">Online Documentation</a>
     */
    var enabled: Boolean

    /**
     * Determines if a normal bias will be applied to shadows.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShadowMap.html#normalOffset">Online Documentation</a>
     */
    var normalOffset: Boolean

    /**
     * Determines if soft shadows are enabled. Uses pcf filtering which requires more texture reads and may hurt performance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShadowMap.html#softShadows">Online Documentation</a>
     */
    var softShadows: Boolean

    /**
     * The width and height, in pixels, of each shadow map.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShadowMap.html#size">Online Documentation</a>
     */
    var size: Double
}
