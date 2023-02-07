// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.jso
import kotlin.js.Promise

/**
 * A [3D Tiles tileset](https://github.com/CesiumGS/3d-tiles/tree/main/specification),
 * used for streaming massive heterogeneous 3D geospatial datasets.
 * ```
 * const tileset = scene.primitives.add(new Cesium3DTileset({
 *      url : 'http://localhost:8002/tilesets/Seattle/tileset.json'
 * }));
 * ```
 * ```
 * // Common setting for the skipLevelOfDetail optimization
 * const tileset = scene.primitives.add(new Cesium3DTileset({
 *      url : 'http://localhost:8002/tilesets/Seattle/tileset.json',
 *      skipLevelOfDetail : true,
 *      baseScreenSpaceError : 1024,
 *      skipScreenSpaceErrorFactor : 16,
 *      skipLevels : 1,
 *      immediatelyLoadDesiredLevelOfDetail : false,
 *      loadSiblings : false,
 *      cullWithChildrenBounds : true
 * }));
 * ```
 * ```
 * // Common settings for the dynamicScreenSpaceError optimization
 * const tileset = scene.primitives.add(new Cesium3DTileset({
 *      url : 'http://localhost:8002/tilesets/Seattle/tileset.json',
 *      dynamicScreenSpaceError : true,
 *      dynamicScreenSpaceErrorDensity : 0.00278,
 *      dynamicScreenSpaceErrorFactor : 4.0,
 *      dynamicScreenSpaceErrorHeightFalloff : 0.25
 * }));
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html">Online Documentation</a>
 */
