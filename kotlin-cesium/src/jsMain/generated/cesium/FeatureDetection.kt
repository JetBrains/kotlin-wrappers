// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * A set of functions to detect whether the current browser supports
 * various features.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FeatureDetection.html">Online Documentation</a>
 */
external object FeatureDetection {
    /**
     * Detects whether the current browser supports Basis Universal textures and the web assembly modules needed to transcode them.
     * @return true if the browser supports web assembly modules and the scene supports Basis Universal textures, false if not.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FeatureDetection.html#.supportsBasis">Online Documentation</a>
     */
    fun supportsBasis(scene: Scene): Boolean

    /**
     * Detects whether the current browser supports the full screen standard.
     * @return true if the browser supports the full screen standard, false if not.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FeatureDetection.html#.supportsFullscreen">Online Documentation</a>
     */
    fun supportsFullscreen(): Boolean

    /**
     * Detects whether the current browser supports typed arrays.
     * @return true if the browser supports typed arrays, false if not.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FeatureDetection.html#.supportsTypedArrays">Online Documentation</a>
     */
    fun supportsTypedArrays(): Boolean

    /**
     * Detects whether the current browser supports BigInt64Array typed arrays.
     * @return true if the browser supports BigInt64Array typed arrays, false if not.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FeatureDetection.html#.supportsBigInt64Array">Online Documentation</a>
     */
    fun supportsBigInt64Array(): Boolean

    /**
     * Detects whether the current browser supports BigUint64Array typed arrays.
     * @return true if the browser supports BigUint64Array typed arrays, false if not.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FeatureDetection.html#.supportsBigUint64Array">Online Documentation</a>
     */
    fun supportsBigUint64Array(): Boolean

    /**
     * Detects whether the current browser supports BigInt.
     * @return true if the browser supports BigInt, false if not.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FeatureDetection.html#.supportsBigInt">Online Documentation</a>
     */
    fun supportsBigInt(): Boolean

    /**
     * Detects whether the current browser supports Web Workers.
     * @return true if the browsers supports Web Workers, false if not.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FeatureDetection.html#.supportsWebWorkers">Online Documentation</a>
     */
    fun supportsWebWorkers(): Boolean

    /**
     * Detects whether the current browser supports Web Assembly.
     * @return true if the browsers supports Web Assembly, false if not.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FeatureDetection.html#.supportsWebAssembly">Online Documentation</a>
     */
    fun supportsWebAssembly(): Boolean

    /**
     * Detects whether the current browser supports a WebGL2 rendering context for the specified scene.
     * @param [scene] the Cesium scene specifying the rendering context
     * @return true if the browser supports a WebGL2 rendering context, false if not.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FeatureDetection.html#.supportsWebgl2">Online Documentation</a>
     */
    fun supportsWebgl2(scene: Scene): Boolean
}
