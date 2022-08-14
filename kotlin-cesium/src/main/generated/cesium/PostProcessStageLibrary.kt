// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import kotlinx.js.ReadonlyArray

/**
 * Contains functions for creating common post-process stages.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageLibrary.html">Online Documentation</a>
 */
external object PostProcessStageLibrary {
    /**
     * Creates a post-process stage that applies a Gaussian blur to the input texture. This stage is usually applied in conjunction with another stage.
     *
     * This stage has the following uniforms: `delta`, `sigma`, and `stepSize`.
     *
     * `delta` and `sigma` are used to compute the weights of a Gaussian filter. The equation is `exp((-0.5 * delta * delta) / (sigma * sigma))`.
     * The default value for `delta` is `1.0`. The default value for `sigma` is `2.0`.
     * `stepSize` is the distance to the next texel. The default is `1.0`.
     * @return A post-process stage that applies a Gaussian blur to the input texture.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageLibrary.html#.createBlurStage">Online Documentation</a>
     */
    fun createBlurStage(): PostProcessStageComposite

    /**
     * Creates a post-process stage that applies a depth of field effect.
     *
     * Depth of field simulates camera focus. Objects in the scene that are in focus
     * will be clear whereas objects not in focus will be blurred.
     *
     * This stage has the following uniforms: `focalDistance`, `delta`, `sigma`, and `stepSize`.
     *
     * `focalDistance` is the distance in meters from the camera to set the camera focus.
     *
     * `delta`, `sigma`, and `stepSize` are the same properties as [PostProcessStageLibrary.createBlurStage].
     * The blur is applied to the areas out of focus.
     * @return A post-process stage that applies a depth of field effect.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageLibrary.html#.createDepthOfFieldStage">Online Documentation</a>
     */
    fun createDepthOfFieldStage(): PostProcessStageComposite

    /**
     * Whether or not a depth of field stage is supported.
     *
     * This stage requires the WEBGL_depth_texture extension.
     * @param [scene] The scene.
     * @return Whether this post process stage is supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageLibrary.html#.isDepthOfFieldSupported">Online Documentation</a>
     */
    fun isDepthOfFieldSupported(scene: Scene): Boolean

    /**
     * Creates a post-process stage that detects edges.
     *
     * Writes the color to the output texture with alpha set to 1.0 when it is on an edge.
     *
     * This stage has the following uniforms: `color` and `length`
     *
     * - `color` is the color of the highlighted edge. The default is [Color.BLACK].
     * - `length` is the length of the edges in pixels. The default is `0.5`.
     *
     * This stage is not supported in 2D.
     * ```
     * // multiple silhouette effects
     * const yellowEdge = PostProcessLibrary.createEdgeDetectionStage();
     * yellowEdge.uniforms.color = Color.YELLOW;
     * yellowEdge.selected = [feature0];
     *
     * const greenEdge = PostProcessLibrary.createEdgeDetectionStage();
     * greenEdge.uniforms.color = Color.LIME;
     * greenEdge.selected = [feature1];
     *
     * // draw edges around feature0 and feature1
     * postProcessStages.add(PostProcessLibrary.createSilhouetteStage([yellowEdge, greenEdge]);
     * ```
     * @return A post-process stage that applies an edge detection effect.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageLibrary.html#.createEdgeDetectionStage">Online Documentation</a>
     */
    fun createEdgeDetectionStage(): PostProcessStage

    /**
     * Whether or not an edge detection stage is supported.
     *
     * This stage requires the WEBGL_depth_texture extension.
     * @param [scene] The scene.
     * @return Whether this post process stage is supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageLibrary.html#.isEdgeDetectionSupported">Online Documentation</a>
     */
    fun isEdgeDetectionSupported(scene: Scene): Boolean

    /**
     * Creates a post-process stage that applies a silhouette effect.
     *
     * A silhouette effect composites the color from the edge detection pass with input color texture.
     *
     * This stage has the following uniforms when `edgeDetectionStages` is `undefined`: `color` and `length`
     *
     * `color` is the color of the highlighted edge. The default is [Color.BLACK].
     * `length` is the length of the edges in pixels. The default is `0.5`.
     * @param [edgeDetectionStages] An array of edge detection post process stages.
     * @return A post-process stage that applies a silhouette effect.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageLibrary.html#.createSilhouetteStage">Online Documentation</a>
     */
    fun createSilhouetteStage(edgeDetectionStages: ReadonlyArray<PostProcessStage>? = definedExternally): PostProcessStageComposite

    /**
     * Whether or not a silhouette stage is supported.
     *
     * This stage requires the WEBGL_depth_texture extension.
     * @param [scene] The scene.
     * @return Whether this post process stage is supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageLibrary.html#.isSilhouetteSupported">Online Documentation</a>
     */
    fun isSilhouetteSupported(scene: Scene): Boolean

    /**
     * Whether or not an ambient occlusion stage is supported.
     *
     * This stage requires the WEBGL_depth_texture extension.
     * @param [scene] The scene.
     * @return Whether this post process stage is supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageLibrary.html#.isAmbientOcclusionSupported">Online Documentation</a>
     */
    fun isAmbientOcclusionSupported(scene: Scene): Boolean

    /**
     * Creates a post-process stage that renders the input texture with black and white gradations.
     *
     * This stage has one uniform value, `gradations`, which scales the luminance of each pixel.
     * @return A post-process stage that renders the input texture with black and white gradations.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageLibrary.html#.createBlackAndWhiteStage">Online Documentation</a>
     */
    fun createBlackAndWhiteStage(): PostProcessStage

    /**
     * Creates a post-process stage that saturates the input texture.
     *
     * This stage has one uniform value, `brightness`, which scales the saturation of each pixel.
     * @return A post-process stage that saturates the input texture.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageLibrary.html#.createBrightnessStage">Online Documentation</a>
     */
    fun createBrightnessStage(): PostProcessStage

    /**
     * Creates a post-process stage that adds a night vision effect to the input texture.
     * @return A post-process stage that adds a night vision effect to the input texture.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageLibrary.html#.createNightVisionStage">Online Documentation</a>
     */
    fun createNightVisionStage(): PostProcessStage

    /**
     * Creates a post-process stage that applies an effect simulating light flaring a camera lens.
     *
     * This stage has the following uniforms: `dirtTexture`, `starTexture`, `intensity`, `distortion`, `ghostDispersal`,
     * `haloWidth`, `dirtAmount`, and `earthRadius`.
     * - `dirtTexture` is a texture sampled to simulate dirt on the lens.
     * - `starTexture` is the texture sampled for the star pattern of the flare.
     * - `intensity` is a scalar multiplied by the result of the lens flare. The default value is `2.0`.
     * - `distortion` is a scalar value that affects the chromatic effect distortion. The default value is `10.0`.
     * - `ghostDispersal` is a scalar indicating how far the halo effect is from the center of the texture. The default value is `0.4`.
     * - `haloWidth` is a scalar representing the width of the halo  from the ghost dispersal. The default value is `0.4`.
     * - `dirtAmount` is a scalar representing the amount of dirt on the lens. The default value is `0.4`.
     * - `earthRadius` is the maximum radius of the earth. The default value is `Ellipsoid.WGS84.maximumRadius`.
     * @return A post-process stage for applying a lens flare effect.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PostProcessStageLibrary.html#.createLensFlareStage">Online Documentation</a>
     */
    fun createLensFlareStage(): PostProcessStage
}
