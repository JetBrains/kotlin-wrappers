// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * The globe rendered in the scene, including its terrain ([Globe.terrainProvider])
 * and imagery layers ([Globe.imageryLayers]).  Access the globe using [Scene.globe].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html">Online Documentation</a>
 *
 * @constructor
 * @property [ellipsoid] Determines the size and shape of the
 *   globe.
 *   Default value - [Ellipsoid.WGS84]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html">Online Documentation</a>
 */
external class Globe(var ellipsoid: Ellipsoid = definedExternally) {
    /**
     * Determines if the globe will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * The maximum screen-space error used to drive level-of-detail refinement.  Higher
     * values will provide better performance but lower visual quality.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#maximumScreenSpaceError">Online Documentation</a>
     */
    var maximumScreenSpaceError: Int

    /**
     * The size of the terrain tile cache, expressed as a number of tiles.  Any additional
     * tiles beyond this number will be freed, as long as they aren't needed for rendering
     * this frame.  A larger number will consume more memory but will show detail faster
     * when, for example, zooming out and then back in.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#tileCacheSize">Online Documentation</a>
     */
    var tileCacheSize: Int

    /**
     * Gets or sets the number of loading descendant tiles that is considered "too many".
     * If a tile has too many loading descendants, that tile will be loaded and rendered before any of
     * its descendants are loaded and rendered. This means more feedback for the user that something
     * is happening at the cost of a longer overall load time. Setting this to 0 will cause each
     * tile level to be loaded successively, significantly increasing load time. Setting it to a large
     * number (e.g. 1000) will minimize the number of tiles that are loaded but tend to make
     * detail appear all at once after a long wait.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#loadingDescendantLimit">Online Documentation</a>
     */
    var loadingDescendantLimit: Int

    /**
     * Gets or sets a value indicating whether the ancestors of rendered tiles should be preloaded.
     * Setting this to true optimizes the zoom-out experience and provides more detail in
     * newly-exposed areas when panning. The down side is that it requires loading more tiles.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#preloadAncestors">Online Documentation</a>
     */
    var preloadAncestors: Boolean

    /**
     * Gets or sets a value indicating whether the siblings of rendered tiles should be preloaded.
     * Setting this to true causes tiles with the same parent as a rendered tile to be loaded, even
     * if they are culled. Setting this to true may provide a better panning experience at the
     * cost of loading more tiles.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#preloadSiblings">Online Documentation</a>
     */
    var preloadSiblings: Boolean

    /**
     * The color to use to highlight terrain fill tiles. If undefined, fill tiles are not
     * highlighted at all. The alpha value is used to alpha blend with the tile's
     * actual color. Because terrain fill tiles do not represent the actual terrain surface,
     * it may be useful in some applications to indicate visually that they are not to be trusted.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#fillHighlightColor">Online Documentation</a>
     */
    var fillHighlightColor: Color

    /**
     * Enable lighting the globe with the scene's light source.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#enableLighting">Online Documentation</a>
     */
    var enableLighting: Boolean

    /**
     * A multiplier to adjust terrain lambert lighting.
     * This number is multiplied by the result of `czm_getLambertDiffuse` in GlobeFS.glsl.
     * This only takes effect when `enableLighting` is `true`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#lambertDiffuseMultiplier">Online Documentation</a>
     */
    var lambertDiffuseMultiplier: Double

    /**
     * Enable dynamic lighting effects on atmosphere and fog. This only takes effect
     * when `enableLighting` is `true`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#dynamicAtmosphereLighting">Online Documentation</a>
     */
    var dynamicAtmosphereLighting: Boolean

    /**
     * Whether dynamic atmosphere lighting uses the sun direction instead of the scene's
     * light direction. This only takes effect when `enableLighting` and
     * `dynamicAtmosphereLighting` are `true`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#dynamicAtmosphereLightingFromSun">Online Documentation</a>
     */
    var dynamicAtmosphereLightingFromSun: Boolean

    /**
     * Enable the ground atmosphere, which is drawn over the globe when viewed from a distance between `lightingFadeInDistance` and `lightingFadeOutDistance`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#showGroundAtmosphere">Online Documentation</a>
     */
    var showGroundAtmosphere: Boolean

    /**
     * The intensity of the light that is used for computing the ground atmosphere color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#atmosphereLightIntensity">Online Documentation</a>
     */
    var atmosphereLightIntensity: Double

    /**
     * The Rayleigh scattering coefficient used in the atmospheric scattering equations for the ground atmosphere.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#atmosphereRayleighCoefficient">Online Documentation</a>
     */
    var atmosphereRayleighCoefficient: Cartesian3

    /**
     * The Mie scattering coefficient used in the atmospheric scattering equations for the ground atmosphere.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#atmosphereMieCoefficient">Online Documentation</a>
     */
    var atmosphereMieCoefficient: Cartesian3

    /**
     * The Rayleigh scale height used in the atmospheric scattering equations for the ground atmosphere, in meters.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#atmosphereRayleighScaleHeight">Online Documentation</a>
     */
    var atmosphereRayleighScaleHeight: Double

    /**
     * The Mie scale height used in the atmospheric scattering equations for the ground atmosphere, in meters.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#atmosphereMieScaleHeight">Online Documentation</a>
     */
    var atmosphereMieScaleHeight: Double

    /**
     * The anisotropy of the medium to consider for Mie scattering.
     *
     * Valid values are between -1.0 and 1.0.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#atmosphereMieAnisotropy">Online Documentation</a>
     */
    var atmosphereMieAnisotropy: Double

    /**
     * The distance where everything becomes lit. This only takes effect
     * when `enableLighting` or `showGroundAtmosphere` is `true`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#lightingFadeOutDistance">Online Documentation</a>
     */
    var lightingFadeOutDistance: Double

    /**
     * The distance where lighting resumes. This only takes effect
     * when `enableLighting` or `showGroundAtmosphere` is `true`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#lightingFadeInDistance">Online Documentation</a>
     */
    var lightingFadeInDistance: Double

    /**
     * The distance where the darkness of night from the ground atmosphere fades out to a lit ground atmosphere.
     * This only takes effect when `showGroundAtmosphere`, `enableLighting`, and
     * `dynamicAtmosphereLighting` are `true`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#nightFadeOutDistance">Online Documentation</a>
     */
    var nightFadeOutDistance: Double

    /**
     * The distance where the darkness of night from the ground atmosphere fades in to an unlit ground atmosphere.
     * This only takes effect when `showGroundAtmosphere`, `enableLighting`, and
     * `dynamicAtmosphereLighting` are `true`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#nightFadeInDistance">Online Documentation</a>
     */
    var nightFadeInDistance: Double

    /**
     * True if an animated wave effect should be shown in areas of the globe
     * covered by water; otherwise, false.  This property is ignored if the
     * `terrainProvider` does not provide a water mask.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#showWaterEffect">Online Documentation</a>
     */
    var showWaterEffect: Boolean

    /**
     * True if primitives such as billboards, polylines, labels, etc. should be depth-tested
     * against the terrain surface, or false if such primitives should always be drawn on top
     * of terrain unless they're on the opposite side of the globe.  The disadvantage of depth
     * testing primitives against terrain is that slight numerical noise or terrain level-of-detail
     * switched can sometimes make a primitive that should be on the surface disappear underneath it.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#depthTestAgainstTerrain">Online Documentation</a>
     */
    var depthTestAgainstTerrain: Boolean

    /**
     * Determines whether the globe casts or receives shadows from light sources. Setting the globe
     * to cast shadows may impact performance since the terrain is rendered again from the light's perspective.
     * Currently only terrain that is in view casts shadows. By default the globe does not cast shadows.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#shadows">Online Documentation</a>
     */
    var shadows: ShadowMode

    /**
     * The hue shift to apply to the atmosphere. Defaults to 0.0 (no shift).
     * A hue shift of 1.0 indicates a complete rotation of the hues available.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#atmosphereHueShift">Online Documentation</a>
     */
    var atmosphereHueShift: Double

    /**
     * The saturation shift to apply to the atmosphere. Defaults to 0.0 (no shift).
     * A saturation shift of -1.0 is monochrome.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#atmosphereSaturationShift">Online Documentation</a>
     */
    var atmosphereSaturationShift: Double

    /**
     * The brightness shift to apply to the atmosphere. Defaults to 0.0 (no shift).
     * A brightness shift of -1.0 is complete darkness, which will let space show through.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#atmosphereBrightnessShift">Online Documentation</a>
     */
    var atmosphereBrightnessShift: Double

    /**
     * A scalar used to exaggerate the terrain. Defaults to `1.0` (no exaggeration).
     * A value of `2.0` scales the terrain by 2x.
     * A value of `0.0` makes the terrain completely flat.
     * Note that terrain exaggeration will not modify any other primitive as they are positioned relative to the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#terrainExaggeration">Online Documentation</a>
     */
    var terrainExaggeration: Double

    /**
     * The height from which terrain is exaggerated. Defaults to `0.0` (scaled relative to ellipsoid surface).
     * Terrain that is above this height will scale upwards and terrain that is below this height will scale downwards.
     * Note that terrain exaggeration will not modify any other primitive as they are positioned relative to the ellipsoid.
     * If [Globe.terrainExaggeration] is `1.0` this value will have no effect.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#terrainExaggerationRelativeHeight">Online Documentation</a>
     */
    var terrainExaggerationRelativeHeight: Double

    /**
     * Whether to show terrain skirts. Terrain skirts are geometry extending downwards from a tile's edges used to hide seams between neighboring tiles.
     * Skirts are always hidden when the camera is underground or translucency is enabled.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#showSkirts">Online Documentation</a>
     */
    var showSkirts: Boolean

    /**
     * Whether to cull back-facing terrain. Back faces are not culled when the camera is underground or translucency is enabled.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#backFaceCulling">Online Documentation</a>
     */
    var backFaceCulling: Boolean

    /**
     * Gets the collection of image layers that will be rendered on this globe.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#imageryLayers">Online Documentation</a>
     */
    var imageryLayers: ImageryLayerCollection

    /**
     * Gets an event that's raised when an imagery layer is added, shown, hidden, moved, or removed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#imageryLayersUpdatedEvent">Online Documentation</a>
     */
    val imageryLayersUpdatedEvent: DefaultEvent

    /**
     * Returns `true` when the tile load queue is empty, `false` otherwise.  When the load queue is empty,
     * all terrain and imagery for the current view have been loaded.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#tilesLoaded">Online Documentation</a>
     */
    val tilesLoaded: Boolean

    /**
     * Gets or sets the color of the globe when no imagery is available.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#baseColor">Online Documentation</a>
     */
    var baseColor: Color

    /**
     * A property specifying a [ClippingPlaneCollection] used to selectively disable rendering on the outside of each plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#clippingPlanes">Online Documentation</a>
     */
    var clippingPlanes: ClippingPlaneCollection

    /**
     * A property specifying a [Rectangle] used to limit globe rendering to a cartographic area.
     * Defaults to the maximum extent of cartographic coordinates.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#cartographicLimitRectangle">Online Documentation</a>
     */
    var cartographicLimitRectangle: Rectangle

    /**
     * The normal map to use for rendering waves in the ocean.  Setting this property will
     * only have an effect if the configured terrain provider includes a water mask.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#oceanNormalMapUrl">Online Documentation</a>
     */
    var oceanNormalMapUrl: String

    /**
     * The terrain provider providing surface geometry for this globe.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#terrainProvider">Online Documentation</a>
     */
    var terrainProvider: TerrainProvider

    /**
     * Gets an event that's raised when the terrain provider is changed
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#terrainProviderChanged">Online Documentation</a>
     */
    val terrainProviderChanged: DefaultEvent

    /**
     * Gets an event that's raised when the length of the tile load queue has changed since the last render frame.  When the load queue is empty,
     * all terrain and imagery for the current view have been loaded.  The event passes the new length of the tile load queue.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#tileLoadProgressEvent">Online Documentation</a>
     */
    var tileLoadProgressEvent: DefaultEvent

    /**
     * Gets or sets the material appearance of the Globe.  This can be one of several built-in [Material] objects or a custom material, scripted with
     * [Fabric](https://github.com/CesiumGS/cesium/wiki/Fabric).
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#material">Online Documentation</a>
     */
    var material: Material?

    /**
     * The color to render the back side of the globe when the camera is underground or the globe is translucent,
     * blended with the globe color based on the camera's distance.
     *
     * To disable underground coloring, set `undergroundColor` to `undefined`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#undergroundColor">Online Documentation</a>
     */
    var undergroundColor: Color

    /**
     * Gets or sets the near and far distance for blending [Globe.undergroundColor] with the globe color.
     * The alpha will interpolate between the [NearFarScalar.nearValue] and
     * [NearFarScalar.farValue] while the camera distance falls within the lower and upper bounds
     * of the specified [NearFarScalar.near] and [NearFarScalar.far].
     * Outside of these ranges the alpha remains clamped to the nearest bound. If undefined,
     * the underground color will not be blended with the globe color.
     *
     * When the camera is above the ellipsoid the distance is computed from the nearest
     * point on the ellipsoid instead of the camera's position.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#undergroundColorAlphaByDistance">Online Documentation</a>
     */
    var undergroundColorAlphaByDistance: NearFarScalar

    /**
     * Properties for controlling globe translucency.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#translucency">Online Documentation</a>
     */
    var translucency: GlobeTranslucency

    /**
     * Find an intersection between a ray and the globe surface that was rendered. The ray must be given in world coordinates.
     * ```
     * // find intersection of ray through a pixel and the globe
     * const ray = viewer.camera.getPickRay(windowCoordinates);
     * const intersection = globe.pick(ray, scene);
     * ```
     * @param [ray] The ray to test for intersection.
     * @param [scene] The scene.
     * @param [result] The object onto which to store the result.
     * @return The intersection or `undefined` if none was found.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#pick">Online Documentation</a>
     */
    fun pick(
        ray: Ray,
        scene: Scene,
        result: Cartesian3? = definedExternally,
    ): Cartesian3?

    /**
     * Get the height of the surface at a given cartographic.
     * @param [cartographic] The cartographic for which to find the height.
     * @return The height of the cartographic or undefined if it could not be found.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#getHeight">Online Documentation</a>
     */
    fun getHeight(cartographic: Cartographic): Double?

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return True if this object was destroyed; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#isDestroyed">Online Documentation</a>
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
     * globe = globe && globe.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Globe.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
