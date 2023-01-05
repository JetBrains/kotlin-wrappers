// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.jso

/**
 * An appearance for [GeometryInstance] instances with color attributes and
 * [PolylineGeometry] or [GroundPolylineGeometry].
 * This allows several geometry instances, each with a different color, to
 * be drawn with the same [Primitive].
 * ```
 * // A solid white line segment
 * const primitive = new Primitive({
 *   geometryInstances : new GeometryInstance({
 *     geometry : new PolylineGeometry({
 *       positions : Cartesian3.fromDegreesArray([
 *         0.0, 0.0,
 *         5.0, 0.0
 *       ]),
 *       width : 10.0,
 *       vertexFormat : PolylineColorAppearance.VERTEX_FORMAT
 *     }),
 *     attributes : {
 *       color : ColorGeometryInstanceAttribute.fromColor(new Color(1.0, 1.0, 1.0, 1.0))
 *     }
 *   }),
 *   appearance : new PolylineColorAppearance({
 *     translucent : false
 *   })
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineColorAppearance.html">Online Documentation</a>
 */
external class PolylineColorAppearance(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [translucent] When `true`, the geometry is expected to appear translucent so [PolylineColorAppearance.renderState] has alpha blending enabled.
     *   Default value - `true`
     * @property [vertexShaderSource] Optional GLSL vertex shader source to override the default vertex shader.
     * @property [fragmentShaderSource] Optional GLSL fragment shader source to override the default fragment shader.
     * @property [renderState] Optional render state to override the default render state.
     */
    interface ConstructorOptions {
        var translucent: Boolean?
        var vertexShaderSource: String?
        var fragmentShaderSource: String?
        var renderState: Any?
    }

    /**
     * This property is part of the [Appearance] interface, but is not
     * used by [PolylineColorAppearance] since a fully custom fragment shader is used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineColorAppearance.html#material">Online Documentation</a>
     */
    var material: Material

    /**
     * When `true`, the geometry is expected to appear translucent so
     * [PolylineColorAppearance.renderState] has alpha blending enabled.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineColorAppearance.html#translucent">Online Documentation</a>
     */
    var translucent: Boolean

    /**
     * The GLSL source code for the vertex shader.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineColorAppearance.html#vertexShaderSource">Online Documentation</a>
     */
    val vertexShaderSource: String

    /**
     * The GLSL source code for the fragment shader.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineColorAppearance.html#fragmentShaderSource">Online Documentation</a>
     */
    val fragmentShaderSource: String

    /**
     * The WebGL fixed-function state to use when rendering the geometry.
     *
     * The render state can be explicitly defined when constructing a [PolylineColorAppearance]
     * instance, or it is set implicitly via [PolylineColorAppearance.translucent].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineColorAppearance.html#renderState">Online Documentation</a>
     */
    val renderState: Any

    /**
     * When `true`, the geometry is expected to be closed so
     * [PolylineColorAppearance.renderState] has backface culling enabled.
     * This is always `false` for `PolylineColorAppearance`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineColorAppearance.html#closed">Online Documentation</a>
     */
    val closed: Boolean

    /**
     * The [VertexFormat] that this appearance instance is compatible with.
     * A geometry can have more vertex attributes and still be compatible - at a
     * potential performance cost - but it can't have less.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineColorAppearance.html#vertexFormat">Online Documentation</a>
     */
    val vertexFormat: VertexFormat

    /**
     * Procedurally creates the full GLSL fragment shader source.
     * @return The full GLSL fragment shader source.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineColorAppearance.html#getFragmentShaderSource">Online Documentation</a>
     */
    fun getFragmentShaderSource(): String

    /**
     * Determines if the geometry is translucent based on [PolylineColorAppearance.translucent].
     * @return `true` if the appearance is translucent.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineColorAppearance.html#isTranslucent">Online Documentation</a>
     */
    fun isTranslucent(): Boolean

    /**
     * Creates a render state.  This is not the final render state instance; instead,
     * it can contain a subset of render state properties identical to the render state
     * created in the context.
     * @return The render state.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineColorAppearance.html#getRenderState">Online Documentation</a>
     */
    fun getRenderState(): Any

    companion object {
        /**
         * The [VertexFormat] that all [PolylineColorAppearance] instances
         * are compatible with. This requires only a `position` attribute.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineColorAppearance.html#.VERTEX_FORMAT">Online Documentation</a>
         */
        val VERTEX_FORMAT: VertexFormat
    }
}

inline fun PolylineColorAppearance(
    block: PolylineColorAppearance.ConstructorOptions.() -> Unit,
): PolylineColorAppearance =
    PolylineColorAppearance(options = jso(block))
