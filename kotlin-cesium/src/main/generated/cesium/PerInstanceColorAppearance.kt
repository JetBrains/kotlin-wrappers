// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * An appearance for [GeometryInstance] instances with color attributes.
 * This allows several geometry instances, each with a different color, to
 * be drawn with the same [Primitive] as shown in the second example below.
 * ```
 * // A solid white line segment
 * const primitive = new Primitive({
 *   geometryInstances : new GeometryInstance({
 *     geometry : new SimplePolylineGeometry({
 *       positions : Cartesian3.fromDegreesArray([
 *         0.0, 0.0,
 *         5.0, 0.0
 *       ])
 *     }),
 *     attributes : {
 *       color : ColorGeometryInstanceAttribute.fromColor(new Color(1.0, 1.0, 1.0, 1.0))
 *     }
 *   }),
 *   appearance : new PerInstanceColorAppearance({
 *     flat : true,
 *     translucent : false
 *   })
 * });
 *
 * // Two rectangles in a primitive, each with a different color
 * const instance = new GeometryInstance({
 *   geometry : new RectangleGeometry({
 *     rectangle : Rectangle.fromDegrees(0.0, 20.0, 10.0, 30.0)
 *   }),
 *   attributes : {
 *     color : new ColorGeometryInstanceAttribute(1.0, 0.0, 0.0, 0.5)
 *   }
 * });
 *
 * const anotherInstance = new GeometryInstance({
 *   geometry : new RectangleGeometry({
 *     rectangle : Rectangle.fromDegrees(0.0, 40.0, 10.0, 50.0)
 *   }),
 *   attributes : {
 *     color : new ColorGeometryInstanceAttribute(0.0, 0.0, 1.0, 0.5)
 *   }
 * });
 *
 * const rectanglePrimitive = new Primitive({
 *   geometryInstances : [instance, anotherInstance],
 *   appearance : new PerInstanceColorAppearance()
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerInstanceColorAppearance.html">Online Documentation</a>
 */
external class PerInstanceColorAppearance(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [flat] When `true`, flat shading is used in the fragment shader, which means lighting is not taking into account.
     *   Default value - `false`
     * @property [faceForward] When `true`, the fragment shader flips the surface normal as needed to ensure that the normal faces the viewer to avoid dark spots.  This is useful when both sides of a geometry should be shaded like [WallGeometry].
     *   Default value - `!options.closed`
     * @property [translucent] When `true`, the geometry is expected to appear translucent so [PerInstanceColorAppearance.renderState] has alpha blending enabled.
     *   Default value - `true`
     * @property [closed] When `true`, the geometry is expected to be closed so [PerInstanceColorAppearance.renderState] has backface culling enabled.
     *   Default value - `false`
     * @property [vertexShaderSource] Optional GLSL vertex shader source to override the default vertex shader.
     * @property [fragmentShaderSource] Optional GLSL fragment shader source to override the default fragment shader.
     * @property [renderState] Optional render state to override the default render state.
     */
    interface ConstructorOptions {
        var flat: Boolean?
        var faceForward: Boolean?
        var translucent: Boolean?
        var closed: Boolean?
        var vertexShaderSource: String?
        var fragmentShaderSource: String?
        var renderState: Any?
    }

    /**
     * This property is part of the [Appearance] interface, but is not
     * used by [PerInstanceColorAppearance] since a fully custom fragment shader is used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerInstanceColorAppearance.html#material">Online Documentation</a>
     */
    var material: Material

    /**
     * When `true`, the geometry is expected to appear translucent so
     * [PerInstanceColorAppearance.renderState] has alpha blending enabled.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerInstanceColorAppearance.html#translucent">Online Documentation</a>
     */
    var translucent: Boolean

    /**
     * The GLSL source code for the vertex shader.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerInstanceColorAppearance.html#vertexShaderSource">Online Documentation</a>
     */
    val vertexShaderSource: String

    /**
     * The GLSL source code for the fragment shader.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerInstanceColorAppearance.html#fragmentShaderSource">Online Documentation</a>
     */
    val fragmentShaderSource: String

    /**
     * The WebGL fixed-function state to use when rendering the geometry.
     *
     * The render state can be explicitly defined when constructing a [PerInstanceColorAppearance]
     * instance, or it is set implicitly via [PerInstanceColorAppearance.translucent]
     * and [PerInstanceColorAppearance.closed].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerInstanceColorAppearance.html#renderState">Online Documentation</a>
     */
    val renderState: Any

    /**
     * When `true`, the geometry is expected to be closed so
     * [PerInstanceColorAppearance.renderState] has backface culling enabled.
     * If the viewer enters the geometry, it will not be visible.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerInstanceColorAppearance.html#closed">Online Documentation</a>
     */
    val closed: Boolean

    /**
     * The [VertexFormat] that this appearance instance is compatible with.
     * A geometry can have more vertex attributes and still be compatible - at a
     * potential performance cost - but it can't have less.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerInstanceColorAppearance.html#vertexFormat">Online Documentation</a>
     */
    val vertexFormat: VertexFormat

    /**
     * When `true`, flat shading is used in the fragment shader,
     * which means lighting is not taking into account.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerInstanceColorAppearance.html#flat">Online Documentation</a>
     */
    val flat: Boolean

    /**
     * When `true`, the fragment shader flips the surface normal
     * as needed to ensure that the normal faces the viewer to avoid
     * dark spots.  This is useful when both sides of a geometry should be
     * shaded like [WallGeometry].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerInstanceColorAppearance.html#faceForward">Online Documentation</a>
     */
    val faceForward: Boolean

    /**
     * Procedurally creates the full GLSL fragment shader source.  For [PerInstanceColorAppearance],
     * this is derived from [PerInstanceColorAppearance.fragmentShaderSource], [PerInstanceColorAppearance.flat],
     * and [PerInstanceColorAppearance.faceForward].
     * @return The full GLSL fragment shader source.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerInstanceColorAppearance.html#getFragmentShaderSource">Online Documentation</a>
     */
    fun getFragmentShaderSource(): String

    /**
     * Determines if the geometry is translucent based on [PerInstanceColorAppearance.translucent].
     * @return `true` if the appearance is translucent.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerInstanceColorAppearance.html#isTranslucent">Online Documentation</a>
     */
    fun isTranslucent(): Boolean

    /**
     * Creates a render state.  This is not the final render state instance; instead,
     * it can contain a subset of render state properties identical to the render state
     * created in the context.
     * @return The render state.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerInstanceColorAppearance.html#getRenderState">Online Documentation</a>
     */
    fun getRenderState(): Any

    companion object {
        /**
         * The [VertexFormat] that all [PerInstanceColorAppearance] instances
         * are compatible with.  This requires only `position` and `normal`
         * attributes.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerInstanceColorAppearance.html#.VERTEX_FORMAT">Online Documentation</a>
         */
        val VERTEX_FORMAT: VertexFormat

        /**
         * The [VertexFormat] that all [PerInstanceColorAppearance] instances
         * are compatible with when [PerInstanceColorAppearance.flat] is `true`.
         * This requires only a `position` attribute.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerInstanceColorAppearance.html#.FLAT_VERTEX_FORMAT">Online Documentation</a>
         */
        val FLAT_VERTEX_FORMAT: VertexFormat
    }
}

inline fun PerInstanceColorAppearance(
    block: PerInstanceColorAppearance.ConstructorOptions.() -> Unit,
): PerInstanceColorAppearance {
    val options: PerInstanceColorAppearance.ConstructorOptions = js("({})")
    block(options)
    return PerInstanceColorAppearance(options)
}
