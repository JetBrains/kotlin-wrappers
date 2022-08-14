// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import kotlinx.js.ReadonlyArray

/**
 * A primitive represents geometry in the [Scene].  The geometry can be from a single [GeometryInstance]
 * as shown in example 1 below, or from an array of instances, even if the geometry is from different
 * geometry types, e.g., an [RectangleGeometry] and an [EllipsoidGeometry] as shown in Code Example 2.
 *
 * A primitive combines geometry instances with an [Appearance] that describes the full shading, including
 * [Material] and [RenderState].  Roughly, the geometry instance defines the structure and placement,
 * and the appearance defines the visual characteristics.  Decoupling geometry and appearance allows us to mix
 * and match most of them and add a new geometry or appearance independently of each other.
 *
 * Combining multiple instances into one primitive is called batching, and significantly improves performance for static data.
 * Instances can be individually picked; [Scene.pick] returns their [GeometryInstance.id].  Using
 * per-instance appearances like [PerInstanceColorAppearance], each instance can also have a unique color.
 *
 * [Geometry] can either be created and batched on a web worker or the main thread. The first two examples
 * show geometry that will be created on a web worker by using the descriptions of the geometry. The third example
 * shows how to create the geometry on the main thread by explicitly calling the `createGeometry` method.
 * ```
 * // 1. Draw a translucent ellipse on the surface with a checkerboard pattern
 * const instance = new GeometryInstance({
 *   geometry : new EllipseGeometry({
 *       center : Cartesian3.fromDegrees(-100.0, 20.0),
 *       semiMinorAxis : 500000.0,
 *       semiMajorAxis : 1000000.0,
 *       rotation : Math.PI_OVER_FOUR,
 *       vertexFormat : VertexFormat.POSITION_AND_ST
 *   }),
 *   id : 'object returned when this instance is picked and to get/set per-instance attributes'
 * });
 * scene.primitives.add(new Primitive({
 *   geometryInstances : instance,
 *   appearance : new EllipsoidSurfaceAppearance({
 *     material : Material.fromType('Checkerboard')
 *   })
 * }));
 * ```
 * ```
 * // 2. Draw different instances each with a unique color
 * const rectangleInstance = new GeometryInstance({
 *   geometry : new RectangleGeometry({
 *     rectangle : Rectangle.fromDegrees(-140.0, 30.0, -100.0, 40.0),
 *     vertexFormat : PerInstanceColorAppearance.VERTEX_FORMAT
 *   }),
 *   id : 'rectangle',
 *   attributes : {
 *     color : new ColorGeometryInstanceAttribute(0.0, 1.0, 1.0, 0.5)
 *   }
 * });
 * const ellipsoidInstance = new GeometryInstance({
 *   geometry : new EllipsoidGeometry({
 *     radii : new Cartesian3(500000.0, 500000.0, 1000000.0),
 *     vertexFormat : VertexFormat.POSITION_AND_NORMAL
 *   }),
 *   modelMatrix : Matrix4.multiplyByTranslation(Transforms.eastNorthUpToFixedFrame(
 *     Cartesian3.fromDegrees(-95.59777, 40.03883)), new Cartesian3(0.0, 0.0, 500000.0), new Matrix4()),
 *   id : 'ellipsoid',
 *   attributes : {
 *     color : ColorGeometryInstanceAttribute.fromColor(Color.AQUA)
 *   }
 * });
 * scene.primitives.add(new Primitive({
 *   geometryInstances : [rectangleInstance, ellipsoidInstance],
 *   appearance : new PerInstanceColorAppearance()
 * }));
 * ```
 * ```
 * // 3. Create the geometry on the main thread.
 * scene.primitives.add(new Primitive({
 *   geometryInstances : new GeometryInstance({
 *     geometry : EllipsoidGeometry.createGeometry(new EllipsoidGeometry({
 *       radii : new Cartesian3(500000.0, 500000.0, 1000000.0),
 *       vertexFormat : VertexFormat.POSITION_AND_NORMAL
 *     })),
 *     modelMatrix : Matrix4.multiplyByTranslation(Transforms.eastNorthUpToFixedFrame(
 *       Cartesian3.fromDegrees(-95.59777, 40.03883)), new Cartesian3(0.0, 0.0, 500000.0), new Matrix4()),
 *     id : 'ellipsoid',
 *     attributes : {
 *       color : ColorGeometryInstanceAttribute.fromColor(Color.AQUA)
 *     }
 *   }),
 *   appearance : new PerInstanceColorAppearance(),
 *   asynchronous : false
 * }));
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Primitive.html">Online Documentation</a>
 */
