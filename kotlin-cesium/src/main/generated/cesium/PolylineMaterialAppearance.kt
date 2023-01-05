// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.jso

/**
 * An appearance for [PolylineGeometry] that supports shading with materials.
 * ```
 * const primitive = new Primitive({
 *   geometryInstances : new GeometryInstance({
 *     geometry : new PolylineGeometry({
 *       positions : Cartesian3.fromDegreesArray([
 *         0.0, 0.0,
 *         5.0, 0.0
 *       ]),
 *       width : 10.0,
 *       vertexFormat : PolylineMaterialAppearance.VERTEX_FORMAT
 *     })
 *   }),
 *   appearance : new PolylineMaterialAppearance({
 *     material : Material.fromType('Color')
 *   })
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineMaterialAppearance.html">Online Documentation</a>
 */
external class PolylineMaterialAppearance(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [translucent] When `true`, the geometry is expected to appear translucent so [PolylineMaterialAppearance.renderState] has alpha blending enabled.
     *   Default value - `true`
     * @property [material] The material used to determine the fragment color.
     *   Default value - [Material.ColorType]
     * @property [vertexShaderSource] Optional GLSL vertex shader source to override the default vertex shader.
     * @property [fragmentShaderSource] Optional GLSL fragment shader source to override the default fragment shader.
     * @property [renderState] Optional render state to override the default render state.
     */
    interface ConstructorOptions {
        var translucent: Boolean?
        var material: Material?
        var vertexShaderSource: String?
        var fragmentShaderSource: String?
        var renderState: Any?
    }

    /**
     * The material used to determine the fragment color.  Unlike other [PolylineMaterialAppearance]
     * properties, this is not read-only, so an appearance's material can change on the fly.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineMaterialAppearance.html#material">Online Documentation</a>
     */
    var material: Material

    /**
     * When `true`, the geometry is expected to appear translucent so
     * [PolylineMaterialAppearance.renderState] has alpha blending enabled.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineMaterialAppearance.html#translucent">Online Documentation</a>
     */
    var translucent: Boolean

    /**
     * The GLSL source code for the vertex shader.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineMaterialAppearance.html#vertexShaderSource">Online Documentation</a>
     */
    val vertexShaderSource: String

    /**
     * The GLSL source code for the fragment shader.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineMaterialAppearance.html#fragmentShaderSource">Online Documentation</a>
     */
    val fragmentShaderSource: String

    /**
     * The WebGL fixed-function state to use when rendering the geometry.
     *
     * The render state can be explicitly defined when constructing a [PolylineMaterialAppearance]
     * instance, or it is set implicitly via [PolylineMaterialAppearance.translucent]
     * and [PolylineMaterialAppearance.closed].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineMaterialAppearance.html#renderState">Online Documentation</a>
     */
    val renderState: Any

    /**
     * When `true`, the geometry is expected to be closed so
     * [PolylineMaterialAppearance.renderState] has backface culling enabled.
     * This is always `false` for `PolylineMaterialAppearance`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineMaterialAppearance.html#closed">Online Documentation</a>
     */
    val closed: Boolean

    /**
     * The [VertexFormat] that this appearance instance is compatible with.
     * A geometry can have more vertex attributes and still be compatible - at a
     * potential performance cost - but it can't have less.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineMaterialAppearance.html#vertexFormat">Online Documentation</a>
     */
    val vertexFormat: VertexFormat

    /**
     * Procedurally creates the full GLSL fragment shader source.  For [PolylineMaterialAppearance],
     * this is derived from [PolylineMaterialAppearance.fragmentShaderSource] and [PolylineMaterialAppearance.material].
     * @return The full GLSL fragment shader source.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineMaterialAppearance.html#getFragmentShaderSource">Online Documentation</a>
     */
    fun getFragmentShaderSource(): String

    /**
     * Determines if the geometry is translucent based on [PolylineMaterialAppearance.translucent] and [Material.isTranslucent].
     * @return `true` if the appearance is translucent.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineMaterialAppearance.html#isTranslucent">Online Documentation</a>
     */
    fun isTranslucent(): Boolean

    /**
     * Creates a render state.  This is not the final render state instance; instead,
     * it can contain a subset of render state properties identical to the render state
     * created in the context.
     * @return The render state.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineMaterialAppearance.html#getRenderState">Online Documentation</a>
     */
    fun getRenderState(): Any

    companion object {
        /**
         * The [VertexFormat] that all [PolylineMaterialAppearance] instances
         * are compatible with. This requires `position` and `st` attributes.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineMaterialAppearance.html#.VERTEX_FORMAT">Online Documentation</a>
         */
        val VERTEX_FORMAT: VertexFormat
    }
}

inline fun PolylineMaterialAppearance(
    block: PolylineMaterialAppearance.ConstructorOptions.() -> Unit,
): PolylineMaterialAppearance =
    PolylineMaterialAppearance(options = jso(block))
