// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray
import js.core.jso
import kotlin.js.Promise

/**
 * A primitive that renders voxel data from a [VoxelProvider].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html">Online Documentation</a>
 */
external class VoxelPrimitive(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [provider] The voxel provider that supplies the primitive with tile data.
     * @property [modelMatrix] The model matrix used to transform the primitive.
     *   Default value - [Matrix4.IDENTITY]
     * @property [customShader] The custom shader used to style the primitive.
     * @property [clock] The clock used to control time dynamic behavior.
     */
    interface ConstructorOptions {
        var provider: VoxelProvider?
        var modelMatrix: Matrix4?
        var customShader: CustomShader?
        var clock: Clock?
    }

    /**
     * Gets a value indicating whether or not the primitive is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#ready">Online Documentation</a>
     */
    val ready: Boolean

    /**
     * Gets the promise that will be resolved when the primitive is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#readyPromise">Online Documentation</a>
     */
    val readyPromise: Promise<VoxelPrimitive>

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
     * Gets the voxel dimensions.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#dimensions">Online Documentation</a>
     */
    val dimensions: Cartesian3

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
     * Gets or sets whether or not to jitter the view ray during the raymarch.
     * This reduces stair-step artifacts but introduces noise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelPrimitive.html#jitter">Online Documentation</a>
     */
    var jitter: Boolean

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

inline fun VoxelPrimitive(
    block: VoxelPrimitive.ConstructorOptions.() -> Unit,
): VoxelPrimitive =
    VoxelPrimitive(options = jso(block))
