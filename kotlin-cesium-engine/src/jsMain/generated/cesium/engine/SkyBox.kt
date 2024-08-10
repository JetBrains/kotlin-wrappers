// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import kotlinx.js.JsPlainObject

/**
 * A sky box around the scene to draw stars.  The sky box is defined using the True Equator Mean Equinox (TEME) axes.
 *
 * This is only supported in 3D.  The sky box is faded out when morphing to 2D or Columbus view.  The size of
 * the sky box must not exceed [Scene.maximumCubeMapSize].
 * ```
 * scene.skyBox = new SkyBox({
 *   sources : {
 *     positiveX : 'skybox_px.png',
 *     negativeX : 'skybox_nx.png',
 *     positiveY : 'skybox_py.png',
 *     negativeY : 'skybox_ny.png',
 *     positiveZ : 'skybox_pz.png',
 *     negativeZ : 'skybox_nz.png'
 *   }
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SkyBox.html">Online Documentation</a>
 */
external class SkyBox(
    options: ConstructorOptions,
) {
    /**
     * @property [sources] The source URL or `Image` object for each of the six cube map faces.  See the example below.
     * @property [show] Determines if this primitive will be shown.
     *   Default value - `true`
     */
    @JsPlainObject
    sealed interface ConstructorOptions {
        var sources: Any?
        var show: Boolean?
    }

    /**
     * The sources used to create the cube map faces: an object
     * with `positiveX`, `negativeX`, `positiveY`,
     * `negativeY`, `positiveZ`, and `negativeZ` properties.
     * These can be either URLs or `Image` objects.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SkyBox.html#sources">Online Documentation</a>
     */
    var sources: Any

    /**
     * Determines if the sky box will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SkyBox.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Called when [Viewer] or [CesiumWidget] render the scene to
     * get the draw commands needed to render this primitive.
     *
     * Do not call this function directly.  This is documented just to
     * list the exceptions that may be propagated when the scene is rendered:
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SkyBox.html#update">Online Documentation</a>
     */
    fun update()

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SkyBox.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
     * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
     *
     * Once an object is destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.  Therefore,
     * assign the return value (`undefined`) to the object as done in the example.
     * ```
     * skyBox = skyBox && skyBox.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SkyBox.html#destroy">Online Documentation</a>
     */
    fun destroy()

    companion object {
        /**
         * Creates a skybox instance with the default starmap for the Earth.
         * ```
         * viewer.scene.skyBox = SkyBox.createEarthSkyBox();
         * ```
         * @return The default skybox for the Earth
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SkyBox.html#.createEarthSkyBox">Online Documentation</a>
         */
        fun createEarthSkyBox(): SkyBox
    }
}
