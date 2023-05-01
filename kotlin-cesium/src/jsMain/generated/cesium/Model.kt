// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import kotlin.js.Promise

/**
 * <div class="notice">
 * To construct a Model, call [Model.fromGltfAsync]. Do not call the constructor directly.
 * </div>
 * A 3D model based on glTF, the runtime asset format for WebGL, OpenGL ES, and OpenGL.
 *
 * Cesium supports glTF assets with the following extensions:
 * - [AGI_articulations](https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Vendor/AGI_articulations/README.md)
 * - [CESIUM_primitive_outline](https://github.com/KhronosGroup/glTF/tree/main/extensions/2.0/Vendor/CESIUM_primitive_outline)
 * - [CESIUM_RTC](https://github.com/KhronosGroup/glTF/blob/master/extensions/1.0/Vendor/CESIUM_RTC/README.md)
 * - [EXT_instance_features](https://github.com/CesiumGS/glTF/tree/3d-tiles-next/extensions/2.0/Vendor/EXT_instance_features)
 * - [EXT_mesh_features](https://github.com/CesiumGS/glTF/tree/3d-tiles-next/extensions/2.0/Vendor/EXT_mesh_features)
 * - [EXT_mesh_gpu_instancing](https://github.com/KhronosGroup/glTF/tree/main/extensions/2.0/Vendor/EXT_mesh_gpu_instancing)
 * - [EXT_meshopt_compression](https://github.com/KhronosGroup/glTF/tree/main/extensions/2.0/Vendor/EXT_meshopt_compression)
 * - [EXT_structural_metadata](https://github.com/CesiumGS/glTF/tree/3d-tiles-next/extensions/2.0/Vendor/EXT_structural_metadata)
 * - [EXT_texture_webp](https://github.com/KhronosGroup/glTF/tree/main/extensions/2.0/Vendor/EXT_texture_webp)
 * - [KHR_draco_mesh_compression](https://github.com/KhronosGroup/glTF/blob/master/extensions/2.0/Khronos/KHR_draco_mesh_compression/README.md)
 * - [KHR_techniques_webgl](https://github.com/KhronosGroup/glTF/blob/main/extensions/2.0/Archived/KHR_techniques_webgl/README.md)
 * - [KHR_materials_common](https://github.com/KhronosGroup/glTF/blob/main/extensions/1.0/Khronos/KHR_materials_common/README.md)
 * - [KHR_materials_pbrSpecularGlossiness](https://github.com/KhronosGroup/glTF/tree/main/extensions/2.0/Archived/KHR_materials_pbrSpecularGlossiness)
 * - [KHR_materials_unlit](https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Khronos/KHR_materials_unlit/README.md)
 * - [KHR_mesh_quantization](https://github.com/KhronosGroup/glTF/tree/main/extensions/2.0/Khronos/KHR_mesh_quantization)
 * - [KHR_texture_basisu](https://github.com/KhronosGroup/glTF/blob/master/extensions/2.0/Khronos/KHR_texture_basisu)
 * - [KHR_texture_transform](https://github.com/KhronosGroup/glTF/blob/master/extensions/2.0/Khronos/KHR_texture_transform/README.md)
 * - [WEB3D_quantized_attributes](https://github.com/KhronosGroup/glTF/blob/main/extensions/1.0/Vendor/WEB3D_quantized_attributes/README.md)
 *
 * Note: for models with compressed textures using the KHR_texture_basisu extension, we recommend power of 2 textures in both dimensions
 * for maximum compatibility. This is because some samplers require power of 2 textures ([Using textures in WebGL](https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Tutorial/Using_textures_in_WebGL))
 * and KHR_texture_basisu requires multiple of 4 dimensions ([KHR_texture_basisu additional requirements](https://github.com/KhronosGroup/glTF/blob/master/extensions/2.0/Khronos/KHR_texture_basisu/README.md#additional-requirements)).
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html">Online Documentation</a>
 */