external class Cesium3DTileset(options: ConstructorOptions) {
    /**
     * @property [url] The url to a tileset JSON file.
     * @property [show] Determines if the tileset will be shown.
     *   Default value - `true`
     * @property [modelMatrix] A 4x4 transformation matrix that transforms the tileset's root tile.
     *   Default value - [Matrix4.IDENTITY]
     * @property [modelUpAxis] Which axis is considered up when loading models for tile contents.
     *   Default value - [Axis.Y]
     * @property [modelForwardAxis] Which axis is considered forward when loading models for tile contents.
     *   Default value - [Axis.X]
     * @property [shadows] Determines whether the tileset casts or receives shadows from light sources.
     *   Default value - [ShadowMode.ENABLED]
     * @property [maximumScreenSpaceError] The maximum screen space error used to drive level of detail refinement.
     *   Default value - `16`
     * @property [maximumMemoryUsage] The maximum amount of memory in MB that can be used by the tileset.
     *   Default value - `512`
     * @property [cullWithChildrenBounds] Optimization option. Whether to cull tiles using the union of their children bounding volumes.
     *   Default value - `true`
     * @property [cullRequestsWhileMoving] Optimization option. Don't request tiles that will likely be unused when they come back because of the camera's movement. This optimization only applies to stationary tilesets.
     *   Default value - `true`
     * @property [cullRequestsWhileMovingMultiplier] Optimization option. Multiplier used in culling requests while moving. Larger is more aggressive culling, smaller less aggressive culling.
     *   Default value - `60.0`
     * @property [preloadWhenHidden] Preload tiles when `tileset.show` is `false`. Loads tiles as if the tileset is visible but does not render them.
     *   Default value - `false`
     * @property [preloadFlightDestinations] Optimization option. Preload tiles at the camera's flight destination while the camera is in flight.
     *   Default value - `true`
     * @property [preferLeaves] Optimization option. Prefer loading of leaves first.
     *   Default value - `false`
     * @property [dynamicScreenSpaceError] Optimization option. Reduce the screen space error for tiles that are further away from the camera.
     *   Default value - `false`
     * @property [dynamicScreenSpaceErrorDensity] Density used to adjust the dynamic screen space error, similar to fog density.
     *   Default value - `0.00278`
     * @property [dynamicScreenSpaceErrorFactor] A factor used to increase the computed dynamic screen space error.
     *   Default value - `4.0`
     * @property [dynamicScreenSpaceErrorHeightFalloff] A ratio of the tileset's height at which the density starts to falloff.
     *   Default value - `0.25`
     * @property [progressiveResolutionHeightFraction] Optimization option. If between (0.0, 0.5], tiles at or above the screen space error for the reduced screen resolution of `progressiveResolutionHeightFraction*screenHeight` will be prioritized first. This can help get a quick layer of tiles down while full resolution tiles continue to load.
     *   Default value - `0.3`
     * @property [foveatedScreenSpaceError] Optimization option. Prioritize loading tiles in the center of the screen by temporarily raising the screen space error for tiles around the edge of the screen. Screen space error returns to normal once all the tiles in the center of the screen as determined by the [Cesium3DTileset.foveatedConeSize] are loaded.
     *   Default value - `true`
     * @property [foveatedConeSize] Optimization option. Used when [Cesium3DTileset.foveatedScreenSpaceError] is true to control the cone size that determines which tiles are deferred. Tiles that are inside this cone are loaded immediately. Tiles outside the cone are potentially deferred based on how far outside the cone they are and their screen space error. This is controlled by [Cesium3DTileset.foveatedInterpolationCallback] and [Cesium3DTileset.foveatedMinimumScreenSpaceErrorRelaxation]. Setting this to 0.0 means the cone will be the line formed by the camera position and its view direction. Setting this to 1.0 means the cone encompasses the entire field of view of the camera, disabling the effect.
     *   Default value - `0.1`
     * @property [foveatedMinimumScreenSpaceErrorRelaxation] Optimization option. Used when [Cesium3DTileset.foveatedScreenSpaceError] is true to control the starting screen space error relaxation for tiles outside the foveated cone. The screen space error will be raised starting with tileset value up to [Cesium3DTileset.maximumScreenSpaceError] based on the provided [Cesium3DTileset.foveatedInterpolationCallback].
     *   Default value - `0.0`
     * @property [foveatedInterpolationCallback] Optimization option. Used when [Cesium3DTileset.foveatedScreenSpaceError] is true to control how much to raise the screen space error for tiles outside the foveated cone, interpolating between [Cesium3DTileset.foveatedMinimumScreenSpaceErrorRelaxation] and [Cesium3DTileset.maximumScreenSpaceError]
     *   Default value - [Math.lerp]
     * @property [foveatedTimeDelay] Optimization option. Used when [Cesium3DTileset.foveatedScreenSpaceError] is true to control how long in seconds to wait after the camera stops moving before deferred tiles start loading in. This time delay prevents requesting tiles around the edges of the screen when the camera is moving. Setting this to 0.0 will immediately request all tiles in any given view.
     *   Default value - `0.2`
     * @property [skipLevelOfDetail] Optimization option. Determines if level of detail skipping should be applied during the traversal.
     *   Default value - `false`
     * @property [baseScreenSpaceError] When `skipLevelOfDetail` is `true`, the screen space error that must be reached before skipping levels of detail.
     *   Default value - `1024`
     * @property [skipScreenSpaceErrorFactor] When `skipLevelOfDetail` is `true`, a multiplier defining the minimum screen space error to skip. Used in conjunction with `skipLevels` to determine which tiles to load.
     *   Default value - `16`
     * @property [skipLevels] When `skipLevelOfDetail` is `true`, a constant defining the minimum number of levels to skip when loading tiles. When it is 0, no levels are skipped. Used in conjunction with `skipScreenSpaceErrorFactor` to determine which tiles to load.
     *   Default value - `1`
     * @property [immediatelyLoadDesiredLevelOfDetail] When `skipLevelOfDetail` is `true`, only tiles that meet the maximum screen space error will ever be downloaded. Skipping factors are ignored and just the desired tiles are loaded.
     *   Default value - `false`
     * @property [loadSiblings] When `skipLevelOfDetail` is `true`, determines whether siblings of visible tiles are always downloaded during traversal.
     *   Default value - `false`
     * @property [clippingPlanes] The [ClippingPlaneCollection] used to selectively disable rendering the tileset.
     * @property [classificationType] Determines whether terrain, 3D Tiles or both will be classified by this tileset. See [Cesium3DTileset.classificationType] for details about restrictions and limitations.
     * @property [ellipsoid] The ellipsoid determining the size and shape of the globe.
     *   Default value - [Ellipsoid.WGS84]
     * @property [pointCloudShading] Options for constructing a [PointCloudShading] object to control point attenuation based on geometric error and lighting.
     * @property [lightColor] The light color when shading models. When `undefined` the scene's light color is used instead.
     * @property [imageBasedLighting] The properties for managing image-based lighting for this tileset.
     * @property [backFaceCulling] Whether to cull back-facing geometry. When true, back face culling is determined by the glTF material's doubleSided property; when false, back face culling is disabled.
     *   Default value - `true`
     * @property [enableShowOutline] Whether to enable outlines for models using the [CESIUM_primitive_outline](https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Vendor/CESIUM_primitive_outline) extension. This can be set to false to avoid the additional processing of geometry at load time. When false, the showOutlines and outlineColor options are ignored.
     *   Default value - `true`
     * @property [showOutline] Whether to display the outline for models using the [CESIUM_primitive_outline](https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Vendor/CESIUM_primitive_outline) extension. When true, outlines are displayed. When false, outlines are not displayed.
     *   Default value - `true`
     * @property [outlineColor] The color to use when rendering outlines.
     *   Default value - [Color.BLACK]
     * @property [vectorClassificationOnly] Indicates that only the tileset's vector tiles should be used for classification.
     *   Default value - `false`
     * @property [vectorKeepDecodedPositions] Whether vector tiles should keep decoded positions in memory. This is used with [Cesium3DTileFeature.getPolylinePositions].
     *   Default value - `false`
     * @property [featureIdLabel] Label of the feature ID set to use for picking and styling. For EXT_mesh_features, this is the feature ID's label property, or "featureId_N" (where N is the index in the featureIds array) when not specified. EXT_feature_metadata did not have a label field, so such feature ID sets are always labeled "featureId_N" where N is the index in the list of all feature Ids, where feature ID attributes are listed before feature ID textures. If featureIdLabel is an integer N, it is converted to the string "featureId_N" automatically. If both per-primitive and per-instance feature IDs are present, the instance feature IDs take priority.
     *   Default value - `"featureId_0"`
     * @property [instanceFeatureIdLabel] Label of the instance feature ID set used for picking and styling. If instanceFeatureIdLabel is set to an integer N, it is converted to the string "instanceFeatureId_N" automatically. If both per-primitive and per-instance feature IDs are present, the instance feature IDs take priority.
     *   Default value - `"instanceFeatureId_0"`
     * @property [showCreditsOnScreen] Whether to display the credits of this tileset on screen.
     *   Default value - `false`
     * @property [splitDirection] The [SplitDirection] split to apply to this tileset.
     *   Default value - [SplitDirection.NONE]
     * @property [projectTo2D] Whether to accurately project the tileset to 2D. If this is true, the tileset will be projected accurately to 2D, but it will use more memory to do so. If this is false, the tileset will use less memory and will still render in 2D / CV mode, but its projected positions may be inaccurate. This cannot be set after the tileset has loaded.
     *   Default value - `false`
     * @property [debugHeatmapTilePropertyName] The tile variable to colorize as a heatmap. All rendered tiles will be colorized relative to each other's specified variable value.
     * @property [debugFreezeFrame] For debugging only. Determines if only the tiles from last frame should be used for rendering.
     *   Default value - `false`
     * @property [debugColorizeTiles] For debugging only. When true, assigns a random color to each tile.
     *   Default value - `false`
     * @property [enableDebugWireframe] For debugging only. This must be true for debugWireframe to work in WebGL1. This cannot be set after the tileset has loaded.
     * @property [debugWireframe] For debugging only. When true, render's each tile's content as a wireframe.
     *   Default value - `false`
     * @property [debugShowBoundingVolume] For debugging only. When true, renders the bounding volume for each tile.
     *   Default value - `false`
     * @property [debugShowContentBoundingVolume] For debugging only. When true, renders the bounding volume for each tile's content.
     *   Default value - `false`
     * @property [debugShowViewerRequestVolume] For debugging only. When true, renders the viewer request volume for each tile.
     *   Default value - `false`
     * @property [debugShowGeometricError] For debugging only. When true, draws labels to indicate the geometric error of each tile.
     *   Default value - `false`
     * @property [debugShowRenderingStatistics] For debugging only. When true, draws labels to indicate the number of commands, points, triangles and features for each tile.
     *   Default value - `false`
     * @property [debugShowMemoryUsage] For debugging only. When true, draws labels to indicate the texture and geometry memory in megabytes used by each tile.
     *   Default value - `false`
     * @property [debugShowUrl] For debugging only. When true, draws labels to indicate the url of each tile.
     *   Default value - `false`
     */
    interface ConstructorOptions {
        var url: dynamic
        var show: Boolean?
        var modelMatrix: Matrix4?
        var modelUpAxis: Axis?
        var modelForwardAxis: Axis?
        var shadows: ShadowMode?
        var maximumScreenSpaceError: Int?
        var maximumMemoryUsage: Int?
        var cullWithChildrenBounds: Boolean?
        var cullRequestsWhileMoving: Boolean?
        var cullRequestsWhileMovingMultiplier: Double?
        var preloadWhenHidden: Boolean?
        var preloadFlightDestinations: Boolean?
        var preferLeaves: Boolean?
        var dynamicScreenSpaceError: Boolean?
        var dynamicScreenSpaceErrorDensity: Double?
        var dynamicScreenSpaceErrorFactor: Double?
        var dynamicScreenSpaceErrorHeightFalloff: Double?
        var progressiveResolutionHeightFraction: Double?
        var foveatedScreenSpaceError: Boolean?
        var foveatedConeSize: Double?
        var foveatedMinimumScreenSpaceErrorRelaxation: Double?
        var foveatedInterpolationCallback: FoveatedInterpolationCallback?
        var foveatedTimeDelay: Double?
        var skipLevelOfDetail: Boolean?
        var baseScreenSpaceError: Int?
        var skipScreenSpaceErrorFactor: Int?
        var skipLevels: Int?
        var immediatelyLoadDesiredLevelOfDetail: Boolean?
        var loadSiblings: Boolean?
        var clippingPlanes: ClippingPlaneCollection?
        var classificationType: ClassificationType?
        var ellipsoid: Ellipsoid?
        var pointCloudShading: Any?
        var lightColor: Cartesian3?
        var imageBasedLighting: ImageBasedLighting?
        var backFaceCulling: Boolean?
        var enableShowOutline: Boolean?
        var showOutline: Boolean?
        var outlineColor: Color?
        var vectorClassificationOnly: Boolean?
        var vectorKeepDecodedPositions: Boolean?
        var featureIdLabel: String?
        var instanceFeatureIdLabel: String?
        var showCreditsOnScreen: Boolean?
        var splitDirection: SplitDirection?
        var projectTo2D: Boolean?
        var debugHeatmapTilePropertyName: String?
        var debugFreezeFrame: Boolean?
        var debugColorizeTiles: Boolean?
        var enableDebugWireframe: Boolean?
        var debugWireframe: Boolean?
        var debugShowBoundingVolume: Boolean?
        var debugShowContentBoundingVolume: Boolean?
        var debugShowViewerRequestVolume: Boolean?
        var debugShowGeometricError: Boolean?
        var debugShowRenderingStatistics: Boolean?
        var debugShowMemoryUsage: Boolean?
        var debugShowUrl: Boolean?
    }

    /**
     * Optimization option. Don't request tiles that will likely be unused when they come back because of the camera's movement. This optimization only applies to stationary tilesets.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#cullRequestsWhileMoving">Online Documentation</a>
     */
    var cullRequestsWhileMoving: Boolean

    /**
     * Optimization option. Multiplier used in culling requests while moving. Larger is more aggressive culling, smaller less aggressive culling.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#cullRequestsWhileMovingMultiplier">Online Documentation</a>
     */
    var cullRequestsWhileMovingMultiplier: Double

    /**
     * Optimization option. If between (0.0, 0.5], tiles at or above the screen space error for the reduced screen resolution of `progressiveResolutionHeightFraction*screenHeight` will be prioritized first. This can help get a quick layer of tiles down while full resolution tiles continue to load.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#progressiveResolutionHeightFraction">Online Documentation</a>
     */
    var progressiveResolutionHeightFraction: Double

    /**
     * Optimization option. Prefer loading of leaves first.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#preferLeaves">Online Documentation</a>
     */
    var preferLeaves: Boolean

    /**
     * Preload tiles when `tileset.show` is `false`. Loads tiles as if the tileset is visible but does not render them.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#preloadWhenHidden">Online Documentation</a>
     */
    var preloadWhenHidden: Boolean

    /**
     * Optimization option. Fetch tiles at the camera's flight destination while the camera is in flight.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#preloadFlightDestinations">Online Documentation</a>
     */
    var preloadFlightDestinations: Boolean

    /**
     * Optimization option. Whether the tileset should refine based on a dynamic screen space error. Tiles that are further
     * away will be rendered with lower detail than closer tiles. This improves performance by rendering fewer
     * tiles and making less requests, but may result in a slight drop in visual quality for tiles in the distance.
     * The algorithm is biased towards "street views" where the camera is close to the ground plane of the tileset and looking
     * at the horizon. In addition results are more accurate for tightly fitting bounding volumes like box and region.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#dynamicScreenSpaceError">Online Documentation</a>
     */
    var dynamicScreenSpaceError: Boolean

    /**
     * Optimization option. Prioritize loading tiles in the center of the screen by temporarily raising the
     * screen space error for tiles around the edge of the screen. Screen space error returns to normal once all
     * the tiles in the center of the screen as determined by the [Cesium3DTileset.foveatedConeSize] are loaded.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#foveatedScreenSpaceError">Online Documentation</a>
     */
    var foveatedScreenSpaceError: Boolean

    /**
     * Gets or sets a callback to control how much to raise the screen space error for tiles outside the foveated cone,
     * interpolating between [Cesium3DTileset.foveatedMinimumScreenSpaceErrorRelaxation] and [Cesium3DTileset.maximumScreenSpaceError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#foveatedInterpolationCallback">Online Documentation</a>
     */
    var foveatedInterpolationCallback: FoveatedInterpolationCallback

    /**
     * Optimization option. Used when [Cesium3DTileset.foveatedScreenSpaceError] is true to control
     * how long in seconds to wait after the camera stops moving before deferred tiles start loading in.
     * This time delay prevents requesting tiles around the edges of the screen when the camera is moving.
     * Setting this to 0.0 will immediately request all tiles in any given view.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#foveatedTimeDelay">Online Documentation</a>
     */
    var foveatedTimeDelay: Double

    /**
     * A scalar that determines the density used to adjust the dynamic screen space error, similar to [Fog]. Increasing this
     * value has the effect of increasing the maximum screen space error for all tiles, but in a non-linear fashion.
     * The error starts at 0.0 and increases exponentially until a midpoint is reached, and then approaches 1.0 asymptotically.
     * This has the effect of keeping high detail in the closer tiles and lower detail in the further tiles, with all tiles
     * beyond a certain distance all roughly having an error of 1.0.
     *
     * The dynamic error is in the range [0.0, 1.0) and is multiplied by `dynamicScreenSpaceErrorFactor` to produce the
     * final dynamic error. This dynamic error is then subtracted from the tile's actual screen space error.
     *
     * Increasing `dynamicScreenSpaceErrorDensity` has the effect of moving the error midpoint closer to the camera.
     * It is analogous to moving fog closer to the camera.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#dynamicScreenSpaceErrorDensity">Online Documentation</a>
     */
    var dynamicScreenSpaceErrorDensity: Double

    /**
     * A factor used to increase the screen space error of tiles for dynamic screen space error. As this value increases less tiles
     * are requested for rendering and tiles in the distance will have lower detail. If set to zero, the feature will be disabled.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#dynamicScreenSpaceErrorFactor">Online Documentation</a>
     */
    var dynamicScreenSpaceErrorFactor: Double

    /**
     * A ratio of the tileset's height at which the density starts to falloff. If the camera is below this height the
     * full computed density is applied, otherwise the density falls off. This has the effect of higher density at
     * street level views.
     *
     * Valid values are between 0.0 and 1.0.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#dynamicScreenSpaceErrorHeightFalloff">Online Documentation</a>
     */
    var dynamicScreenSpaceErrorHeightFalloff: Double

    /**
     * Determines whether the tileset casts or receives shadows from light sources.
     *
     * Enabling shadows has a performance impact. A tileset that casts shadows must be rendered twice, once from the camera and again from the light's point of view.
     *
     * Shadows are rendered only when [Viewer.shadows] is `true`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#shadows">Online Documentation</a>
     */
    var shadows: ShadowMode

    /**
     * Determines if the tileset will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Defines how per-feature colors set from the Cesium API or declarative styling blend with the source colors from
     * the original feature, e.g. glTF material or per-point color in the tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#colorBlendMode">Online Documentation</a>
     */
    var colorBlendMode: Cesium3DTileColorBlendMode

    /**
     * Defines the value used to linearly interpolate between the source color and feature color when the [Cesium3DTileset.colorBlendMode] is `MIX`.
     * A value of 0.0 results in the source color while a value of 1.0 results in the feature color, with any value in-between
     * resulting in a mix of the source color and feature color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#colorBlendAmount">Online Documentation</a>
     */
    var colorBlendAmount: Double

    /**
     * The event fired to indicate progress of loading new tiles.  This event is fired when a new tile
     * is requested, when a requested tile is finished downloading, and when a downloaded tile has been
     * processed and is ready to render.
     *
     * The number of pending tile requests, `numberOfPendingRequests`, and number of tiles
     * processing, `numberOfTilesProcessing` are passed to the event listener.
     *
     * This event is fired at the end of the frame after the scene is rendered.
     * ```
     * tileset.loadProgress.addEventListener(function(numberOfPendingRequests, numberOfTilesProcessing) {
     *     if ((numberOfPendingRequests === 0) && (numberOfTilesProcessing === 0)) {
     *         console.log('Stopped loading');
     *         return;
     *     }
     *
     *     console.log(`Loading: requests: ${numberOfPendingRequests}, processing: ${numberOfTilesProcessing}`);
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#loadProgress">Online Documentation</a>
     */
    var loadProgress: DefaultEvent

    /**
     * The event fired to indicate that all tiles that meet the screen space error this frame are loaded. The tileset
     * is completely loaded for this view.
     *
     * This event is fired at the end of the frame after the scene is rendered.
     * ```
     * tileset.allTilesLoaded.addEventListener(function() {
     *     console.log('All tiles are loaded');
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#allTilesLoaded">Online Documentation</a>
     */
    var allTilesLoaded: DefaultEvent

    /**
     * The event fired to indicate that all tiles that meet the screen space error this frame are loaded. This event
     * is fired once when all tiles in the initial view are loaded.
     *
     * This event is fired at the end of the frame after the scene is rendered.
     * ```
     * tileset.initialTilesLoaded.addEventListener(function() {
     *     console.log('Initial tiles are loaded');
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#initialTilesLoaded">Online Documentation</a>
     */
    var initialTilesLoaded: DefaultEvent

    /**
     * The event fired to indicate that a tile's content was loaded.
     *
     * The loaded [Cesium3DTile] is passed to the event listener.
     *
     * This event is fired during the tileset traversal while the frame is being rendered
     * so that updates to the tile take effect in the same frame.  Do not create or modify
     * Cesium entities or primitives during the event listener.
     * ```
     * tileset.tileLoad.addEventListener(function(tile) {
     *     console.log('A tile was loaded.');
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#tileLoad">Online Documentation</a>
     */
    var tileLoad: DefaultEvent

    /**
     * The event fired to indicate that a tile's content was unloaded.
     *
     * The unloaded [Cesium3DTile] is passed to the event listener.
     *
     * This event is fired immediately before the tile's content is unloaded while the frame is being
     * rendered so that the event listener has access to the tile's content.  Do not create
     * or modify Cesium entities or primitives during the event listener.
     * ```
     * tileset.tileUnload.addEventListener(function(tile) {
     *     console.log('A tile was unloaded from the cache.');
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#tileUnload">Online Documentation</a>
     */
    var tileUnload: DefaultEvent

    /**
     * The event fired to indicate that a tile's content failed to load.
     *
     * If there are no event listeners, error messages will be logged to the console.
     *
     * The error object passed to the listener contains two properties:
     * - `url`: the url of the failed tile.
     * - `message`: the error message.
     * If multiple contents are present, this event is raised once per inner content with errors.
     * ```
     * tileset.tileFailed.addEventListener(function(error) {
     *     console.log(`An error occurred loading tile: ${error.url}`);
     *     console.log(`Error: ${error.message}`);
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#tileFailed">Online Documentation</a>
     */
    var tileFailed: DefaultEvent

    /**
     * This event fires once for each visible tile in a frame.  This can be used to manually
     * style a tileset.
     *
     * The visible [Cesium3DTile] is passed to the event listener.
     *
     * This event is fired during the tileset traversal while the frame is being rendered
     * so that updates to the tile take effect in the same frame.  Do not create or modify
     * Cesium entities or primitives during the event listener.
     * ```
     * tileset.tileVisible.addEventListener(function(tile) {
     *     if (tile.content instanceof Model3DTileContent) {
     *         console.log('A 3D model tile is visible.');
     *     }
     * });
     * ```
     * ```
     * // Apply a red style and then manually set random colors for every other feature when the tile becomes visible.
     * tileset.style = new Cesium3DTileStyle({
     *     color : 'color("red")'
     * });
     * tileset.tileVisible.addEventListener(function(tile) {
     *     const content = tile.content;
     *     const featuresLength = content.featuresLength;
     *     for (let i = 0; i < featuresLength; i+=2) {
     *         content.getFeature(i).color = Color.fromRandom();
     *     }
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#tileVisible">Online Documentation</a>
     */
    var tileVisible: DefaultEvent

    /**
     * Optimization option. Determines if level of detail skipping should be applied during the traversal.
     *
     * The common strategy for replacement-refinement traversal is to store all levels of the tree in memory and require
     * all children to be loaded before the parent can refine. With this optimization levels of the tree can be skipped
     * entirely and children can be rendered alongside their parents. The tileset requires significantly less memory when
     * using this optimization.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#skipLevelOfDetail">Online Documentation</a>
     */
    var skipLevelOfDetail: Boolean

    /**
     * The screen space error that must be reached before skipping levels of detail.
     *
     * Only used when [Cesium3DTileset.skipLevelOfDetail] is `true`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#baseScreenSpaceError">Online Documentation</a>
     */
    var baseScreenSpaceError: Int

    /**
     * Multiplier defining the minimum screen space error to skip.
     * For example, if a tile has screen space error of 100, no tiles will be loaded unless they
     * are leaves or have a screen space error `<= 100 / skipScreenSpaceErrorFactor`.
     *
     * Only used when [Cesium3DTileset.skipLevelOfDetail] is `true`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#skipScreenSpaceErrorFactor">Online Documentation</a>
     */
    var skipScreenSpaceErrorFactor: Int

    /**
     * Constant defining the minimum number of levels to skip when loading tiles. When it is 0, no levels are skipped.
     * For example, if a tile is level 1, no tiles will be loaded unless they are at level greater than 2.
     *
     * Only used when [Cesium3DTileset.skipLevelOfDetail] is `true`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#skipLevels">Online Documentation</a>
     */
    var skipLevels: Int

    /**
     * When true, only tiles that meet the maximum screen space error will ever be downloaded.
     * Skipping factors are ignored and just the desired tiles are loaded.
     *
     * Only used when [Cesium3DTileset.skipLevelOfDetail] is `true`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#immediatelyLoadDesiredLevelOfDetail">Online Documentation</a>
     */
    var immediatelyLoadDesiredLevelOfDetail: Boolean

    /**
     * Determines whether siblings of visible tiles are always downloaded during traversal.
     * This may be useful for ensuring that tiles are already available when the viewer turns left/right.
     *
     * Only used when [Cesium3DTileset.skipLevelOfDetail] is `true`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#loadSiblings">Online Documentation</a>
     */
    var loadSiblings: Boolean

    /**
     * The light color when shading models. When `undefined` the scene's light color is used instead.
     *
     * For example, disabling additional light sources by setting
     * `tileset.imageBasedLighting.imageBasedLightingFactor = new Cartesian2(0.0, 0.0)`
     * will make the tileset much darker. Here, increasing the intensity of the light source will make the tileset brighter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#lightColor">Online Documentation</a>
     */
    var lightColor: Cartesian3

    /**
     * Whether to cull back-facing geometry. When true, back face culling is determined
     * by the glTF material's doubleSided property; when false, back face culling is disabled.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#backFaceCulling">Online Documentation</a>
     */
    var backFaceCulling: Boolean

    /**
     * Whether to display the outline for models using the
     * [CESIUM_primitive_outline](https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Vendor/CESIUM_primitive_outline) extension.
     * When true, outlines are displayed. When false, outlines are not displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#showOutline">Online Documentation</a>
     */
    var showOutline: Boolean

    /**
     * The color to use when rendering outlines.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#outlineColor">Online Documentation</a>
     */
    var outlineColor: Color

    /**
     * The [SplitDirection] to apply to this tileset.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#splitDirection">Online Documentation</a>
     */
    var splitDirection: SplitDirection

    /**
     * This property is for debugging only; it is not optimized for production use.
     *
     * Determines if only the tiles from last frame should be used for rendering.  This
     * effectively "freezes" the tileset to the previous frame so it is possible to zoom
     * out and see what was rendered.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#debugFreezeFrame">Online Documentation</a>
     */
    var debugFreezeFrame: Boolean

    /**
     * This property is for debugging only; it is not optimized for production use.
     *
     * When true, assigns a random color to each tile.  This is useful for visualizing
     * what features belong to what tiles, especially with additive refinement where features
     * from parent tiles may be interleaved with features from child tiles.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#debugColorizeTiles">Online Documentation</a>
     */
    var debugColorizeTiles: Boolean

    /**
     * This property is for debugging only; it is not optimized for production use.
     *
     * When true, renders each tile's content as a wireframe.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#debugWireframe">Online Documentation</a>
     */
    var debugWireframe: Boolean

    /**
     * This property is for debugging only; it is not optimized for production use.
     *
     * When true, renders the bounding volume for each visible tile.  The bounding volume is
     * white if the tile has a content bounding volume or is empty; otherwise, it is red.  Tiles that don't meet the
     * screen space error and are still refining to their descendants are yellow.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#debugShowBoundingVolume">Online Documentation</a>
     */
    var debugShowBoundingVolume: Boolean

    /**
     * This property is for debugging only; it is not optimized for production use.
     *
     * When true, renders the bounding volume for each visible tile's content. The bounding volume is
     * blue if the tile has a content bounding volume; otherwise it is red.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#debugShowContentBoundingVolume">Online Documentation</a>
     */
    var debugShowContentBoundingVolume: Boolean

    /**
     * This property is for debugging only; it is not optimized for production use.
     *
     * When true, renders the viewer request volume for each tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#debugShowViewerRequestVolume">Online Documentation</a>
     */
    var debugShowViewerRequestVolume: Boolean

    /**
     * This property is for debugging only; it is not optimized for production use.
     *
     * When true, draws labels to indicate the geometric error of each tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#debugShowGeometricError">Online Documentation</a>
     */
    var debugShowGeometricError: Boolean

    /**
     * This property is for debugging only; it is not optimized for production use.
     *
     * When true, draws labels to indicate the number of commands, points, triangles and features of each tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#debugShowRenderingStatistics">Online Documentation</a>
     */
    var debugShowRenderingStatistics: Boolean

    /**
     * This property is for debugging only; it is not optimized for production use.
     *
     * When true, draws labels to indicate the geometry and texture memory usage of each tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#debugShowMemoryUsage">Online Documentation</a>
     */
    var debugShowMemoryUsage: Boolean

    /**
     * This property is for debugging only; it is not optimized for production use.
     *
     * When true, draws labels to indicate the url of each tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#debugShowUrl">Online Documentation</a>
     */
    var debugShowUrl: Boolean

    /**
     * Function for examining vector lines as they are being streamed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#examineVectorLinesFunction">Online Documentation</a>
     */
    var examineVectorLinesFunction: Function<*>

    /**
     * Gets the tileset's asset object property, which contains metadata about the tileset.
     *
     * See the [asset schema reference](https://github.com/CesiumGS/3d-tiles/tree/main/specification#reference-asset)
     * in the 3D Tiles spec for the full set of properties.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#asset">Online Documentation</a>
     */
    val asset: Any

    /**
     * Gets the tileset's extensions object property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#extensions">Online Documentation</a>
     */
    val extensions: Any

    /**
     * The [ClippingPlaneCollection] used to selectively disable rendering the tileset.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#clippingPlanes">Online Documentation</a>
     */
    var clippingPlanes: ClippingPlaneCollection

    /**
     * Gets the tileset's properties dictionary object, which contains metadata about per-feature properties.
     *
     * See the [properties schema reference](https://github.com/CesiumGS/3d-tiles/tree/main/specification#reference-properties)
     * in the 3D Tiles spec for the full set of properties.
     * ```
     * console.log(`Maximum building height: ${tileset.properties.height.maximum}`);
     * console.log(`Minimum building height: ${tileset.properties.height.minimum}`);
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#properties">Online Documentation</a>
     */
    val properties: Any

    /**
     * When `true`, the tileset's root tile is loaded and the tileset is ready to render.
     * This is set to `true` right before [Cesium3DTileset.readyPromise] is resolved.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#ready">Online Documentation</a>
     */
    val ready: Boolean

    /**
     * Gets the promise that will be resolved when the tileset's root tile is loaded and the tileset is ready to render.
     *
     * This promise is resolved at the end of the frame before the first frame the tileset is rendered in.
     * ```
     * tileset.readyPromise.then(function(tileset) {
     *     // tile.properties is not defined until readyPromise resolves.
     *     const properties = tileset.properties;
     *     if (defined(properties)) {
     *         for (const name in properties) {
     *             console.log(properties[name]);
     *         }
     *     }
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#readyPromise">Online Documentation</a>
     */
    val readyPromise: Promise<Cesium3DTileset>

    /**
     * When `true`, all tiles that meet the screen space error this frame are loaded. The tileset is
     * completely loaded for this view.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#tilesLoaded">Online Documentation</a>
     */
    val tilesLoaded: Boolean

    /**
     * The resource used to fetch the tileset JSON file
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#resource">Online Documentation</a>
     */
    val resource: Resource

    /**
     * The base path that non-absolute paths in tileset JSON file are relative to.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#basePath">Online Documentation</a>
     */
    val basePath: String

    /**
     * The style, defined using the
     * [3D Tiles Styling language](https://github.com/CesiumGS/3d-tiles/tree/main/specification/Styling),
     * applied to each feature in the tileset.
     *
     * Assign `undefined` to remove the style, which will restore the visual
     * appearance of the tileset to its default when no style was applied.
     *
     * The style is applied to a tile before the [Cesium3DTileset.tileVisible]
     * event is raised, so code in `tileVisible` can manually set a feature's
     * properties (e.g. color and show) after the style is applied. When
     * a new style is assigned any manually set properties are overwritten.
     *
     * Use an always "true" condition to specify the Color for all objects that are not
     * overridden by pre-existing conditions. Otherwise, the default color Cesium.Color.White
     * will be used. Similarly, use an always "true" condition to specify the show property
     * for all objects that are not overridden by pre-existing conditions. Otherwise, the
     * default show value true will be used.
     * ```
     * tileset.style = new Cesium3DTileStyle({
     *    color : {
     *        conditions : [
     *            ['${Height} >= 100', 'color("purple", 0.5)'],
     *            ['${Height} >= 50', 'color("red")'],
     *            ['true', 'color("blue")']
     *        ]
     *    },
     *    show : '${Height} > 0',
     *    meta : {
     *        description : '"Building id ${id} has height ${Height}."'
     *    }
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#style">Online Documentation</a>
     */
    var style: Cesium3DTileStyle?

    /**
     * A custom shader to apply to all tiles in the tileset. Only used for
     * contents that use [Model]. Using custom shaders with a
     * [Cesium3DTileStyle] may lead to undefined behavior.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#customShader">Online Documentation</a>
     */
    var customShader: CustomShader?

    /**
     * The maximum screen space error used to drive level of detail refinement.  This value helps determine when a tile
     * refines to its descendants, and therefore plays a major role in balancing performance with visual quality.
     *
     * A tile's screen space error is roughly equivalent to the number of pixels wide that would be drawn if a sphere with a
     * radius equal to the tile's <b>geometric error</b> were rendered at the tile's position. If this value exceeds
     * `maximumScreenSpaceError` the tile refines to its descendants.
     *
     * Depending on the tileset, `maximumScreenSpaceError` may need to be tweaked to achieve the right balance.
     * Higher values provide better performance but lower visual quality.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#maximumScreenSpaceError">Online Documentation</a>
     */
    var maximumScreenSpaceError: Int

    /**
     * The maximum amount of GPU memory (in MB) that may be used to cache tiles. This value is estimated from
     * geometry, textures, and batch table textures of loaded tiles. For point clouds, this value also
     * includes per-point metadata.
     *
     * Tiles not in view are unloaded to enforce this.
     *
     * If decreasing this value results in unloading tiles, the tiles are unloaded the next frame.
     *
     * If tiles sized more than `maximumMemoryUsage` are needed
     * to meet the desired screen space error, determined by [Cesium3DTileset.maximumScreenSpaceError],
     * for the current view, then the memory usage of the tiles loaded will exceed
     * `maximumMemoryUsage`.  For example, if the maximum is 256 MB, but
     * 300 MB of tiles are needed to meet the screen space error, then 300 MB of tiles may be loaded.  When
     * these tiles go out of view, they will be unloaded.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#maximumMemoryUsage">Online Documentation</a>
     */
    var maximumMemoryUsage: Int

    /**
     * Options for controlling point size based on geometric error and eye dome lighting.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#pointCloudShading">Online Documentation</a>
     */
    var pointCloudShading: PointCloudShading

    /**
     * The root tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#root">Online Documentation</a>
     */
    val root: Cesium3DTile

    /**
     * The tileset's bounding sphere.
     * ```
     * const tileset = viewer.scene.primitives.add(new Cesium3DTileset({
     *     url : 'http://localhost:8002/tilesets/Seattle/tileset.json'
     * }));
     *
     * tileset.readyPromise.then(function(tileset) {
     *     // Set the camera to view the newly added tileset
     *     viewer.camera.viewBoundingSphere(tileset.boundingSphere, new HeadingPitchRange(0, -0.5, 0));
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#boundingSphere">Online Documentation</a>
     */
    val boundingSphere: BoundingSphere

    /**
     * A 4x4 transformation matrix that transforms the entire tileset.
     * ```
     * // Adjust a tileset's height from the globe's surface.
     * const heightOffset = 20.0;
     * const boundingSphere = tileset.boundingSphere;
     * const cartographic = Cartographic.fromCartesian(boundingSphere.center);
     * const surface = Cartesian3.fromRadians(cartographic.longitude, cartographic.latitude, 0.0);
     * const offset = Cartesian3.fromRadians(cartographic.longitude, cartographic.latitude, heightOffset);
     * const translation = Cartesian3.subtract(offset, surface, new Cartesian3());
     * tileset.modelMatrix = Matrix4.fromTranslation(translation);
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#modelMatrix">Online Documentation</a>
     */
    var modelMatrix: Matrix4

    /**
     * Returns the time, in milliseconds, since the tileset was loaded and first updated.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#timeSinceLoad">Online Documentation</a>
     */
    val timeSinceLoad: Double

    /**
     * The total amount of GPU memory in bytes used by the tileset. This value is estimated from
     * geometry, texture, batch table textures, and binary metadata of loaded tiles.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#totalMemoryUsageInBytes">Online Documentation</a>
     */
    val totalMemoryUsageInBytes: Int

    /**
     * Determines whether terrain, 3D Tiles, or both will be classified by this tileset.
     *
     * This option is only applied to tilesets containing batched 3D models,
     * glTF content, geometry data, or vector data. Even when undefined, vector
     * and geometry data must render as classifications and will default to
     * rendering on both terrain and other 3D Tiles tilesets.
     *
     * When enabled for batched 3D model and glTF tilesets, there are a few
     * requirements/limitations on the glTF:
     * - The glTF cannot contain morph targets, skins, or animations.
     * - The glTF cannot contain the `EXT_mesh_gpu_instancing` extension.
     * - Only meshes with TRIANGLES can be used to classify other assets.
     * - The `POSITION` semantic is required.
     * - If `_BATCHID`s and an index buffer are both present, all indices with the same batch id must occupy contiguous sections of the index buffer.
     * - If `_BATCHID`s are present with no index buffer, all positions with the same batch id must occupy contiguous sections of the position buffer.
     *
     * Additionally, classification is not supported for points or instanced 3D
     * models.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#classificationType">Online Documentation</a>
     */
    val classificationType: ClassificationType

    /**
     * Gets an ellipsoid describing the shape of the globe.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#ellipsoid">Online Documentation</a>
     */
    val ellipsoid: Ellipsoid

    /**
     * Optimization option. Used when [Cesium3DTileset.foveatedScreenSpaceError] is true to control the cone size that determines which tiles are deferred.
     * Tiles that are inside this cone are loaded immediately. Tiles outside the cone are potentially deferred based on how far outside the cone they are and [Cesium3DTileset.foveatedInterpolationCallback] and [Cesium3DTileset.foveatedMinimumScreenSpaceErrorRelaxation].
     * Setting this to 0.0 means the cone will be the line formed by the camera position and its view direction. Setting this to 1.0 means the cone encompasses the entire field of view of the camera, essentially disabling the effect.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#foveatedConeSize">Online Documentation</a>
     */
    var foveatedConeSize: Double

    /**
     * Optimization option. Used when [Cesium3DTileset.foveatedScreenSpaceError] is true to control the starting screen space error relaxation for tiles outside the foveated cone.
     * The screen space error will be raised starting with this value up to [Cesium3DTileset.maximumScreenSpaceError] based on the provided [Cesium3DTileset.foveatedInterpolationCallback].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#foveatedMinimumScreenSpaceErrorRelaxation">Online Documentation</a>
     */
    var foveatedMinimumScreenSpaceErrorRelaxation: Double

    /**
     * Returns the `extras` property at the top-level of the tileset JSON, which contains application specific metadata.
     * Returns `undefined` if `extras` does not exist.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#extras">Online Documentation</a>
     */
    val extras: Any

    /**
     * The properties for managing image-based lighting on this tileset.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#imageBasedLighting">Online Documentation</a>
     */
    var imageBasedLighting: ImageBasedLighting

    /**
     * Indicates that only the tileset's vector tiles should be used for classification.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#vectorClassificationOnly">Online Documentation</a>
     */
    var vectorClassificationOnly: Boolean

    /**
     * Whether vector tiles should keep decoded positions in memory.
     * This is used with [Cesium3DTileFeature.getPolylinePositions].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#vectorKeepDecodedPositions">Online Documentation</a>
     */
    var vectorKeepDecodedPositions: Boolean

    /**
     * Determines whether the credits of the tileset will be displayed on the screen
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#showCreditsOnScreen">Online Documentation</a>
     */
    var showCreditsOnScreen: Boolean

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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#featureIdLabel">Online Documentation</a>
     */
    var featureIdLabel: String

    /**
     * Label of the instance feature ID set used for picking and styling.
     *
     * If instanceFeatureIdLabel is set to an integer N, it is converted to
     * the string "instanceFeatureId_N" automatically.
     * If both per-primitive and per-instance feature IDs are present, the
     * instance feature IDs take priority.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#instanceFeatureIdLabel">Online Documentation</a>
     */
    var instanceFeatureIdLabel: String

    /**
     * Marks the tileset's [Cesium3DTileset.style] as dirty, which forces all
     * features to re-evaluate the style in the next frame each is visible.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#makeStyleDirty">Online Documentation</a>
     */
    fun makeStyleDirty()

    /**
     * Unloads all tiles that weren't selected the previous frame.  This can be used to
     * explicitly manage the tile cache and reduce the total number of tiles loaded below
     * [Cesium3DTileset.maximumMemoryUsage].
     *
     * Tile unloads occur at the next frame to keep all the WebGL delete calls
     * within the render loop.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#trimLoadedTiles">Online Documentation</a>
     */
    fun trimLoadedTiles()

    /**
     * `true` if the tileset JSON file lists the extension in extensionsUsed; otherwise, `false`.
     * @param [extensionName] The name of the extension to check.
     * @return `true` if the tileset JSON file lists the extension in extensionsUsed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#hasExtension">Online Documentation</a>
     */
    fun hasExtension(extensionName: String): Boolean

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#isDestroyed">Online Documentation</a>
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
     * tileset = tileset && tileset.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#destroy">Online Documentation</a>
     */
    fun destroy()

    companion object {
        /**
         * Provides a hook to override the method used to request the tileset json
         * useful when fetching tilesets from remote servers
         * @param [tilesetUrl] The url of the json file to be fetched
         * @return A promise that resolves with the fetched json data
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#.loadJson">Online Documentation</a>
         */
        fun loadJson(tilesetUrl: Resource): Promise<Any>

        fun loadJson(tilesetUrl: String): Promise<Any>
    }
}

/**
 * Optimization option. Used as a callback when [Cesium3DTileset.foveatedScreenSpaceError] is true to control how much to raise the screen space error for tiles outside the foveated cone,
 * interpolating between [Cesium3DTileset.foveatedMinimumScreenSpaceErrorRelaxation] and [Cesium3DTileset.maximumScreenSpaceError].
 * @param [p] The start value to interpolate.
 * @param [q] The end value to interpolate.
 * @param [time] The time of interpolation generally in the range `[0.0, 1.0]`.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileset.html#.foveatedInterpolationCallback">Online Documentation</a>
 */
typealias FoveatedInterpolationCallback = (p: Double, q: Double, time: Double) -> Double

inline fun Cesium3DTileset(
    block: Cesium3DTileset.ConstructorOptions.() -> Unit,
): Cesium3DTileset =
    Cesium3DTileset(options = jso(block))
