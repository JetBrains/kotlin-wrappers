// Automatically generated - do not modify!

@file:JsModule("@cesium/widgets")

package cesium.widgets

import cesium.engine.*
import js.array.ReadonlyArray
import js.core.JsAny
import js.core.JsBoolean
import js.objects.JsPlainObject
import js.promise.Promise
import seskar.js.JsAsync
import web.dom.Element
import web.html.HTMLCanvasElement

/**
 * A base widget for building applications.  It composites all of the standard Cesium widgets into one reusable package.
 * The widget can always be extended by using mixins, which add functionality useful for a variety of applications.
 * ```
 * // Initialize the viewer widget with several custom options and mixins.
 * try {
 *   const viewer = new Viewer("cesiumContainer", {
 *     // Start in Columbus Viewer
 *     sceneMode: SceneMode.COLUMBUS_VIEW,
 *     // Use Cesium World Terrain
 *     terrain: Terrain.fromWorldTerrain(),
 *     // Hide the base layer picker
 *     baseLayerPicker: false,
 *     // Use OpenStreetMaps
 *     baseLayer: new ImageryLayer(new OpenStreetMapImageryProvider({
 *       url: "https://tile.openstreetmap.org/"
 *     })),
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
 *     mapProjection: new WebMercatorProjection()
 *   });
 * } catch (error) {
 *   console.log(error);
 * }
 *
 * // Add basic drag and drop functionality
 * viewer.extend(viewerDragDropMixin);
 *
 * // Show a pop-up alert if we encounter an error when processing a dropped file
 * viewer.dropError.addEventListener(function(dropHandler, name, error) {
 *   console.log(error);
 *   window.alert(error);
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html">Online Documentation</a>
 *
 * @constructor
 * @property [container] The DOM element that will contain the widget.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html">Online Documentation</a>
 */
