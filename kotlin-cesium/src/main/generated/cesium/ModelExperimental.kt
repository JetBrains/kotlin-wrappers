// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A 3D model. This is a new architecture that is more decoupled than the older [Model]. This class is still experimental.
 *
 * Do not call this function directly, instead use the `from` functions to create
 * the Model from your source data type.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html">Online Documentation</a>
 */
external class ModelExperimental(options: ConstructorOptions) {
    /**
     * @property [resource] The Resource to the 3D model.
     * @property [modelMatrix] The 4x4 transformation matrix that transforms the model from model to world coordinates.
     *   Default value - [Matrix4.IDENTITY]
     * @property [scale] A uniform scale applied to this model.
     *   Default value - `1.0`
     * @property [minimumPixelSize] The approximate minimum pixel size of the model regardless of zoom.
     *   Default value - `0.0`
     * @property [maximumScale] The maximum scale size of a model. An upper limit for minimumPixelSize.
     * @property [debugShowBoundingVolume] For debugging only. Draws the bounding sphere for each draw command in the model.
     *   Default value - `false`
     * @property [cull] Whether or not to cull the model using frustum/horizon culling. If the model is part of a 3D Tiles tileset, this property will always be false, since the 3D Tiles culling system is used.
     *   Default value - `true`
     * @property [opaquePass] The pass to use in the [DrawCommand] for the opaque portions of the model.
     *   Default value - [Pass.OPAQUE]
     * @property [allowPicking] When `true`, each primitive is pickable with [Scene.pick].
     *   Default value - `true`
     * @property [customShader] A custom shader. This will add user-defined GLSL code to the vertex and fragment shaders. Using custom shaders with a [Cesium3DTileStyle] may lead to undefined behavior.
     * @property [content] The tile content this model belongs to. This property will be undefined if model is not loaded as part of a tileset.
     * @property [show] Whether or not to render the model.
     *   Default value - `true`
     * @property [color] A color that blends with the model's rendered color.
     * @property [colorBlendMode] Defines how the color blends with the model.
     *   Default value - [ColorBlendMode.HIGHLIGHT]
     * @property [colorBlendAmount] Value used to determine the color strength when the `colorBlendMode` is `MIX`. A value of 0.0 results in the model's rendered color while a value of 1.0 results in a solid color, with any value in-between resulting in a mix of the two.
     *   Default value - `0.5`
     * @property [featureIdLabel] Label of the feature ID set to use for picking and styling. For EXT_mesh_features, this is the feature ID's label property, or "featureId_N" (where N is the index in the featureIds array) when not specified. EXT_feature_metadata did not have a label field, so such feature ID sets are always labeled "featureId_N" where N is the index in the list of all feature Ids, where feature ID attributes are listed before feature ID textures. If featureIdLabel is an integer N, it is converted to the string "featureId_N" automatically. If both per-primitive and per-instance feature IDs are present, the instance feature IDs take priority.
     *   Default value - `"featureId_0"`
     * @property [instanceFeatureIdLabel] Label of the instance feature ID set used for picking and styling. If instanceFeatureIdLabel is set to an integer N, it is converted to the string "instanceFeatureId_N" automatically. If both per-primitive and per-instance feature IDs are present, the instance feature IDs take priority.
     *   Default value - `"instanceFeatureId_0"`
     * @property [pointCloudShading] Options for constructing a [PointCloudShading] object to control point attenuation based on geometric error and lighting.
     * @property [clippingPlanes] The [ClippingPlaneCollection] used to selectively disable rendering the model.
     * @property [lightColor] The light color when shading the model. When `undefined` the scene's light color is used instead.
     * @property [imageBasedLighting] The properties for managing image-based lighting on this model.
     * @property [backFaceCulling] Whether to cull back-facing geometry. When true, back face culling is determined by the material's doubleSided property; when false, back face culling is disabled. Back faces are not culled if the model's color is translucent.
     *   Default value - `true`
     * @property [shadows] Determines whether the model casts or receives shadows from light sources.
     *   Default value - [ShadowMode.ENABLED]
     * @property [showCreditsOnScreen] Whether to display the credits of this model on screen.
     *   Default value - `false`
     * @property [splitDirection] The [SplitDirection] split to apply to this model.
     *   Default value - [SplitDirection.NONE]
     */
    interface ConstructorOptions {
        var resource: Resource
        var modelMatrix: Matrix4?
        var scale: Double?
        var minimumPixelSize: Double?
        var maximumScale: Double?
        var debugShowBoundingVolume: Boolean?
        var cull: Boolean?
        var opaquePass: Boolean?
        var allowPicking: Boolean?
        var customShader: CustomShader?
        var content: Cesium3DTileContent?
        var show: Boolean?
        var color: Color?
        var colorBlendMode: ColorBlendMode?
        var colorBlendAmount: Double?
        var featureIdLabel: dynamic
        var instanceFeatureIdLabel: dynamic
        var pointCloudShading: Any?
        var clippingPlanes: ClippingPlaneCollection?
        var lightColor: Cartesian3?
        var imageBasedLighting: ImageBasedLighting?
        var backFaceCulling: Boolean?
        var shadows: ShadowMode?
        var showCreditsOnScreen: Boolean?
        var splitDirection: SplitDirection?
    }

    /**
     * When `true`, this model is ready to render, i.e., the external binary, image,
     * and shader files were downloaded and the WebGL resources were created.  This is set to
     * `true` right before [ModelExperimental.readyPromise] is resolved.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#ready">Online Documentation</a>
     */
    val ready: Boolean

    /**
     * Gets the promise that will be resolved when this model is ready to render, i.e. when the external resources
     * have been downloaded and the WebGL resources are created.
     *
     * This promise is resolved at the end of the frame before the first frame the model is rendered in.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#readyPromise">Online Documentation</a>
     */
    val readyPromise: kotlin.js.Promise<ModelExperimental>

    /**
     * Point cloud shading settings for controlling point cloud attenuation
     * and lighting. For 3D Tiles, this is inherited from the
     * [Cesium3DTileset].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#pointCloudShading">Online Documentation</a>
     */
    var pointCloudShading: PointCloudShading

    /**
     * The model's custom shader, if it exists. Using custom shaders with a [Cesium3DTileStyle]
     * may lead to undefined behavior.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#customShader">Online Documentation</a>
     */
    var customShader: CustomShader

    /**
     * The color to blend with the model's rendered color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#color">Online Documentation</a>
     */
    var color: Color

    /**
     * Defines how the color blends with the model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#colorBlendMode">Online Documentation</a>
     */
    var colorBlendMode: dynamic

    /**
     * Value used to determine the color strength when the `colorBlendMode` is `MIX`. A value of 0.0 results in the model's rendered color while a value of 1.0 results in a solid color, with any value in-between resulting in a mix of the two.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#colorBlendAmount">Online Documentation</a>
     */
    var colorBlendAmount: Double

    /**
     * Gets the model's bounding sphere.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#boundingSphere">Online Documentation</a>
     */
    val boundingSphere: BoundingSphere

    /**
     * This property is for debugging only; it is not for production use nor is it optimized.
     *
     * Draws the bounding sphere for each draw command in the model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#debugShowBoundingVolume">Online Documentation</a>
     */
    var debugShowBoundingVolume: Boolean

    /**
     * Whether or not to render the model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Label of the feature ID set to use for picking and styling.
     *
     * For EXT_mesh_features, this is the feature ID's label property, or
     * "featureId_N" (where N is the index in the featureIds array) when not
     * specified. EXT_feature_metadata did not have a label field, so such
     * feature ID sets are always labeled "featureId_N" where N is the index in
     * the list of all feature Ids, where feature ID attributes are listed before
     * feature ID textures.
     *
     * If featureIdLabel is set to an integer N, it is converted to
     * the string "featureId_N" automatically. If both per-primitive and
     * per-instance feature IDs are present, the instance feature IDs take
     * priority.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#featureIdLabel">Online Documentation</a>
     */
    var featureIdLabel: String

    /**
     * Label of the instance feature ID set used for picking and styling.
     *
     * If instanceFeatureIdLabel is set to an integer N, it is converted to
     * the string "instanceFeatureId_N" automatically.
     * If both per-primitive and per-instance feature IDs are present, the
     * instance feature IDs take priority.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#instanceFeatureIdLabel">Online Documentation</a>
     */
    var instanceFeatureIdLabel: String

    /**
     * The [ClippingPlaneCollection] used to selectively disable rendering the model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#clippingPlanes">Online Documentation</a>
     */
    var clippingPlanes: ClippingPlaneCollection

    /**
     * The light color when shading the model. When `undefined` the scene's light color is used instead.
     *
     * Disabling additional light sources by setting `model.imageBasedLightingFactor = new Cartesian2(0.0, 0.0)` will make the
     * model much darker. Here, increasing the intensity of the light source will make the model brighter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#lightColor">Online Documentation</a>
     */
    var lightColor: Cartesian3

    /**
     * The properties for managing image-based lighting on this model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#imageBasedLighting">Online Documentation</a>
     */
    var imageBasedLighting: ImageBasedLighting

    /**
     * Whether to cull back-facing geometry. When true, back face culling is
     * determined by the material's doubleSided property; when false, back face
     * culling is disabled. Back faces are not culled if the model's color is
     * translucent.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#backFaceCulling">Online Documentation</a>
     */
    var backFaceCulling: Boolean

    /**
     * A uniform scale applied to this model before the [Model.modelMatrix].
     * Values greater than `1.0` increase the size of the model; values
     * less than `1.0` decrease.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#scale">Online Documentation</a>
     */
    var scale: Double

    /**
     * The approximate minimum pixel size of the model regardless of zoom.
     * This can be used to ensure that a model is visible even when the viewer
     * zooms out.  When `0.0`, no minimum size is enforced.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#minimumPixelSize">Online Documentation</a>
     */
    var minimumPixelSize: Double

    /**
     * The maximum scale size for a model. This can be used to give
     * an upper limit to the [Model.minimumPixelSize], ensuring that the model
     * is never an unreasonable scale.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#maximumScale">Online Documentation</a>
     */
    var maximumScale: Double

    /**
     * Determines whether the model casts or receives shadows from light sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#shadows">Online Documentation</a>
     */
    var shadows: ShadowMode

    /**
     * Gets or sets whether the credits of the model will be displayed on the screen
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#showCreditsOnScreen">Online Documentation</a>
     */
    var showCreditsOnScreen: Boolean

    /**
     * The [SplitDirection] to apply to this model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#splitDirection">Online Documentation</a>
     */
    var splitDirection: SplitDirection

    /**
     * Called when [Viewer] or [CesiumWidget] render the scene to
     * get the draw commands needed to render this primitive.
     *
     * Do not call this function directly.  This is documented just to
     * list the exceptions that may be propagated when the scene is rendered:
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#update">Online Documentation</a>
     */
    fun update()

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#isDestroyed">Online Documentation</a>
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
     * model = model && model.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#destroy">Online Documentation</a>
     */
    fun destroy()

    companion object {
        /**
         * Creates a model from a glTF asset.  When the model is ready to render, i.e., when the external binary, image,
         * and shader files are downloaded and the WebGL resources are created, the [Model.readyPromise] is resolved.
         *
         * The model can be a traditional glTF asset with a .gltf extension or a Binary glTF using the .glb extension.
         * @return The newly created model.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelExperimental.html#.fromGltf">Online Documentation</a>
         */
        fun fromGltf(options: FromGltfOptions): ModelExperimental

        /**
         * @property [gltf] A Resource/URL to a glTF/glb file, a binary glTF buffer, or a JSON object containing the glTF contents
         * @property [basePath] The base path that paths in the glTF JSON are relative to.
         *   Default value - `''`
         * @property [modelMatrix] The 4x4 transformation matrix that transforms the model from model to world coordinates.
         *   Default value - [Matrix4.IDENTITY]
         * @property [scale] A uniform scale applied to this model.
         *   Default value - `1.0`
         * @property [minimumPixelSize] The approximate minimum pixel size of the model regardless of zoom.
         *   Default value - `0.0`
         * @property [maximumScale] The maximum scale size of a model. An upper limit for minimumPixelSize.
         * @property [incrementallyLoadTextures] Determine if textures may continue to stream in after the model is loaded.
         *   Default value - `true`
         * @property [releaseGltfJson] When true, the glTF JSON is released once the glTF is loaded. This is is especially useful for cases like 3D Tiles, where each .gltf model is unique and caching the glTF JSON is not effective.
         *   Default value - `false`
         * @property [debugShowBoundingVolume] For debugging only. Draws the bounding sphere for each draw command in the model.
         *   Default value - `false`
         * @property [cull] Whether or not to cull the model using frustum/horizon culling. If the model is part of a 3D Tiles tileset, this property will always be false, since the 3D Tiles culling system is used.
         *   Default value - `true`
         * @property [opaquePass] The pass to use in the [DrawCommand] for the opaque portions of the model.
         *   Default value - [Pass.OPAQUE]
         * @property [upAxis] The up-axis of the glTF model.
         *   Default value - [Axis.Y]
         * @property [forwardAxis] The forward-axis of the glTF model.
         *   Default value - [Axis.Z]
         * @property [allowPicking] When `true`, each primitive is pickable with [Scene.pick].
         *   Default value - `true`
         * @property [customShader] A custom shader. This will add user-defined GLSL code to the vertex and fragment shaders. Using custom shaders with a [Cesium3DTileStyle] may lead to undefined behavior.
         * @property [content] The tile content this model belongs to. This property will be undefined if model is not loaded as part of a tileset.
         * @property [show] Whether or not to render the model.
         *   Default value - `true`
         * @property [color] A color that blends with the model's rendered color.
         * @property [colorBlendMode] Defines how the color blends with the model.
         *   Default value - [ColorBlendMode.HIGHLIGHT]
         * @property [colorBlendAmount] Value used to determine the color strength when the `colorBlendMode` is `MIX`. A value of 0.0 results in the model's rendered color while a value of 1.0 results in a solid color, with any value in-between resulting in a mix of the two.
         *   Default value - `0.5`
         * @property [featureIdLabel] Label of the feature ID set to use for picking and styling. For EXT_mesh_features, this is the feature ID's label property, or "featureId_N" (where N is the index in the featureIds array) when not specified. EXT_feature_metadata did not have a label field, so such feature ID sets are always labeled "featureId_N" where N is the index in the list of all feature Ids, where feature ID attributes are listed before feature ID textures. If featureIdLabel is an integer N, it is converted to the string "featureId_N" automatically. If both per-primitive and per-instance feature IDs are present, the instance feature IDs take priority.
         *   Default value - `"featureId_0"`
         * @property [instanceFeatureIdLabel] Label of the instance feature ID set used for picking and styling. If instanceFeatureIdLabel is set to an integer N, it is converted to the string "instanceFeatureId_N" automatically. If both per-primitive and per-instance feature IDs are present, the instance feature IDs take priority.
         *   Default value - `"instanceFeatureId_0"`
         * @property [pointCloudShading] Options for constructing a [PointCloudShading] object to control point attenuation and lighting.
         * @property [clippingPlanes] The [ClippingPlaneCollection] used to selectively disable rendering the model.
         * @property [lightColor] The light color when shading the model. When `undefined` the scene's light color is used instead.
         * @property [imageBasedLighting] The properties for managing image-based lighting on this model.
         * @property [backFaceCulling] Whether to cull back-facing geometry. When true, back face culling is determined by the material's doubleSided property; when false, back face culling is disabled. Back faces are not culled if the model's color is translucent.
         *   Default value - `true`
         * @property [shadows] Determines whether the model casts or receives shadows from light sources.
         *   Default value - [ShadowMode.ENABLED]
         * @property [showCreditsOnScreen] Whether to display the credits of this model on screen.
         *   Default value - `false`
         * @property [splitDirection] The [SplitDirection] split to apply to this model.
         *   Default value - [SplitDirection.NONE]
         */
        interface FromGltfOptions {
            var gltf: dynamic
            var basePath: Resource?
            var modelMatrix: Matrix4?
            var scale: Double?
            var minimumPixelSize: Double?
            var maximumScale: Double?
            var incrementallyLoadTextures: Boolean?
            var releaseGltfJson: Boolean?
            var debugShowBoundingVolume: Boolean?
            var cull: Boolean?
            var opaquePass: Boolean?
            var upAxis: Axis?
            var forwardAxis: Axis?
            var allowPicking: Boolean?
            var customShader: CustomShader?
            var content: Cesium3DTileContent?
            var show: Boolean?
            var color: Color?
            var colorBlendMode: ColorBlendMode?
            var colorBlendAmount: Double?
            var featureIdLabel: dynamic
            var instanceFeatureIdLabel: dynamic
            var pointCloudShading: Any?
            var clippingPlanes: ClippingPlaneCollection?
            var lightColor: Cartesian3?
            var imageBasedLighting: ImageBasedLighting?
            var backFaceCulling: Boolean?
            var shadows: ShadowMode?
            var showCreditsOnScreen: Boolean?
            var splitDirection: SplitDirection?
        }
    }
}

inline fun ModelExperimental(
    block: ModelExperimental.ConstructorOptions.() -> Unit,
): ModelExperimental {
    val options: ModelExperimental.ConstructorOptions = js("({})")
    block(options)
    return ModelExperimental(options)
}
