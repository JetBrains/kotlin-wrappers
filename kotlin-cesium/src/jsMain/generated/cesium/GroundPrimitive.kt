// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.Void
import js.core.jso
import js.promise.Promise

/**
 * A ground primitive represents geometry draped over terrain or 3D Tiles in the [Scene].
 *
 * A primitive combines geometry instances with an [Appearance] that describes the full shading, including
 * [Material] and [RenderState].  Roughly, the geometry instance defines the structure and placement,
 * and the appearance defines the visual characteristics.  Decoupling geometry and appearance allows us to mix
 * and match most of them and add a new geometry or appearance independently of each other.
 *
 * Support for the WEBGL_depth_texture extension is required to use GeometryInstances with different PerInstanceColors
 * or materials besides PerInstanceColorAppearance.
 *
 * Textured GroundPrimitives were designed for notional patterns and are not meant for precisely mapping
 * textures to terrain - for that use case, use [SingleTileImageryProvider].
 *
 * For correct rendering, this feature requires the EXT_frag_depth WebGL extension. For hardware that do not support this extension, there
 * will be rendering artifacts for some viewing angles.
 *
 * Valid geometries are [CircleGeometry], [CorridorGeometry], [EllipseGeometry], [PolygonGeometry], and [RectangleGeometry].
 * ```
 * // Example 1: Create primitive with a single instance
 * const rectangleInstance = new GeometryInstance({
 *   geometry : new RectangleGeometry({
 *     rectangle : Rectangle.fromDegrees(-140.0, 30.0, -100.0, 40.0)
 *   }),
 *   id : 'rectangle',
 *   attributes : {
 *     color : new ColorGeometryInstanceAttribute(0.0, 1.0, 1.0, 0.5)
 *   }
 * });
 * scene.primitives.add(new GroundPrimitive({
 *   geometryInstances : rectangleInstance
 * }));
 *
 * // Example 2: Batch instances
 * const color = new ColorGeometryInstanceAttribute(0.0, 1.0, 1.0, 0.5); // Both instances must have the same color.
 * const rectangleInstance = new GeometryInstance({
 *   geometry : new RectangleGeometry({
 *     rectangle : Rectangle.fromDegrees(-140.0, 30.0, -100.0, 40.0)
 *   }),
 *   id : 'rectangle',
 *   attributes : {
 *     color : color
 *   }
 * });
 * const ellipseInstance = new GeometryInstance({
 *     geometry : new EllipseGeometry({
 *         center : Cartesian3.fromDegrees(-105.0, 40.0),
 *         semiMinorAxis : 300000.0,
 *         semiMajorAxis : 400000.0
 *     }),
 *     id : 'ellipse',
 *     attributes : {
 *         color : color
 *     }
 * });
 * scene.primitives.add(new GroundPrimitive({
 *   geometryInstances : [rectangleInstance, ellipseInstance]
 * }));
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPrimitive.html">Online Documentation</a>
 */
