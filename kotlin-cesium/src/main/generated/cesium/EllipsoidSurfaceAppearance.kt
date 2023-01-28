// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.jso

/**
 * An appearance for geometry on the surface of the ellipsoid like [PolygonGeometry]
 * and [RectangleGeometry], which supports all materials like [MaterialAppearance]
 * with {@link MaterialAppearance.MaterialSupport.ALL}.  However, this appearance requires
 * fewer vertex attributes since the fragment shader can procedurally compute `normal`,
 * `tangent`, and `bitangent`.
 * ```
 * const primitive = new Primitive({
 *   geometryInstances : new GeometryInstance({
 *     geometry : new PolygonGeometry({
 *       vertexFormat : EllipsoidSurfaceAppearance.VERTEX_FORMAT,
 *       // ...
 *     })
 *   }),
 *   appearance : new EllipsoidSurfaceAppearance({
 *     material : Material.fromType('Stripe')
 *   })
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidSurfaceAppearance.html">Online Documentation</a>
 */
external class EllipsoidSurfaceAppearance(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [flat] When `true`, flat shading is used in the fragment shader, which means lighting is not taking into account.
     *   Default value - `false`
     * @property [faceForward] When `true`, the fragment shader flips the surface normal as needed to ensure that the normal faces the viewer to avoid dark spots.  This is useful when both sides of a geometry should be shaded like [WallGeometry].
     *   Default value - `options.aboveGround`
     * @property [translucent] When `true`, the geometry is expected to appear translucent so [EllipsoidSurfaceAppearance.renderState] has alpha blending enabled.
     *   Default value - `true`
     * @property [aboveGround] When `true`, the geometry is expected to be on the ellipsoid's surface - not at a constant height above it - so [EllipsoidSurfaceAppearance.renderState] has backface culling enabled.
     *   Default value - `false`
     * @property [material] The material used to determine the fragment color.
     *   Default value - [Material.ColorType]
     * @property [vertexShaderSource] Optional GLSL vertex shader source to override the default vertex shader.
     * @property [fragmentShaderSource] Optional GLSL fragment shader source to override the default fragment shader.
     * @property [renderState] Optional render state to override the default render state.
     */
    interface ConstructorOptions {
        var flat: Boolean?
        var faceForward: Boolean?
        var translucent: Boolean?
        var aboveGround: Boolean?
        var material: Material?
        var vertexShaderSource: String?
        var fragmentShaderSource: String?
        var renderState: Any?
    }

    /**
     * The material used to determine the fragment color.  Unlike other [EllipsoidSurfaceAppearance]
     * properties, this is not read-only, so an appearance's material can change on the fly.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidSurfaceAppearance.html#material">Online Documentation</a>
     */
    var material: Material

    /**
     * When `true`, the geometry is expected to appear translucent.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidSurfaceAppearance.html#translucent">Online Documentation</a>
     */
    var translucent: Boolean

    /**
     * The GLSL source code for the vertex shader.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidSurfaceAppearance.html#vertexShaderSource">Online Documentation</a>
     */
    val vertexShaderSource: String

    /**
     * The GLSL source code for the fragment shader.  The full fragment shader
     * source is built procedurally taking into account [EllipsoidSurfaceAppearance.material],
     * [EllipsoidSurfaceAppearance.flat], and [EllipsoidSurfaceAppearance.faceForward].
     * Use [EllipsoidSurfaceAppearance.getFragmentShaderSource] to get the full source.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidSurfaceAppearance.html#fragmentShaderSource">Online Documentation</a>
     */
    val fragmentShaderSource: String

    /**
     * The WebGL fixed-function state to use when rendering the geometry.
     *
     * The render state can be explicitly defined when constructing a [EllipsoidSurfaceAppearance]
     * instance, or it is set implicitly via [EllipsoidSurfaceAppearance.translucent]
     * and [EllipsoidSurfaceAppearance.aboveGround].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidSurfaceAppearance.html#renderState">Online Documentation</a>
     */
    val renderState: Any

    /**
     * When `true`, the geometry is expected to be closed so
     * [EllipsoidSurfaceAppearance.renderState] has backface culling enabled.
     * If the viewer enters the geometry, it will not be visible.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidSurfaceAppearance.html#closed">Online Documentation</a>
     */
    val closed: Boolean

    /**
     * The [VertexFormat] that this appearance instance is compatible with.
     * A geometry can have more vertex attributes and still be compatible - at a
     * potential performance cost - but it can't have less.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidSurfaceAppearance.html#vertexFormat">Online Documentation</a>
     */
    val vertexFormat: VertexFormat

    /**
     * When `true`, flat shading is used in the fragment shader,
     * which means lighting is not taking into account.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidSurfaceAppearance.html#flat">Online Documentation</a>
     */
    val flat: Boolean

    /**
     * When `true`, the fragment shader flips the surface normal
     * as needed to ensure that the normal faces the viewer to avoid
     * dark spots.  This is useful when both sides of a geometry should be
     * shaded like [WallGeometry].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidSurfaceAppearance.html#faceForward">Online Documentation</a>
     */
    val faceForward: Boolean

    /**
     * When `true`, the geometry is expected to be on the ellipsoid's
     * surface - not at a constant height above it - so [EllipsoidSurfaceAppearance.renderState]
     * has backface culling enabled.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidSurfaceAppearance.html#aboveGround">Online Documentation</a>
     */
    val aboveGround: Boolean

    /**
     * Procedurally creates the full GLSL fragment shader source.  For [EllipsoidSurfaceAppearance],
     * this is derived from [EllipsoidSurfaceAppearance.fragmentShaderSource], [EllipsoidSurfaceAppearance.flat],
     * and [EllipsoidSurfaceAppearance.faceForward].
     * @return The full GLSL fragment shader source.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidSurfaceAppearance.html#getFragmentShaderSource">Online Documentation</a>
     */
    fun getFragmentShaderSource(): String

    /**
     * Determines if the geometry is translucent based on [EllipsoidSurfaceAppearance.translucent] and [Material.isTranslucent].
     * @return `true` if the appearance is translucent.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidSurfaceAppearance.html#isTranslucent">Online Documentation</a>
     */
    fun isTranslucent(): Boolean

    /**
     * Creates a render state.  This is not the final render state instance; instead,
     * it can contain a subset of render state properties identical to the render state
     * created in the context.
     * @return The render state.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidSurfaceAppearance.html#getRenderState">Online Documentation</a>
     */
    fun getRenderState(): Any

    companion object {
        /**
         * The [VertexFormat] that all [EllipsoidSurfaceAppearance] instances
         * are compatible with, which requires only `position` and `st`
         * attributes.  Other attributes are procedurally computed in the fragment shader.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidSurfaceAppearance.html#.VERTEX_FORMAT">Online Documentation</a>
         */
        val VERTEX_FORMAT: VertexFormat
    }
}

inline fun EllipsoidSurfaceAppearance(
    block: EllipsoidSurfaceAppearance.ConstructorOptions.() -> Unit,
): EllipsoidSurfaceAppearance =
    EllipsoidSurfaceAppearance(options = jso(block))
