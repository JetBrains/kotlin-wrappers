// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray
import js.core.jso

/**
 * A collection of [PostProcessStage]s or other post-process composite stages that execute together logically.
 *
 * All stages are executed in the order of the array. The input texture changes based on the value of `inputPreviousStageTexture`.
 * If `inputPreviousStageTexture` is `true`, the input to each stage is the output texture rendered to by the scene or of the stage that executed before it.
 * If `inputPreviousStageTexture` is `false`, the input texture is the same for each stage in the composite. The input texture is the texture rendered to by the scene
 * or the output texture of the previous stage.
 * ```
 * // Example 1: separable blur filter
 * // The input to blurXDirection is the texture rendered to by the scene or the output of the previous stage.
 * // The input to blurYDirection is the texture rendered to by blurXDirection.
 * scene.postProcessStages.add(new PostProcessStageComposite({
 *     stages : [blurXDirection, blurYDirection]
 * }));
 * ```
 * ```
 * // Example 2: referencing the output of another post-process stage
 * scene.postProcessStages.add(new PostProcessStageComposite({
 *     inputPreviousStageTexture : false,
 *     stages : [
 *         // The same as Example 1.
 *         new PostProcessStageComposite({
 *             inputPreviousStageTexture : true
 *             stages : [blurXDirection, blurYDirection],
 *             name : 'blur'
 *         }),
 *         // The input texture for this stage is the same input texture to blurXDirection since inputPreviousStageTexture is false
 *         new PostProcessStage({
 *             fragmentShader : compositeShader,
 *             uniforms : {
 *                 blurTexture : 'blur' // The output of the composite with name 'blur' (the texture that blurYDirection rendered to).
 *             }
 *         })
 *     ]
 * });
 * ```
 * ```
 * // Example 3: create a uniform alias
 * const uniforms = {};
 * defineProperties(uniforms, {
 *     filterSize : {
 *         get : function() {
 *             return blurXDirection.uniforms.filterSize;
 *         },
 *         set : function(value) {
 *             blurXDirection.uniforms.filterSize = blurYDirection.uniforms.filterSize = value;
 *         }
 *     }
 * });
 * scene.postProcessStages.add(new PostProcessStageComposite({
 *     stages : [blurXDirection, blurYDirection],
 *     uniforms : uniforms
 * }));
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageComposite.html">Online Documentation</a>
 */
external class PostProcessStageComposite(options: ConstructorOptions) {
    /**
     * @property [stages] An array of [PostProcessStage]s or composites to be executed in order.
     * @property [inputPreviousStageTexture] Whether to execute each post-process stage where the input to one stage is the output of the previous. Otherwise, the input to each contained stage is the output of the stage that executed before the composite.
     *   Default value - `true`
     * @property [name] The unique name of this post-process stage for reference by other composites. If a name is not supplied, a GUID will be generated.
     *   Default value - [createGuid()][createGuid]
     * @property [uniforms] An alias to the uniforms of post-process stages.
     */
    interface ConstructorOptions {
        var stages: ReadonlyArray<Any>
        var inputPreviousStageTexture: Boolean?
        var name: String?
        var uniforms: Any?
    }

    /**
     * Determines if this post-process stage is ready to be executed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageComposite.html#ready">Online Documentation</a>
     */
    val ready: Boolean

    /**
     * The unique name of this post-process stage for reference by other stages in a PostProcessStageComposite.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageComposite.html#name">Online Documentation</a>
     */
    val name: String

    /**
     * Whether or not to execute this post-process stage when ready.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageComposite.html#enabled">Online Documentation</a>
     */
    var enabled: Boolean

    /**
     * An alias to the uniform values of the post-process stages. May be `undefined`; in which case, get each stage to set uniform values.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageComposite.html#uniforms">Online Documentation</a>
     */
    var uniforms: Any

    /**
     * All post-process stages are executed in the order of the array. The input texture changes based on the value of `inputPreviousStageTexture`.
     * If `inputPreviousStageTexture` is `true`, the input to each stage is the output texture rendered to by the scene or of the stage that executed before it.
     * If `inputPreviousStageTexture` is `false`, the input texture is the same for each stage in the composite. The input texture is the texture rendered to by the scene
     * or the output texture of the previous stage.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageComposite.html#inputPreviousStageTexture">Online Documentation</a>
     */
    val inputPreviousStageTexture: Boolean

    /**
     * The number of post-process stages in this composite.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageComposite.html#length">Online Documentation</a>
     */
    val length: Int

    /**
     * The features selected for applying the post-process.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageComposite.html#selected">Online Documentation</a>
     */
    var selected: ReadonlyArray<Any>

    /**
     * Gets the post-process stage at `index`
     * @param [index] The index of the post-process stage or composite.
     * @return The post-process stage or composite at index.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageComposite.html#get">Online Documentation</a>
     */
    fun get(index: Int): dynamic

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageComposite.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
     * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
     *
     * Once an object is destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.  Therefore,
     * assign the return value (`undefined`) to the object as done in the example.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageComposite.html#destroy">Online Documentation</a>
     */
    fun destroy()
}

inline fun PostProcessStageComposite(
    block: PostProcessStageComposite.ConstructorOptions.() -> Unit,
): PostProcessStageComposite =
    PostProcessStageComposite(options = jso(block))
