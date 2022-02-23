// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Runs a post-process stage on either the texture rendered by the scene or the output of a previous post-process stage.
 * ```
 * // Simple stage to change the color
 * const fs =
 *     'uniform sampler2D colorTexture;\n' +
 *     'varying vec2 v_textureCoordinates;\n' +
 *     'uniform float scale;\n' +
 *     'uniform vec3 offset;\n' +
 *     'void main() {\n' +
 *     '    vec4 color = texture2D(colorTexture, v_textureCoordinates);\n' +
 *     '    gl_FragColor = vec4(color.rgb * scale + offset, 1.0);\n' +
 *     '}\n';
 * scene.postProcessStages.add(new PostProcessStage({
 *     fragmentShader : fs,
 *     uniforms : {
 *         scale : 1.1,
 *         offset : function() {
 *             return new Cartesian3(0.1, 0.2, 0.3);
 *         }
 *     }
 * }));
 * ```
 * ```
 * // Simple stage to change the color of what is selected.
 * // If czm_selected returns true, the current fragment belongs to geometry in the selected array.
 * const fs =
 *     'uniform sampler2D colorTexture;\n' +
 *     'varying vec2 v_textureCoordinates;\n' +
 *     'uniform vec4 highlight;\n' +
 *     'void main() {\n' +
 *     '    vec4 color = texture2D(colorTexture, v_textureCoordinates);\n' +
 *     '    if (czm_selected()) {\n' +
 *     '        vec3 highlighted = highlight.a * highlight.rgb + (1.0 - highlight.a) * color.rgb;\n' +
 *     '        gl_FragColor = vec4(highlighted, 1.0);\n' +
 *     '    } else { \n' +
 *     '        gl_FragColor = color;\n' +
 *     '    }\n' +
 *     '}\n';
 * const stage = scene.postProcessStages.add(new PostProcessStage({
 *     fragmentShader : fs,
 *     uniforms : {
 *         highlight : function() {
 *             return new Color(1.0, 0.0, 0.0, 0.5);
 *         }
 *     }
 * }));
 * stage.selected = [cesium3DTileFeature];
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStage.html">Online Documentation</a>
 */
external class PostProcessStage(options: ConstructorOptions) {
    /**
     * @property [fragmentShader] The fragment shader to use. The default `sampler2D` uniforms are `colorTexture` and `depthTexture`. The color texture is the output of rendering the scene or the previous stage. The depth texture is the output from rendering the scene. The shader should contain one or both uniforms. There is also a `vec2` varying named `v_textureCoordinates` that can be used to sample the textures.
     * @property [uniforms] An object whose properties will be used to set the shaders uniforms. The properties can be constant values or a function. A constant value can also be a URI, data URI, or HTML element to use as a texture.
     * @property [textureScale] A number in the range (0.0, 1.0] used to scale the texture dimensions. A scale of 1.0 will render this post-process stage  to a texture the size of the viewport.
     *   Default value - `1.0`
     * @property [forcePowerOfTwo] Whether or not to force the texture dimensions to be both equal powers of two. The power of two will be the next power of two of the minimum of the dimensions.
     *   Default value - `false`
     * @property [sampleMode] How to sample the input color texture.
     *   Default value - [PostProcessStageSampleMode.NEAREST]
     * @property [pixelFormat] The color pixel format of the output texture.
     *   Default value - [PixelFormat.RGBA]
     * @property [pixelDatatype] The pixel data type of the output texture.
     *   Default value - [PixelDatatype.UNSIGNED_BYTE]
     * @property [clearColor] The color to clear the output texture to.
     *   Default value - [Color.BLACK]
     * @property [scissorRectangle] The rectangle to use for the scissor test.
     * @property [name] The unique name of this post-process stage for reference by other stages in a composite. If a name is not supplied, a GUID will be generated.
     *   Default value - [createGuid()][createGuid]
     */
    interface ConstructorOptions {
        var fragmentShader: String
        var uniforms: Any?
        var textureScale: Double?
        var forcePowerOfTwo: Boolean?
        var sampleMode: PostProcessStageSampleMode?
        var pixelFormat: PixelFormat?
        var pixelDatatype: PixelDatatype?
        var clearColor: Color?
        var scissorRectangle: BoundingRectangle?
        var name: String?
    }

    /**
     * Whether or not to execute this post-process stage when ready.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStage.html#enabled">Online Documentation</a>
     */
    var enabled: Boolean

    /**
     * Determines if this post-process stage is ready to be executed. A stage is only executed when both `ready`
     * and [PostProcessStage.enabled] are `true`. A stage will not be ready while it is waiting on textures
     * to load.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStage.html#ready">Online Documentation</a>
     */
    val ready: Boolean

    /**
     * The unique name of this post-process stage for reference by other stages in a [PostProcessStageComposite].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStage.html#name">Online Documentation</a>
     */
    val name: String

    /**
     * The fragment shader to use when execute this post-process stage.
     *
     * The shader must contain a sampler uniform declaration for `colorTexture`, `depthTexture`,
     * or both.
     *
     * The shader must contain a `vec2` varying declaration for `v_textureCoordinates` for sampling
     * the texture uniforms.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStage.html#fragmentShader">Online Documentation</a>
     */
    val fragmentShader: String

    /**
     * An object whose properties are used to set the uniforms of the fragment shader.
     *
     * The object property values can be either a constant or a function. The function will be called
     * each frame before the post-process stage is executed.
     *
     * A constant value can also be a URI to an image, a data URI, or an HTML element that can be used as a texture, such as HTMLImageElement or HTMLCanvasElement.
     *
     * If this post-process stage is part of a [PostProcessStageComposite] that does not execute in series, the constant value can also be
     * the name of another stage in a composite. This will set the uniform to the output texture the stage with that name.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStage.html#uniforms">Online Documentation</a>
     */
    val uniforms: Any

    /**
     * A number in the range (0.0, 1.0] used to scale the output texture dimensions. A scale of 1.0 will render this post-process stage to a texture the size of the viewport.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStage.html#textureScale">Online Documentation</a>
     */
    val textureScale: Double

    /**
     * Whether or not to force the output texture dimensions to be both equal powers of two. The power of two will be the next power of two of the minimum of the dimensions.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStage.html#forcePowerOfTwo">Online Documentation</a>
     */
    val forcePowerOfTwo: Int

    /**
     * How to sample the input color texture.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStage.html#sampleMode">Online Documentation</a>
     */
    val sampleMode: PostProcessStageSampleMode

    /**
     * The color pixel format of the output texture.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStage.html#pixelFormat">Online Documentation</a>
     */
    val pixelFormat: PixelFormat

    /**
     * The pixel data type of the output texture.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStage.html#pixelDatatype">Online Documentation</a>
     */
    val pixelDatatype: PixelDatatype

    /**
     * The color to clear the output texture to.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStage.html#clearColor">Online Documentation</a>
     */
    val clearColor: Color

    /**
     * The [BoundingRectangle] to use for the scissor test. A default bounding rectangle will disable the scissor test.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStage.html#scissorRectangle">Online Documentation</a>
     */
    val scissorRectangle: BoundingRectangle

    /**
     * The features selected for applying the post-process.
     *
     * In the fragment shader, use `czm_selected` to determine whether or not to apply the post-process
     * stage to that fragment. For example:
     * ```
     * if (czm_selected(v_textureCoordinates)) {
     *     // apply post-process stage
     * } else {
     *     gl_FragColor = texture2D(colorTexture, v_textureCordinates);
     * }
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStage.html#selected">Online Documentation</a>
     */
    var selected: Array<out Any>

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStage.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
     * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
     *
     * Once an object is destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.  Therefore,
     * assign the return value (`undefined`) to the object as done in the example.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStage.html#destroy">Online Documentation</a>
     */
    fun destroy()
}

inline fun PostProcessStage(
    block: PostProcessStage.ConstructorOptions.() -> Unit,
): PostProcessStage {
    val options: PostProcessStage.ConstructorOptions = js("({})")
    block(options)
    return PostProcessStage(options)
}
