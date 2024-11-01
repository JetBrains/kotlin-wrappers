// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium.engine

import js.array.ReadonlyArray
import js.promise.Promise
import kotlinx.js.JsPlainObject
import seskar.js.JsAsync
import web.dom.Element
import web.html.HTMLCanvasElement

/**
 * A widget containing a Cesium scene.
 * ```
 * // For each example, include a link to CesiumWidget.css stylesheet in HTML head,
 * // and in the body, include: <div id="cesiumContainer"></div>
 *
 * // Widget with no terrain and default Bing Maps imagery provider.
 * const widget = new CesiumWidget("cesiumContainer");
 *
 * // Widget with ion imagery and Cesium World Terrain.
 * const widget2 = new CesiumWidget("cesiumContainer", {
 *     baseLayer: ImageryLayer.fromWorldTerrain(),
 *     terrain: Terrain.fromWorldTerrain()
 *     skyBox: new SkyBox({
 *       sources: {
 *         positiveX: "stars/TychoSkymapII.t3_08192x04096_80_px.jpg",
 *         negativeX: "stars/TychoSkymapII.t3_08192x04096_80_mx.jpg",
 *         positiveY: "stars/TychoSkymapII.t3_08192x04096_80_py.jpg",
 *         negativeY: "stars/TychoSkymapII.t3_08192x04096_80_my.jpg",
 *         positiveZ: "stars/TychoSkymapII.t3_08192x04096_80_pz.jpg",
 *         negativeZ: "stars/TychoSkymapII.t3_08192x04096_80_mz.jpg"
 *       }
 *     }),
 *     // Show Columbus View map with Web Mercator projection
 *     sceneMode: SceneMode.COLUMBUS_VIEW,
 *     mapProjection: new WebMercatorProjection()
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html">Online Documentation</a>
 *
 * @constructor
 * @property [container] The DOM element that will contain the widget.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html">Online Documentation</a>
 */
