// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A 3D model based on glTF, the runtime asset format for WebGL, OpenGL ES, and OpenGL.
 *
 * Cesium includes support for geometry and materials, glTF animations, and glTF skinning.
 * In addition, individual glTF nodes are pickable with [Scene.pick] and animatable
 * with [Model.getNode].  glTF cameras and lights are not currently supported.
 *
 * An external glTF asset is created with [Model.fromGltf].  glTF JSON can also be
 * created at runtime and passed to this constructor function.  In either case, the
 * [Model.readyPromise] is resolved when the model is ready to render, i.e.,
 * when the external binary, image, and shader files are downloaded and the WebGL
 * resources are created.
 *
 * Cesium supports glTF assets with the following extensions:
 * - [KHR_binary_glTF (glTF 1.0)](https://github.com/KhronosGroup/glTF/blob/master/extensions/1.0/Khronos/KHR_binary_glTF/README.md)
 * - [KHR_materials_common (glTF 1.0)](https://github.com/KhronosGroup/glTF/blob/master/extensions/1.0/Khronos/KHR_materials_common/README.md)
 * - [WEB3D_quantized_attributes (glTF 1.0)](https://github.com/KhronosGroup/glTF/blob/master/extensions/1.0/Vendor/WEB3D_quantized_attributes/README.md)
 * - [AGI_articulations](https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Vendor/AGI_articulations/README.md)
 * - [KHR_blend (draft)](https://github.com/KhronosGroup/glTF/pull/1302)
 * - [KHR_draco_mesh_compression](https://github.com/KhronosGroup/glTF/blob/master/extensions/2.0/Khronos/KHR_draco_mesh_compression/README.md)
 * - [KHR_materials_pbrSpecularGlossiness](https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Khronos/KHR_materials_pbrSpecularGlossiness/README.md)
 * - [KHR_materials_unlit](https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Khronos/KHR_materials_unlit/README.md)
 * - [KHR_techniques_webgl](https://github.com/KhronosGroup/glTF/blob/master/extensions/2.0/Khronos/KHR_techniques_webgl/README.md)
 * - [KHR_texture_transform](https://github.com/KhronosGroup/glTF/blob/master/extensions/2.0/Khronos/KHR_texture_transform/README.md)
 * - [KHR_texture_basisu](https://github.com/KhronosGroup/glTF/blob/master/extensions/2.0/Khronos/KHR_texture_basisu)
 *
 * Note: for models with compressed textures using the KHR_texture_basisu extension, we recommend power of 2 textures in both dimensions
 * for maximum compatibility. This is because some samplers require power of 2 textures ([Using textures in WebGL](https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Tutorial/Using_textures_in_WebGL))
 * and KHR_texture_basisu requires multiple of 4 dimensions ([KHR_texture_basisu additional requirements](https://github.com/KhronosGroup/glTF/blob/master/extensions/2.0/Khronos/KHR_texture_basisu/README.md#additional-requirements)).
 *
 * For high-precision rendering, Cesium supports the [CESIUM_RTC](https://github.com/KhronosGroup/glTF/blob/master/extensions/1.0/Vendor/CESIUM_RTC/README.md) extension, which introduces the
 * CESIUM_RTC_MODELVIEW parameter semantic that says the node is in WGS84 coordinates translated
 * relative to a local origin.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html">Online Documentation</a>
 */
external class Model(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [gltf] A glTF JSON object, or a binary glTF buffer.
     * @property [basePath] The base path that paths in the glTF JSON are relative to.
     *   Default value - `''`
     * @property [show] Determines if the model primitive will be shown.
     *   Default value - `true`
     * @property [modelMatrix] The 4x4 transformation matrix that transforms the model from model to world coordinates.
     *   Default value - [Matrix4.IDENTITY]
     * @property [scale] A uniform scale applied to this model.
     *   Default value - `1.0`
     * @property [minimumPixelSize] The approximate minimum pixel size of the model regardless of zoom.
     *   Default value - `0.0`
     * @property [maximumScale] The maximum scale size of a model. An upper limit for minimumPixelSize.
     * @property [id] A user-defined object to return when the model is picked with [Scene.pick].
     * @property [allowPicking] When `true`, each glTF mesh and primitive is pickable with [Scene.pick].
     *   Default value - `true`
     * @property [incrementallyLoadTextures] Determine if textures may continue to stream in after the model is loaded.
     *   Default value - `true`
     * @property [asynchronous] Determines if model WebGL resource creation will be spread out over several frames or block until completion once all glTF files are loaded.
     *   Default value - `true`
     * @property [clampAnimations] Determines if the model's animations should hold a pose over frames where no keyframes are specified.
     *   Default value - `true`
     * @property [shadows] Determines whether the model casts or receives shadows from light sources.
     *   Default value - [ShadowMode.ENABLED]
     * @property [debugShowBoundingVolume] For debugging only. Draws the bounding sphere for each draw command in the model.
     *   Default value - `false`
     * @property [debugWireframe] For debugging only. Draws the model in wireframe.
     *   Default value - `false`
     * @property [heightReference] Determines how the model is drawn relative to terrain.
     *   Default value - [HeightReference.NONE]
     * @property [scene] Must be passed in for models that use the height reference property.
     * @property [distanceDisplayCondition] The condition specifying at what distance from the camera that this model will be displayed.
     * @property [color] A color that blends with the model's rendered color.
     *   Default value - [Color.WHITE]
     * @property [colorBlendMode] Defines how the color blends with the model.
     *   Default value - [ColorBlendMode.HIGHLIGHT]
     * @property [colorBlendAmount] Value used to determine the color strength when the `colorBlendMode` is `MIX`. A value of 0.0 results in the model's rendered color while a value of 1.0 results in a solid color, with any value in-between resulting in a mix of the two.
     *   Default value - `0.5`
     * @property [silhouetteColor] The silhouette color. If more than 256 models have silhouettes enabled, there is a small chance that overlapping models will have minor artifacts.
     *   Default value - [Color.RED]
     * @property [silhouetteSize] The size of the silhouette in pixels.
     *   Default value - `0.0`
     * @property [clippingPlanes] The [ClippingPlaneCollection] used to selectively disable rendering the model.
     * @property [dequantizeInShader] Determines if a [Draco](https://github.com/google/draco) encoded model is dequantized on the GPU. This decreases total memory usage for encoded models. Deprecated in CesiumJS 1.94, will be removed in CesiumJS 1.95.
     *   Default value - `true`
     * @property [lightColor] The light color when shading the model. When `undefined` the scene's light color is used instead.
     * @property [imageBasedLighting] The properties for managing image-based lighting on this model.
     * @property [credit] A credit for the data source, which is displayed on the canvas.
     * @property [showCreditsOnScreen] Whether to display the credits of this model on screen.
     *   Default value - `false`
     * @property [backFaceCulling] Whether to cull back-facing geometry. When true, back face culling is determined by the material's doubleSided property; when false, back face culling is disabled. Back faces are not culled if [Model.color] is translucent or [Model.silhouetteSize] is greater than 0.0.
     *   Default value - `true`
     * @property [showOutline] Whether to display the outline for models using the [CESIUM_primitive_outline](https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Vendor/CESIUM_primitive_outline) extension. When true, outlines are displayed. When false, outlines are not displayed.
     *   Default value - `true`
     * @property [splitDirection] The [SplitDirection] split to apply to this model.
     *   Default value - [SplitDirection.NONE]
     */
    interface ConstructorOptions {
        var gltf: dynamic
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
        var debugShowBoundingVolume: Boolean?
        var debugWireframe: Boolean?
        var heightReference: HeightReference?
        var scene: Scene?
        var distanceDisplayCondition: DistanceDisplayCondition?
        var color: Color?
        var colorBlendMode: ColorBlendMode?
        var colorBlendAmount: Double?
        var silhouetteColor: Color?
        var silhouetteSize: Double?
        var clippingPlanes: ClippingPlaneCollection?
        var dequantizeInShader: Boolean?
        var lightColor: Cartesian3?
        var imageBasedLighting: ImageBasedLighting?
        var credit: Credit?
        var showCreditsOnScreen: Boolean?
        var backFaceCulling: Boolean?
        var showOutline: Boolean?
        var splitDirection: SplitDirection?
    }

    /**
     * Determines if the model primitive will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#show">Online Documentation</a>
     */
    var show: Boolean

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
     * The 4x4 transformation matrix that transforms the model from model to world coordinates.
     * When this is the identity matrix, the model is drawn in world coordinates, i.e., Earth's WGS84 coordinates.
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
     * User-defined object returned when the model is picked.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#id">Online Documentation</a>
     */
    var id: Any

    /**
     * Returns the height reference of the model
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#heightReference">Online Documentation</a>
     */
    var heightReference: HeightReference

    /**
     * The currently playing glTF animations.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#activeAnimations">Online Documentation</a>
     */
    var activeAnimations: ModelAnimationCollection

    /**
     * Determines if the model's animations should hold a pose over frames where no keyframes are specified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#clampAnimations">Online Documentation</a>
     */
    var clampAnimations: Boolean

    /**
     * Determines whether the model casts or receives shadows from light sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#shadows">Online Documentation</a>
     */
    var shadows: ShadowMode

    /**
     * A color that blends with the model's rendered color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#color">Online Documentation</a>
     */
    var color: Color

    /**
     * Defines how the color blends with the model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#colorBlendMode">Online Documentation</a>
     */
    var colorBlendMode: ColorBlendMode

    /**
     * Value used to determine the color strength when the `colorBlendMode` is `MIX`.
     * A value of 0.0 results in the model's rendered color while a value of 1.0 results in a solid color, with
     * any value in-between resulting in a mix of the two.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#colorBlendAmount">Online Documentation</a>
     */
    var colorBlendAmount: Double

    /**
     * Whether to cull back-facing geometry. When true, back face culling is
     * determined by the material's doubleSided property; when false, back face
     * culling is disabled. Back faces are not culled if [Model.color] is
     * translucent or [Model.silhouetteSize] is greater than 0.0.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#backFaceCulling">Online Documentation</a>
     */
    var backFaceCulling: Boolean

    /**
     * Whether to display the outline for models using the
     * [CESIUM_primitive_outline](https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Vendor/CESIUM_primitive_outline) extension.
     * When true, outlines are displayed. When false, outlines are not displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#showOutline">Online Documentation</a>
     */
    val showOutline: Boolean

    /**
     * The [SplitDirection] to apply to this model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#splitDirection">Online Documentation</a>
     */
    var splitDirection: SplitDirection

    /**
     * This property is for debugging only; it is not for production use nor is it optimized.
     *
     * Draws the bounding sphere for each draw command in the model.  A glTF primitive corresponds
     * to one draw command.  A glTF mesh has an array of primitives, often of length one.
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
     * The object for the glTF JSON, including properties with default values omitted
     * from the JSON provided to this model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#gltf">Online Documentation</a>
     */
    val gltf: Any

    /**
     * The base path that paths in the glTF JSON are relative to.  The base
     * path is the same path as the path containing the .gltf file
     * minus the .gltf file, when binary, image, and shader files are
     * in the same directory as the .gltf.  When this is `''`,
     * the app's base path is used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#basePath">Online Documentation</a>
     */
    val basePath: String

    /**
     * The model's bounding sphere in its local coordinate system.  This does not take into
     * account glTF animations and skins nor does it take into account [Model.minimumPixelSize].
     * ```
     * // Center in WGS84 coordinates
     * const center = Matrix4.multiplyByPoint(model.modelMatrix, model.boundingSphere.center, new Cartesian3());
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#boundingSphere">Online Documentation</a>
     */
    val boundingSphere: BoundingSphere

    /**
     * When `true`, this model is ready to render, i.e., the external binary, image,
     * and shader files were downloaded and the WebGL resources were created.  This is set to
     * `true` right before [Model.readyPromise] is resolved.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#ready">Online Documentation</a>
     */
    val ready: Boolean

    /**
     * Gets the promise that will be resolved when this model is ready to render, i.e., when the external binary, image,
     * and shader files were downloaded and the WebGL resources were created.
     *
     * This promise is resolved at the end of the frame before the first frame the model is rendered in.
     * ```
     * // Play all animations at half-speed when the model is ready to render
     * Promise.resolve(model.readyPromise).then(function(model) {
     *   model.activeAnimations.addAll({
     *     multiplier : 0.5
     *   });
     * }).catch(function(error){
     *   window.alert(error);
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#readyPromise">Online Documentation</a>
     */
    val readyPromise: kotlin.js.Promise<Model>

    /**
     * Determines if model WebGL resource creation will be spread out over several frames or
     * block until completion once all glTF files are loaded.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#asynchronous">Online Documentation</a>
     */
    val asynchronous: Boolean

    /**
     * When `true`, each glTF mesh and primitive is pickable with [Scene.pick].  When `false`, GPU memory is saved.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#allowPicking">Online Documentation</a>
     */
    val allowPicking: Boolean

    /**
     * Determine if textures may continue to stream in after the model is loaded.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#incrementallyLoadTextures">Online Documentation</a>
     */
    val incrementallyLoadTextures: Boolean

    /**
     * Return the number of pending texture loads.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#pendingTextureLoads">Online Documentation</a>
     */
    val pendingTextureLoads: Double

    /**
     * Gets or sets the condition specifying at what distance from the camera that this model will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: DistanceDisplayCondition

    /**
     * The [ClippingPlaneCollection] used to selectively disable rendering the model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#clippingPlanes">Online Documentation</a>
     */
    var clippingPlanes: ClippingPlaneCollection

    /**
     * The light color when shading the model. When `undefined` the scene's light color is used instead.
     *
     * For example, disabling additional light sources by setting
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
     * Gets the credit that will be displayed for the model
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#credit">Online Documentation</a>
     */
    var credit: Credit

    /**
     * Gets or sets whether the credits of the model will be displayed on the screen
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#showCreditsOnScreen">Online Documentation</a>
     */
    var showCreditsOnScreen: Boolean

    /**
     * Returns the glTF node with the given `name` property.  This is used to
     * modify a node's transform for animation outside of glTF animations.
     * ```
     * // Apply non-uniform scale to node LOD3sp
     * const node = model.getNode('LOD3sp');
     * node.matrix = Matrix4.fromScale(new Cartesian3(5.0, 1.0, 1.0), node.matrix);
     * ```
     * @param [name] The glTF name of the node.
     * @return The node or `undefined` if no node with `name` exists.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#getNode">Online Documentation</a>
     */
    fun getNode(name: String): ModelNode

    /**
     * Returns the glTF mesh with the given `name` property.
     * @param [name] The glTF name of the mesh.
     * @return The mesh or `undefined` if no mesh with `name` exists.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#getMesh">Online Documentation</a>
     */
    fun getMesh(name: String): ModelMesh

    /**
     * Returns the glTF material with the given `name` property.
     * @param [name] The glTF name of the material.
     * @return The material or `undefined` if no material with `name` exists.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#getMaterial">Online Documentation</a>
     */
    fun getMaterial(name: String): ModelMaterial

    /**
     * Sets the current value of an articulation stage.  After setting one or multiple stage values, call
     * Model.applyArticulations() to cause the node matrices to be recalculated.
     * @param [articulationStageKey] The name of the articulation, a space, and the name of the stage.
     * @param [value] The numeric value of this stage of the articulation.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#setArticulationStage">Online Documentation</a>
     */
    fun setArticulationStage(
        articulationStageKey: String,
        value: Double,
    )

    /**
     * Applies any modified articulation stages to the matrix of each node that participates
     * in any articulation.  Note that this will overwrite any nodeTransformations on participating nodes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#applyArticulations">Online Documentation</a>
     */
    fun applyArticulations()

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
         * Determines if silhouettes are supported.
         * @param [scene] The scene.
         * @return `true` if silhouettes are supported; otherwise, returns `false`
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#.silhouetteSupported">Online Documentation</a>
         */
        fun silhouetteSupported(scene: Scene): Boolean

        /**
         * Creates a model from a glTF asset.  When the model is ready to render, i.e., when the external binary, image,
         * and shader files are downloaded and the WebGL resources are created, the [Model.readyPromise] is resolved.
         *
         * The model can be a traditional glTF asset with a .gltf extension or a Binary glTF using the .glb extension.
         *
         * Cesium supports glTF assets with the following extensions:
         * - [KHR_binary_glTF (glTF 1.0)](https://github.com/KhronosGroup/glTF/blob/master/extensions/1.0/Khronos/KHR_binary_glTF/README.md)
         * - [KHR_materials_common (glTF 1.0)](https://github.com/KhronosGroup/glTF/blob/master/extensions/1.0/Khronos/KHR_materials_common/README.md)
         * - [WEB3D_quantized_attributes (glTF 1.0)](https://github.com/KhronosGroup/glTF/blob/master/extensions/1.0/Vendor/WEB3D_quantized_attributes/README.md)
         * - [AGI_articulations](https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Vendor/AGI_articulations/README.md)
         * - [KHR_blend (draft)](https://github.com/KhronosGroup/glTF/pull/1302)
         * - [KHR_draco_mesh_compression](https://github.com/KhronosGroup/glTF/blob/master/extensions/2.0/Khronos/KHR_draco_mesh_compression/README.md)
         * - [KHR_materials_pbrSpecularGlossiness](https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Khronos/KHR_materials_pbrSpecularGlossiness/README.md)
         * - [KHR_materials_unlit](https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Khronos/KHR_materials_unlit/README.md)
         * - [KHR_techniques_webgl](https://github.com/KhronosGroup/glTF/blob/master/extensions/2.0/Khronos/KHR_techniques_webgl/README.md)
         * - [KHR_texture_transform](https://github.com/KhronosGroup/glTF/blob/master/extensions/2.0/Khronos/KHR_texture_transform/README.md)
         * - [KHR_texture_basisu](https://github.com/KhronosGroup/glTF/blob/master/extensions/2.0/Khronos/KHR_texture_basisu/README.md)
         *
         * For high-precision rendering, Cesium supports the [CESIUM_RTC](https://github.com/KhronosGroup/glTF/blob/master/extensions/1.0/Vendor/CESIUM_RTC/README.md) extension, which introduces the
         * CESIUM_RTC_MODELVIEW parameter semantic that says the node is in WGS84 coordinates translated
         * relative to a local origin.
         * ```
         * // Example 1. Create a model from a glTF asset
         * const model = scene.primitives.add(Model.fromGltf({
         *   url : './duck/duck.gltf'
         * }));
         * ```
         * ```
         * // Example 2. Create model and provide all properties and events
         * const origin = Cartesian3.fromDegrees(-95.0, 40.0, 200000.0);
         * const modelMatrix = Transforms.eastNorthUpToFixedFrame(origin);
         *
         * const model = scene.primitives.add(Model.fromGltf({
         *   url : './duck/duck.gltf',
         *   show : true,                     // default
         *   modelMatrix : modelMatrix,
         *   scale : 2.0,                     // double size
         *   minimumPixelSize : 128,          // never smaller than 128 pixels
         *   maximumScale: 20000,             // never larger than 20000 * model size (overrides minimumPixelSize)
         *   allowPicking : false,            // not pickable
         *   debugShowBoundingVolume : false, // default
         *   debugWireframe : false
         * }));
         *
         * model.readyPromise.then(function(model) {
         *   // Play all animations when the model is ready to render
         *   model.activeAnimations.addAll();
         * });
         * ```
         * @return The newly created model.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Model.html#.fromGltf">Online Documentation</a>
         */
        fun fromGltf(options: FromGltfOptions): Model

        /**
         * @property [url] The url to the .gltf file.
         * @property [basePath] The base path that paths in the glTF JSON are relative to.
         * @property [show] Determines if the model primitive will be shown.
         *   Default value - `true`
         * @property [modelMatrix] The 4x4 transformation matrix that transforms the model from model to world coordinates.
         *   Default value - [Matrix4.IDENTITY]
         * @property [scale] A uniform scale applied to this model.
         *   Default value - `1.0`
         * @property [minimumPixelSize] The approximate minimum pixel size of the model regardless of zoom.
         *   Default value - `0.0`
         * @property [maximumScale] The maximum scale for the model.
         * @property [id] A user-defined object to return when the model is picked with [Scene.pick].
         * @property [allowPicking] When `true`, each glTF mesh and primitive is pickable with [Scene.pick].
         *   Default value - `true`
         * @property [incrementallyLoadTextures] Determine if textures may continue to stream in after the model is loaded.
         *   Default value - `true`
         * @property [asynchronous] Determines if model WebGL resource creation will be spread out over several frames or block until completion once all glTF files are loaded.
         *   Default value - `true`
         * @property [clampAnimations] Determines if the model's animations should hold a pose over frames where no keyframes are specified.
         *   Default value - `true`
         * @property [shadows] Determines whether the model casts or receives shadows from light sources.
         *   Default value - [ShadowMode.ENABLED]
         * @property [debugShowBoundingVolume] For debugging only. Draws the bounding sphere for each draw command in the model.
         *   Default value - `false`
         * @property [debugWireframe] For debugging only. Draws the model in wireframe.
         *   Default value - `false`
         * @property [heightReference] Determines how the model is drawn relative to terrain.
         *   Default value - [HeightReference.NONE]
         * @property [scene] Must be passed in for models that use the height reference property.
         * @property [distanceDisplayCondition] The condition specifying at what distance from the camera that this model will be displayed.
         * @property [color] A color that blends with the model's rendered color.
         *   Default value - [Color.WHITE]
         * @property [colorBlendMode] Defines how the color blends with the model.
         *   Default value - [ColorBlendMode.HIGHLIGHT]
         * @property [colorBlendAmount] Value used to determine the color strength when the `colorBlendMode` is `MIX`. A value of 0.0 results in the model's rendered color while a value of 1.0 results in a solid color, with any value in-between resulting in a mix of the two.
         *   Default value - `0.5`
         * @property [silhouetteColor] The silhouette color. If more than 256 models have silhouettes enabled, there is a small chance that overlapping models will have minor artifacts.
         *   Default value - [Color.RED]
         * @property [silhouetteSize] The size of the silhouette in pixels.
         *   Default value - `0.0`
         * @property [clippingPlanes] The [ClippingPlaneCollection] used to selectively disable rendering the model.
         * @property [dequantizeInShader] Determines if a [Draco](https://github.com/google/draco) encoded model is dequantized on the GPU. This decreases total memory usage for encoded models. Deprecated in CesiumJS 1.94, will be removed in CesiumJS 1.95.
         *   Default value - `true`
         * @property [lightColor] The light color when shading the model. When `undefined` the scene's light color is used instead.
         * @property [imageBasedLighting] The properties for managing image-based lighting for this tileset.
         * @property [credit] A credit for the model, which is displayed on the canvas.
         * @property [showCreditsOnScreen] Whether to display the credits of this model on screen.
         *   Default value - `false`
         * @property [backFaceCulling] Whether to cull back-facing geometry. When true, back face culling is determined by the material's doubleSided property; when false, back face culling is disabled. Back faces are not culled if [Model.color] is translucent or [Model.silhouetteSize] is greater than 0.0.
         *   Default value - `true`
         * @property [showOutline] Whether to display the outline for models using the [CESIUM_primitive_outline](https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Vendor/CESIUM_primitive_outline) extension. When true, outlines are displayed. When false, outlines are not displayed.
         *   Default value - `true`
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
            var debugShowBoundingVolume: Boolean?
            var debugWireframe: Boolean?
            var heightReference: HeightReference?
            var scene: Scene?
            var distanceDisplayCondition: DistanceDisplayCondition?
            var color: Color?
            var colorBlendMode: ColorBlendMode?
            var colorBlendAmount: Double?
            var silhouetteColor: Color?
            var silhouetteSize: Double?
            var clippingPlanes: ClippingPlaneCollection?
            var dequantizeInShader: Boolean?
            var lightColor: Cartesian3?
            var imageBasedLighting: ImageBasedLighting?
            var credit: Credit?
            var showCreditsOnScreen: Boolean?
            var backFaceCulling: Boolean?
            var showOutline: Boolean?
        }
    }
}

inline fun Model(
    block: Model.ConstructorOptions.() -> Unit,
): Model {
    val options: Model.ConstructorOptions = js("({})")
    block(options)
    return Model(options)
}
