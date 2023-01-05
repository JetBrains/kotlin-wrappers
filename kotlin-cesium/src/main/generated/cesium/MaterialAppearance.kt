// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.jso

/**
 * An appearance for arbitrary geometry (as opposed to [EllipsoidSurfaceAppearance], for example)
 * that supports shading with materials.
 * ```
 * const primitive = new Primitive({
 *   geometryInstances : new GeometryInstance({
 *     geometry : new WallGeometry({
 *             materialSupport :  MaterialAppearance.MaterialSupport.BASIC.vertexFormat,
 *       // ...
 *     })
 *   }),
 *   appearance : new MaterialAppearance({
 *     material : Material.fromType('Color'),
 *     faceForward : true
 *   })
 *
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MaterialAppearance.html">Online Documentation</a>
 */
external class MaterialAppearance(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [flat] When `true`, flat shading is used in the fragment shader, which means lighting is not taking into account.
     *   Default value - `false`
     * @property [faceForward] When `true`, the fragment shader flips the surface normal as needed to ensure that the normal faces the viewer to avoid dark spots.  This is useful when both sides of a geometry should be shaded like [WallGeometry].
     *   Default value - `!options.closed`
     * @property [translucent] When `true`, the geometry is expected to appear translucent so [MaterialAppearance.renderState] has alpha blending enabled.
     *   Default value - `true`
     * @property [closed] When `true`, the geometry is expected to be closed so [MaterialAppearance.renderState] has backface culling enabled.
     *   Default value - `false`
     * @property [materialSupport] The type of materials that will be supported.
     *   Default value - `MaterialAppearance.MaterialSupport.TEXTURED`
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
        var closed: Boolean?
        var materialSupport: MaterialSupportType?
        var material: Material?
        var vertexShaderSource: String?
        var fragmentShaderSource: String?
        var renderState: Any?
    }

    /**
     * The material used to determine the fragment color.  Unlike other [MaterialAppearance]
     * properties, this is not read-only, so an appearance's material can change on the fly.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MaterialAppearance.html#material">Online Documentation</a>
     */
    var material: Material

    /**
     * When `true`, the geometry is expected to appear translucent.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MaterialAppearance.html#translucent">Online Documentation</a>
     */
    var translucent: Boolean

    /**
     * The GLSL source code for the vertex shader.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MaterialAppearance.html#vertexShaderSource">Online Documentation</a>
     */
    val vertexShaderSource: String

    /**
     * The GLSL source code for the fragment shader.  The full fragment shader
     * source is built procedurally taking into account [MaterialAppearance.material],
     * [MaterialAppearance.flat], and [MaterialAppearance.faceForward].
     * Use [MaterialAppearance.getFragmentShaderSource] to get the full source.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MaterialAppearance.html#fragmentShaderSource">Online Documentation</a>
     */
    val fragmentShaderSource: String

    /**
     * The WebGL fixed-function state to use when rendering the geometry.
     *
     * The render state can be explicitly defined when constructing a [MaterialAppearance]
     * instance, or it is set implicitly via [MaterialAppearance.translucent]
     * and [MaterialAppearance.closed].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MaterialAppearance.html#renderState">Online Documentation</a>
     */
    val renderState: Any

    /**
     * When `true`, the geometry is expected to be closed so
     * [MaterialAppearance.renderState] has backface culling enabled.
     * If the viewer enters the geometry, it will not be visible.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MaterialAppearance.html#closed">Online Documentation</a>
     */
    val closed: Boolean

    /**
     * The type of materials supported by this instance.  This impacts the required
     * [VertexFormat] and the complexity of the vertex and fragment shaders.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MaterialAppearance.html#materialSupport">Online Documentation</a>
     */
    val materialSupport: MaterialSupportType

    /**
     * The [VertexFormat] that this appearance instance is compatible with.
     * A geometry can have more vertex attributes and still be compatible - at a
     * potential performance cost - but it can't have less.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MaterialAppearance.html#vertexFormat">Online Documentation</a>
     */
    val vertexFormat: VertexFormat

    /**
     * When `true`, flat shading is used in the fragment shader,
     * which means lighting is not taking into account.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MaterialAppearance.html#flat">Online Documentation</a>
     */
    val flat: Boolean

    /**
     * When `true`, the fragment shader flips the surface normal
     * as needed to ensure that the normal faces the viewer to avoid
     * dark spots.  This is useful when both sides of a geometry should be
     * shaded like [WallGeometry].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MaterialAppearance.html#faceForward">Online Documentation</a>
     */
    val faceForward: Boolean

    /**
     * Procedurally creates the full GLSL fragment shader source.  For [MaterialAppearance],
     * this is derived from [MaterialAppearance.fragmentShaderSource], [MaterialAppearance.material],
     * [MaterialAppearance.flat], and [MaterialAppearance.faceForward].
     * @return The full GLSL fragment shader source.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MaterialAppearance.html#getFragmentShaderSource">Online Documentation</a>
     */
    fun getFragmentShaderSource(): String

    /**
     * Determines if the geometry is translucent based on [MaterialAppearance.translucent] and [Material.isTranslucent].
     * @return `true` if the appearance is translucent.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MaterialAppearance.html#isTranslucent">Online Documentation</a>
     */
    fun isTranslucent(): Boolean

    /**
     * Creates a render state.  This is not the final render state instance; instead,
     * it can contain a subset of render state properties identical to the render state
     * created in the context.
     * @return The render state.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MaterialAppearance.html#getRenderState">Online Documentation</a>
     */
    fun getRenderState(): Any

    interface MaterialSupportType {
        var vertexFormat: VertexFormat
        var vertexShaderSource: String
        var fragmentShaderSource: String
    }

    /**
     * Determines the type of [Material] that is supported by a
     * [MaterialAppearance] instance.  This is a trade-off between
     * flexibility (a wide array of materials) and memory/performance
     * (required vertex format and GLSL shader complexity.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MaterialAppearance.MaterialSupport.html">Online Documentation</a>
     */
    object MaterialSupport {
        /**
         * Only basic materials, which require just `position` and
         * `normal` vertex attributes, are supported.
         */
        val BASIC: MaterialSupportType

        /**
         * Materials with textures, which require `position`,
         * `normal`, and `st` vertex attributes,
         * are supported.  The vast majority of materials fall into this category.
         */
        val TEXTURED: MaterialSupportType

        /**
         * All materials, including those that work in tangent space, are supported.
         * This requires `position`, `normal`, `st`,
         * `tangent`, and `bitangent` vertex attributes.
         */
        val ALL: MaterialSupportType
    }

}

inline fun MaterialAppearance(
    block: MaterialAppearance.ConstructorOptions.() -> Unit,
): MaterialAppearance =
    MaterialAppearance(options = jso(block))