external class Viewer(
    val container: Element,
    options: ConstructorOptions? = definedExternally,
) {
    /**
     * Manages the list of credits to display on screen and in the lightbox.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#creditDisplay">Online Documentation</a>
     */
    var creditDisplay: CreditDisplay

    /**
     * Gets the DOM element for the area at the bottom of the window containing the
     * [CreditDisplay] and potentially other things.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#bottomContainer">Online Documentation</a>
     */
    val bottomContainer: Element

    /**
     * Gets the CesiumWidget.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#cesiumWidget">Online Documentation</a>
     */
    val cesiumWidget: CesiumWidget

    /**
     * Gets the selection indicator.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#selectionIndicator">Online Documentation</a>
     */
    val selectionIndicator: SelectionIndicator

    /**
     * Gets the info box.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#infoBox">Online Documentation</a>
     */
    val infoBox: InfoBox

    /**
     * Gets the Geocoder.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#geocoder">Online Documentation</a>
     */
    val geocoder: Geocoder

    /**
     * Gets the HomeButton.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#homeButton">Online Documentation</a>
     */
    val homeButton: HomeButton

    /**
     * Gets the SceneModePicker.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#sceneModePicker">Online Documentation</a>
     */
    val sceneModePicker: SceneModePicker

    /**
     * Gets the ProjectionPicker.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#projectionPicker">Online Documentation</a>
     */
    val projectionPicker: ProjectionPicker

    /**
     * Gets the BaseLayerPicker.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#baseLayerPicker">Online Documentation</a>
     */
    val baseLayerPicker: BaseLayerPicker

    /**
     * Gets the NavigationHelpButton.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#navigationHelpButton">Online Documentation</a>
     */
    val navigationHelpButton: NavigationHelpButton

    /**
     * Gets the Animation widget.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#animation">Online Documentation</a>
     */
    val animation: Animation

    /**
     * Gets the Timeline widget.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#timeline">Online Documentation</a>
     */
    val timeline: Timeline

    /**
     * Gets the FullscreenButton.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#fullscreenButton">Online Documentation</a>
     */
    val fullscreenButton: FullscreenButton

    /**
     * Gets the VRButton.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#vrButton">Online Documentation</a>
     */
    val vrButton: VRButton

    /**
     * Gets the display used for [DataSource] visualization.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#dataSourceDisplay">Online Documentation</a>
     */
    val dataSourceDisplay: DataSourceDisplay

    /**
     * Gets the collection of entities not tied to a particular data source.
     * This is a shortcut to [dataSourceDisplay.defaultDataSource.entities][Viewer.dataSourceDisplay].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#entities">Online Documentation</a>
     */
    val entities: EntityCollection

    /**
     * Gets the set of [DataSource] instances to be visualized.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#dataSources">Online Documentation</a>
     */
    val dataSources: DataSourceCollection

    /**
     * Gets the canvas.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#canvas">Online Documentation</a>
     */
    val canvas: HTMLCanvasElement

    /**
     * Gets the scene.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#scene">Online Documentation</a>
     */
    val scene: Scene

    /**
     * Determines if shadows are cast by light sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#shadows">Online Documentation</a>
     */
    var shadows: Boolean

    /**
     * Determines if the terrain casts or shadows from light sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#terrainShadows">Online Documentation</a>
     */
    var terrainShadows: ShadowMode

    /**
     * Get the scene's shadow map
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#shadowMap">Online Documentation</a>
     */
    val shadowMap: ShadowMap

    /**
     * Gets the collection of image layers that will be rendered on the globe.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#imageryLayers">Online Documentation</a>
     */
    val imageryLayers: ImageryLayerCollection

    /**
     * The terrain provider providing surface geometry for the globe.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#terrainProvider">Online Documentation</a>
     */
    var terrainProvider: TerrainProvider

    /**
     * Gets the camera.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#camera">Online Documentation</a>
     */
    val camera: Camera

    /**
     * Gets the default ellipsoid for the scene.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#ellipsoid">Online Documentation</a>
     */
    val ellipsoid: Ellipsoid

    /**
     * Gets the post-process stages.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#postProcessStages">Online Documentation</a>
     */
    val postProcessStages: PostProcessStageCollection

    /**
     * Gets the clock.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#clock">Online Documentation</a>
     */
    val clock: Clock

    /**
     * Gets the clock view model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#clockViewModel">Online Documentation</a>
     */
    val clockViewModel: ClockViewModel

    /**
     * Gets the screen space event handler.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#screenSpaceEventHandler">Online Documentation</a>
     */
    val screenSpaceEventHandler: ScreenSpaceEventHandler

    /**
     * Gets or sets the target frame rate of the widget when `useDefaultRenderLoop`
     * is true. If undefined, the browser's requestAnimationFrame implementation
     * determines the frame rate.  If defined, this value must be greater than 0.  A value higher
     * than the underlying requestAnimationFrame implementation will have no effect.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#targetFrameRate">Online Documentation</a>
     */
    var targetFrameRate: Int

    /**
     * Gets or sets whether or not this widget should control the render loop.
     * If true the widget will use requestAnimationFrame to
     * perform rendering and resizing of the widget, as well as drive the
     * simulation clock. If set to false, you must manually call the
     * `resize`, `render` methods
     * as part of a custom render loop.  If an error occurs during rendering, [Scene]'s
     * `renderError` event will be raised and this property
     * will be set to false.  It must be set back to true to continue rendering
     * after the error.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#useDefaultRenderLoop">Online Documentation</a>
     */
    var useDefaultRenderLoop: Boolean

    /**
     * Gets or sets a scaling factor for rendering resolution.  Values less than 1.0 can improve
     * performance on less powerful devices while values greater than 1.0 will render at a higher
     * resolution and then scale down, resulting in improved visual fidelity.
     * For example, if the widget is laid out at a size of 640x480, setting this value to 0.5
     * will cause the scene to be rendered at 320x240 and then scaled up while setting
     * it to 2.0 will cause the scene to be rendered at 1280x960 and then scaled down.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#resolutionScale">Online Documentation</a>
     */
    var resolutionScale: Double

    /**
     * Boolean flag indicating if the browser's recommended resolution is used.
     * If true, the browser's device pixel ratio is ignored and 1.0 is used instead,
     * effectively rendering based on CSS pixels instead of device pixels. This can improve
     * performance on less powerful devices that have high pixel density. When false, rendering
     * will be in device pixels. [Viewer.resolutionScale] will still take effect whether
     * this flag is true or false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#useBrowserRecommendedResolution">Online Documentation</a>
     */
    var useBrowserRecommendedResolution: Boolean

    /**
     * Gets or sets whether or not data sources can temporarily pause
     * animation in order to avoid showing an incomplete picture to the user.
     * For example, if asynchronous primitives are being processed in the
     * background, the clock will not advance until the geometry is ready.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#allowDataSourcesToSuspendAnimation">Online Documentation</a>
     */
    var allowDataSourcesToSuspendAnimation: Boolean

    /**
     * Gets or sets the Entity instance currently being tracked by the camera.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#trackedEntity">Online Documentation</a>
     */
    var trackedEntity: Entity?

    /**
     * Gets or sets the object instance for which to display a selection indicator.
     *
     * If a user interactively picks a Cesium3DTilesFeature instance, then this property
     * will contain a transient Entity instance with a property named "feature" that is
     * the instance that was picked.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#selectedEntity">Online Documentation</a>
     */
    var selectedEntity: Entity?

    /**
     * Gets the event that is raised when the selected entity changes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#selectedEntityChanged">Online Documentation</a>
     */
    val selectedEntityChanged: DefaultEvent

    /**
     * Gets the event that is raised when the tracked entity changes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#trackedEntityChanged">Online Documentation</a>
     */
    val trackedEntityChanged: DefaultEvent

    /**
     * Gets or sets the data source to track with the viewer's clock.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#clockTrackedDataSource">Online Documentation</a>
     */
    var clockTrackedDataSource: DataSource

    /**
     * Extends the base viewer functionality with the provided mixin.
     * A mixin may add additional properties, functions, or other behavior
     * to the provided viewer instance.
     * @param [mixin] The Viewer mixin to add to this instance.
     * @param [options] The options object to be passed to the mixin function.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#extend">Online Documentation</a>
     */
    fun extend(
        mixin: ViewerMixin,
        options: JsAny? = definedExternally,
    )

    /**
     * Resizes the widget to match the container size.
     * This function is called automatically as needed unless
     * `useDefaultRenderLoop` is set to false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#resize">Online Documentation</a>
     */
    fun resize()

    /**
     * This forces the widget to re-think its layout, including
     * widget sizes and credit placement.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#forceResize">Online Documentation</a>
     */
    fun forceResize()

    /**
     * Renders the scene.  This function is called automatically
     * unless `useDefaultRenderLoop` is set to false;
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#render">Online Documentation</a>
     */
    fun render()

    /**
     * @return true if the object has been destroyed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the widget.  Should be called if permanently
     * removing the widget from layout.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#destroy">Online Documentation</a>
     */
    fun destroy()

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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#zoomTo">Online Documentation</a>
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun zoomTo(
        target: Entity,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: Entity,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun zoomTo(
        target: ReadonlyArray<Entity>,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: ReadonlyArray<Entity>,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun zoomTo(
        target: EntityCollection,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: EntityCollection,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun zoomTo(
        target: DataSource,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: DataSource,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun zoomTo(
        target: ImageryLayer,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: ImageryLayer,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun zoomTo(
        target: Cesium3DTileset,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: Cesium3DTileset,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun zoomTo(
        target: TimeDynamicPointCloud,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: TimeDynamicPointCloud,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun zoomTo(
        target: Promise<Entity>,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: Promise<Entity>,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun zoomTo(
        target: Promise<ReadonlyArray<Entity>>,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: Promise<ReadonlyArray<Entity>>,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun zoomTo(
        target: Promise<EntityCollection>,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: Promise<EntityCollection>,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun zoomTo(
        target: Promise<DataSource>,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: Promise<DataSource>,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun zoomTo(
        target: Promise<ImageryLayer>,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: Promise<ImageryLayer>,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun zoomTo(
        target: Promise<Cesium3DTileset>,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: Promise<Cesium3DTileset>,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun zoomTo(
        target: Promise<TimeDynamicPointCloud>,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: Promise<TimeDynamicPointCloud>,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun zoomTo(
        target: Promise<VoxelPrimitive>,
        offset: HeadingPitchRange? = definedExternally,
    ): Boolean

    @JsName("zoomTo")
    fun zoomToAsync(
        target: Promise<VoxelPrimitive>,
        offset: HeadingPitchRange? = definedExternally,
    ): Promise<JsBoolean>

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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#flyTo">Online Documentation</a>
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun flyTo(
        target: Entity,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: Entity,
        options: FlyToOptions? = definedExternally,
    ): Promise<JsBoolean>

    /**
     * @property [duration] The duration of the flight in seconds.
     *   Default value - `3.0`
     * @property [maximumHeight] The maximum height at the peak of the flight.
     * @property [offset] The offset from the target in the local east-north-up reference frame centered at the target.
     */
    @JsPlainObject
    interface FlyToOptions {
        val duration: Double?
        val maximumHeight: Double?
        val offset: HeadingPitchRange?
    }

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun flyTo(
        target: ReadonlyArray<Entity>,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: ReadonlyArray<Entity>,
        options: FlyToOptions? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun flyTo(
        target: EntityCollection,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: EntityCollection,
        options: FlyToOptions? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun flyTo(
        target: DataSource,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: DataSource,
        options: FlyToOptions? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun flyTo(
        target: ImageryLayer,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: ImageryLayer,
        options: FlyToOptions? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun flyTo(
        target: Cesium3DTileset,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: Cesium3DTileset,
        options: FlyToOptions? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun flyTo(
        target: TimeDynamicPointCloud,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: TimeDynamicPointCloud,
        options: FlyToOptions? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun flyTo(
        target: Promise<Entity>,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: Promise<Entity>,
        options: FlyToOptions? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun flyTo(
        target: Promise<ReadonlyArray<Entity>>,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: Promise<ReadonlyArray<Entity>>,
        options: FlyToOptions? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun flyTo(
        target: Promise<EntityCollection>,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: Promise<EntityCollection>,
        options: FlyToOptions? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun flyTo(
        target: Promise<DataSource>,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: Promise<DataSource>,
        options: FlyToOptions? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun flyTo(
        target: Promise<ImageryLayer>,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: Promise<ImageryLayer>,
        options: FlyToOptions? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun flyTo(
        target: Promise<Cesium3DTileset>,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: Promise<Cesium3DTileset>,
        options: FlyToOptions? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun flyTo(
        target: Promise<TimeDynamicPointCloud>,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: Promise<TimeDynamicPointCloud>,
        options: FlyToOptions? = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun flyTo(
        target: Promise<VoxelPrimitive>,
        options: FlyToOptions? = definedExternally,
    ): Boolean

    @JsName("flyTo")
    fun flyToAsync(
        target: Promise<VoxelPrimitive>,
        options: FlyToOptions? = definedExternally,
    ): Promise<JsBoolean>

    /**
     * Initialization options for the Viewer constructor
     * @property [animation] If set to false, the Animation widget will not be created.
     *   Default value - `true`
     * @property [baseLayerPicker] If set to false, the BaseLayerPicker widget will not be created.
     *   Default value - `true`
     * @property [fullscreenButton] If set to false, the FullscreenButton widget will not be created.
     *   Default value - `true`
     * @property [vrButton] If set to true, the VRButton widget will be created.
     *   Default value - `false`
     * @property [geocoder] The geocoding service or services to use when searching with the Geocoder widget. If set to false, the Geocoder widget will not be created.
     *   Default value - [IonGeocodeProviderType.DEFAULT]
     * @property [homeButton] If set to false, the HomeButton widget will not be created.
     *   Default value - `true`
     * @property [infoBox] If set to false, the InfoBox widget will not be created.
     *   Default value - `true`
     * @property [sceneModePicker] If set to false, the SceneModePicker widget will not be created.
     *   Default value - `true`
     * @property [selectionIndicator] If set to false, the SelectionIndicator widget will not be created.
     *   Default value - `true`
     * @property [timeline] If set to false, the Timeline widget will not be created.
     *   Default value - `true`
     * @property [navigationHelpButton] If set to false, the navigation help button will not be created.
     *   Default value - `true`
     * @property [navigationInstructionsInitiallyVisible] True if the navigation instructions should initially be visible, or false if the should not be shown until the user explicitly clicks the button.
     *   Default value - `true`
     * @property [scene3DOnly] When `true`, each geometry instance will only be rendered in 3D to save GPU memory.
     *   Default value - `false`
     * @property [shouldAnimate] `true` if the clock should attempt to advance simulation time by default, `false` otherwise.  This option takes precedence over setting [Viewer.clockViewModel].
     *   Default value - `false`
     * @property [clockViewModel] The clock view model to use to control current time.
     *   Default value - [ClockViewModel(clock)][ClockViewModel]
     * @property [selectedImageryProviderViewModel] The view model for the current base imagery layer, if not supplied the first available base layer is used.  This value is only valid if `baseLayerPicker` is set to true.
     * @property [imageryProviderViewModels] The array of ProviderViewModels to be selectable from the BaseLayerPicker.  This value is only valid if `baseLayerPicker` is set to true.
     *   Default value - `createDefaultImageryProviderViewModels()`
     * @property [selectedTerrainProviderViewModel] The view model for the current base terrain layer, if not supplied the first available base layer is used.  This value is only valid if `baseLayerPicker` is set to true.
     * @property [terrainProviderViewModels] The array of ProviderViewModels to be selectable from the BaseLayerPicker.  This value is only valid if `baseLayerPicker` is set to true.
     *   Default value - `createDefaultTerrainProviderViewModels()`
     * @property [baseLayer] The bottommost imagery layer applied to the globe. If set to `false`, no imagery provider will be added. This value is only valid if `baseLayerPicker` is set to false. Cannot be used when `globe` is set to false.
     *   Default value - `ImageryLayer.fromWorldImagery()`
     * @property [ellipsoid] The default ellipsoid.
     *   Default value - [Ellipsoid.default]
     * @property [terrainProvider] The terrain provider to use
     *   Default value - [EllipsoidTerrainProvider()][EllipsoidTerrainProvider]
     * @property [terrain] A terrain object which handles asynchronous terrain provider. Can only specify if options.terrainProvider is undefined.
     * @property [skyBox] The skybox used to render the stars. When `undefined` and the WGS84 ellipsoid used, the default stars are used. If set to `false`, no skyBox, Sun, or Moon will be added.
     * @property [skyAtmosphere] Blue sky, and the glow around the Earth's limb. Enabled when the WGS84 ellipsoid used. Set to `false` to turn it off.
     * @property [fullscreenElement] The element or id to be placed into fullscreen mode when the full screen button is pressed.
     *   Default value - `document.body`
     * @property [useDefaultRenderLoop] True if this widget should control the render loop, false otherwise.
     *   Default value - `true`
     * @property [targetFrameRate] The target frame rate when using the default render loop.
     * @property [showRenderLoopErrors] If true, this widget will automatically display an HTML panel to the user containing the error, if a render loop error occurs.
     *   Default value - `true`
     * @property [useBrowserRecommendedResolution] If true, render at the browser's recommended resolution and ignore `window.devicePixelRatio`.
     *   Default value - `true`
     * @property [automaticallyTrackDataSourceClocks] If true, this widget will automatically track the clock settings of newly added DataSources, updating if the DataSource's clock changes.  Set this to false if you want to configure the clock independently.
     *   Default value - `true`
     * @property [contextOptions] Context and WebGL creation properties passed to [Scene].
     * @property [sceneMode] The initial scene mode.
     *   Default value - [SceneMode.SCENE3D]
     * @property [mapProjection] The map projection to use in 2D and Columbus View modes.
     *   Default value - [GeographicProjection(options.ellipsoid)][GeographicProjection]
     * @property [globe] The globe to use in the scene.  If set to `false`, no globe will be added and the sky atmosphere will be hidden by default.
     *   Default value - [Globe(options.ellipsoid)][Globe]
     * @property [orderIndependentTranslucency] If true and the configuration supports it, use order independent translucency.
     *   Default value - `true`
     * @property [creditContainer] The DOM element that will contain the [CreditDisplay].  If not specified, the credits are added to the bottom of the widget itself.
     * @property [creditViewport] The DOM element that will contain the credit pop up created by the [CreditDisplay].  If not specified, it will appear over the widget itself.
     * @property [dataSources] The collection of data sources visualized by the widget.  If this parameter is provided,
     *   the instance is assumed to be owned by the caller and will not be destroyed when the viewer is destroyed.
     *   Default value - [DataSourceCollection()][DataSourceCollection]
     * @property [shadows] Determines if shadows are cast by light sources.
     *   Default value - `false`
     * @property [terrainShadows] Determines if the terrain casts or receives shadows from light sources.
     *   Default value - [ShadowMode.RECEIVE_ONLY]
     * @property [mapMode2D] Determines if the 2D map is rotatable or can be scrolled infinitely in the horizontal direction.
     *   Default value - [MapMode2D.INFINITE_SCROLL]
     * @property [projectionPicker] If set to true, the ProjectionPicker widget will be created.
     *   Default value - `false`
     * @property [blurActiveElementOnCanvasFocus] If true, the active element will blur when the viewer's canvas is clicked. Setting this to false is useful for cases when the canvas is clicked only for retrieving position or an entity data without actually meaning to set the canvas to be the active element.
     *   Default value - `true`
     * @property [requestRenderMode] If true, rendering a frame will only occur when needed as determined by changes within the scene. Enabling reduces the CPU/GPU usage of your application and uses less battery on mobile, but requires using [Scene.requestRender] to render a new frame explicitly in this mode. This will be necessary in many cases after making changes to the scene in other parts of the API. See [Improving Performance with Explicit Rendering](https://cesium.com/blog/2018/01/24/cesium-scene-rendering-performance/).
     *   Default value - `false`
     * @property [maximumRenderTimeChange] If requestRenderMode is true, this value defines the maximum change in simulation time allowed before a render is requested. See [Improving Performance with Explicit Rendering](https://cesium.com/blog/2018/01/24/cesium-scene-rendering-performance/).
     *   Default value - `0.0`
     * @property [depthPlaneEllipsoidOffset] Adjust the DepthPlane to address rendering artefacts below ellipsoid zero elevation.
     *   Default value - `0.0`
     * @property [msaaSamples] If provided, this value controls the rate of multisample antialiasing. Typical multisampling rates are 2, 4, and sometimes 8 samples per pixel. Higher sampling rates of MSAA may impact performance in exchange for improved visual quality. This value only applies to WebGL2 contexts that support multisample render targets. Set to 1 to disable MSAA.
     *   Default value - `4`
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Viewer.html#.ConstructorOptions">Online Documentation</a>
     */
    @JsPlainObject
    interface ConstructorOptions {
        val animation: Boolean?
        val baseLayerPicker: Boolean?
        val fullscreenButton: Boolean?
        val vrButton: Boolean?
        val geocoder: JsAny /* boolean | IonGeocodeProviderType | GeocoderService[] */?
        val homeButton: Boolean?
        val infoBox: Boolean?
        val sceneModePicker: Boolean?
        val selectionIndicator: Boolean?
        val timeline: Boolean?
        val navigationHelpButton: Boolean?
        val navigationInstructionsInitiallyVisible: Boolean?
        val scene3DOnly: Boolean?
        val shouldAnimate: Boolean?
        val clockViewModel: ClockViewModel?
        val selectedImageryProviderViewModel: ProviderViewModel?
        val imageryProviderViewModels: ReadonlyArray<ProviderViewModel>?
        val selectedTerrainProviderViewModel: ProviderViewModel?
        val terrainProviderViewModels: ReadonlyArray<ProviderViewModel>?
        val baseLayer: ImageryLayer /* | false */?
        val ellipsoid: Ellipsoid?
        val terrainProvider: TerrainProvider?
        val terrain: Terrain?
        val skyBox: SkyBox /* | false */?
        val skyAtmosphere: SkyAtmosphere /* | false */?
        val fullscreenElement: Element?
        val useDefaultRenderLoop: Boolean?
        val targetFrameRate: Int?
        val showRenderLoopErrors: Boolean?
        val useBrowserRecommendedResolution: Boolean?
        val automaticallyTrackDataSourceClocks: Boolean?
        val contextOptions: ContextOptions?
        val sceneMode: SceneMode?
        val mapProjection: MapProjection?
        val globe: Globe /* | false */?
        val orderIndependentTranslucency: Boolean?
        val creditContainer: Element?
        val creditViewport: Element?
        val dataSources: DataSourceCollection?
        val shadows: Boolean?
        val terrainShadows: ShadowMode?
        val mapMode2D: MapMode2D?
        val projectionPicker: Boolean?
        val blurActiveElementOnCanvasFocus: Boolean?
        val requestRenderMode: Boolean?
        val maximumRenderTimeChange: Double?
        val depthPlaneEllipsoidOffset: Double?
        val msaaSamples: Double?
    }
}
