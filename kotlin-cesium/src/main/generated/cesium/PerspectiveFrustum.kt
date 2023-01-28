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
 * const frustum = new PerspectiveFrustum({
 *     fov : Math.PI_OVER_THREE,
 *     aspectRatio : canvas.clientWidth / canvas.clientHeight
 *     near : 1.0,
 *     far : 1000.0
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveFrustum.html">Online Documentation</a>
 */
external class PerspectiveFrustum {
    /**
     * The angle of the field of view (FOV), in radians.  This angle will be used
     * as the horizontal FOV if the width is greater than the height, otherwise
     * it will be the vertical FOV.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveFrustum.html#fov">Online Documentation</a>
     */
    var fov: Double

    /**
     * The aspect ratio of the frustum's width to it's height.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveFrustum.html#aspectRatio">Online Documentation</a>
     */
    var aspectRatio: Double

    /**
     * The distance of the near plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveFrustum.html#near">Online Documentation</a>
     */
    var near: Double

    /**
     * The distance of the far plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveFrustum.html#far">Online Documentation</a>
     */
    var far: Double

    /**
     * Offsets the frustum in the x direction.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveFrustum.html#xOffset">Online Documentation</a>
     */
    var xOffset: Double

    /**
     * Offsets the frustum in the y direction.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveFrustum.html#yOffset">Online Documentation</a>
     */
    var yOffset: Double

    /**
     * Gets the perspective projection matrix computed from the view frustum.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveFrustum.html#projectionMatrix">Online Documentation</a>
     */
    val projectionMatrix: Matrix4

    /**
     * The perspective projection matrix computed from the view frustum with an infinite far plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveFrustum.html#infiniteProjectionMatrix">Online Documentation</a>
     */
    val infiniteProjectionMatrix: Matrix4

    /**
     * Gets the angle of the vertical field of view, in radians.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveFrustum.html#fovy">Online Documentation</a>
     */
    val fovy: Double

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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveFrustum.html#computeCullingVolume">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveFrustum.html#getPixelDimensions">Online Documentation</a>
     */
    fun getPixelDimensions(
        drawingBufferWidth: Double,
        drawingBufferHeight: Double,
        distance: Double,
        pixelRatio: Double,
        result: Cartesian2,
    ): Cartesian2

    /**
     * Returns a duplicate of a PerspectiveFrustum instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new PerspectiveFrustum instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveFrustum.html#clone">Online Documentation</a>
     */
    fun clone(result: PerspectiveFrustum? = definedExternally): PerspectiveFrustum

    /**
     * Compares the provided PerspectiveFrustum componentwise and returns
     * `true` if they pass an absolute or relative tolerance test,
     * `false` otherwise.
     * @param [other] The right hand side PerspectiveFrustum.
     * @param [relativeEpsilon] The relative epsilon tolerance to use for equality testing.
     * @param [absoluteEpsilon] The absolute epsilon tolerance to use for equality testing.
     *   Default value - [relativeEpsilon]
     * @return `true` if this and other are within the provided epsilon, `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveFrustum.html#equalsEpsilon">Online Documentation</a>
     */
    fun equalsEpsilon(
        other: PerspectiveFrustum,
        relativeEpsilon: Double,
        absoluteEpsilon: Double? = definedExternally,
    ): Boolean

    companion object : Packable<PerspectiveFrustum> {
        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveFrustum.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveFrustum.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: PerspectiveFrustum,
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new PerspectiveFrustum instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerspectiveFrustum.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
            result: PerspectiveFrustum?,
        ): PerspectiveFrustum
    }
}

inline fun PerspectiveFrustum(
    block: PerspectiveFrustum.() -> Unit,
): PerspectiveFrustum =
    PerspectiveFrustum().apply(block)
