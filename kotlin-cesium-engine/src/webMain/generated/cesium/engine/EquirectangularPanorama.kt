// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import kotlinx.js.JsPlainObject

/**
 * A [Panorama] that displays imagery in equirectangular format in a scene.
 * ```
 * const position = Cartesian3.fromDegrees(
 *   -75.1699,  // longitude
 *   39.9522,   // latitude
 *   100.0      // height in meters
 * );
 *
 * const heading = Math.toRadians(45.0); // rotation about up axis
 * const pitch = Math.toRadians(-30.0);   // pitch (negative looks down)
 * const roll = Math.toRadians(10.0);    // roll about forward axis
 *
 * const hpr = new HeadingPitchRoll(
 *   heading,
 *   pitch,
 *   roll
 * );
 *
 * const modelMatrix = Transforms.headingPitchRollToFixedFrame(
 *   position,
 *   hpr,
 *   Ellipsoid.WGS84,
 *   Transforms.eastNorthUpToFixedFrame
 * );
 *
 * scene.primitives.add(new EquirectangularPanorama({
 *   transform: modelMatrix,
 *   image: 'path/to/image',
 * }));
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EquirectangularPanorama.html">Online Documentation</a>
 */
external class EquirectangularPanorama(
    options: ConstructorOptions,
) {
    /**
     * Gets the radius of the panorama.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EquirectangularPanorama.html#radius">Online Documentation</a>
     */
    val radius: Double

    /**
     * Gets the source image of the panorama.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EquirectangularPanorama.html#image">Online Documentation</a>
     */
    val image: JsAny /* string | HTMLImageElement | HTMLCanvasElement | ImageBitmap */

    /**
     * Gets the transform of the panorama.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EquirectangularPanorama.html#transform">Online Documentation</a>
     */
    val transform: Matrix4

    /**
     * Gets the credits of the panorama.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EquirectangularPanorama.html#credit">Online Documentation</a>
     */
    val credit: Credit

    /**
     * Determines if the equirectangular panorama will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EquirectangularPanorama.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Called when [Viewer] or [CesiumWidget] render the scene to
     * get the draw commands needed to render this primitive.
     *
     * Do not call this function directly.  This is documented just to
     * list the exceptions that may be propagated when the scene is rendered:
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EquirectangularPanorama.html#update">Online Documentation</a>
     */
    fun update()

    /**
     * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
     * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
     *
     * Once an object is destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.  Therefore,
     * assign the return value (`undefined`) to the object as done in the example.
     * ```
     * equirectangularPanorama = equirectangularPanorama && equirectangularPanorama.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EquirectangularPanorama.html#destroy">Online Documentation</a>
     */
    fun destroy()

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EquirectangularPanorama.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Initialization options for the EquirectangularPanorama constructor
     * @property [options.transform] A 4x4 transformation matrix that defines the panorama’s position and orientation
     *   (for example, derived from a position and heading-pitch-roll).
     * @property [options.image] A URL to an image resource, or a preloaded image object.
     * @property [options.radius] The radius of the panorama in meters.
     *   Default value - `100000.0`
     * @property [options.repeatHorizontal] The number of times to repeat the texture horizontally.
     *   Default value - `1.0`
     * @property [options.repeatVertical] The number of times to repeat the texture vertically.
     *   Default value - `1.0`
     * @property [options.credit] A credit for the panorama, which is displayed on the canvas.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EquirectangularPanorama.html#.ConstructorOptions">Online Documentation</a>
     */
    @JsPlainObject
    interface ConstructorOptions {
        /* EMPTY WITHOUT REASON */
    }
}
