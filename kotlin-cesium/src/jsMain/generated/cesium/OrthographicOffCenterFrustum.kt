// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * The viewing frustum is defined by 6 planes.
 * Each plane is represented by a [Cartesian4] object, where the x, y, and z components
 * define the unit vector normal to the plane, and the w component is the distance of the
 * plane from the origin/camera position.
 * ```
 * const maxRadii = ellipsoid.maximumRadius;
 *
 * const frustum = new OrthographicOffCenterFrustum();
 * frustum.right = maxRadii * Math.PI;
 * frustum.left = -c.frustum.right;
 * frustum.top = c.frustum.right * (canvas.clientHeight / canvas.clientWidth);
 * frustum.bottom = -c.frustum.top;
 * frustum.near = 0.01 * maxRadii;
 * frustum.far = 50.0 * maxRadii;
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicOffCenterFrustum.html">Online Documentation</a>
 */
external class OrthographicOffCenterFrustum {
    /**
     * The left clipping plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicOffCenterFrustum.html#left">Online Documentation</a>
     */
    var left: Double

    /**
     * The right clipping plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicOffCenterFrustum.html#right">Online Documentation</a>
     */
    var right: Double

    /**
     * The top clipping plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicOffCenterFrustum.html#top">Online Documentation</a>
     */
    var top: Double

    /**
     * The bottom clipping plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicOffCenterFrustum.html#bottom">Online Documentation</a>
     */
    var bottom: Double

    /**
     * The distance of the near plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicOffCenterFrustum.html#near">Online Documentation</a>
     */
    var near: Double

    /**
     * The distance of the far plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicOffCenterFrustum.html#far">Online Documentation</a>
     */
    var far: Double

    /**
     * Gets the orthographic projection matrix computed from the view frustum.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicOffCenterFrustum.html#projectionMatrix">Online Documentation</a>
     */
    val projectionMatrix: Matrix4

    /**
     * Creates a culling volume for this frustum.
     * ```
     * // Check if a bounding volume intersects the frustum.
     * const cullingVolume = frustum.computeCullingVolume(cameraPosition, cameraDirection, cameraUp);
     * const intersect = cullingVolume.computeVisibility(boundingVolume);
     * ```
     * @param [position] The eye position.
     * @param [direction] The view direction.
     * @param [up] The up direction.
     * @return A culling volume at the given position and orientation.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicOffCenterFrustum.html#computeCullingVolume">Online Documentation</a>
     */
    fun computeCullingVolume(
        position: Cartesian3,
        direction: Cartesian3,
        up: Cartesian3,
    ): CullingVolume

    /**
     * Returns the pixel's width and height in meters.
     * ```
     * // Example 1
     * // Get the width and height of a pixel.
     * const pixelSize = camera.frustum.getPixelDimensions(scene.drawingBufferWidth, scene.drawingBufferHeight, 0.0, scene.pixelRatio, new Cartesian2());
     * ```
     * @param [drawingBufferWidth] The width of the drawing buffer.
     * @param [drawingBufferHeight] The height of the drawing buffer.
     * @param [distance] The distance to the near plane in meters.
     * @param [pixelRatio] The scaling factor from pixel space to coordinate space.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance of [Cartesian2] with the pixel's width and height in the x and y properties, respectively.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicOffCenterFrustum.html#getPixelDimensions">Online Documentation</a>
     */
    fun getPixelDimensions(
        drawingBufferWidth: Double,
        drawingBufferHeight: Double,
        distance: Double,
        pixelRatio: Double,
        result: Cartesian2,
    ): Cartesian2

    /**
     * Returns a duplicate of a OrthographicOffCenterFrustum instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new OrthographicOffCenterFrustum instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicOffCenterFrustum.html#clone">Online Documentation</a>
     */
    fun clone(result: OrthographicOffCenterFrustum? = definedExternally): OrthographicOffCenterFrustum

    /**
     * Compares the provided OrthographicOffCenterFrustum componentwise and returns
     * `true` if they pass an absolute or relative tolerance test,
     * `false` otherwise.
     * @param [other] The right hand side OrthographicOffCenterFrustum.
     * @param [relativeEpsilon] The relative epsilon tolerance to use for equality testing.
     * @param [absoluteEpsilon] The absolute epsilon tolerance to use for equality testing.
     *   Default value - [relativeEpsilon]
     * @return `true` if this and other are within the provided epsilon, `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicOffCenterFrustum.html#equalsEpsilon">Online Documentation</a>
     */
    fun equalsEpsilon(
        other: OrthographicOffCenterFrustum,
        relativeEpsilon: Double,
        absoluteEpsilon: Double? = definedExternally,
    ): Boolean
}

inline fun OrthographicOffCenterFrustum(
    block: OrthographicOffCenterFrustum.() -> Unit,
): OrthographicOffCenterFrustum =
    OrthographicOffCenterFrustum().apply(block)
