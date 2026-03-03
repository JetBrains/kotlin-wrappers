// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import kotlinx.js.JsPlainObject

/**
 * A [Panorama] that displays imagery in cube map format in a scene.
 *
 * This is only supported in 3D.  The cube map panorama is faded out when morphing to 2D or Columbus view.  The size of
 * the cube map panorama must not exceed [Scene.maximumSkyBoxSize].
 * ```
 * const modelMatrix = Matrix4.getMatrix3(
 *   Transforms.localFrameToFixedFrameGenerator("north", "down")(
 *     Cartesian3.fromDegrees(longitude, latitude, height),
 *     Ellipsoid.default
 *   ),
 *   new Matrix3()
 * );
 *
 * scene.primitives.add(new CubeMapPanorama({
 *   sources : {
 *     positiveX : 'cubemap_px.png',
 *     negativeX : 'cubemap_nx.png',
 *     positiveY : 'cubemap_py.png',
 *     negativeY : 'cubemap_ny.png',
 *     positiveZ : 'cubemap_pz.png',
 *     negativeZ : 'cubemap_nz.png'
 *   }
 *   transform: modelMatrix,
 * }));
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CubeMapPanorama.html">Online Documentation</a>
 */
external class CubeMapPanorama(
    options: ConstructorOptions,
) {
    /**
     * The sources used to create the cube map faces: an object
     * with `positiveX`, `negativeX`, `positiveY`,
     * `negativeY`, `positiveZ`, and `negativeZ` properties.
     * These can be either URLs or `Image` objects.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CubeMapPanorama.html#sources">Online Documentation</a>
     */
    var sources: JsAny

    /**
     * Determines if the cube map panorama will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CubeMapPanorama.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Gets the transform of the panorama.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CubeMapPanorama.html#transform">Online Documentation</a>
     */
    val transform: Matrix4

    /**
     * Gets the credits of the panorama.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CubeMapPanorama.html#credit">Online Documentation</a>
     */
    val credit: Credit

    /**
     * Called when [Viewer] or [CesiumWidget] render the scene to
     * get the draw commands needed to render this primitive.
     *
     * Do not call this function directly.  This is documented just to
     * list the exceptions that may be propagated when the scene is rendered:
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CubeMapPanorama.html#update">Online Documentation</a>
     */
    fun update()

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CubeMapPanorama.html#isDestroyed">Online Documentation</a>
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
     * cubeMapPanorama = cubeMapPanorama && cubeMapPanorama.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CubeMapPanorama.html#destroy">Online Documentation</a>
     */
    fun destroy()

    /**
     * Initialization options for the CubeMapPanorama constructor
     * @property [options.sources] The source URL or `Image` object for each of the six cube map faces.  See the example below.
     * @property [options.transform] A 4x4 transformation matrix that defines the panorama’s position and orientation
     * @property [options.show] Determines if this primitive will be shown.
     *   Default value - `true`
     * @property [options.credit] A credit for the panorama, which is displayed on the canvas.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CubeMapPanorama.html#.ConstructorOptions">Online Documentation</a>
     */
    @JsPlainObject
    interface ConstructorOptions {
        /* EMPTY WITHOUT REASON */
    }
}
