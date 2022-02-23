// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A classification primitive represents a volume enclosing geometry in the [Scene] to be highlighted.
 *
 * A primitive combines geometry instances with an [Appearance] that describes the full shading, including
 * [Material] and [RenderState].  Roughly, the geometry instance defines the structure and placement,
 * and the appearance defines the visual characteristics.  Decoupling geometry and appearance allows us to mix
 * and match most of them and add a new geometry or appearance independently of each other.
 * Only [PerInstanceColorAppearance] with the same color across all instances is supported at this time when using
 * ClassificationPrimitive directly.
 * For full [Appearance] support when classifying terrain or 3D Tiles use [GroundPrimitive] instead.
 *
 * For correct rendering, this feature requires the EXT_frag_depth WebGL extension. For hardware that do not support this extension, there
 * will be rendering artifacts for some viewing angles.
 *
 * Valid geometries are [BoxGeometry], [CylinderGeometry], [EllipsoidGeometry], [PolylineVolumeGeometry], and [SphereGeometry].
 *
 * Geometries that follow the surface of the ellipsoid, such as [CircleGeometry], [CorridorGeometry], [EllipseGeometry], [PolygonGeometry], and [RectangleGeometry],
 * are also valid if they are extruded volumes; otherwise, they will not be rendered.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClassificationPrimitive.html">Online Documentation</a>
 */
external class ClassificationPrimitive(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [geometryInstances] The geometry instances to render. This can either be a single instance or an array of length one.
     * @property [appearance] The appearance used to render the primitive. Defaults to PerInstanceColorAppearance when GeometryInstances have a color attribute.
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
     * The geometry instance rendered with this primitive.  This may
     * be `undefined` if `options.releaseGeometryInstances`
     * is `true` when the primitive is constructed.
     *
     * Changing this property after the primitive is rendered has no effect.
     *
     * Because of the rendering technique used, all geometry instances must be the same color.
     * If there is an instance with a differing color, a `DeveloperError` will be thrown
     * on the first attempt to render.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClassificationPrimitive.html#geometryInstances">Online Documentation</a>
     */
    val geometryInstances: GeometryInstance

    /**
     * Determines if the primitive will be shown.  This affects all geometry
     * instances in the primitive.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClassificationPrimitive.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Determines whether terrain, 3D Tiles or both will be classified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClassificationPrimitive.html#classificationType">Online Documentation</a>
     */
    var classificationType: ClassificationType

    /**
     * This property is for debugging only; it is not for production use nor is it optimized.
     *
     * Draws the bounding sphere for each draw command in the primitive.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClassificationPrimitive.html#debugShowBoundingVolume">Online Documentation</a>
     */
    var debugShowBoundingVolume: Boolean

    /**
     * This property is for debugging only; it is not for production use nor is it optimized.
     *
     * Draws the shadow volume for each geometry in the primitive.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClassificationPrimitive.html#debugShowShadowVolume">Online Documentation</a>
     */
    var debugShowShadowVolume: Boolean

    /**
     * When `true`, geometry vertices are optimized for the pre and post-vertex-shader caches.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClassificationPrimitive.html#vertexCacheOptimize">Online Documentation</a>
     */
    val vertexCacheOptimize: Boolean

    /**
     * Determines if geometry vertex attributes are interleaved, which can slightly improve rendering performance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClassificationPrimitive.html#interleave">Online Documentation</a>
     */
    val interleave: Boolean

    /**
     * When `true`, the primitive does not keep a reference to the input `geometryInstances` to save memory.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClassificationPrimitive.html#releaseGeometryInstances">Online Documentation</a>
     */
    val releaseGeometryInstances: Boolean

    /**
     * When `true`, each geometry instance will only be pickable with [Scene.pick].  When `false`, GPU memory is saved.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClassificationPrimitive.html#allowPicking">Online Documentation</a>
     */
    val allowPicking: Boolean

    /**
     * Determines if the geometry instances will be created and batched on a web worker.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClassificationPrimitive.html#asynchronous">Online Documentation</a>
     */
    val asynchronous: Boolean

    /**
     * When `true`, geometry vertices are compressed, which will save memory.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClassificationPrimitive.html#compressVertices">Online Documentation</a>
     */
    val compressVertices: Boolean

    /**
     * Determines if the primitive is complete and ready to render.  If this property is
     * true, the primitive will be rendered the next time that [ClassificationPrimitive.update]
     * is called.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClassificationPrimitive.html#ready">Online Documentation</a>
     */
    val ready: Boolean

    /**
     * Gets a promise that resolves when the primitive is ready to render.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClassificationPrimitive.html#readyPromise">Online Documentation</a>
     */
    val readyPromise: kotlin.js.Promise<ClassificationPrimitive>

    /**
     * Called when [Viewer] or [CesiumWidget] render the scene to
     * get the draw commands needed to render this primitive.
     *
     * Do not call this function directly.  This is documented just to
     * list the exceptions that may be propagated when the scene is rendered:
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClassificationPrimitive.html#update">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClassificationPrimitive.html#getGeometryInstanceAttributes">Online Documentation</a>
     */
    fun getGeometryInstanceAttributes(id: Any): Any

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClassificationPrimitive.html#isDestroyed">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClassificationPrimitive.html#destroy">Online Documentation</a>
     */
    fun destroy()

    companion object {
        /**
         * Determines if ClassificationPrimitive rendering is supported.
         * @param [scene] The scene.
         * @return `true` if ClassificationPrimitives are supported; otherwise, returns `false`
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClassificationPrimitive.html#.isSupported">Online Documentation</a>
         */
        fun isSupported(scene: Scene): Boolean
    }
}

inline fun ClassificationPrimitive(
    block: ClassificationPrimitive.ConstructorOptions.() -> Unit,
): ClassificationPrimitive {
    val options: ClassificationPrimitive.ConstructorOptions = js("({})")
    block(options)
    return ClassificationPrimitive(options)
}