external class CesiumWidget(
    val container: Element,
    options: ConstructorOptions? = definedExternally,
) {
    /**
     * @property [clock] The clock to use to control current time.
     *   Default value - [Clock()][Clock]
     * @property [shouldAnimate] `true` if the clock should attempt to advance simulation time by default, `false` otherwise.
     *   Default value - `false`
     * @property [ellipsoid] The default ellipsoid.
     *   Default value - [Ellipsoid.default]
     * @property [baseLayer] The bottommost imagery layer applied to the globe. If set to `false`, no imagery provider will be added.
     *   Default value - `ImageryLayer.fromWorldImagery()`
     * @property [terrainProvider] The terrain provider.
     *   Default value - [EllipsoidTerrainProvider(options.ellipsoid)][EllipsoidTerrainProvider]
     * @property [terrain] A terrain object which handles asynchronous terrain provider. Can only specify if options.terrainProvider is undefined.
     * @property [skyBox] The skybox used to render the stars. When `undefined` and the WGS84 ellipsoid used, the default stars are used. If set to `false`, no skyBox, Sun, or Moon will be added.
     * @property [skyAtmosphere] Blue sky, and the glow around the Earth's limb. Enabled when the default ellipsoid used. Set to `false` to turn it off.
     * @property [sceneMode] The initial scene mode.
     *   Default value - [SceneMode.SCENE3D]
     * @property [scene3DOnly] When `true`, each geometry instance will only be rendered in 3D to save GPU memory.
     *   Default value - `false`
     * @property [orderIndependentTranslucency] If true and the configuration supports it, use order independent translucency.
     *   Default value - `true`
     * @property [mapProjection] The map projection to use in 2D and Columbus View modes.
     *   Default value - [GeographicProjection(options.ellipsoid)][GeographicProjection]
     * @property [globe] The globe to use in the scene.  If set to `false`, no globe will be added and the sky atmosphere will be hidden by default.
     *   Default value - [Globe(options.ellipsoid)][Globe]
     * @property [useDefaultRenderLoop] True if this widget should control the render loop, false otherwise.
     *   Default value - `true`
     * @property [useBrowserRecommendedResolution] If true, render at the browser's recommended resolution and ignore `window.devicePixelRatio`.
     *   Default value - `true`
     * @property [targetFrameRate] The target frame rate when using the default render loop.
     * @property [showRenderLoopErrors] If true, this widget will automatically display an HTML panel to the user containing the error, if a render loop error occurs.
     *   Default value - `true`
     * @property [automaticallyTrackDataSourceClocks] If true, this widget will automatically track the clock settings of newly added DataSources, updating if the DataSource's clock changes.  Set this to false if you want to configure the clock independently.
     *   Default value - `true`
     * @property [contextOptions] Context and WebGL creation properties passed to [Scene].
     * @property [creditContainer] The DOM element that will contain the [CreditDisplay].  If not specified, the credits are added
     *   to the bottom of the widget itself.
     * @property [creditViewport] The DOM element that will contain the credit pop up created by the [CreditDisplay].  If not specified, it will appear over the widget itself.
     * @property [dataSources] The collection of data sources visualized by the widget.  If this parameter is provided,
     *   the instance is assumed to be owned by the caller and will not be destroyed when the widget is destroyed.
     *   Default value - [DataSourceCollection()][DataSourceCollection]
     * @property [shadows] Determines if shadows are cast by light sources.
     *   Default value - `false`
     * @property [terrainShadows] Determines if the terrain casts or receives shadows from light sources.
     *   Default value - [ShadowMode.RECEIVE_ONLY]
     * @property [mapMode2D] Determines if the 2D map is rotatable or can be scrolled infinitely in the horizontal direction.
     *   Default value - [MapMode2D.INFINITE_SCROLL]
     * @property [blurActiveElementOnCanvasFocus] If true, the active element will blur when the widget's canvas is clicked. Setting this to false is useful for cases when the canvas is clicked only for retrieving position or an entity data without actually meaning to set the canvas to be the active element.
     *   Default value - `true`
     * @property [requestRenderMode] If true, rendering a frame will only occur when needed as determined by changes within the scene. Enabling improves performance of the application, but requires using [Scene.requestRender] to render a new frame explicitly in this mode. This will be necessary in many cases after making changes to the scene in other parts of the API. See [Improving Performance with Explicit Rendering](https://cesium.com/blog/2018/01/24/cesium-scene-rendering-performance/).
     *   Default value - `false`
     * @property [maximumRenderTimeChange] If requestRenderMode is true, this value defines the maximum change in simulation time allowed before a render is requested. See [Improving Performance with Explicit Rendering](https://cesium.com/blog/2018/01/24/cesium-scene-rendering-performance/).
     *   Default value - `0.0`
     * @property [msaaSamples] If provided, this value controls the rate of multisample antialiasing. Typical multisampling rates are 2, 4, and sometimes 8 samples per pixel. Higher sampling rates of MSAA may impact performance in exchange for improved visual quality. This value only applies to WebGL2 contexts that support multisample render targets. Set to 1 to disable MSAA.
     *   Default value - `4`
     */
    @JsPlainObject
    interface ConstructorOptions {
        var clock: Clock?
        var shouldAnimate: Boolean?
        var ellipsoid: Ellipsoid?
        var baseLayer: ImageryLayer /* | false */?
        var terrainProvider: TerrainProvider?
        var terrain: Terrain?
        var skyBox: SkyBox /* | false */?
        var skyAtmosphere: SkyAtmosphere /* | false */?
        var sceneMode: SceneMode?
        var scene3DOnly: Boolean?
        var orderIndependentTranslucency: Boolean?
        var mapProjection: MapProjection?
        var globe: Globe /* | false */?
        var useDefaultRenderLoop: Boolean?
        var useBrowserRecommendedResolution: Boolean?
        var targetFrameRate: Int?
        var showRenderLoopErrors: Boolean?
        var automaticallyTrackDataSourceClocks: Boolean?
        var contextOptions: ContextOptions?
        var creditContainer: Element?
        var creditViewport: Element?
        var dataSources: DataSourceCollection?
        var shadows: Boolean?
        var terrainShadows: ShadowMode?
        var mapMode2D: MapMode2D?
        var blurActiveElementOnCanvasFocus: Boolean?
        var requestRenderMode: Boolean?
        var maximumRenderTimeChange: Double?
        var msaaSamples: Double?
    }

    /**
     * Gets the canvas.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#canvas">Online Documentation</a>
     */
    val canvas: HTMLCanvasElement

    /**
     * Gets the credit container.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#creditContainer">Online Documentation</a>
     */
    val creditContainer: Element

    /**
     * Gets the credit viewport
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#creditViewport">Online Documentation</a>
     */
    val creditViewport: Element

    /**
     * Gets the scene.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#scene">Online Documentation</a>
     */
    val scene: Scene

    /**
     * Gets the collection of image layers that will be rendered on the globe.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#imageryLayers">Online Documentation</a>
     */
    val imageryLayers: ImageryLayerCollection

    /**
     * The terrain provider providing surface geometry for the globe.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#terrainProvider">Online Documentation</a>
     */
    var terrainProvider: TerrainProvider

    /**
     * Manages the list of credits to display on screen and in the lightbox.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#creditDisplay">Online Documentation</a>
     */
    var creditDisplay: CreditDisplay

    /**
     * Gets the display used for [DataSource] visualization.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#dataSourceDisplay">Online Documentation</a>
     */
    val dataSourceDisplay: DataSourceDisplay

    /**
     * Gets the collection of entities not tied to a particular data source.
     * This is a shortcut to [dataSourceDisplay.defaultDataSource.entities][CesiumWidget.dataSourceDisplay].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#entities">Online Documentation</a>
     */
    val entities: EntityCollection

    /**
     * Gets the set of [DataSource] instances to be visualized.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#dataSources">Online Documentation</a>
     */
    val dataSources: DataSourceCollection

    /**
     * Gets the camera.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#camera">Online Documentation</a>
     */
    val camera: Camera

    /**
     * Gets the default ellipsoid for the scene.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#ellipsoid">Online Documentation</a>
     */
    val ellipsoid: Ellipsoid

    /**
     * Gets the clock.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#clock">Online Documentation</a>
     */
    val clock: Clock

    /**
     * Gets the screen space event handler.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#screenSpaceEventHandler">Online Documentation</a>
     */
    val screenSpaceEventHandler: ScreenSpaceEventHandler

    /**
     * Gets or sets the target frame rate of the widget when `useDefaultRenderLoop`
     * is true. If undefined, the browser's requestAnimationFrame implementation
     * determines the frame rate.  If defined, this value must be greater than 0.  A value higher
     * than the underlying requestAnimationFrame implementation will have no effect.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#targetFrameRate">Online Documentation</a>
     */
    var targetFrameRate: Int

    /**
     * Gets or sets whether or not this widget should control the render loop.
     * If true the widget will use requestAnimationFrame to
     * perform rendering and resizing of the widget, as well as drive the
     * simulation clock. If set to false, you must manually call the
     * `resize`, `render` methods as part of a custom
     * render loop.  If an error occurs during rendering, [Scene]'s
     * `renderError` event will be raised and this property
     * will be set to false.  It must be set back to true to continue rendering
     * after the error.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#useDefaultRenderLoop">Online Documentation</a>
     */
    var useDefaultRenderLoop: Boolean

    /**
     * Gets or sets a scaling factor for rendering resolution.  Values less than 1.0 can improve
     * performance on less powerful devices while values greater than 1.0 will render at a higher
     * resolution and then scale down, resulting in improved visual fidelity.
     * For example, if the widget is laid out at a size of 640x480, setting this value to 0.5
     * will cause the scene to be rendered at 320x240 and then scaled up while setting
     * it to 2.0 will cause the scene to be rendered at 1280x960 and then scaled down.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#resolutionScale">Online Documentation</a>
     */
    var resolutionScale: Double

    /**
     * Boolean flag indicating if the browser's recommended resolution is used.
     * If true, the browser's device pixel ratio is ignored and 1.0 is used instead,
     * effectively rendering based on CSS pixels instead of device pixels. This can improve
     * performance on less powerful devices that have high pixel density. When false, rendering
     * will be in device pixels. [CesiumWidget.resolutionScale] will still take effect whether
     * this flag is true or false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#useBrowserRecommendedResolution">Online Documentation</a>
     */
    var useBrowserRecommendedResolution: Boolean

    /**
     * Gets or sets whether or not data sources can temporarily pause
     * animation in order to avoid showing an incomplete picture to the user.
     * For example, if asynchronous primitives are being processed in the
     * background, the clock will not advance until the geometry is ready.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#allowDataSourcesToSuspendAnimation">Online Documentation</a>
     */
    var allowDataSourcesToSuspendAnimation: Boolean

    /**
     * Gets or sets the Entity instance currently being tracked by the camera.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#trackedEntity">Online Documentation</a>
     */
    var trackedEntity: Entity?

    /**
     * Gets the event that is raised when the tracked entity changes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#trackedEntityChanged">Online Documentation</a>
     */
    val trackedEntityChanged: DefaultEvent

    /**
     * Gets or sets the data source to track with the widget's clock.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#clockTrackedDataSource">Online Documentation</a>
     */
    var clockTrackedDataSource: DataSource

    /**
     * Show an error panel to the user containing a title and a longer error message,
     * which can be dismissed using an OK button.  This panel is displayed automatically
     * when a render loop error occurs, if showRenderLoopErrors was not false when the
     * widget was constructed.
     * @param [title] The title to be displayed on the error panel.  This string is interpreted as text.
     * @param [message] A helpful, user-facing message to display prior to the detailed error information.  This string is interpreted as HTML.
     * @param [error] The error to be displayed on the error panel.  This string is formatted using [formatError] and then displayed as text.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#showErrorPanel">Online Documentation</a>
     */
    fun showErrorPanel(
        title: String,
        message: String? = definedExternally,
        error: String? = definedExternally,
    )

    /**
     * @return true if the object has been destroyed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the widget.  Should be called if permanently
     * removing the widget from layout.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#destroy">Online Documentation</a>
     */
    fun destroy()

    /**
     * Updates the canvas size, camera aspect ratio, and viewport size.
     * This function is called automatically as needed unless
     * `useDefaultRenderLoop` is set to false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#resize">Online Documentation</a>
     */
    fun resize()

    /**
     * Renders the scene.  This function is called automatically
     * unless `useDefaultRenderLoop` is set to false;
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#render">Online Documentation</a>
     */
    fun render()

    /**
     * Asynchronously sets the camera to view the provided entity, entities, or data source.
     * If the data source is still in the process of loading or the visualization is otherwise still loading,
     * this method waits for the data to be ready before performing the zoom.
     *
     * The offset is heading/pitch/range in the local east-north-up reference frame centered at the center of the bounding sphere.
     * The heading and the pitch angles are defined in the local east-north-up reference frame.
     * The heading is the angle from y axis and increasing towards the x axis. Pitch is the rotation from the xy-plane. Positive pitch
     * angles are above the plane. Negative pitch angles are below the plane. The range is the distance from the center. If the range is
     * zero, a range will be computed such that the whole bounding sphere is visible.
     *
     * In 2D, there must be a top down view. The camera will be placed above the target looking down. The height above the
     * target will be the range. The heading will be determined from the offset. If the heading cannot be
     * determined from the offset, the heading will be north.
     * @param [target] The entity, array of entities, entity collection, data source, Cesium3DTileset, point cloud, or imagery layer to view. You can also pass a promise that resolves to one of the previously mentioned types.
     * @param [offset] The offset from the center of the entity in the local east-north-up reference frame.
     * @return A Promise that resolves to true if the zoom was successful or false if the target is not currently visualized in the scene or the zoom was cancelled.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#zoomTo">Online Documentation</a>
     */
    @JsAsync
    suspend fun zoomTo(
        target: Entity,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: Entity,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun zoomTo(
        target: ReadonlyArray<Entity>,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: ReadonlyArray<Entity>,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun zoomTo(
        target: EntityCollection,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: EntityCollection,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun zoomTo(
        target: DataSource,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: DataSource,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun zoomTo(
        target: ImageryLayer,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: ImageryLayer,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun zoomTo(
        target: Cesium3DTileset,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: Cesium3DTileset,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun zoomTo(
        target: TimeDynamicPointCloud,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: TimeDynamicPointCloud,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun zoomTo(
        target: Promise<Entity>,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: Promise<Entity>,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun zoomTo(
        target: Promise<ReadonlyArray<Entity>>,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: Promise<ReadonlyArray<Entity>>,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun zoomTo(
        target: Promise<EntityCollection>,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: Promise<EntityCollection>,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun zoomTo(
        target: Promise<DataSource>,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: Promise<DataSource>,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun zoomTo(
        target: Promise<ImageryLayer>,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: Promise<ImageryLayer>,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun zoomTo(
        target: Promise<Cesium3DTileset>,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: Promise<Cesium3DTileset>,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun zoomTo(
        target: Promise<TimeDynamicPointCloud>,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: Promise<TimeDynamicPointCloud>,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun zoomTo(
        target: Promise<VoxelPrimitive>,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: Promise<VoxelPrimitive>,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<Boolean>

    /**
     * Flies the camera to the provided entity, entities, or data source.
     * If the data source is still in the process of loading or the visualization is otherwise still loading,
     * this method waits for the data to be ready before performing the flight.
     *
     * The offset is heading/pitch/range in the local east-north-up reference frame centered at the center of the bounding sphere.
     * The heading and the pitch angles are defined in the local east-north-up reference frame.
     * The heading is the angle from y axis and increasing towards the x axis. Pitch is the rotation from the xy-plane. Positive pitch
     * angles are above the plane. Negative pitch angles are below the plane. The range is the distance from the center. If the range is
     * zero, a range will be computed such that the whole bounding sphere is visible.
     *
     * In 2D, there must be a top down view. The camera will be placed above the target looking down. The height above the
     * target will be the range. The heading will be determined from the offset. If the heading cannot be
     * determined from the offset, the heading will be north.
     * @param [target] The entity, array of entities, entity collection, data source, Cesium3DTileset, point cloud, or imagery layer to view. You can also pass a promise that resolves to one of the previously mentioned types.
     * @return A Promise that resolves to true if the flight was successful or false if the target is not currently visualized in the scene or the flight was cancelled. //TODO: Cleanup entity mentions
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumWidget.html#flyTo">Online Documentation</a>
     */
    @JsAsync
    suspend fun flyTo(
        target: Entity,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: Entity,
        options: FlyToOptions? = definedExternally,
    ): Promise<Boolean>

    /**
     * @property [duration] The duration of the flight in seconds.
     *   Default value - `3.0`
     * @property [maximumHeight] The maximum height at the peak of the flight.
     * @property [offset] The offset from the target in the local east-north-up reference frame centered at the target.
     */
    @JsPlainObject
    interface FlyToOptions {
        var duration: Double?
        var maximumHeight: Double?
        var offset: HeadingPitchRange?
    }

    @JsAsync
    suspend fun flyTo(
        target: ReadonlyArray<Entity>,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: ReadonlyArray<Entity>,
        options: FlyToOptions? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun flyTo(
        target: EntityCollection,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: EntityCollection,
        options: FlyToOptions? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun flyTo(
        target: DataSource,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: DataSource,
        options: FlyToOptions? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun flyTo(
        target: ImageryLayer,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: ImageryLayer,
        options: FlyToOptions? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun flyTo(
        target: Cesium3DTileset,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: Cesium3DTileset,
        options: FlyToOptions? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun flyTo(
        target: TimeDynamicPointCloud,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: TimeDynamicPointCloud,
        options: FlyToOptions? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun flyTo(
        target: Promise<Entity>,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: Promise<Entity>,
        options: FlyToOptions? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun flyTo(
        target: Promise<ReadonlyArray<Entity>>,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: Promise<ReadonlyArray<Entity>>,
        options: FlyToOptions? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun flyTo(
        target: Promise<EntityCollection>,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: Promise<EntityCollection>,
        options: FlyToOptions? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun flyTo(
        target: Promise<DataSource>,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: Promise<DataSource>,
        options: FlyToOptions? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun flyTo(
        target: Promise<ImageryLayer>,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: Promise<ImageryLayer>,
        options: FlyToOptions? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun flyTo(
        target: Promise<Cesium3DTileset>,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: Promise<Cesium3DTileset>,
        options: FlyToOptions? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun flyTo(
        target: Promise<TimeDynamicPointCloud>,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: Promise<TimeDynamicPointCloud>,
        options: FlyToOptions? = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun flyTo(
        target: Promise<VoxelPrimitive>,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: Promise<VoxelPrimitive>,
        options: FlyToOptions? = definedExternally,
    ): Promise<Boolean>
}
