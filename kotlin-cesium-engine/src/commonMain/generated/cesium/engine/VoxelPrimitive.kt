// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A primitive that renders voxel data from a [VoxelProvider].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html">Online Documentation</a>
 */
external class VoxelPrimitive(
    options: ConstructorOptions? = definedExternally,
) {
    /**
     * @property [provider] The voxel provider that supplies the primitive with tile data.
     * @property [modelMatrix] The model matrix used to transform the primitive.
     *   Default value - [Matrix4.IDENTITY]
     * @property [customShader] The custom shader used to style the primitive.
     * @property [clock] The clock used to control time dynamic behavior.
     * @property [calculateStatistics] Generate statistics for performance profile.
     */
    @JsPlainObject
    interface ConstructorOptions {
        val provider: VoxelProvider?
        val modelMatrix: Matrix4?
        val customShader: CustomShader?
        val clock: Clock?
        val calculateStatistics: Boolean?
    }

    /**
     * The event fired to indicate that a tile's content was loaded.
     *
     * This event is fired during the tileset traversal while the frame is being rendered
     * so that updates to the tile take effect in the same frame.  Do not create or modify
     * Cesium entities or primitives during the event listener.
     * ```
     * voxelPrimitive.tileLoad.addEventListener(function() {
     *     console.log('A tile was loaded.');
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#tileLoad">Online Documentation</a>
     */
    var tileLoad: DefaultEvent

    /**
     * This event fires once for each visible tile in a frame.
     * This event is fired during the traversal while the frame is being rendered.
     * ```
     * voxelPrimitive.tileVisible.addEventListener(function() {
     *     console.log('A tile is visible.');
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#tileVisible">Online Documentation</a>
     */
    var tileVisible: DefaultEvent

    /**
     * The event fired to indicate that a tile's content failed to load.
     * ```
     * voxelPrimitive.tileFailed.addEventListener(function() {
     *     console.log('An error occurred loading tile.');
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#tileFailed">Online Documentation</a>
     */
    var tileFailed: DefaultEvent

    /**
     * The event fired to indicate that a tile's content was unloaded.
     * ```
     * voxelPrimitive.tileUnload.addEventListener(function() {
     *     console.log('A tile was unloaded from the cache.');
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#tileUnload">Online Documentation</a>
     */
    var tileUnload: DefaultEvent

    /**
     * The event fired to indicate progress of loading new tiles. This event is fired when a new tile
     * is requested, when a requested tile is finished downloading, and when a downloaded tile has been
     * processed and is ready to render.
     *
     * The number of pending tile requests, `numberOfPendingRequests`, and number of tiles
     * processing, `numberOfTilesProcessing` are passed to the event listener.
     *
     * This event is fired at the end of the frame after the scene is rendered.
     * ```
     * voxelPrimitive.loadProgress.addEventListener(function(numberOfPendingRequests, numberOfTilesProcessing) {
     *     if ((numberOfPendingRequests === 0) && (numberOfTilesProcessing === 0)) {
     *         console.log('Finished loading');
     *         return;
     *     }
     *
     *     console.log(`Loading: requests: ${numberOfPendingRequests}, processing: ${numberOfTilesProcessing}`);
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#loadProgress">Online Documentation</a>
     */
    var loadProgress: DefaultEvent

    /**
     * The event fired to indicate that all tiles that meet the screen space error this frame are loaded. The voxel
     * primitive is completely loaded for this view.
     *
     * This event is fired at the end of the frame after the scene is rendered.
     * ```
     * voxelPrimitive.allTilesLoaded.addEventListener(function() {
     *     console.log('All tiles are loaded');
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#allTilesLoaded">Online Documentation</a>
     */
    var allTilesLoaded: DefaultEvent

    /**
     * The event fired to indicate that all tiles that meet the screen space error this frame are loaded. This event
     * is fired once when all tiles in the initial view are loaded.
     *
     * This event is fired at the end of the frame after the scene is rendered.
     * ```
     * voxelPrimitive.initialTilesLoaded.addEventListener(function() {
     *     console.log('Initial tiles are loaded');
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#initialTilesLoaded">Online Documentation</a>
     */
    var initialTilesLoaded: DefaultEvent

    /**
     * Gets a value indicating whether or not the primitive is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#ready">Online Documentation</a>
     */
    val ready: Boolean

    /**
     * Gets the [VoxelProvider] associated with this primitive.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#provider">Online Documentation</a>
     */
    val provider: VoxelProvider

    /**
     * Gets the bounding sphere.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#boundingSphere">Online Documentation</a>
     */
    val boundingSphere: BoundingSphere

    /**
     * Gets the oriented bounding box.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#orientedBoundingBox">Online Documentation</a>
     */
    val orientedBoundingBox: OrientedBoundingBox

    /**
     * Gets the model matrix.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#modelMatrix">Online Documentation</a>
     */
    val modelMatrix: Matrix4

    /**
     * Gets the shape type.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#shape">Online Documentation</a>
     */
    val shape: VoxelShapeType

    /**
     * Gets the dimensions of each voxel tile, in z-up orientation.
     * Does not include padding.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#dimensions">Online Documentation</a>
     */
    val dimensions: Cartesian3

    /**
     * Gets the dimensions of one tile of the input voxel data, in the input orientation.
     * Includes padding.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#inputDimensions">Online Documentation</a>
     */
    val inputDimensions: Cartesian3

    /**
     * Gets the padding before the voxel data.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#paddingBefore">Online Documentation</a>
     */
    val paddingBefore: Cartesian3

    /**
     * Gets the padding after the voxel data.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#paddingAfter">Online Documentation</a>
     */
    val paddingAfter: Cartesian3

    /**
     * Gets the minimum value per channel of the voxel data.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#minimumValues">Online Documentation</a>
     */
    val minimumValues: ReadonlyArray<ReadonlyArray<Double>>

    /**
     * Gets the maximum value per channel of the voxel data.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#maximumValues">Online Documentation</a>
     */
    val maximumValues: ReadonlyArray<ReadonlyArray<Double>>

    /**
     * Gets or sets whether or not this primitive should be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Gets or sets whether or not the primitive should update when the view changes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#disableUpdate">Online Documentation</a>
     */
    var disableUpdate: Boolean

    /**
     * Gets or sets whether or not to render debug visualizations.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#debugDraw">Online Documentation</a>
     */
    var debugDraw: Boolean

    /**
     * Gets or sets whether or not to test against depth when rendering.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#depthTest">Online Documentation</a>
     */
    var depthTest: Boolean

    /**
     * Gets or sets the nearest sampling.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#nearestSampling">Online Documentation</a>
     */
    var nearestSampling: Boolean

    /**
     * Gets or sets the screen space error in pixels. If the screen space size
     * of a voxel is greater than the screen space error, the tile is subdivided.
     * Lower screen space error corresponds with higher detail rendering, but could
     * result in worse performance and higher memory consumption.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#screenSpaceError">Online Documentation</a>
     */
    var screenSpaceError: Int

    /**
     * Gets or sets the step size multiplier used during raymarching.
     * The lower the value, the higher the rendering quality, but
     * also the worse the performance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#stepSize">Online Documentation</a>
     */
    var stepSize: Double

    /**
     * Gets or sets the minimum bounds in the shape's local coordinate system.
     * Voxel data is stretched or squashed to fit the bounds.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#minBounds">Online Documentation</a>
     */
    var minBounds: Cartesian3

    /**
     * Gets or sets the maximum bounds in the shape's local coordinate system.
     * Voxel data is stretched or squashed to fit the bounds.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#maxBounds">Online Documentation</a>
     */
    var maxBounds: Cartesian3

    /**
     * Gets or sets the minimum clipping location in the shape's local coordinate system.
     * Any voxel content outside the range is clipped.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#minClippingBounds">Online Documentation</a>
     */
    var minClippingBounds: Cartesian3

    /**
     * Gets or sets the maximum clipping location in the shape's local coordinate system.
     * Any voxel content outside the range is clipped.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#maxClippingBounds">Online Documentation</a>
     */
    var maxClippingBounds: Cartesian3

    /**
     * The [ClippingPlaneCollection] used to selectively disable rendering the primitive.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#clippingPlanes">Online Documentation</a>
     */
    var clippingPlanes: ClippingPlaneCollection

    /**
     * Gets or sets the custom shader. If undefined, [VoxelPrimitive.DefaultCustomShader] is set.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#customShader">Online Documentation</a>
     */
    var customShader: CustomShader

    /**
     * Gets an event that is raised whenever a custom shader is compiled.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#customShaderCompilationEvent">Online Documentation</a>
     */
    val customShaderCompilationEvent: DefaultEvent

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#isDestroyed">Online Documentation</a>
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
     * voxelPrimitive = voxelPrimitive && voxelPrimitive.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