external class Primitive(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [geometryInstances] The geometry instances - or a single geometry instance - to render.
     * @property [appearance] The appearance used to render the primitive.
     * @property [depthFailAppearance] The appearance used to shade this primitive when it fails the depth test.
     * @property [show] Determines if this primitive will be shown.
     *   Default value - `true`
     * @property [modelMatrix] The 4x4 transformation matrix that transforms the primitive (all geometry instances) from model to world coordinates.
     *   Default value - [Matrix4.IDENTITY]
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
     * @property [cull] When `true`, the renderer frustum culls and horizon culls the primitive's commands based on their bounding volume.  Set this to `false` for a small performance gain if you are manually culling the primitive.
     *   Default value - `true`
     * @property [asynchronous] Determines if the primitive will be created asynchronously or block until ready.
     *   Default value - `true`
     * @property [debugShowBoundingVolume] For debugging only. Determines if this primitive's commands' bounding spheres are shown.
     *   Default value - `false`
     * @property [shadows] Determines whether this primitive casts or receives shadows from light sources.
     *   Default value - [ShadowMode.DISABLED]
     */
    interface ConstructorOptions {
        var geometryInstances: ReadonlyArray<GeometryInstance>?
        var appearance: Appearance?
        var depthFailAppearance: Appearance?
        var show: Boolean?
        var modelMatrix: Matrix4?
        var vertexCacheOptimize: Boolean?
        var interleave: Boolean?
        var compressVertices: Boolean?
        var releaseGeometryInstances: Boolean?
        var allowPicking: Boolean?
        var cull: Boolean?
        var asynchronous: Boolean?
        var debugShowBoundingVolume: Boolean?
        var shadows: ShadowMode?
    }

    /**
     * The geometry instances rendered with this primitive.  This may
     * be `undefined` if `options.releaseGeometryInstances`
     * is `true` when the primitive is constructed.
     *
     * Changing this property after the primitive is rendered has no effect.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Primitive.html#geometryInstances">Online Documentation</a>
     */
    val geometryInstances: ReadonlyArray<GeometryInstance>

    /**
     * The [Appearance] used to shade this primitive. Each geometry
     * instance is shaded with the same appearance.  Some appearances, like
     * [PerInstanceColorAppearance] allow giving each instance unique
     * properties.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Primitive.html#appearance">Online Documentation</a>
     */
    var appearance: Appearance

    /**
     * The [Appearance] used to shade this primitive when it fails the depth test. Each geometry
     * instance is shaded with the same appearance.  Some appearances, like
     * [PerInstanceColorAppearance] allow giving each instance unique
     * properties.
     *
     * When using an appearance that requires a color attribute, like PerInstanceColorAppearance,
     * add a depthFailColor per-instance attribute instead.
     *
     *
     * Requires the EXT_frag_depth WebGL extension to render properly. If the extension is not supported,
     * there may be artifacts.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Primitive.html#depthFailAppearance">Online Documentation</a>
     */
    var depthFailAppearance: Appearance

    /**
     * The 4x4 transformation matrix that transforms the primitive (all geometry instances) from model to world coordinates.
     * When this is the identity matrix, the primitive is drawn in world coordinates, i.e., Earth's WGS84 coordinates.
     * Local reference frames can be used by providing a different transformation matrix, like that returned
     * by [Transforms.eastNorthUpToFixedFrame].
     *
     * This property is only supported in 3D mode.
     * ```
     * const origin = Cartesian3.fromDegrees(-95.0, 40.0, 200000.0);
     * p.modelMatrix = Transforms.eastNorthUpToFixedFrame(origin);
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Primitive.html#modelMatrix">Online Documentation</a>
     */
    var modelMatrix: Matrix4

    /**
     * Determines if the primitive will be shown.  This affects all geometry
     * instances in the primitive.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Primitive.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * When `true`, the renderer frustum culls and horizon culls the primitive's commands
     * based on their bounding volume.  Set this to `false` for a small performance gain
     * if you are manually culling the primitive.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Primitive.html#cull">Online Documentation</a>
     */
    var cull: Boolean

    /**
     * This property is for debugging only; it is not for production use nor is it optimized.
     *
     * Draws the bounding sphere for each draw command in the primitive.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Primitive.html#debugShowBoundingVolume">Online Documentation</a>
     */
    var debugShowBoundingVolume: Boolean

    /**
     * Determines whether this primitive casts or receives shadows from light sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Primitive.html#shadows">Online Documentation</a>
     */
    var shadows: ShadowMode

    /**
     * When `true`, geometry vertices are optimized for the pre and post-vertex-shader caches.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Primitive.html#vertexCacheOptimize">Online Documentation</a>
     */
    val vertexCacheOptimize: Boolean

    /**
     * Determines if geometry vertex attributes are interleaved, which can slightly improve rendering performance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Primitive.html#interleave">Online Documentation</a>
     */
    val interleave: Boolean

    /**
     * When `true`, the primitive does not keep a reference to the input `geometryInstances` to save memory.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Primitive.html#releaseGeometryInstances">Online Documentation</a>
     */
    val releaseGeometryInstances: Boolean

    /**
     * When `true`, each geometry instance will only be pickable with [Scene.pick].  When `false`, GPU memory is saved.         *
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Primitive.html#allowPicking">Online Documentation</a>
     */
    val allowPicking: Boolean

    /**
     * Determines if the geometry instances will be created and batched on a web worker.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Primitive.html#asynchronous">Online Documentation</a>
     */
    val asynchronous: Boolean

    /**
     * When `true`, geometry vertices are compressed, which will save memory.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Primitive.html#compressVertices">Online Documentation</a>
     */
    val compressVertices: Boolean

    /**
     * Determines if the primitive is complete and ready to render.  If this property is
     * true, the primitive will be rendered the next time that [Primitive.update]
     * is called.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Primitive.html#ready">Online Documentation</a>
     */
    val ready: Boolean

    /**
     * Gets a promise that resolves when the primitive is ready to render.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Primitive.html#readyPromise">Online Documentation</a>
     */
    val readyPromise: kotlin.js.Promise<Primitive>

    /**
     * Called when [Viewer] or [CesiumWidget] render the scene to
     * get the draw commands needed to render this primitive.
     *
     * Do not call this function directly.  This is documented just to
     * list the exceptions that may be propagated when the scene is rendered:
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Primitive.html#update">Online Documentation</a>
     */
    fun update()

    /**
     * Returns the modifiable per-instance attributes for a [GeometryInstance].
     * ```
     * const attributes = primitive.getGeometryInstanceAttributes('an id');
     * attributes.color = ColorGeometryInstanceAttribute.toValue(Color.AQUA);
     * attributes.show = ShowGeometryInstanceAttribute.toValue(true);
     * attributes.distanceDisplayCondition = DistanceDisplayConditionGeometryInstanceAttribute.toValue(100.0, 10000.0);
     * attributes.offset = OffsetGeometryInstanceAttribute.toValue(Cartesian3.IDENTITY);
     * ```
     * @param [id] The id of the [GeometryInstance].
     * @return The typed array in the attribute's format or undefined if the is no instance with id.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Primitive.html#getGeometryInstanceAttributes">Online Documentation</a>
     */
    fun getGeometryInstanceAttributes(id: Any): Any

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Primitive.html#isDestroyed">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Primitive.html#destroy">Online Documentation</a>
     */
    fun destroy()
}

inline fun Primitive(
    block: Primitive.ConstructorOptions.() -> Unit,
): Primitive {
    val options: Primitive.ConstructorOptions = js("({})")
    block(options)
    return Primitive(options)
}
