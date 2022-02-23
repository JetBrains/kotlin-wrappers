// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

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
 * const frustum = new PerspectiveOffCenterFrustum({
 *     left : -1.0,
 *     right : 1.0,
 *     top : 1.0,
 *     bottom : -1.0,
 *     near : 1.0,
 *     far : 100.0
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveOffCenterFrustum.html">Online Documentation</a>
 */
external class PerspectiveOffCenterFrustum {
    /**
     * Defines the left clipping plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveOffCenterFrustum.html#left">Online Documentation</a>
     */
    var left: Double

    /**
     * Defines the right clipping plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveOffCenterFrustum.html#right">Online Documentation</a>
     */
    var right: Double

    /**
     * Defines the top clipping plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveOffCenterFrustum.html#top">Online Documentation</a>
     */
    var top: Double

    /**
     * Defines the bottom clipping plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveOffCenterFrustum.html#bottom">Online Documentation</a>
     */
    var bottom: Double

    /**
     * The distance of the near plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveOffCenterFrustum.html#near">Online Documentation</a>
     */
    var near: Double

    /**
     * The distance of the far plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveOffCenterFrustum.html#far">Online Documentation</a>
     */
    var far: Double

    /**
     * Gets the perspective projection matrix computed from the view frustum.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveOffCenterFrustum.html#projectionMatrix">Online Documentation</a>
     */
    val projectionMatrix: Matrix4

    /**
     * Gets the perspective projection matrix computed from the view frustum with an infinite far plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveOffCenterFrustum.html#infiniteProjectionMatrix">Online Documentation</a>
     */
    val infiniteProjectionMatrix: Matrix4

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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveOffCenterFrustum.html#computeCullingVolume">Online Documentation</a>
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
     * const pixelSize = camera.frustum.getPixelDimensions(scene.drawingBufferWidth, scene.drawingBufferHeight, 1.0, scene.pixelRatio, new Cartesian2());
     * ```
     * ```
     * // Example 2
     * // Get the width and height of a pixel if the near plane was set to 'distance'.
     * // For example, get the size of a pixel of an image on a billboard.
     * const position = camera.position;
     * const direction = camera.direction;
     * const toCenter = Cartesian3.subtract(primitive.boundingVolume.center, position, new Cartesian3());      // vector from camera to a primitive
     * const toCenterProj = Cartesian3.multiplyByScalar(direction, Cartesian3.dot(direction, toCenter), new Cartesian3()); // project vector onto camera direction vector
     * const distance = Cartesian3.magnitude(toCenterProj);
     * const pixelSize = camera.frustum.getPixelDimensions(scene.drawingBufferWidth, scene.drawingBufferHeight, distance, scene.pixelRatio, new Cartesian2());
     * ```
     * @param [drawingBufferWidth] The width of the drawing buffer.
     * @param [drawingBufferHeight] The height of the drawing buffer.
     * @param [distance] The distance to the near plane in meters.
     * @param [pixelRatio] The scaling factor from pixel space to coordinate space.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance of [Cartesian2] with the pixel's width and height in the x and y properties, respectively.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveOffCenterFrustum.html#getPixelDimensions">Online Documentation</a>
     */
    fun getPixelDimensions(
        drawingBufferWidth: Double,
        drawingBufferHeight: Double,
        distance: Double,
        pixelRatio: Double,
        result: Cartesian2,
    ): Cartesian2

    /**
     * Returns a duplicate of a PerspectiveOffCenterFrustum instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new PerspectiveFrustum instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveOffCenterFrustum.html#clone">Online Documentation</a>
     */
    fun clone(result: PerspectiveOffCenterFrustum? = definedExternally): PerspectiveOffCenterFrustum

    /**
     * Compares the provided PerspectiveOffCenterFrustum componentwise and returns
     * `true` if they pass an absolute or relative tolerance test,
     * `false` otherwise.
     * @param [other] The right hand side PerspectiveOffCenterFrustum.
     * @param [relativeEpsilon] The relative epsilon tolerance to use for equality testing.
     * @param [absoluteEpsilon] The absolute epsilon tolerance to use for equality testing.
     *   Default value - [relativeEpsilon]
     * @return `true` if this and other are within the provided epsilon, `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveOffCenterFrustum.html#equalsEpsilon">Online Documentation</a>
     */
    fun equalsEpsilon(
        other: PerspectiveOffCenterFrustum,
        relativeEpsilon: Double,
        absoluteEpsilon: Double? = definedExternally,
    ): Boolean
}

inline fun PerspectiveOffCenterFrustum(
    block: PerspectiveOffCenterFrustum.() -> Unit,
): PerspectiveOffCenterFrustum =
    PerspectiveOffCenterFrustum().apply(block)
