// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.jso

/**
 * Visualizes a vertex attribute by displaying it as a color for debugging.
 *
 * Components for well-known unit-length vectors, i.e., `normal`,
 * `tangent`, and `bitangent`, are scaled and biased
 * from [-1.0, 1.0] to (-1.0, 1.0).
 * ```
 * const primitive = new Primitive({
 *   geometryInstances : // ...
 *   appearance : new DebugAppearance({
 *     attributeName : 'normal'
 *   })
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugAppearance.html">Online Documentation</a>
 */
external class DebugAppearance(options: ConstructorOptions) {
    /**
     * @property [attributeName] The name of the attribute to visualize.
     * @property [perInstanceAttribute] Boolean that determines whether this attribute is a per-instance geometry attribute.
     *   Default value - `false`
     * @property [glslDatatype] The GLSL datatype of the attribute.  Supported datatypes are `float`, `vec2`, `vec3`, and `vec4`.
     *   Default value - `'vec3'`
     * @property [vertexShaderSource] Optional GLSL vertex shader source to override the default vertex shader.
     * @property [fragmentShaderSource] Optional GLSL fragment shader source to override the default fragment shader.
     * @property [renderState] Optional render state to override the default render state.
     */
    interface ConstructorOptions {
        var attributeName: String
        var perInstanceAttribute: Boolean?
        var glslDatatype: String?
        var vertexShaderSource: String?
        var fragmentShaderSource: String?
        var renderState: Any?
    }

    /**
     * This property is part of the [Appearance] interface, but is not
     * used by [DebugAppearance] since a fully custom fragment shader is used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugAppearance.html#material">Online Documentation</a>
     */
    var material: Material

    /**
     * When `true`, the geometry is expected to appear translucent.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugAppearance.html#translucent">Online Documentation</a>
     */
    var translucent: Boolean

    /**
     * The GLSL source code for the vertex shader.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugAppearance.html#vertexShaderSource">Online Documentation</a>
     */
    val vertexShaderSource: String

    /**
     * The GLSL source code for the fragment shader.  The full fragment shader
     * source is built procedurally taking into account the [DebugAppearance.material].
     * Use [DebugAppearance.getFragmentShaderSource] to get the full source.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugAppearance.html#fragmentShaderSource">Online Documentation</a>
     */
    val fragmentShaderSource: String

    /**
     * The WebGL fixed-function state to use when rendering the geometry.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugAppearance.html#renderState">Online Documentation</a>
     */
    val renderState: Any

    /**
     * When `true`, the geometry is expected to be closed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugAppearance.html#closed">Online Documentation</a>
     */
    val closed: Boolean

    /**
     * The name of the attribute being visualized.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugAppearance.html#attributeName">Online Documentation</a>
     */
    val attributeName: String

    /**
     * The GLSL datatype of the attribute being visualized.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugAppearance.html#glslDatatype">Online Documentation</a>
     */
    val glslDatatype: String

    /**
     * Returns the full GLSL fragment shader source, which for [DebugAppearance] is just
     * [DebugAppearance.fragmentShaderSource].
     * @return The full GLSL fragment shader source.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugAppearance.html#getFragmentShaderSource">Online Documentation</a>
     */
    fun getFragmentShaderSource(): String

    /**
     * Determines if the geometry is translucent based on [DebugAppearance.translucent].
     * @return `true` if the appearance is translucent.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugAppearance.html#isTranslucent">Online Documentation</a>
     */
    fun isTranslucent(): Boolean

    /**
     * Creates a render state.  This is not the final render state instance; instead,
     * it can contain a subset of render state properties identical to the render state
     * created in the context.
     * @return The render state.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugAppearance.html#getRenderState">Online Documentation</a>
     */
    fun getRenderState(): Any
}

inline fun DebugAppearance(
    block: DebugAppearance.ConstructorOptions.() -> Unit,
): DebugAppearance =
    DebugAppearance(options = jso(block))
