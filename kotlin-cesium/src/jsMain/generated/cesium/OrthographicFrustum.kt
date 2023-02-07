// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray

/**
 * The viewing frustum is defined by 6 planes.
 * Each plane is represented by a [Cartesian4] object, where the x, y, and z components
 * define the unit vector normal to the plane, and the w component is the distance of the
 * plane from the origin/camera position.
 * ```
 * const maxRadii = ellipsoid.maximumRadius;
 *
 * const frustum = new OrthographicFrustum();
 * frustum.near = 0.01 * maxRadii;
 * frustum.far = 50.0 * maxRadii;
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicFrustum.html">Online Documentation</a>
 */
external class OrthographicFrustum {
    /**
     * The horizontal width of the frustum in meters.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicFrustum.html#width">Online Documentation</a>
     */
    var width: Double

    /**
     * The aspect ratio of the frustum's width to it's height.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicFrustum.html#aspectRatio">Online Documentation</a>
     */
    var aspectRatio: Double

    /**
     * The distance of the near plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicFrustum.html#near">Online Documentation</a>
     */
    var near: Double

    /**
     * The distance of the far plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicFrustum.html#far">Online Documentation</a>
     */
    var far: Double

    /**
     * Gets the orthographic projection matrix computed from the view frustum.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicFrustum.html#projectionMatrix">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicFrustum.html#computeCullingVolume">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicFrustum.html#getPixelDimensions">Online Documentation</a>
     */
    fun getPixelDimensions(
        drawingBufferWidth: Double,
        drawingBufferHeight: Double,
        distance: Double,
        pixelRatio: Double,
        result: Cartesian2,
    ): Cartesian2

    /**
     * Returns a duplicate of a OrthographicFrustum instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new OrthographicFrustum instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicFrustum.html#clone">Online Documentation</a>
     */
    fun clone(result: OrthographicFrustum? = definedExternally): OrthographicFrustum

    /**
     * Compares the provided OrthographicFrustum componentwise and returns
     * `true` if they pass an absolute or relative tolerance test,
     * `false` otherwise.
     * @param [other] The right hand side OrthographicFrustum.
     * @param [relativeEpsilon] The relative epsilon tolerance to use for equality testing.
     * @param [absoluteEpsilon] The absolute epsilon tolerance to use for equality testing.
     *   Default value - [relativeEpsilon]
     * @return `true` if this and other are within the provided epsilon, `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicFrustum.html#equalsEpsilon">Online Documentation</a>
     */
    fun equalsEpsilon(
        other: OrthographicFrustum,
        relativeEpsilon: Double,
        absoluteEpsilon: Double? = definedExternally,
    ): Boolean

    companion object : Packable<OrthographicFrustum> {
        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicFrustum.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicFrustum.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: OrthographicFrustum,
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new OrthographicFrustum instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrthographicFrustum.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
            result: OrthographicFrustum?,
        ): OrthographicFrustum
    }
}

inline fun OrthographicFrustum(
    block: OrthographicFrustum.() -> Unit,
): OrthographicFrustum =
    OrthographicFrustum().apply(block)
