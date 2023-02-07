// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A 3D model based on [glTF](https://github.com/KhronosGroup/glTF), the runtime asset format for WebGL, OpenGL ES, and OpenGL.
 * The position and orientation of the model is determined by the containing [Entity].
 *
 * Cesium includes support for glTF geometry, materials, animations, and skinning.
 * Cameras and lights are not currently supported.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html">Online Documentation</a>
 */
external class ModelGraphics {
    /**
     * Gets the event that is raised whenever a property or sub-property is changed or modified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets or sets the boolean Property specifying the visibility of the model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#show">Online Documentation</a>
     */
    var show: Property?

    /**
     * Gets or sets the string Property specifying the URI of the glTF asset.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#uri">Online Documentation</a>
     */
    var uri: Property?

    /**
     * Gets or sets the numeric Property specifying a uniform linear scale
     * for this model. Values greater than 1.0 increase the size of the model while
     * values less than 1.0 decrease it.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#scale">Online Documentation</a>
     */
    var scale: Property?

    /**
     * Gets or sets the numeric Property specifying the approximate minimum
     * pixel size of the model regardless of zoom. This can be used to ensure that
     * a model is visible even when the viewer zooms out.  When `0.0`,
     * no minimum size is enforced.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#minimumPixelSize">Online Documentation</a>
     */
    var minimumPixelSize: Property?

    /**
     * Gets or sets the numeric Property specifying the maximum scale
     * size of a model. This property is used as an upper limit for
     * [ModelGraphics.minimumPixelSize].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#maximumScale">Online Documentation</a>
     */
    var maximumScale: Property?

    /**
     * Get or sets the boolean Property specifying whether textures
     * may continue to stream in after the model is loaded.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#incrementallyLoadTextures">Online Documentation</a>
     */
    var incrementallyLoadTextures: Property?

    /**
     * Gets or sets the boolean Property specifying if glTF animations should be run.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#runAnimations">Online Documentation</a>
     */
    var runAnimations: Property?

    /**
     * Gets or sets the boolean Property specifying if glTF animations should hold the last pose for time durations with no keyframes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#clampAnimations">Online Documentation</a>
     */
    var clampAnimations: Property?

    /**
     * Get or sets the enum Property specifying whether the model
     * casts or receives shadows from light sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#shadows">Online Documentation</a>
     */
    var shadows: Property?

    /**
     * Gets or sets the Property specifying the [HeightReference].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#heightReference">Online Documentation</a>
     */
    var heightReference: Property?

    /**
     * Gets or sets the Property specifying the [Color] of the silhouette.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#silhouetteColor">Online Documentation</a>
     */
    var silhouetteColor: Property?

    /**
     * Gets or sets the numeric Property specifying the size of the silhouette in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#silhouetteSize">Online Documentation</a>
     */
    var silhouetteSize: Property?

    /**
     * Gets or sets the Property specifying the [Color] that blends with the model's rendered color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#color">Online Documentation</a>
     */
    var color: Property?

    /**
     * Gets or sets the enum Property specifying how the color blends with the model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#colorBlendMode">Online Documentation</a>
     */
    var colorBlendMode: Property?

    /**
     * A numeric Property specifying the color strength when the `colorBlendMode` is MIX.
     * A value of 0.0 results in the model's rendered color while a value of 1.0 results in a solid color, with
     * any value in-between resulting in a mix of the two.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#colorBlendAmount">Online Documentation</a>
     */
    var colorBlendAmount: Property?

    /**
     * A property specifying the [Cartesian2] used to scale the diffuse and specular image-based lighting contribution to the final color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#imageBasedLightingFactor">Online Documentation</a>
     */
    var imageBasedLightingFactor: Property?

    /**
     * A property specifying the [Cartesian3] light color when shading the model. When `undefined` the scene's light color is used instead.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#lightColor">Online Documentation</a>
     */
    var lightColor: Property?

    /**
     * Gets or sets the [DistanceDisplayCondition] Property specifying at what distance from the camera that this model will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: Property?

    /**
     * Gets or sets the set of node transformations to apply to this model.  This is represented as an [PropertyBag], where keys are
     * names of nodes, and values are [TranslationRotationScale] Properties describing the transformation to apply to that node.
     * The transformation is applied after the node's existing transformation as specified in the glTF, and does not replace the node's existing transformation.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#nodeTransformations">Online Documentation</a>
     */
    var nodeTransformations: PropertyBag

    /**
     * Gets or sets the set of articulation values to apply to this model.  This is represented as an [PropertyBag], where keys are
     * composed as the name of the articulation, a single space, and the name of the stage.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#articulations">Online Documentation</a>
     */
    var articulations: PropertyBag

    /**
     * A property specifying the [ClippingPlaneCollection] used to selectively disable rendering the model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#clippingPlanes">Online Documentation</a>
     */
    var clippingPlanes: Property?

    /**
     * Gets or sets the [CustomShader] to apply to this model. When `undefined`, no custom shader code is used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#customShader">Online Documentation</a>
     */
    var customShader: Property?

    /**
     * Duplicates this instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#clone">Online Documentation</a>
     */
    fun clone(result: ModelGraphics? = definedExternally): ModelGraphics

    /**
     * Assigns each unassigned property on this object to the value
     * of the same property on the provided source object.
     * @param [source] The object to be merged into this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelGraphics.html#merge">Online Documentation</a>
     */
    fun merge(source: ModelGraphics)
}

inline fun ModelGraphics(
    block: ModelGraphics.() -> Unit,
): ModelGraphics =
    ModelGraphics().apply(block)
