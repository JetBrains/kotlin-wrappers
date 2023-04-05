// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray
import js.core.jso
import web.dom.Element
import web.html.HTMLCanvasElement
import kotlin.js.Promise

/**
 * The container for all 3D graphical objects and state in a Cesium virtual scene.  Generally,
 * a scene is not created directly; instead, it is implicitly created by [CesiumWidget].
 * ```
 * // Create scene without anisotropic texture filtering
 * const scene = new Scene({
 *   canvas : canvas,
 *   contextOptions : {
 *     allowTextureFilterAnisotropic : false
 *   }
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html">Online Documentation</a>
 */
external class Scene(options: ConstructorOptions) {
    /**
     * @property [canvas] The HTML canvas element to create the scene for.
     * @property [contextOptions] Context and WebGL creation properties.
     * @property [creditContainer] The HTML element in which the credits will be displayed.
     * @property [creditViewport] The HTML element in which to display the credit popup.  If not specified, the viewport will be a added as a sibling of the canvas.
     * @property [mapProjection] The map projection to use in 2D and Columbus View modes.
     *   Default value - [GeographicProjection()][GeographicProjection]
     * @property [orderIndependentTranslucency] If true and the configuration supports it, use order independent translucency.
     *   Default value - `true`
     * @property [scene3DOnly] If true, optimizes memory use and performance for 3D mode but disables the ability to use 2D or Columbus View.
     *   Default value - `false`
     * @property [shadows] Determines if shadows are cast by light sources.
     *   Default value - `false`
     * @property [mapMode2D] Determines if the 2D map is rotatable or can be scrolled infinitely in the horizontal direction.
     *   Default value - [MapMode2D.INFINITE_SCROLL]
     * @property [requestRenderMode] If true, rendering a frame will only occur when needed as determined by changes within the scene. Enabling improves performance of the application, but requires using [Scene.requestRender] to render a new frame explicitly in this mode. This will be necessary in many cases after making changes to the scene in other parts of the API. See [Improving Performance with Explicit Rendering](https://cesium.com/blog/2018/01/24/cesium-scene-rendering-performance/).
     *   Default value - `false`
     * @property [maximumRenderTimeChange] If requestRenderMode is true, this value defines the maximum change in simulation time allowed before a render is requested. See [Improving Performance with Explicit Rendering](https://cesium.com/blog/2018/01/24/cesium-scene-rendering-performance/).
     *   Default value - `0.0`
     * @property [depthPlaneEllipsoidOffset] Adjust the DepthPlane to address rendering artefacts below ellipsoid zero elevation.
     *   Default value - `0.0`
     * @property [msaaSamples] If provided, this value controls the rate of multisample antialiasing. Typical multisampling rates are 2, 4, and sometimes 8 samples per pixel. Higher sampling rates of MSAA may impact performance in exchange for improved visual quality. This value only applies to WebGL2 contexts that support multisample render targets.
     *   Default value - `1`
     */
    interface ConstructorOptions {
        var canvas: HTMLCanvasElement
        var contextOptions: ContextOptions?
        var creditContainer: Element?
        var creditViewport: Element?
        var mapProjection: MapProjection?
        var orderIndependentTranslucency: Boolean?
        var scene3DOnly: Boolean?
        var shadows: Boolean?
        var mapMode2D: MapMode2D?
        var requestRenderMode: Boolean?
        var maximumRenderTimeChange: Double?
        var depthPlaneEllipsoidOffset: Double?
        var msaaSamples: Double?
    }

    /**
     * Exceptions occurring in `render` are always caught in order to raise the
     * `renderError` event.  If this property is true, the error is rethrown
     * after the event is raised.  If this property is false, the `render` function
     * returns normally after raising the event.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#rethrowRenderErrors">Online Documentation</a>
     */
    var rethrowRenderErrors: Boolean

    /**
     * Determines whether or not to instantly complete the
     * scene transition animation on user input.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#completeMorphOnUserInput">Online Documentation</a>
     */
    var completeMorphOnUserInput: Boolean

    /**
     * The event fired at the beginning of a scene transition.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#morphStart">Online Documentation</a>
     */
    var morphStart: DefaultEvent

    /**
     * The event fired at the completion of a scene transition.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#morphComplete">Online Documentation</a>
     */
    var morphComplete: DefaultEvent

    /**
     * The [SkyBox] used to draw the stars.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#skyBox">Online Documentation</a>
     */
    var skyBox: SkyBox

    /**
     * The sky atmosphere drawn around the globe.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#skyAtmosphere">Online Documentation</a>
     */
    var skyAtmosphere: SkyAtmosphere

    /**
     * The [Sun].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#sun">Online Documentation</a>
     */
    var sun: Sun

    /**
     * Uses a bloom filter on the sun when enabled.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#sunBloom">Online Documentation</a>
     */
    var sunBloom: Boolean

    /**
     * The [Moon]
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#moon">Online Documentation</a>
     */
    var moon: Moon

    /**
     * The background color, which is only visible if there is no sky box, i.e., [Scene.skyBox] is undefined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#backgroundColor">Online Documentation</a>
     */
    var backgroundColor: Color

    /**
     * The current morph transition time between 2D/Columbus View and 3D,
     * with 0.0 being 2D or Columbus View and 1.0 being 3D.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#morphTime">Online Documentation</a>
     */
    var morphTime: Double

    /**
     * The far-to-near ratio of the multi-frustum when using a normal depth buffer.
     *
     * This value is used to create the near and far values for each frustum of the multi-frustum. It is only used
     * when [Scene.logarithmicDepthBuffer] is `false`. When `logarithmicDepthBuffer` is
     * `true`, use [Scene.logarithmicDepthFarToNearRatio].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#farToNearRatio">Online Documentation</a>
     */
    var farToNearRatio: Double

    /**
     * The far-to-near ratio of the multi-frustum when using a logarithmic depth buffer.
     *
     * This value is used to create the near and far values for each frustum of the multi-frustum. It is only used
     * when [Scene.logarithmicDepthBuffer] is `true`. When `logarithmicDepthBuffer` is
     * `false`, use [Scene.farToNearRatio].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#logarithmicDepthFarToNearRatio">Online Documentation</a>
     */
    var logarithmicDepthFarToNearRatio: Double

    /**
     * Determines the uniform depth size in meters of each frustum of the multifrustum in 2D. If a primitive or model close
     * to the surface shows z-fighting, decreasing this will eliminate the artifact, but decrease performance. On the
     * other hand, increasing this will increase performance but may cause z-fighting among primitives close to the surface.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#nearToFarDistance2D">Online Documentation</a>
     */
    var nearToFarDistance2D: Double

    /**
     * This property is for debugging only; it is not for production use.
     *
     * A function that determines what commands are executed.  As shown in the examples below,
     * the function receives the command's `owner` as an argument, and returns a boolean indicating if the
     * command should be executed.
     *
     * The default is `undefined`, indicating that all commands are executed.
     * ```
     * // Do not execute any commands.
     * scene.debugCommandFilter = function(command) {
     *     return false;
     * };
     *
     * // Execute only the billboard's commands.  That is, only draw the billboard.
     * const billboards = new BillboardCollection();
     * scene.debugCommandFilter = function(command) {
     *     return command.owner === billboards;
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#debugCommandFilter">Online Documentation</a>
     */
    var debugCommandFilter: Function<*>

    /**
     * This property is for debugging only; it is not for production use.
     *
     * When `true`, commands are randomly shaded.  This is useful
     * for performance analysis to see what parts of a scene or model are
     * command-dense and could benefit from batching.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#debugShowCommands">Online Documentation</a>
     */
    var debugShowCommands: Boolean

    /**
     * This property is for debugging only; it is not for production use.
     *
     * When `true`, commands are shaded based on the frustums they
     * overlap.  Commands in the closest frustum are tinted red, commands in
     * the next closest are green, and commands in the farthest frustum are
     * blue.  If a command overlaps more than one frustum, the color components
     * are combined, e.g., a command overlapping the first two frustums is tinted
     * yellow.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#debugShowFrustums">Online Documentation</a>
     */
    var debugShowFrustums: Boolean

    /**
     * This property is for debugging only; it is not for production use.
     *
     * Displays frames per second and time between frames.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#debugShowFramesPerSecond">Online Documentation</a>
     */
    var debugShowFramesPerSecond: Boolean

    /**
     * This property is for debugging only; it is not for production use.
     *
     * Indicates which frustum will have depth information displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#debugShowDepthFrustum">Online Documentation</a>
     */
    var debugShowDepthFrustum: Int

    /**
     * This property is for debugging only; it is not for production use.
     *
     * When `true`, draws outlines to show the boundaries of the camera frustums
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#debugShowFrustumPlanes">Online Documentation</a>
     */
    var debugShowFrustumPlanes: Boolean

    /**
     * When `true`, enables picking using the depth buffer.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#useDepthPicking">Online Documentation</a>
     */
    var useDepthPicking: Boolean

    /**
     * When `true`, enables picking translucent geometry using the depth buffer. Note that [Scene.useDepthPicking] must also be true for enabling this to work.
     *
     * There is a decrease in performance when enabled. There are extra draw calls to write depth for
     * translucent geometry.
     * ```
     * // picking the position of a translucent primitive
     * viewer.screenSpaceEventHandler.setInputAction(function onLeftClick(movement) {
     *      const pickedFeature = viewer.scene.pick(movement.position);
     *      if (!Cesium.defined(pickedFeature)) {
     *          // nothing picked
     *          return;
     *      }
     *      const worldPosition = viewer.scene.pickPosition(movement.position);
     * }, ScreenSpaceEventType.LEFT_CLICK);
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#pickTranslucentDepth">Online Documentation</a>
     */
    var pickTranslucentDepth: Boolean

    /**
     * Blends the atmosphere to geometry far from the camera for horizon views. Allows for additional
     * performance improvements by rendering less geometry and dispatching less terrain requests.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#fog">Online Documentation</a>
     */
    var fog: Fog

    /**
     * The shadow map for the scene's light source. When enabled, models, primitives, and the globe may cast and receive shadows.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#shadowMap">Online Documentation</a>
     */
    var shadowMap: ShadowMap

    /**
     * When `false`, 3D Tiles will render normally. When `true`, classified 3D Tile geometry will render normally and
     * unclassified 3D Tile geometry will render with the color multiplied by [Scene.invertClassificationColor].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#invertClassification">Online Documentation</a>
     */
    var invertClassification: Boolean

    /**
     * The highlight color of unclassified 3D Tile geometry when [Scene.invertClassification] is `true`.
     * When the color's alpha is less than 1.0, the unclassified portions of the 3D Tiles will not blend correctly with the classified positions of the 3D Tiles.
     * Also, when the color's alpha is less than 1.0, the WEBGL_depth_texture and EXT_frag_depth WebGL extensions must be supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#invertClassificationColor">Online Documentation</a>
     */
    var invertClassificationColor: Color

    /**
     * The focal length for use when with cardboard or WebVR.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#focalLength">Online Documentation</a>
     */
    var focalLength: Double

    /**
     * The eye separation distance in meters for use with cardboard or WebVR.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#eyeSeparation">Online Documentation</a>
     */
    var eyeSeparation: Double

    /**
     * Post processing effects applied to the final render.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#postProcessStages">Online Documentation</a>
     */
    var postProcessStages: PostProcessStageCollection

    /**
     * When `true`, rendering a frame will only occur when needed as determined by changes within the scene.
     * Enabling improves performance of the application, but requires using [Scene.requestRender]
     * to render a new frame explicitly in this mode. This will be necessary in many cases after making changes
     * to the scene in other parts of the API.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#requestRenderMode">Online Documentation</a>
     */
    var requestRenderMode: Boolean

    /**
     * If [Scene.requestRenderMode] is `true`, this value defines the maximum change in
     * simulation time allowed before a render is requested. Lower values increase the number of frames rendered
     * and higher values decrease the number of frames rendered. If `undefined`, changes to
     * the simulation time will never request a render.
     * This value impacts the rate of rendering for changes in the scene like lighting, entity property updates,
     * and animations.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#maximumRenderTimeChange">Online Documentation</a>
     */
    var maximumRenderTimeChange: Double

    /**
     * The spherical harmonic coefficients for image-based lighting of PBR models.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#sphericalHarmonicCoefficients">Online Documentation</a>
     */
    var sphericalHarmonicCoefficients: ReadonlyArray<Cartesian3>

    /**
     * The url to the KTX2 file containing the specular environment map and convoluted mipmaps for image-based lighting of PBR models.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#specularEnvironmentMaps">Online Documentation</a>
     */
    var specularEnvironmentMaps: String

    /**
     * The light source for shading. Defaults to a directional light from the Sun.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#light">Online Documentation</a>
     */
    var light: Light

    /**
     * Gets the canvas element to which this scene is bound.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#canvas">Online Documentation</a>
     */
    val canvas: HTMLCanvasElement

    /**
     * The drawingBufferHeight of the underlying GL context.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#drawingBufferHeight">Online Documentation</a>
     */
    val drawingBufferHeight: Double

    /**
     * The drawingBufferHeight of the underlying GL context.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#drawingBufferWidth">Online Documentation</a>
     */
    val drawingBufferWidth: Double

    /**
     * The maximum aliased line width, in pixels, supported by this WebGL implementation.  It will be at least one.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#maximumAliasedLineWidth">Online Documentation</a>
     */
    val maximumAliasedLineWidth: Double

    /**
     * The maximum length in pixels of one edge of a cube map, supported by this WebGL implementation.  It will be at least 16.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#maximumCubeMapSize">Online Documentation</a>
     */
    val maximumCubeMapSize: Double

    /**
     * Returns `true` if the [Scene.pickPosition] function is supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#pickPositionSupported">Online Documentation</a>
     */
    val pickPositionSupported: Boolean

    /**
     * Returns `true` if the [Scene.sampleHeight] and [Scene.sampleHeightMostDetailed] functions are supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#sampleHeightSupported">Online Documentation</a>
     */
    val sampleHeightSupported: Boolean

    /**
     * Returns `true` if the [Scene.clampToHeight] and [Scene.clampToHeightMostDetailed] functions are supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#clampToHeightSupported">Online Documentation</a>
     */
    val clampToHeightSupported: Boolean

    /**
     * Returns `true` if the [Scene.invertClassification] is supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#invertClassificationSupported">Online Documentation</a>
     */
    val invertClassificationSupported: Boolean

    /**
     * Returns `true` if specular environment maps are supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#specularEnvironmentMapsSupported">Online Documentation</a>
     */
    val specularEnvironmentMapsSupported: Boolean

    /**
     * Gets or sets the depth-test ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#globe">Online Documentation</a>
     */
    var globe: Globe

    /**
     * Gets the collection of primitives.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#primitives">Online Documentation</a>
     */
    val primitives: PrimitiveCollection

    /**
     * Gets the collection of ground primitives.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#groundPrimitives">Online Documentation</a>
     */
    val groundPrimitives: PrimitiveCollection

    /**
     * Gets or sets the camera.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#camera">Online Documentation</a>
     */
    val camera: Camera

    /**
     * Gets the controller for camera input handling.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#screenSpaceCameraController">Online Documentation</a>
     */
    val screenSpaceCameraController: ScreenSpaceCameraController

    /**
     * Get the map projection to use in 2D and Columbus View modes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#mapProjection">Online Documentation</a>
     */
    val mapProjection: MapProjection

    /**
     * Gets the collection of image layers that will be rendered on the globe.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#imageryLayers">Online Documentation</a>
     */
    val imageryLayers: ImageryLayerCollection

    /**
     * The terrain provider providing surface geometry for the globe.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#terrainProvider">Online Documentation</a>
     */
    var terrainProvider: TerrainProvider

    /**
     * Gets an event that's raised when the terrain provider is changed
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#terrainProviderChanged">Online Documentation</a>
     */
    val terrainProviderChanged: DefaultEvent

    /**
     * Gets the event that will be raised before the scene is updated or rendered.  Subscribers to the event
     * receive the Scene instance as the first parameter and the current time as the second parameter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#preUpdate">Online Documentation</a>
     */
    val preUpdate: DefaultEvent

    /**
     * Gets the event that will be raised immediately after the scene is updated and before the scene is rendered.
     * Subscribers to the event receive the Scene instance as the first parameter and the current time as the second
     * parameter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#postUpdate">Online Documentation</a>
     */
    val postUpdate: DefaultEvent

    /**
     * Gets the event that will be raised when an error is thrown inside the `render` function.
     * The Scene instance and the thrown error are the only two parameters passed to the event handler.
     * By default, errors are not rethrown after this event is raised, but that can be changed by setting
     * the `rethrowRenderErrors` property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#renderError">Online Documentation</a>
     */
    val renderError: DefaultEvent

    /**
     * Gets the event that will be raised after the scene is updated and immediately before the scene is rendered.
     * Subscribers to the event receive the Scene instance as the first parameter and the current time as the second
     * parameter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#preRender">Online Documentation</a>
     */
    val preRender: DefaultEvent

    /**
     * Gets the event that will be raised immediately after the scene is rendered.  Subscribers to the event
     * receive the Scene instance as the first parameter and the current time as the second parameter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#postRender">Online Documentation</a>
     */
    val postRender: DefaultEvent

    /**
     * Gets the simulation time when the scene was last rendered. Returns undefined if the scene has not yet been
     * rendered.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#lastRenderTime">Online Documentation</a>
     */
    val lastRenderTime: JulianDate

    /**
     * This property is for debugging only; it is not for production use.
     *
     * When [Scene.debugShowFrustums] is `true`, this contains
     * properties with statistics about the number of command execute per frustum.
     * `totalCommands` is the total number of commands executed, ignoring
     * overlap. `commandsInFrustums` is an array with the number of times
     * commands are executed redundantly, e.g., how many commands overlap two or
     * three frustums.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#debugFrustumStatistics">Online Documentation</a>
     */
    val debugFrustumStatistics: Any

    /**
     * Gets whether or not the scene is optimized for 3D only viewing.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#scene3DOnly">Online Documentation</a>
     */
    val scene3DOnly: Boolean

    /**
     * Gets whether or not the scene has order independent translucency enabled.
     * Note that this only reflects the original construction option, and there are
     * other factors that could prevent OIT from functioning on a given system configuration.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#orderIndependentTranslucency">Online Documentation</a>
     */
    val orderIndependentTranslucency: Boolean

    /**
     * Gets the unique identifier for this scene.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#id">Online Documentation</a>
     */
    val id: String

    /**
     * Gets or sets the current mode of the scene.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#mode">Online Documentation</a>
     */
    var mode: SceneMode

    /**
     * When `true`, splits the scene into two viewports with steroscopic views for the left and right eyes.
     * Used for cardboard and WebVR.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#useWebVR">Online Documentation</a>
     */
    var useWebVR: Boolean

    /**
     * Determines if the 2D map is rotatable or can be scrolled infinitely in the horizontal direction.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#mapMode2D">Online Documentation</a>
     */
    val mapMode2D: MapMode2D

    /**
     * Gets or sets the position of the splitter within the viewport.  Valid values are between 0.0 and 1.0.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#splitPosition">Online Documentation</a>
     */
    var splitPosition: Double

    /**
     * The distance from the camera at which to disable the depth test of billboards, labels and points
     * to, for example, prevent clipping against terrain. When set to zero, the depth test should always
     * be applied. When less than zero, the depth test should never be applied. Setting the disableDepthTestDistance
     * property of a billboard, label or point will override this value.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#minimumDisableDepthTestDistance">Online Documentation</a>
     */
    var minimumDisableDepthTestDistance: Double

    /**
     * Whether or not to use a logarithmic depth buffer. Enabling this option will allow for less frustums in the multi-frustum,
     * increasing performance. This property relies on fragmentDepth being supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#logarithmicDepthBuffer">Online Documentation</a>
     */
    var logarithmicDepthBuffer: Boolean

    /**
     * The value used for gamma correction. This is only used when rendering with high dynamic range.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#gamma">Online Documentation</a>
     */
    var gamma: Double

    /**
     * Whether or not to use high dynamic range rendering.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#highDynamicRange">Online Documentation</a>
     */
    var highDynamicRange: Boolean

    /**
     * Whether or not high dynamic range rendering is supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#highDynamicRangeSupported">Online Documentation</a>
     */
    val highDynamicRangeSupported: Boolean

    /**
     * Whether or not the camera is underneath the globe.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#cameraUnderground">Online Documentation</a>
     */
    val cameraUnderground: Boolean

    /**
     * The sample rate of multisample antialiasing (values greater than 1 enable MSAA).
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#msaaSamples">Online Documentation</a>
     */
    var msaaSamples: Double

    /**
     * Returns `true` if the Scene's context supports MSAA.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#msaaSupported">Online Documentation</a>
     */
    val msaaSupported: Boolean

    /**
     * Determines if a compressed texture format is supported.
     * @param [format] The texture format. May be the name of the format or the WebGL extension name, e.g. s3tc or WEBGL_compressed_texture_s3tc.
     * @return Whether or not the format is supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#getCompressedTextureFormatSupported">Online Documentation</a>
     */
    fun getCompressedTextureFormatSupported(format: String): Boolean

    /**
     * Update and render the scene. It is usually not necessary to call this function
     * directly because [CesiumWidget] will do it automatically.
     * @param [time] The simulation time at which to render.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#render">Online Documentation</a>
     */
    fun render(time: JulianDate? = definedExternally)

    /**
     * Requests a new rendered frame when [Scene.requestRenderMode] is set to `true`.
     * The render rate will not exceed the [CesiumWidget.targetFrameRate].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#requestRender">Online Documentation</a>
     */
    fun requestRender()

    /**
     * Returns an object with a `primitive` property that contains the first (top) primitive in the scene
     * at a particular window coordinate or undefined if nothing is at the location. Other properties may
     * potentially be set depending on the type of primitive and may be used to further identify the picked object.
     *
     * When a feature of a 3D Tiles tileset is picked, `pick` returns a [Cesium3DTileFeature] object.
     * ```
     * // On mouse over, color the feature yellow.
     * handler.setInputAction(function(movement) {
     *     const feature = scene.pick(movement.endPosition);
     *     if (feature instanceof Cesium3DTileFeature) {
     *         feature.color = Color.YELLOW;
     *     }
     * }, ScreenSpaceEventType.MOUSE_MOVE);
     * ```
     * @param [windowPosition] Window coordinates to perform picking on.
     * @param [width] Width of the pick rectangle.
     *   Default value - `3`
     * @param [height] Height of the pick rectangle.
     *   Default value - `3`
     * @return Object containing the picked primitive.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#pick">Online Documentation</a>
     */
    fun pick(
        windowPosition: Cartesian2,
        width: Double? = definedExternally,
        height: Double? = definedExternally,
    ): Any

    /**
     * Returns the cartesian position reconstructed from the depth buffer and window position.
     *
     * The position reconstructed from the depth buffer in 2D may be slightly different from those
     * reconstructed in 3D and Columbus view. This is caused by the difference in the distribution
     * of depth values of perspective and orthographic projection.
     *
     * Set [Scene.pickTranslucentDepth] to `true` to include the depth of
     * translucent primitives; otherwise, this essentially picks through translucent primitives.
     * @param [windowPosition] Window coordinates to perform picking on.
     * @param [result] The object on which to restore the result.
     * @return The cartesian position.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#pickPosition">Online Documentation</a>
     */
    fun pickPosition(
        windowPosition: Cartesian2,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Returns a list of objects, each containing a `primitive` property, for all primitives at
     * a particular window coordinate position. Other properties may also be set depending on the
     * type of primitive and may be used to further identify the picked object. The primitives in
     * the list are ordered by their visual order in the scene (front to back).
     * ```
     * const pickedObjects = scene.drillPick(new Cartesian2(100.0, 200.0));
     * ```
     * @param [windowPosition] Window coordinates to perform picking on.
     * @param [limit] If supplied, stop drilling after collecting this many picks.
     * @param [width] Width of the pick rectangle.
     *   Default value - `3`
     * @param [height] Height of the pick rectangle.
     *   Default value - `3`
     * @return Array of objects, each containing 1 picked primitives.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#drillPick">Online Documentation</a>
     */
    fun drillPick(
        windowPosition: Cartesian2,
        limit: Double? = definedExternally,
        width: Double? = definedExternally,
        height: Double? = definedExternally,
    ): ReadonlyArray<Any>

    /**
     * Returns the height of scene geometry at the given cartographic position or `undefined` if there was no
     * scene geometry to sample height from. The height of the input position is ignored. May be used to clamp objects to
     * the globe, 3D Tiles, or primitives in the scene.
     *
     * This function only samples height from globe tiles and 3D Tiles that are rendered in the current view. Samples height
     * from all other primitives regardless of their visibility.
     * ```
     * const position = new Cartographic(-1.31968, 0.698874);
     * const height = viewer.scene.sampleHeight(position);
     * console.log(height);
     * ```
     * @param [position] The cartographic position to sample height from.
     * @param [objectsToExclude] A list of primitives, entities, or 3D Tiles features to not sample height from.
     * @param [width] Width of the intersection volume in meters.
     *   Default value - `0.1`
     * @return The height. This may be `undefined` if there was no scene geometry to sample height from.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#sampleHeight">Online Documentation</a>
     */
    fun sampleHeight(
        position: Cartographic,
        objectsToExclude: ReadonlyArray<Any>? = definedExternally,
        width: Double? = definedExternally,
    ): Double

    /**
     * Clamps the given cartesian position to the scene geometry along the geodetic surface normal. Returns the
     * clamped position or `undefined` if there was no scene geometry to clamp to. May be used to clamp
     * objects to the globe, 3D Tiles, or primitives in the scene.
     *
     * This function only clamps to globe tiles and 3D Tiles that are rendered in the current view. Clamps to
     * all other primitives regardless of their visibility.
     * ```
     * // Clamp an entity to the underlying scene geometry
     * const position = entity.position.getValue(JulianDate.now());
     * entity.position = viewer.scene.clampToHeight(position);
     * ```
     * @param [cartesian] The cartesian position.
     * @param [objectsToExclude] A list of primitives, entities, or 3D Tiles features to not clamp to.
     * @param [width] Width of the intersection volume in meters.
     *   Default value - `0.1`
     * @param [result] An optional object to return the clamped position.
     * @return The modified result parameter or a new Cartesian3 instance if one was not provided. This may be `undefined` if there was no scene geometry to clamp to.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#clampToHeight">Online Documentation</a>
     */
    fun clampToHeight(
        cartesian: Cartesian3,
        objectsToExclude: ReadonlyArray<Any>? = definedExternally,
        width: Double? = definedExternally,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Initiates an asynchronous [Scene.sampleHeight] query for an array of [Cartographic] positions
     * using the maximum level of detail for 3D Tilesets in the scene. The height of the input positions is ignored.
     * Returns a promise that is resolved when the query completes. Each point height is modified in place.
     * If a height cannot be determined because no geometry can be sampled at that location, or another error occurs,
     * the height is set to undefined.
     * ```
     * const positions = [
     *     new Cartographic(-1.31968, 0.69887),
     *     new Cartographic(-1.10489, 0.83923)
     * ];
     * const promise = viewer.scene.sampleHeightMostDetailed(positions);
     * promise.then(function(updatedPosition) {
     *     // positions[0].height and positions[1].height have been updated.
     *     // updatedPositions is just a reference to positions.
     * }
     * ```
     * @param [positions] The cartographic positions to update with sampled heights.
     * @param [objectsToExclude] A list of primitives, entities, or 3D Tiles features to not sample height from.
     * @param [width] Width of the intersection volume in meters.
     *   Default value - `0.1`
     * @return A promise that resolves to the provided list of positions when the query has completed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#sampleHeightMostDetailed">Online Documentation</a>
     */
    fun sampleHeightMostDetailed(
        positions: ReadonlyArray<Cartographic>,
        objectsToExclude: ReadonlyArray<Any>? = definedExternally,
        width: Double? = definedExternally,
    ): Promise<ReadonlyArray<Cartographic>>

    /**
     * Initiates an asynchronous [Scene.clampToHeight] query for an array of [Cartesian3] positions
     * using the maximum level of detail for 3D Tilesets in the scene. Returns a promise that is resolved when
     * the query completes. Each position is modified in place. If a position cannot be clamped because no geometry
     * can be sampled at that location, or another error occurs, the element in the array is set to undefined.
     * ```
     * const cartesians = [
     *     entities[0].position.getValue(JulianDate.now()),
     *     entities[1].position.getValue(JulianDate.now())
     * ];
     * const promise = viewer.scene.clampToHeightMostDetailed(cartesians);
     * promise.then(function(updatedCartesians) {
     *     entities[0].position = updatedCartesians[0];
     *     entities[1].position = updatedCartesians[1];
     * }
     * ```
     * @param [cartesians] The cartesian positions to update with clamped positions.
     * @param [objectsToExclude] A list of primitives, entities, or 3D Tiles features to not clamp to.
     * @param [width] Width of the intersection volume in meters.
     *   Default value - `0.1`
     * @return A promise that resolves to the provided list of positions when the query has completed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#clampToHeightMostDetailed">Online Documentation</a>
     */
    fun clampToHeightMostDetailed(
        cartesians: ReadonlyArray<Cartesian3>,
        objectsToExclude: ReadonlyArray<Any>? = definedExternally,
        width: Double? = definedExternally,
    ): Promise<ReadonlyArray<Cartesian3>>

    /**
     * Transforms a position in cartesian coordinates to canvas coordinates.  This is commonly used to place an
     * HTML element at the same screen position as an object in the scene.
     * ```
     * // Output the canvas position of longitude/latitude (0, 0) every time the mouse moves.
     * const scene = widget.scene;
     * const ellipsoid = scene.globe.ellipsoid;
     * const position = Cartesian3.fromDegrees(0.0, 0.0);
     * const handler = new ScreenSpaceEventHandler(scene.canvas);
     * handler.setInputAction(function(movement) {
     *     console.log(scene.cartesianToCanvasCoordinates(position));
     * }, ScreenSpaceEventType.MOUSE_MOVE);
     * ```
     * @param [position] The position in cartesian coordinates.
     * @param [result] An optional object to return the input position transformed to canvas coordinates.
     * @return The modified result parameter or a new Cartesian2 instance if one was not provided.  This may be `undefined` if the input position is near the center of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#cartesianToCanvasCoordinates">Online Documentation</a>
     */
    fun cartesianToCanvasCoordinates(
        position: Cartesian3,
        result: Cartesian2? = definedExternally,
    ): Cartesian2

    /**
     * Instantly completes an active transition.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#completeMorph">Online Documentation</a>
     */
    fun completeMorph()

    /**
     * Asynchronously transitions the scene to 2D.
     * @param [duration] The amount of time, in seconds, for transition animations to complete.
     *   Default value - `2.0`
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#morphTo2D">Online Documentation</a>
     */
    fun morphTo2D(duration: Double? = definedExternally)

    /**
     * Asynchronously transitions the scene to Columbus View.
     * @param [duration] The amount of time, in seconds, for transition animations to complete.
     *   Default value - `2.0`
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#morphToColumbusView">Online Documentation</a>
     */
    fun morphToColumbusView(duration: Double? = definedExternally)

    /**
     * Asynchronously transitions the scene to 3D.
     * @param [duration] The amount of time, in seconds, for transition animations to complete.
     *   Default value - `2.0`
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#morphTo3D">Online Documentation</a>
     */
    fun morphTo3D(duration: Double? = definedExternally)

    /**
     * Update the terrain providing surface geometry for the globe.
     * ```
     * // Use Cesium World Terrain
     * scene.setTerrain(Terrain.fromWorldTerrain());
     * ```
     * ```
     * // Use a custom terrain provider
     * const terrain = new Terrain(CesiumTerrainProvider.fromUrl("https://myTestTerrain.com"));
     * scene.setTerrain(terrain);
     *
     * terrain.errorEvent.addEventListener(error => {
     *   alert(`Encountered an error while creating terrain! ${error}`);
     * });
     * ```
     * @param [terrain] The terrain provider async helper
     * @return terrain The terrain provider async helper
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#setTerrain">Online Documentation</a>
     */
    fun setTerrain(terrain: Terrain): Terrain

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#isDestroyed">Online Documentation</a>
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
     * scene = scene && scene.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Scene.html#destroy">Online Documentation</a>
     */
    fun destroy()
}

inline fun Scene(
    block: Scene.ConstructorOptions.() -> Unit,
): Scene =
    Scene(options = jso(block))
