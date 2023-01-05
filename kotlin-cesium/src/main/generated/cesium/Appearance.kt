// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.jso

/**
 * An appearance defines the full GLSL vertex and fragment shaders and the
 * render state used to draw a [Primitive].  All appearances implement
 * this base `Appearance` interface.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Appearance.html">Online Documentation</a>
 */
external class Appearance(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [translucent] When `true`, the geometry is expected to appear translucent so [Appearance.renderState] has alpha blending enabled.
     *   Default value - `true`
     * @property [closed] When `true`, the geometry is expected to be closed so [Appearance.renderState] has backface culling enabled.
     *   Default value - `false`
     * @property [material] The material used to determine the fragment color.
     *   Default value - [Material.ColorType]
     * @property [vertexShaderSource] Optional GLSL vertex shader source to override the default vertex shader.
     * @property [fragmentShaderSource] Optional GLSL fragment shader source to override the default fragment shader.
     * @property [renderState] Optional render state to override the default render state.
     */
    interface ConstructorOptions {
        var translucent: Boolean?
        var closed: Boolean?
        var material: Material?
        var vertexShaderSource: String?
        var fragmentShaderSource: String?
        var renderState: Any?
    }

    /**
     * The material used to determine the fragment color.  Unlike other [Appearance]
     * properties, this is not read-only, so an appearance's material can change on the fly.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Appearance.html#material">Online Documentation</a>
     */
    var material: Material

    /**
     * When `true`, the geometry is expected to appear translucent.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Appearance.html#translucent">Online Documentation</a>
     */
    var translucent: Boolean

    /**
     * The GLSL source code for the vertex shader.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Appearance.html#vertexShaderSource">Online Documentation</a>
     */
    val vertexShaderSource: String

    /**
     * The GLSL source code for the fragment shader.  The full fragment shader
     * source is built procedurally taking into account the [Appearance.material].
     * Use [Appearance.getFragmentShaderSource] to get the full source.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Appearance.html#fragmentShaderSource">Online Documentation</a>
     */
    val fragmentShaderSource: String

    /**
     * The WebGL fixed-function state to use when rendering the geometry.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Appearance.html#renderState">Online Documentation</a>
     */
    val renderState: Any

    /**
     * When `true`, the geometry is expected to be closed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Appearance.html#closed">Online Documentation</a>
     */
    val closed: Boolean

    /**
     * Procedurally creates the full GLSL fragment shader source for this appearance
     * taking into account [Appearance.fragmentShaderSource] and [Appearance.material].
     * @return The full GLSL fragment shader source.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Appearance.html#getFragmentShaderSource">Online Documentation</a>
     */
    fun getFragmentShaderSource(): String

    /**
     * Determines if the geometry is translucent based on [Appearance.translucent] and [Material.isTranslucent].
     * @return `true` if the appearance is translucent.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Appearance.html#isTranslucent">Online Documentation</a>
     */
    fun isTranslucent(): Boolean

    /**
     * Creates a render state.  This is not the final render state instance; instead,
     * it can contain a subset of render state properties identical to the render state
     * created in the context.
     * @return The render state.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Appearance.html#getRenderState">Online Documentation</a>
     */
    fun getRenderState(): Any
}

inline fun Appearance(
    block: Appearance.ConstructorOptions.() -> Unit,
): Appearance =
    Appearance(options = jso(block))