external class GroundPrimitive(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [geometryInstances] The geometry instances to render.
     * @property [appearance] The appearance used to render the primitive. Defaults to a flat PerInstanceColorAppearance when GeometryInstances have a color attribute.
     * @property [show] Determines if this primitive will be shown.
     *   Default value - `true`
     * @property [vertexCacheOptimize] When `true`, geometry vertices are optimized for the pre and post-vertex-shader caches.
     *   Default value - `false`
     * @property [interleave] When `true`, geometry vertex attributes are interleaved, which can slightly improve rendering performance but increases load time.
     *   Default value - `false`
     * @property [compressVertices] When `true`, the geometry vertices are compressed, which will save memory.
     *   Default value - `true`
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
     * @property [debugShowShadowVolume] For debugging only. Determines if the shadow volume for each geometry in the primitive is drawn. Must be `true` on
     *   creation for the volumes to be created before the geometry is released or options.releaseGeometryInstance must be `false`.
     *   Default value - `false`
     */
    interface ConstructorOptions {
        var geometryInstances: GeometryInstance?
        var appearance: Appearance?
        var show: Boolean?
        var vertexCacheOptimize: Boolean?
        var interleave: Boolean?
        var compressVertices: Boolean?
        var releaseGeometryInstances: Boolean?
        var allowPicking: Boolean?
        var asynchronous: Boolean?
        var classificationType: ClassificationType?
        var debugShowBoundingVolume: Boolean?
        var debugShowShadowVolume: Boolean?
    }

    /**
     * The [Appearance] used to shade this primitive. Each geometry
     * instance is shaded with the same appearance.  Some appearances, like
     * [PerInstanceColorAppearance] allow giving each instance unique
     * properties.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPrimitive.html#appearance">Online Documentation</a>
     */
    var appearance: Appearance

    /**
     * The geometry instances rendered with this primitive.  This may
     * be `undefined` if `options.releaseGeometryInstances`
     * is `true` when the primitive is constructed.
     *
     * Changing this property after the primitive is rendered has no effect.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPrimitive.html#geometryInstances">Online Documentation</a>
     */
    val geometryInstances: GeometryInstance

    /**
     * Determines if the primitive will be shown.  This affects all geometry
     * instances in the primitive.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPrimitive.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Determines whether terrain, 3D Tiles or both will be classified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPrimitive.html#classificationType">Online Documentation</a>
     */
    var classificationType: ClassificationType

    /**
     * This property is for debugging only; it is not for production use nor is it optimized.
     *
     * Draws the bounding sphere for each draw command in the primitive.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPrimitive.html#debugShowBoundingVolume">Online Documentation</a>
     */
    var debugShowBoundingVolume: Boolean

    /**
     * This property is for debugging only; it is not for production use nor is it optimized.
     *
     * Draws the shadow volume for each geometry in the primitive.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPrimitive.html#debugShowShadowVolume">Online Documentation</a>
     */
    var debugShowShadowVolume: Boolean

    /**
     * When `true`, geometry vertices are optimized for the pre and post-vertex-shader caches.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPrimitive.html#vertexCacheOptimize">Online Documentation</a>
     */
    val vertexCacheOptimize: Boolean

    /**
     * Determines if geometry vertex attributes are interleaved, which can slightly improve rendering performance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPrimitive.html#interleave">Online Documentation</a>
     */
    val interleave: Boolean

    /**
     * When `true`, the primitive does not keep a reference to the input `geometryInstances` to save memory.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPrimitive.html#releaseGeometryInstances">Online Documentation</a>
     */
    val releaseGeometryInstances: Boolean

    /**
     * When `true`, each geometry instance will only be pickable with [Scene.pick].  When `false`, GPU memory is saved.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPrimitive.html#allowPicking">Online Documentation</a>
     */
    val allowPicking: Boolean

    /**
     * Determines if the geometry instances will be created and batched on a web worker.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPrimitive.html#asynchronous">Online Documentation</a>
     */
    val asynchronous: Boolean

    /**
     * When `true`, geometry vertices are compressed, which will save memory.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPrimitive.html#compressVertices">Online Documentation</a>
     */
    val compressVertices: Boolean

    /**
     * Determines if the primitive is complete and ready to render.  If this property is
     * true, the primitive will be rendered the next time that [GroundPrimitive.update]
     * is called.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPrimitive.html#ready">Online Documentation</a>
     */
    val ready: Boolean

    /**
     * Called when [Viewer] or [CesiumWidget] render the scene to
     * get the draw commands needed to render this primitive.
     *
     * Do not call this function directly.  This is documented just to
     * list the exceptions that may be propagated when the scene is rendered:
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPrimitive.html#update">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPrimitive.html#getGeometryInstanceAttributes">Online Documentation</a>
     */
    fun getGeometryInstanceAttributes(id: Any): Any

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPrimitive.html#isDestroyed">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPrimitive.html#destroy">Online Documentation</a>
     */
    fun destroy()

    companion object {
        /**
         * Determines if GroundPrimitive rendering is supported.
         * @param [scene] The scene.
         * @return `true` if GroundPrimitives are supported; otherwise, returns `false`
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPrimitive.html#.isSupported">Online Documentation</a>
         */
        fun isSupported(scene: Scene): Boolean

        /**
         * Initializes the minimum and maximum terrain heights. This only needs to be called if you are creating the
         * GroundPrimitive synchronously.
         * @return A promise that will resolve once the terrain heights have been loaded.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPrimitive.html#.initializeTerrainHeights">Online Documentation</a>
         */
        fun initializeTerrainHeights(): Promise<Void>

        /**
         * Checks if the given Scene supports materials on GroundPrimitives.
         * Materials on GroundPrimitives require support for the WEBGL_depth_texture extension.
         * @param [scene] The current scene.
         * @return Whether or not the current scene supports materials on GroundPrimitives.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPrimitive.html#.supportsMaterials">Online Documentation</a>
         */
        fun supportsMaterials(scene: Scene): Boolean
    }
}

inline fun GroundPrimitive(
    block: GroundPrimitive.ConstructorOptions.() -> Unit,
): GroundPrimitive =
    GroundPrimitive(options = jso(block))
