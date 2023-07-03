// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.jso

/**
 * Provides playback of time-dynamic point cloud data.
 *
 * Point cloud frames are prefetched in intervals determined by the average frame load time and the current clock speed.
 * If intermediate frames cannot be loaded in time to meet playback speed, they will be skipped. If frames are sufficiently
 * small or the clock is sufficiently slow then no frames will be skipped.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeDynamicPointCloud.html">Online Documentation</a>
 */
external class TimeDynamicPointCloud(options: ConstructorOptions) {
    /**
     * @property [clock] A [Clock] instance that is used when determining the value for the time dimension.
     * @property [intervals] A [TimeIntervalCollection] with its data property being an object containing a `uri` to a 3D Tiles Point Cloud tile and an optional `transform`.
     * @property [show] Determines if the point cloud will be shown.
     *   Default value - `true`
     * @property [modelMatrix] A 4x4 transformation matrix that transforms the point cloud.
     *   Default value - [Matrix4.IDENTITY]
     * @property [shadows] Determines whether the point cloud casts or receives shadows from light sources.
     *   Default value - [ShadowMode.ENABLED]
     * @property [maximumMemoryUsage] The maximum amount of memory in MB that can be used by the point cloud.
     *   Default value - `256`
     * @property [shading] Options for constructing a [PointCloudShading] object to control point attenuation and eye dome lighting.
     * @property [style] The style, defined using the [3D Tiles Styling language](https://github.com/CesiumGS/3d-tiles/tree/main/specification/Styling), applied to each point in the point cloud.
     * @property [clippingPlanes] The [ClippingPlaneCollection] used to selectively disable rendering the point cloud.
     */
    interface ConstructorOptions {
        var clock: Clock
        var intervals: TimeIntervalCollection
        var show: Boolean?
        var modelMatrix: Matrix4?
        var shadows: ShadowMode?
        var maximumMemoryUsage: Int?
        var shading: Any?
        var style: Cesium3DTileStyle?
        var clippingPlanes: ClippingPlaneCollection?
    }

    /**
     * Determines if the point cloud will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeDynamicPointCloud.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * A 4x4 transformation matrix that transforms the point cloud.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeDynamicPointCloud.html#modelMatrix">Online Documentation</a>
     */
    var modelMatrix: Matrix4

    /**
     * Determines whether the point cloud casts or receives shadows from light sources.
     *
     * Enabling shadows has a performance impact. A point cloud that casts shadows must be rendered twice, once from the camera and again from the light's point of view.
     *
     * Shadows are rendered only when [Viewer.shadows] is `true`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeDynamicPointCloud.html#shadows">Online Documentation</a>
     */
    var shadows: ShadowMode

    /**
     * The maximum amount of GPU memory (in MB) that may be used to cache point cloud frames.
     *
     * Frames that are not being loaded or rendered are unloaded to enforce this.
     *
     * If decreasing this value results in unloading tiles, the tiles are unloaded the next frame.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeDynamicPointCloud.html#maximumMemoryUsage">Online Documentation</a>
     */
    var maximumMemoryUsage: Int

    /**
     * Options for controlling point size based on geometric error and eye dome lighting.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeDynamicPointCloud.html#shading">Online Documentation</a>
     */
    var shading: PointCloudShading

    /**
     * The style, defined using the
     * [3D Tiles Styling language](https://github.com/CesiumGS/3d-tiles/tree/main/specification/Styling),
     * applied to each point in the point cloud.
     *
     * Assign `undefined` to remove the style, which will restore the visual
     * appearance of the point cloud to its default when no style was applied.
     * ```
     * pointCloud.style = new Cesium3DTileStyle({
     *    color : {
     *        conditions : [
     *            ['${Classification} === 0', 'color("purple", 0.5)'],
     *            ['${Classification} === 1', 'color("red")'],
     *            ['true', '${COLOR}']
     *        ]
     *    },
     *    show : '${Classification} !== 2'
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeDynamicPointCloud.html#style">Online Documentation</a>
     */
    var style: Cesium3DTileStyle

    /**
     * The event fired to indicate that a frame failed to load. A frame may fail to load if the
     * request for its uri fails or processing fails due to invalid content.
     *
     * If there are no event listeners, error messages will be logged to the console.
     *
     * The error object passed to the listener contains two properties:
     * - `uri`: the uri of the failed frame.
     * - `message`: the error message.
     * ```
     * pointCloud.frameFailed.addEventListener(function(error) {
     *     console.log(`An error occurred loading frame: ${error.uri}`);
     *     console.log(`Error: ${error.message}`);
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeDynamicPointCloud.html#frameFailed">Online Documentation</a>
     */
    var frameFailed: DefaultEvent

    /**
     * The event fired to indicate that a new frame was rendered.
     *
     * The time dynamic point cloud [TimeDynamicPointCloud] is passed to the event listener.
     * ```
     * pointCloud.frameChanged.addEventListener(function(timeDynamicPointCloud) {
     *     viewer.camera.viewBoundingSphere(timeDynamicPointCloud.boundingSphere);
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeDynamicPointCloud.html#frameChanged">Online Documentation</a>
     */
    var frameChanged: DefaultEvent

    /**
     * The [ClippingPlaneCollection] used to selectively disable rendering the point cloud.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeDynamicPointCloud.html#clippingPlanes">Online Documentation</a>
     */
    var clippingPlanes: ClippingPlaneCollection

    /**
     * The total amount of GPU memory in bytes used by the point cloud.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeDynamicPointCloud.html#totalMemoryUsageInBytes">Online Documentation</a>
     */
    val totalMemoryUsageInBytes: Int

    /**
     * The bounding sphere of the frame being rendered. Returns `undefined` if no frame is being rendered.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeDynamicPointCloud.html#boundingSphere">Online Documentation</a>
     */
    val boundingSphere: BoundingSphere

    /**
     * Marks the point cloud's [TimeDynamicPointCloud.style] as dirty, which forces all
     * points to re-evaluate the style in the next frame.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeDynamicPointCloud.html#makeStyleDirty">Online Documentation</a>
     */
    fun makeStyleDirty()

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeDynamicPointCloud.html#isDestroyed">Online Documentation</a>
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
     * pointCloud = pointCloud && pointCloud.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeDynamicPointCloud.html#destroy">Online Documentation</a>
     */
    fun destroy()
}

inline fun TimeDynamicPointCloud(
    block: TimeDynamicPointCloud.ConstructorOptions.() -> Unit,
): TimeDynamicPointCloud =
    TimeDynamicPointCloud(options = jso(block))
