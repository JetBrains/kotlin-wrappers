// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * A collection of [PostProcessStage]s and/or [PostProcessStageComposite]s.
 *
 * The input texture for each post-process stage is the texture rendered to by the scene or the texture rendered
 * to by the previous stage in the collection.
 *
 * If the ambient occlusion or bloom stages are enabled, they will execute before all other stages.
 *
 * If the FXAA stage is enabled, it will execute after all other stages.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageCollection.html">Online Documentation</a>
 */
external class PostProcessStageCollection {
    /**
     * Determines if all of the post-process stages in the collection are ready to be executed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageCollection.html#ready">Online Documentation</a>
     */
    val ready: Boolean

    /**
     * A post-process stage for Fast Approximate Anti-aliasing.
     *
     * When enabled, this stage will execute after all others.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageCollection.html#fxaa">Online Documentation</a>
     */
    val fxaa: PostProcessStage

    /**
     * A post-process stage that applies Horizon-based Ambient Occlusion (HBAO) to the input texture.
     *
     * Ambient occlusion simulates shadows from ambient light. These shadows would always be present when the
     * surface receives light and regardless of the light's position.
     *
     * The uniforms have the following properties: `intensity`, `bias`, `lengthCap`,
     * `stepSize`, `frustumLength`, `ambientOcclusionOnly`,
     * `delta`, `sigma`, and `blurStepSize`.
     *
     * - `intensity` is a scalar value used to lighten or darken the shadows exponentially. Higher values make the shadows darker. The default value is `3.0`.
     * - `bias` is a scalar value representing an angle in radians. If the dot product between the normal of the sample and the vector to the camera is less than this value,
     *   sampling stops in the current direction. This is used to remove shadows from near planar edges. The default value is `0.1`.
     * - `lengthCap` is a scalar value representing a length in meters. If the distance from the current sample to first sample is greater than this value,
     *   sampling stops in the current direction. The default value is `0.26`.
     * - `stepSize` is a scalar value indicating the distance to the next texel sample in the current direction. The default value is `1.95`.
     * - `frustumLength` is a scalar value in meters. If the current fragment has a distance from the camera greater than this value, ambient occlusion is not computed for the fragment.
     *   The default value is `1000.0`.
     * - `ambientOcclusionOnly` is a boolean value. When `true`, only the shadows generated are written to the output. When `false`, the input texture is modulated
     *   with the ambient occlusion. This is a useful debug option for seeing the effects of changing the uniform values. The default value is `false`.
     *
     * `delta`, `sigma`, and `blurStepSize` are the same properties as [PostProcessStageLibrary.createBlurStage].
     * The blur is applied to the shadows generated from the image to make them smoother.
     *
     * When enabled, this stage will execute before all others.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageCollection.html#ambientOcclusion">Online Documentation</a>
     */
    val ambientOcclusion: PostProcessStageComposite

    /**
     * A post-process stage for a bloom effect.
     *
     * A bloom effect adds glow effect, makes bright areas brighter, and dark areas darker.
     *
     * This stage has the following uniforms: `contrast`, `brightness`, `glowOnly`,
     * `delta`, `sigma`, and `stepSize`.
     *
     * - `contrast` is a scalar value in the range [-255.0, 255.0] and affects the contract of the effect. The default value is `128.0`.
     * - `brightness` is a scalar value. The input texture RGB value is converted to hue, saturation, and brightness (HSB) then this value is
     *   added to the brightness. The default value is `-0.3`.
     * - `glowOnly` is a boolean value. When `true`, only the glow effect will be shown. When `false`, the glow will be added to the input texture.
     *   The default value is `false`. This is a debug option for viewing the effects when changing the other uniform values.
     *
     * `delta`, `sigma`, and `stepSize` are the same properties as [PostProcessStageLibrary.createBlurStage].
     * The blur is applied to the shadows generated from the image to make them smoother.
     *
     * When enabled, this stage will execute before all others.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageCollection.html#bloom">Online Documentation</a>
     */
    val bloom: PostProcessStageComposite

    /**
     * The number of post-process stages in this collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageCollection.html#length">Online Documentation</a>
     */
    val length: Int

    /**
     * Adds the post-process stage to the collection.
     * @param [stage] The post-process stage to add to the collection.
     * @return The post-process stage that was added to the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageCollection.html#add">Online Documentation</a>
     */
    fun add(stage: PostProcessStage): PostProcessStage

    fun add(stage: PostProcessStageComposite): PostProcessStageComposite

    /**
     * Removes a post-process stage from the collection and destroys it.
     * @param [stage] The post-process stage to remove from the collection.
     * @return Whether the post-process stage was removed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageCollection.html#remove">Online Documentation</a>
     */
    fun remove(stage: PostProcessStage): Boolean

    fun remove(stage: PostProcessStageComposite): Boolean

    /**
     * Returns whether the collection contains a post-process stage.
     * @param [stage] The post-process stage.
     * @return Whether the collection contains the post-process stage.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageCollection.html#contains">Online Documentation</a>
     */
    fun contains(stage: PostProcessStage): Boolean

    fun contains(stage: PostProcessStageComposite): Boolean

    /**
     * Gets the post-process stage at `index`.
     * @param [index] The index of the post-process stage.
     * @return The post-process stage at index.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageCollection.html#get">Online Documentation</a>
     */
    fun get(index: Int): dynamic

    /**
     * Removes all post-process stages from the collection and destroys them.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageCollection.html#removeAll">Online Documentation</a>
     */
    fun removeAll()

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageCollection.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
     * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
     *
     * Once an object is destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.  Therefore,
     * assign the return value (`undefined`) to the object as done in the example.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageCollection.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