sealed external class Model {
    /**
     * The 4x4 transformation matrix that transforms the model from model to world coordinates.
     * When this is the identity matrix, the model is drawn in world coordinates, i.e., Earth's Cartesian WGS84 coordinates.
     * Local reference frames can be used by providing a different transformation matrix, like that returned
     * by [Transforms.eastNorthUpToFixedFrame].
     * ```
     * const origin = Cartesian3.fromDegrees(-95.0, 40.0, 200000.0);
     * m.modelMatrix = Transforms.eastNorthUpToFixedFrame(origin);
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#modelMatrix">Online Documentation</a>
     */
    var modelMatrix: Matrix4

    /**
     * Whether to display the outline for models using the
     * [CESIUM_primitive_outline](https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Vendor/CESIUM_primitive_outline) extension.
     * When true, outlines are displayed. When false, outlines are not displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#showOutline">Online Documentation</a>
     */
    var showOutline: Boolean

    /**
     * The color to use when rendering outlines.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#outlineColor">Online Documentation</a>
     */
    var outlineColor: Color

    /**
     * When `true`, this model is ready to render, i.e., the external binary, image,
     * and shader files were downloaded and the WebGL resources were created.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#ready">Online Documentation</a>
     */
    val ready: Boolean

    /**
     * Gets an event that is raised when the model encounters an asynchronous rendering error.  By subscribing
     * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
     * are passed an instance of [ModelError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#errorEvent">Online Documentation</a>
     */
    val errorEvent: DefaultEvent

    /**
     * Gets an event that is raised when the model is loaded and ready for rendering, i.e. when the external resources
     * have been downloaded and the WebGL resources are created. Event listeners
     * are passed an instance of the [Model].
     *
     * If [Model.incrementallyLoadTextures] is true, this event will be raised before all textures are loaded and ready for rendering. Subscribe to [Model.texturesReadyEvent] to be notified when the textures are ready.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#readyEvent">Online Documentation</a>
     */
    val readyEvent: DefaultEvent

    /**
     * Gets an event that, if [Model.incrementallyLoadTextures] is true, is raised when the model textures are loaded and ready for rendering, i.e. when the external resources
     * have been downloaded and the WebGL resources are created. Event listeners
     * are passed an instance of the [Model].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#texturesReadyEvent">Online Documentation</a>
     */
    val texturesReadyEvent: DefaultEvent

    /**
     * Gets the promise that will be resolved when this model is ready to render, i.e. when the external resources
     * have been downloaded and the WebGL resources are created.
     *
     * This promise is resolved at the end of the frame before the first frame the model is rendered in.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#readyPromise">Online Documentation</a>
     */
    val readyPromise: Promise<Model>

    /**
     * The currently playing glTF animations.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#activeAnimations">Online Documentation</a>
     */
    val activeAnimations: ModelAnimationCollection

    /**
     * Determines if the model's animations should hold a pose over frames where no keyframes are specified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#clampAnimations">Online Documentation</a>
     */
    var clampAnimations: Boolean

    /**
     * Point cloud shading settings for controlling point cloud attenuation
     * and lighting. For 3D Tiles, this is inherited from the
     * [Cesium3DTileset].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#pointCloudShading">Online Documentation</a>
     */
    var pointCloudShading: PointCloudShading

    /**
     * The model's custom shader, if it exists. Using custom shaders with a [Cesium3DTileStyle]
     * may lead to undefined behavior.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#customShader">Online Documentation</a>
     */
    var customShader: CustomShader

    /**
     * The height reference of the model, which determines how the model is drawn
     * relative to terrain.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#heightReference">Online Documentation</a>
     */
    var heightReference: HeightReference

    /**
     * Gets or sets the distance display condition, which specifies at what distance
     * from the camera this model will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: DistanceDisplayCondition

    /**
     * A user-defined object that is returned when the model is picked.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#id">Online Documentation</a>
     */
    var id: Any

    /**
     * The style to apply to the features in the model. Cannot be applied if a [CustomShader] is also applied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#style">Online Documentation</a>
     */
    var style: Cesium3DTileStyle

    /**
     * The color to blend with the model's rendered color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#color">Online Documentation</a>
     */
    var color: Color

    /**
     * Defines how the color blends with the model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#colorBlendMode">Online Documentation</a>
     */
    var colorBlendMode: dynamic

    /**
     * Value used to determine the color strength when the `colorBlendMode` is `MIX`. A value of 0.0 results in the model's rendered color while a value of 1.0 results in a solid color, with any value in-between resulting in a mix of the two.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#colorBlendAmount">Online Documentation</a>
     */
    var colorBlendAmount: Double

    /**
     * The silhouette color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#silhouetteColor">Online Documentation</a>
     */
    var silhouetteColor: Color

    /**
     * The size of the silhouette in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#silhouetteSize">Online Documentation</a>
     */
    var silhouetteSize: Double

    /**
     * Gets the model's bounding sphere in world space. This does not take into account
     * glTF animations, skins, or morph targets. It also does not account for
     * [Model.minimumPixelSize].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#boundingSphere">Online Documentation</a>
     */
    val boundingSphere: BoundingSphere

    /**
     * This property is for debugging only; it is not for production use nor is it optimized.
     *
     * Draws the bounding sphere for each draw command in the model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#debugShowBoundingVolume">Online Documentation</a>
     */
    var debugShowBoundingVolume: Boolean

    /**
     * This property is for debugging only; it is not for production use nor is it optimized.
     *
     * Draws the model in wireframe.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#debugWireframe">Online Documentation</a>
     */
    var debugWireframe: Boolean

    /**
     * Whether or not to render the model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#show">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#featureIdLabel">Online Documentation</a>
     */
    var featureIdLabel: String

    /**
     * Label of the instance feature ID set used for picking and styling.
     *
     * If instanceFeatureIdLabel is set to an integer N, it is converted to
     * the string "instanceFeatureId_N" automatically.
     * If both per-primitive and per-instance feature IDs are present, the
     * instance feature IDs take priority.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#instanceFeatureIdLabel">Online Documentation</a>
     */
    var instanceFeatureIdLabel: String

    /**
     * The [ClippingPlaneCollection] used to selectively disable rendering the model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#clippingPlanes">Online Documentation</a>
     */
    var clippingPlanes: ClippingPlaneCollection

    /**
     * The light color when shading the model. When `undefined` the scene's light color is used instead.
     *
     * Disabling additional light sources by setting
     * `model.imageBasedLighting.imageBasedLightingFactor = new Cartesian2(0.0, 0.0)`
     * will make the model much darker. Here, increasing the intensity of the light source will make the model brighter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#lightColor">Online Documentation</a>
     */
    var lightColor: Cartesian3

    /**
     * The properties for managing image-based lighting on this model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#imageBasedLighting">Online Documentation</a>
     */
    var imageBasedLighting: ImageBasedLighting

    /**
     * Whether to cull back-facing geometry. When true, back face culling is
     * determined by the material's doubleSided property; when false, back face
     * culling is disabled. Back faces are not culled if [Model.color]
     * is translucent or [Model.silhouetteSize] is greater than 0.0.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#backFaceCulling">Online Documentation</a>
     */
    var backFaceCulling: Boolean

    /**
     * A uniform scale applied to this model before the [Model.modelMatrix].
     * Values greater than `1.0` increase the size of the model; values
     * less than `1.0` decrease.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#scale">Online Documentation</a>
     */
    var scale: Double

    /**
     * The approximate minimum pixel size of the model regardless of zoom.
     * This can be used to ensure that a model is visible even when the viewer
     * zooms out.  When `0.0`, no minimum size is enforced.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#minimumPixelSize">Online Documentation</a>
     */
    var minimumPixelSize: Double

    /**
     * The maximum scale size for a model. This can be used to give
     * an upper limit to the [Model.minimumPixelSize], ensuring that the model
     * is never an unreasonable scale.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#maximumScale">Online Documentation</a>
     */
    var maximumScale: Double

    /**
     * Determines whether the model casts or receives shadows from light sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#shadows">Online Documentation</a>
     */
    var shadows: ShadowMode

    /**
     * Gets the credit that will be displayed for the model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#credit">Online Documentation</a>
     */
    val credit: Credit

    /**
     * Gets or sets whether the credits of the model will be displayed
     * on the screen.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#showCreditsOnScreen">Online Documentation</a>
     */
    var showCreditsOnScreen: Boolean

    /**
     * The [SplitDirection] to apply to this model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#splitDirection">Online Documentation</a>
     */
    var splitDirection: SplitDirection

    /**
     * Gets the model's classification type. This determines whether terrain,
     * 3D Tiles, or both will be classified by this model.
     *
     * Additionally, there are a few requirements/limitations:
     * - The glTF cannot contain morph targets, skins, or animations.
     * - The glTF cannot contain the `EXT_mesh_gpu_instancing` extension.
     * - Only meshes with TRIANGLES can be used to classify other assets.
     * - The position attribute is required.
     * - If feature IDs and an index buffer are both present, all indices with the same feature id must occupy contiguous sections of the index buffer.
     * - If feature IDs are present without an index buffer, all positions with the same feature id must occupy contiguous sections of the position buffer.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#classificationType">Online Documentation</a>
     */
    val classificationType: ClassificationType

    /**
     * Returns the node with the given `name` in the glTF. This is used to
     * modify a node's transform for user-defined animation.
     * ```
     * // Apply non-uniform scale to node "Hand"
     * const node = model.getNode("Hand");
     * node.matrix = Matrix4.fromScale(new Cartesian3(5.0, 1.0, 1.0), node.matrix);
     * ```
     * @param [name] The name of the node in the glTF.
     * @return The node, or `undefined` if no node with the `name` exists.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#getNode">Online Documentation</a>
     */
    fun getNode(name: String): ModelNode

    /**
     * Sets the current value of an articulation stage.  After setting one or
     * multiple stage values, call Model.applyArticulations() to
     * cause the node matrices to be recalculated.
     * ```
     * // Sets the value of the stage named "MoveX" belonging to the articulation named "SampleArticulation"
     * model.setArticulationStage("SampleArticulation MoveX", 50.0);
     * ```
     * @param [articulationStageKey] The name of the articulation, a space, and the name of the stage.
     * @param [value] The numeric value of this stage of the articulation.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#setArticulationStage">Online Documentation</a>
     */
    fun setArticulationStage(
        articulationStageKey: String,
        value: Double,
    )

    /**
     * Applies any modified articulation stages to the matrix of each node that
     * participates in any articulation. Note that this will overwrite any node
     * transformations on participating nodes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#applyArticulations">Online Documentation</a>
     */
    fun applyArticulations()

    /**
     * Marks the model's [Model.style] as dirty, which forces all features
     * to re-evaluate the style in the next frame the model is visible.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#makeStyleDirty">Online Documentation</a>
     */
    fun makeStyleDirty()

    /**
     * Called when [Viewer] or [CesiumWidget] render the scene to
     * get the draw commands needed to render this primitive.
     *
     * Do not call this function directly.  This is documented just to
     * list the exceptions that may be propagated when the scene is rendered:
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#update">Online Documentation</a>
     */
    fun update()

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#isDestroyed">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#destroy">Online Documentation</a>
     */
    fun destroy()

    companion object {
        /**
         * Creates a model from a glTF asset.  When the model is ready to render, i.e., when the external binary, image,
         * and shader files are downloaded and the WebGL resources are created, the [Model.readyPromise] is resolved.
         *
         * The model can be a traditional glTF asset with a .gltf extension or a Binary glTF using the .glb extension.
         * @return The newly created model.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#.fromGltf">Online Documentation</a>
         */
        fun fromGltf(options: FromGltfOptions): Model

        /**
         * @property [url] The url to the .gltf or .glb file.
         * @property [basePath] The base path that paths in the glTF JSON are relative to.
         *   Default value - `''`
         * @property [show] Whether or not to render the model.
         *   Default value - `true`
         * @property [modelMatrix] The 4x4 transformation matrix that transforms the model from model to world coordinates.
         *   Default value - [Matrix4.IDENTITY]
         * @property [scale] A uniform scale applied to this model.
         *   Default value - `1.0`
         * @property [minimumPixelSize] The approximate minimum pixel size of the model regardless of zoom.
         *   Default value - `0.0`
         * @property [maximumScale] The maximum scale size of a model. An upper limit for minimumPixelSize.
         * @property [id] A user-defined object to return when the model is picked with [Scene.pick].
         * @property [allowPicking] When `true`, each primitive is pickable with [Scene.pick].
         *   Default value - `true`
         * @property [incrementallyLoadTextures] Determine if textures may continue to stream in after the model is loaded.
         *   Default value - `true`
         * @property [asynchronous] Determines if model WebGL resource creation will be spread out over several frames or block until completion once all glTF files are loaded.
         *   Default value - `true`
         * @property [clampAnimations] Determines if the model's animations should hold a pose over frames where no keyframes are specified.
         *   Default value - `true`
         * @property [shadows] Determines whether the model casts or receives shadows from light sources.
         *   Default value - [ShadowMode.ENABLED]
         * @property [releaseGltfJson] When true, the glTF JSON is released once the glTF is loaded. This is is especially useful for cases like 3D Tiles, where each .gltf model is unique and caching the glTF JSON is not effective.
         *   Default value - `false`
         * @property [debugShowBoundingVolume] For debugging only. Draws the bounding sphere for each draw command in the model.
         *   Default value - `false`
         * @property [enableDebugWireframe] For debugging only. This must be set to true for debugWireframe to work in WebGL1. This cannot be set after the model has loaded.
         *   Default value - `false`
         * @property [debugWireframe] For debugging only. Draws the model in wireframe. Will only work for WebGL1 if enableDebugWireframe is set to true.
         *   Default value - `false`
         * @property [cull] Whether or not to cull the model using frustum/horizon culling. If the model is part of a 3D Tiles tileset, this property will always be false, since the 3D Tiles culling system is used.
         *   Default value - `true`
         * @property [opaquePass] The pass to use in the [DrawCommand] for the opaque portions of the model.
         *   Default value - [Pass.OPAQUE]
         * @property [upAxis] The up-axis of the glTF model.
         *   Default value - [Axis.Y]
         * @property [forwardAxis] The forward-axis of the glTF model.
         *   Default value - [Axis.Z]
         * @property [customShader] A custom shader. This will add user-defined GLSL code to the vertex and fragment shaders. Using custom shaders with a [Cesium3DTileStyle] may lead to undefined behavior.
         * @property [content] The tile content this model belongs to. This property will be undefined if model is not loaded as part of a tileset.
         * @property [heightReference] Determines how the model is drawn relative to terrain.
         *   Default value - [HeightReference.NONE]
         * @property [scene] Must be passed in for models that use the height reference property.
         * @property [distanceDisplayCondition] The condition specifying at what distance from the camera that this model will be displayed.
         * @property [color] A color that blends with the model's rendered color.
         * @property [colorBlendMode] Defines how the color blends with the model.
         *   Default value - [ColorBlendMode.HIGHLIGHT]
         * @property [colorBlendAmount] Value used to determine the color strength when the `colorBlendMode` is `MIX`. A value of 0.0 results in the model's rendered color while a value of 1.0 results in a solid color, with any value in-between resulting in a mix of the two.
         *   Default value - `0.5`
         * @property [silhouetteColor] The silhouette color. If more than 256 models have silhouettes enabled, there is a small chance that overlapping models will have minor artifacts.
         *   Default value - [Color.RED]
         * @property [silhouetteSize] The size of the silhouette in pixels.
         *   Default value - `0.0`
         * @property [enableShowOutline] Whether to enable outlines for models using the [CESIUM_primitive_outline](https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Vendor/CESIUM_primitive_outline) extension. This can be set false to avoid post-processing geometry at load time. When false, the showOutlines and outlineColor options are ignored.
         *   Default value - `true`
         * @property [showOutline] Whether to display the outline for models using the [CESIUM_primitive_outline](https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Vendor/CESIUM_primitive_outline) extension. When true, outlines are displayed. When false, outlines are not displayed.
         *   Default value - `true`
         * @property [outlineColor] The color to use when rendering outlines.
         *   Default value - [Color.BLACK]
         * @property [clippingPlanes] The [ClippingPlaneCollection] used to selectively disable rendering the model.
         * @property [lightColor] The light color when shading the model. When `undefined` the scene's light color is used instead.
         * @property [imageBasedLighting] The properties for managing image-based lighting on this model.
         * @property [backFaceCulling] Whether to cull back-facing geometry. When true, back face culling is determined by the material's doubleSided property; when false, back face culling is disabled. Back faces are not culled if the model's color is translucent.
         *   Default value - `true`
         * @property [credit] A credit for the data source, which is displayed on the canvas.
         * @property [showCreditsOnScreen] Whether to display the credits of this model on screen.
         *   Default value - `false`
         * @property [splitDirection] The [SplitDirection] split to apply to this model.
         *   Default value - [SplitDirection.NONE]
         * @property [projectTo2D] Whether to accurately project the model's positions in 2D. If this is true, the model will be projected accurately to 2D, but it will use more memory to do so. If this is false, the model will use less memory and will still render in 2D / CV mode, but its positions may be inaccurate. This disables minimumPixelSize and prevents future modification to the model matrix. This also cannot be set after the model has loaded.
         *   Default value - `false`
         * @property [featureIdLabel] Label of the feature ID set to use for picking and styling. For EXT_mesh_features, this is the feature ID's label property, or "featureId_N" (where N is the index in the featureIds array) when not specified. EXT_feature_metadata did not have a label field, so such feature ID sets are always labeled "featureId_N" where N is the index in the list of all feature Ids, where feature ID attributes are listed before feature ID textures. If featureIdLabel is an integer N, it is converted to the string "featureId_N" automatically. If both per-primitive and per-instance feature IDs are present, the instance feature IDs take priority.
         *   Default value - `"featureId_0"`
         * @property [instanceFeatureIdLabel] Label of the instance feature ID set used for picking and styling. If instanceFeatureIdLabel is set to an integer N, it is converted to the string "instanceFeatureId_N" automatically. If both per-primitive and per-instance feature IDs are present, the instance feature IDs take priority.
         *   Default value - `"instanceFeatureId_0"`
         * @property [pointCloudShading] Options for constructing a [PointCloudShading] object to control point attenuation and lighting.
         * @property [classificationType] Determines whether terrain, 3D Tiles or both will be classified by this model. This cannot be set after the model has loaded.
         */
        interface FromGltfOptions {
            var url: Resource
            var basePath: Resource?
            var show: Boolean?
            var modelMatrix: Matrix4?
            var scale: Double?
            var minimumPixelSize: Double?
            var maximumScale: Double?
            var id: Any?
            var allowPicking: Boolean?
            var incrementallyLoadTextures: Boolean?
            var asynchronous: Boolean?
            var clampAnimations: Boolean?
            var shadows: ShadowMode?
            var releaseGltfJson: Boolean?
            var debugShowBoundingVolume: Boolean?
            var enableDebugWireframe: Boolean?
            var debugWireframe: Boolean?
            var cull: Boolean?
            var opaquePass: Boolean?
            var upAxis: Axis?
            var forwardAxis: Axis?
            var customShader: CustomShader?
            var content: Cesium3DTileContent?
            var heightReference: HeightReference?
            var scene: Scene?
            var distanceDisplayCondition: DistanceDisplayCondition?
            var color: Color?
            var colorBlendMode: ColorBlendMode?
            var colorBlendAmount: Double?
            var silhouetteColor: Color?
            var silhouetteSize: Double?
            var enableShowOutline: Boolean?
            var showOutline: Boolean?
            var outlineColor: Color?
            var clippingPlanes: ClippingPlaneCollection?
            var lightColor: Cartesian3?
            var imageBasedLighting: ImageBasedLighting?
            var backFaceCulling: Boolean?
            var credit: Credit?
            var showCreditsOnScreen: Boolean?
            var splitDirection: SplitDirection?
            var projectTo2D: Boolean?
            var featureIdLabel: String?
            var instanceFeatureIdLabel: String?
            var pointCloudShading: Any?
            var classificationType: ClassificationType?
        }

        /**
         * Asynchronously creates a model from a glTF asset. This function returns a promise that resolves when the model is ready to render, i.e., when the external binary, image,
         * and shader files are downloaded and the WebGL resources are created.
         *
         * The model can be a traditional glTF asset with a .gltf extension or a Binary glTF using the .glb extension.
         * ```
         * // Load a model and add it to the scene
         * try {
         *  const model = await Model.fromGltfAsync({
         *    url: "../../SampleData/models/CesiumMan/Cesium_Man.glb"
         *  });
         *  viewer.scene.primitives.add(model);
         * } catch (error) {
         *  console.log(`Failed to load model. ${error}`);
         * }
         * ```
         * ```
         * // Position a model with modelMatrix and display it with a minimum size of 128 pixels
         * const position = Cartesian3.fromDegrees(
         *   -123.0744619,
         *   44.0503706,
         *   5000.0
         * );
         * const headingPositionRoll = new HeadingPitchRoll();
         * const fixedFrameTransform = Transforms.localFrameToFixedFrameGenerator(
         *   "north",
         *   "west"
         * );
         * try {
         *  const model = await Model.fromGltfAsync({
         *    url: "../../SampleData/models/CesiumAir/Cesium_Air.glb",
         *    modelMatrix: Transforms.headingPitchRollToFixedFrame(
         *      position,
         *      headingPositionRoll,
         *      Ellipsoid.WGS84,
         *      fixedFrameTransform
         *    ),
         *    minimumPixelSize: 128,
         *  });
         *  viewer.scene.primitives.add(model);
         * } catch (error) {
         *  console.log(`Failed to load model. ${error}`);
         * }
         * ```
         * ```
         * // Load a model and play the last animation at half speed
         * let animations;
         * try {
         *  const model = await Model.fromGltfAsync({
         *    url: "../../SampleData/models/CesiumMan/Cesium_Man.glb",
         *    gltfCallback: gltf => {
         *      animations = gltf.animations
         *    }
         *  });
         *  viewer.scene.primitives.add(model);
         *  model.readyEvent.addEventListener(() => {
         *    model.activeAnimations.add({
         *      index: animations.length - 1,
         *      loop: ModelAnimationLoop.REPEAT,
         *      multiplier: 0.5,
         *    });
         *  });
         * } catch (error) {
         *  console.log(`Failed to load model. ${error}`);
         * }
         * ```
         * @return A promise that resolves to the created model when it is ready to render.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#.fromGltfAsync">Online Documentation</a>
         */
        fun fromGltfAsync(options: FromGltfAsyncOptions): Promise<Model>

        /**
         * @property [url] The url to the .gltf or .glb file.
         * @property [basePath] The base path that paths in the glTF JSON are relative to.
         *   Default value - `''`
         * @property [show] Whether or not to render the model.
         *   Default value - `true`
         * @property [modelMatrix] The 4x4 transformation matrix that transforms the model from model to world coordinates.
         *   Default value - [Matrix4.IDENTITY]
         * @property [scale] A uniform scale applied to this model.
         *   Default value - `1.0`
         * @property [minimumPixelSize] The approximate minimum pixel size of the model regardless of zoom.
         *   Default value - `0.0`
         * @property [maximumScale] The maximum scale size of a model. An upper limit for minimumPixelSize.
         * @property [id] A user-defined object to return when the model is picked with [Scene.pick].
         * @property [allowPicking] When `true`, each primitive is pickable with [Scene.pick].
         *   Default value - `true`
         * @property [incrementallyLoadTextures] Determine if textures may continue to stream in after the model is loaded.
         *   Default value - `true`
         * @property [asynchronous] Determines if model WebGL resource creation will be spread out over several frames or block until completion once all glTF files are loaded.
         *   Default value - `true`
         * @property [clampAnimations] Determines if the model's animations should hold a pose over frames where no keyframes are specified.
         *   Default value - `true`
         * @property [shadows] Determines whether the model casts or receives shadows from light sources.
         *   Default value - [ShadowMode.ENABLED]
         * @property [releaseGltfJson] When true, the glTF JSON is released once the glTF is loaded. This is is especially useful for cases like 3D Tiles, where each .gltf model is unique and caching the glTF JSON is not effective.
         *   Default value - `false`
         * @property [debugShowBoundingVolume] For debugging only. Draws the bounding sphere for each draw command in the model.
         *   Default value - `false`
         * @property [enableDebugWireframe] For debugging only. This must be set to true for debugWireframe to work in WebGL1. This cannot be set after the model has loaded.
         *   Default value - `false`
         * @property [debugWireframe] For debugging only. Draws the model in wireframe. Will only work for WebGL1 if enableDebugWireframe is set to true.
         *   Default value - `false`
         * @property [cull] Whether or not to cull the model using frustum/horizon culling. If the model is part of a 3D Tiles tileset, this property will always be false, since the 3D Tiles culling system is used.
         *   Default value - `true`
         * @property [opaquePass] The pass to use in the [DrawCommand] for the opaque portions of the model.
         *   Default value - [Pass.OPAQUE]
         * @property [upAxis] The up-axis of the glTF model.
         *   Default value - [Axis.Y]
         * @property [forwardAxis] The forward-axis of the glTF model.
         *   Default value - [Axis.Z]
         * @property [customShader] A custom shader. This will add user-defined GLSL code to the vertex and fragment shaders. Using custom shaders with a [Cesium3DTileStyle] may lead to undefined behavior.
         * @property [content] The tile content this model belongs to. This property will be undefined if model is not loaded as part of a tileset.
         * @property [heightReference] Determines how the model is drawn relative to terrain.
         *   Default value - [HeightReference.NONE]
         * @property [scene] Must be passed in for models that use the height reference property.
         * @property [distanceDisplayCondition] The condition specifying at what distance from the camera that this model will be displayed.
         * @property [color] A color that blends with the model's rendered color.
         * @property [colorBlendMode] Defines how the color blends with the model.
         *   Default value - [ColorBlendMode.HIGHLIGHT]
         * @property [colorBlendAmount] Value used to determine the color strength when the `colorBlendMode` is `MIX`. A value of 0.0 results in the model's rendered color while a value of 1.0 results in a solid color, with any value in-between resulting in a mix of the two.
         *   Default value - `0.5`
         * @property [silhouetteColor] The silhouette color. If more than 256 models have silhouettes enabled, there is a small chance that overlapping models will have minor artifacts.
         *   Default value - [Color.RED]
         * @property [silhouetteSize] The size of the silhouette in pixels.
         *   Default value - `0.0`
         * @property [enableShowOutline] Whether to enable outlines for models using the [CESIUM_primitive_outline](https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Vendor/CESIUM_primitive_outline) extension. This can be set false to avoid post-processing geometry at load time. When false, the showOutlines and outlineColor options are ignored.
         *   Default value - `true`
         * @property [showOutline] Whether to display the outline for models using the [CESIUM_primitive_outline](https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Vendor/CESIUM_primitive_outline) extension. When true, outlines are displayed. When false, outlines are not displayed.
         *   Default value - `true`
         * @property [outlineColor] The color to use when rendering outlines.
         *   Default value - [Color.BLACK]
         * @property [clippingPlanes] The [ClippingPlaneCollection] used to selectively disable rendering the model.
         * @property [lightColor] The light color when shading the model. When `undefined` the scene's light color is used instead.
         * @property [imageBasedLighting] The properties for managing image-based lighting on this model.
         * @property [backFaceCulling] Whether to cull back-facing geometry. When true, back face culling is determined by the material's doubleSided property; when false, back face culling is disabled. Back faces are not culled if the model's color is translucent.
         *   Default value - `true`
         * @property [credit] A credit for the data source, which is displayed on the canvas.
         * @property [showCreditsOnScreen] Whether to display the credits of this model on screen.
         *   Default value - `false`
         * @property [splitDirection] The [SplitDirection] split to apply to this model.
         *   Default value - [SplitDirection.NONE]
         * @property [projectTo2D] Whether to accurately project the model's positions in 2D. If this is true, the model will be projected accurately to 2D, but it will use more memory to do so. If this is false, the model will use less memory and will still render in 2D / CV mode, but its positions may be inaccurate. This disables minimumPixelSize and prevents future modification to the model matrix. This also cannot be set after the model has loaded.
         *   Default value - `false`
         * @property [featureIdLabel] Label of the feature ID set to use for picking and styling. For EXT_mesh_features, this is the feature ID's label property, or "featureId_N" (where N is the index in the featureIds array) when not specified. EXT_feature_metadata did not have a label field, so such feature ID sets are always labeled "featureId_N" where N is the index in the list of all feature Ids, where feature ID attributes are listed before feature ID textures. If featureIdLabel is an integer N, it is converted to the string "featureId_N" automatically. If both per-primitive and per-instance feature IDs are present, the instance feature IDs take priority.
         *   Default value - `"featureId_0"`
         * @property [instanceFeatureIdLabel] Label of the instance feature ID set used for picking and styling. If instanceFeatureIdLabel is set to an integer N, it is converted to the string "instanceFeatureId_N" automatically. If both per-primitive and per-instance feature IDs are present, the instance feature IDs take priority.
         *   Default value - `"instanceFeatureId_0"`
         * @property [pointCloudShading] Options for constructing a [PointCloudShading] object to control point attenuation and lighting.
         * @property [classificationType] Determines whether terrain, 3D Tiles or both will be classified by this model. This cannot be set after the model has loaded.
         * @property [gltfCallback] A function that is called with the loaded gltf object once loaded.
         */
        interface FromGltfAsyncOptions {
            var url: Resource
            var basePath: Resource?
            var show: Boolean?
            var modelMatrix: Matrix4?
            var scale: Double?
            var minimumPixelSize: Double?
            var maximumScale: Double?
            var id: Any?
            var allowPicking: Boolean?
            var incrementallyLoadTextures: Boolean?
            var asynchronous: Boolean?
            var clampAnimations: Boolean?
            var shadows: ShadowMode?
            var releaseGltfJson: Boolean?
            var debugShowBoundingVolume: Boolean?
            var enableDebugWireframe: Boolean?
            var debugWireframe: Boolean?
            var cull: Boolean?
            var opaquePass: Boolean?
            var upAxis: Axis?
            var forwardAxis: Axis?
            var customShader: CustomShader?
            var content: Cesium3DTileContent?
            var heightReference: HeightReference?
            var scene: Scene?
            var distanceDisplayCondition: DistanceDisplayCondition?
            var color: Color?
            var colorBlendMode: ColorBlendMode?
            var colorBlendAmount: Double?
            var silhouetteColor: Color?
            var silhouetteSize: Double?
            var enableShowOutline: Boolean?
            var showOutline: Boolean?
            var outlineColor: Color?
            var clippingPlanes: ClippingPlaneCollection?
            var lightColor: Cartesian3?
            var imageBasedLighting: ImageBasedLighting?
            var backFaceCulling: Boolean?
            var credit: Credit?
            var showCreditsOnScreen: Boolean?
            var splitDirection: SplitDirection?
            var projectTo2D: Boolean?
            var featureIdLabel: String?
            var instanceFeatureIdLabel: String?
            var pointCloudShading: Any?
            var classificationType: ClassificationType?
            var gltfCallback: GltfCallback?
        }
    }
}

/**
 * Interface for the function that is called with the loaded gltf object once loaded.
 * @param [gltf] The gltf object
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#.GltfCallback">Online Documentation</a>
 */
typealias GltfCallback = (gltf: Any) -> Unit
