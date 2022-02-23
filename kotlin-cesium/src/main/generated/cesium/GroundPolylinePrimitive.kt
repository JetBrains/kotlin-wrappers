// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A GroundPolylinePrimitive represents a polyline draped over the terrain or 3D Tiles in the [Scene].
 *
 * Only to be used with GeometryInstances containing [GroundPolylineGeometry].
 * ```
 * // 1. Draw a polyline on terrain with a basic color material
 *
 * const instance = new GeometryInstance({
 *   geometry : new GroundPolylineGeometry({
 *      positions : Cartesian3.fromDegreesArray([
 *          -112.1340164450331, 36.05494287836128,
 *          -112.08821010582645, 36.097804071380715
 *      ]),
 *      width : 4.0
 *   }),
 *   id : 'object returned when this instance is picked and to get/set per-instance attributes'
 * });
 *
 * scene.groundPrimitives.add(new GroundPolylinePrimitive({
 *   geometryInstances : instance,
 *   appearance : new PolylineMaterialAppearance()
 * }));
 *
 * // 2. Draw a looped polyline on terrain with per-instance color and a distance display condition.
 * // Distance display conditions for polylines on terrain are based on an approximate terrain height
 * // instead of true terrain height.
 *
 * const instance2 = new GeometryInstance({
 *   geometry : new GroundPolylineGeometry({
 *      positions : Cartesian3.fromDegreesArray([
 *          -112.1340164450331, 36.05494287836128,
 *          -112.08821010582645, 36.097804071380715,
 *          -112.13296079730024, 36.168769146801104
 *      ]),
 *      loop : true,
 *      width : 4.0
 *   }),
 *   attributes : {
 *      color : ColorGeometryInstanceAttribute.fromColor(Color.fromCssColorString('green').withAlpha(0.7)),
 *      distanceDisplayCondition : new DistanceDisplayConditionGeometryInstanceAttribute(1000, 30000)
 *   },
 *   id : 'object returned when this instance is picked and to get/set per-instance attributes'
 * });
 *
 * scene.groundPrimitives.add(new GroundPolylinePrimitive({
 *   geometryInstances : instance2,
 *   appearance : new PolylineColorAppearance()
 * }));
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylinePrimitive.html">Online Documentation</a>
 */
external class GroundPolylinePrimitive(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [geometryInstances] GeometryInstances containing GroundPolylineGeometry
     * @property [appearance] The Appearance used to render the polyline. Defaults to a white color [Material] on a [PolylineMaterialAppearance].
     * @property [show] Determines if this primitive will be shown.
     *   Default value - `true`
     * @property [interleave] When `true`, geometry vertex attributes are interleaved, which can slightly improve rendering performance but increases load time.
     *   Default value - `false`
     * @property [releaseGeometryInstances] When `true`, the primitive does not keep a reference to the input `geometryInstances` to save memory.
     *   Default value - `true`
     * @property [allowPicking] When `true`, each geometry instance will only be pickable with [Scene.pick].  When `false`, GPU memory is saved.
     *   Default value - `true`
     * @property [asynchronous] Determines if the primitive will be created asynchronously or block until ready. If false initializeTerrainHeights() must be called first.
     *   Default value - `true`
     * @property [classificationType] Determines whether terrain, 3D Tiles or both will be classified.
     *   Default value - [ClassificationType.BOTH]
     * @property [debugShowBoundingVolume] For debugging only. Determines if this primitive's commands' bounding spheres are shown.
     *   Default value - `false`
     * @property [debugShowShadowVolume] For debugging only. Determines if the shadow volume for each geometry in the primitive is drawn. Must be `true` on creation to have effect.
     *   Default value - `false`
     */
    interface ConstructorOptions {
        var geometryInstances: GeometryInstance?
        var appearance: Appearance?
        var show: Boolean?
        var interleave: Boolean?
        var releaseGeometryInstances: Boolean?
        var allowPicking: Boolean?
        var asynchronous: Boolean?
        var classificationType: ClassificationType?
        var debugShowBoundingVolume: Boolean?
        var debugShowShadowVolume: Boolean?
    }

    /**
     * The geometry instances rendered with this primitive. This may
     * be `undefined` if `options.releaseGeometryInstances`
     * is `true` when the primitive is constructed.
     *
     * Changing this property after the primitive is rendered has no effect.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylinePrimitive.html#geometryInstances">Online Documentation</a>
     */
    val geometryInstances: GeometryInstance

    /**
     * The [Appearance] used to shade this primitive. Each geometry
     * instance is shaded with the same appearance.  Some appearances, like
     * [PolylineColorAppearance] allow giving each instance unique
     * properties.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylinePrimitive.html#appearance">Online Documentation</a>
     */
    var appearance: Appearance

    /**
     * Determines if the primitive will be shown.  This affects all geometry
     * instances in the primitive.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylinePrimitive.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Determines whether terrain, 3D Tiles or both will be classified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylinePrimitive.html#classificationType">Online Documentation</a>
     */
    var classificationType: ClassificationType

    /**
     * This property is for debugging only; it is not for production use nor is it optimized.
     *
     * Draws the bounding sphere for each draw command in the primitive.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylinePrimitive.html#debugShowBoundingVolume">Online Documentation</a>
     */
    var debugShowBoundingVolume: Boolean

    /**
     * Determines if geometry vertex attributes are interleaved, which can slightly improve rendering performance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylinePrimitive.html#interleave">Online Documentation</a>
     */
    val interleave: Boolean

    /**
     * When `true`, the primitive does not keep a reference to the input `geometryInstances` to save memory.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylinePrimitive.html#releaseGeometryInstances">Online Documentation</a>
     */
    val releaseGeometryInstances: Boolean

    /**
     * When `true`, each geometry instance will only be pickable with [Scene.pick].  When `false`, GPU memory is saved.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylinePrimitive.html#allowPicking">Online Documentation</a>
     */
    val allowPicking: Boolean

    /**
     * Determines if the geometry instances will be created and batched on a web worker.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylinePrimitive.html#asynchronous">Online Documentation</a>
     */
    val asynchronous: Boolean

    /**
     * Determines if the primitive is complete and ready to render.  If this property is
     * true, the primitive will be rendered the next time that [GroundPolylinePrimitive.update]
     * is called.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylinePrimitive.html#ready">Online Documentation</a>
     */
    val ready: Boolean

    /**
     * Gets a promise that resolves when the primitive is ready to render.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylinePrimitive.html#readyPromise">Online Documentation</a>
     */
    val readyPromise: kotlin.js.Promise<GroundPolylinePrimitive>

    /**
     * This property is for debugging only; it is not for production use nor is it optimized.
     *
     * If true, draws the shadow volume for each geometry in the primitive.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylinePrimitive.html#debugShowShadowVolume">Online Documentation</a>
     */
    val debugShowShadowVolume: Boolean

    /**
     * Called when [Viewer] or [CesiumWidget] render the scene to
     * get the draw commands needed to render this primitive.
     *
     * Do not call this function directly.  This is documented just to
     * list the exceptions that may be propagated when the scene is rendered:
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylinePrimitive.html#update">Online Documentation</a>
     */
    fun update()

    /**
     * Returns the modifiable per-instance attributes for a [GeometryInstance].
     * ```
     * const attributes = primitive.getGeometryInstanceAttributes('an id');
     * attributes.color = ColorGeometryInstanceAttribute.toValue(Color.AQUA);
     * attributes.show = ShowGeometryInstanceAttribute.toValue(true);
     * ```
     * @param [id] The id of the [GeometryInstance].
     * @return The typed array in the attribute's format or undefined if the is no instance with id.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylinePrimitive.html#getGeometryInstanceAttributes">Online Documentation</a>
     */
    fun getGeometryInstanceAttributes(id: Any): Any

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylinePrimitive.html#isDestroyed">Online Documentation</a>
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
     * e = e && e.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylinePrimitive.html#destroy">Online Documentation</a>
     */
    fun destroy()

    companion object {
        /**
         * Initializes the minimum and maximum terrain heights. This only needs to be called if you are creating the
         * GroundPolylinePrimitive synchronously.
         * @return A promise that will resolve once the terrain heights have been loaded.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylinePrimitive.html#.initializeTerrainHeights">Online Documentation</a>
         */
        fun initializeTerrainHeights(): kotlin.js.Promise<Unit>

        /**
         * Checks if the given Scene supports GroundPolylinePrimitives.
         * GroundPolylinePrimitives require support for the WEBGL_depth_texture extension.
         * @param [scene] The current scene.
         * @return Whether or not the current scene supports GroundPolylinePrimitives.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylinePrimitive.html#.isSupported">Online Documentation</a>
         */
        fun isSupported(scene: Scene): Boolean
    }
}

inline fun GroundPolylinePrimitive(
    block: GroundPolylinePrimitive.ConstructorOptions.() -> Unit,
): GroundPolylinePrimitive {
    val options: GroundPolylinePrimitive.ConstructorOptions = js("({})")
    block(options)
    return GroundPolylinePrimitive(options)
}
