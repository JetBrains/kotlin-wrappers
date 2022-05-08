// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Describes a two dimensional label located at the position of the containing [Entity].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html">Online Documentation</a>
 */
external class LabelGraphics {
    /**
     * Gets the event that is raised whenever a property or sub-property is changed or modified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: Event<*>

    /**
     * Gets or sets the boolean Property specifying the visibility of the label.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#show">Online Documentation</a>
     */
    var show: Property?

    /**
     * Gets or sets the string Property specifying the text of the label.
     * Explicit newlines '\n' are supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#text">Online Documentation</a>
     */
    var text: Property?

    /**
     * Gets or sets the string Property specifying the font in CSS syntax.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#font">Online Documentation</a>
     */
    var font: Property?

    /**
     * Gets or sets the Property specifying the [LabelStyle].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#style">Online Documentation</a>
     */
    var style: Property?

    /**
     * Gets or sets the numeric Property specifying the uniform scale to apply to the image.
     * A scale greater than `1.0` enlarges the label while a scale less than `1.0` shrinks it.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#scale">Online Documentation</a>
     */
    var scale: Property?

    /**
     * Gets or sets the boolean Property specifying the visibility of the background behind the label.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#showBackground">Online Documentation</a>
     */
    var showBackground: Property?

    /**
     * Gets or sets the Property specifying the background [Color].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#backgroundColor">Online Documentation</a>
     */
    var backgroundColor: Property?

    /**
     * Gets or sets the [Cartesian2] Property specifying the label's horizontal and vertical
     * background padding in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#backgroundPadding">Online Documentation</a>
     */
    var backgroundPadding: Property?

    /**
     * Gets or sets the [Cartesian2] Property specifying the label's pixel offset in screen space
     * from the origin of this label.  This is commonly used to align multiple labels and labels at
     * the same position, e.g., an image and text.  The screen space origin is the top, left corner of the
     * canvas; `x` increases from left to right, and `y` increases from top to bottom.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#pixelOffset">Online Documentation</a>
     */
    var pixelOffset: Property?

    /**
     * Gets or sets the [Cartesian3] Property specifying the label's offset in eye coordinates.
     * Eye coordinates is a left-handed coordinate system, where `x` points towards the viewer's
     * right, `y` points up, and `z` points into the screen.
     *
     * An eye offset is commonly used to arrange multiple labels or objects at the same position, e.g., to
     * arrange a label above its corresponding 3D model.
     *
     * Below, the label is positioned at the center of the Earth but an eye offset makes it always
     * appear on top of the Earth regardless of the viewer's or Earth's orientation.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#eyeOffset">Online Documentation</a>
     */
    var eyeOffset: Property?

    /**
     * Gets or sets the Property specifying the [HorizontalOrigin].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#horizontalOrigin">Online Documentation</a>
     */
    var horizontalOrigin: Property?

    /**
     * Gets or sets the Property specifying the [VerticalOrigin].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#verticalOrigin">Online Documentation</a>
     */
    var verticalOrigin: Property?

    /**
     * Gets or sets the Property specifying the [HeightReference].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#heightReference">Online Documentation</a>
     */
    var heightReference: Property?

    /**
     * Gets or sets the Property specifying the fill [Color].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#fillColor">Online Documentation</a>
     */
    var fillColor: Property?

    /**
     * Gets or sets the Property specifying the outline [Color].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#outlineColor">Online Documentation</a>
     */
    var outlineColor: Property?

    /**
     * Gets or sets the numeric Property specifying the outline width.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#outlineWidth">Online Documentation</a>
     */
    var outlineWidth: Property?

    /**
     * Gets or sets [NearFarScalar] Property specifying the translucency of the label based on the distance from the camera.
     * A label's translucency will interpolate between the [NearFarScalar.nearValue] and
     * [NearFarScalar.farValue] while the camera distance falls within the lower and upper bounds
     * of the specified [NearFarScalar.near] and [NearFarScalar.far].
     * Outside of these ranges the label's translucency remains clamped to the nearest bound.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#translucencyByDistance">Online Documentation</a>
     */
    var translucencyByDistance: Property?

    /**
     * Gets or sets [NearFarScalar] Property specifying the pixel offset of the label based on the distance from the camera.
     * A label's pixel offset will interpolate between the [NearFarScalar.nearValue] and
     * [NearFarScalar.farValue] while the camera distance falls within the lower and upper bounds
     * of the specified [NearFarScalar.near] and [NearFarScalar.far].
     * Outside of these ranges the label's pixel offset remains clamped to the nearest bound.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#pixelOffsetScaleByDistance">Online Documentation</a>
     */
    var pixelOffsetScaleByDistance: Property?

    /**
     * Gets or sets near and far scaling properties of a Label based on the label's distance from the camera.
     * A label's scale will interpolate between the [NearFarScalar.nearValue] and
     * [NearFarScalar.farValue] while the camera distance falls within the lower and upper bounds
     * of the specified [NearFarScalar.near] and [NearFarScalar.far].
     * Outside of these ranges the label's scale remains clamped to the nearest bound.  If undefined,
     * scaleByDistance will be disabled.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#scaleByDistance">Online Documentation</a>
     */
    var scaleByDistance: Property?

    /**
     * Gets or sets the [DistanceDisplayCondition] Property specifying at what distance from the camera that this label will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: Property?

    /**
     * Gets or sets the distance from the camera at which to disable the depth test to, for example, prevent clipping against terrain.
     * When set to zero, the depth test is always applied. When set to Number.POSITIVE_INFINITY, the depth test is never applied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#disableDepthTestDistance">Online Documentation</a>
     */
    var disableDepthTestDistance: Property?

    /**
     * Duplicates this instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#clone">Online Documentation</a>
     */
    fun clone(result: LabelGraphics? = definedExternally): LabelGraphics

    /**
     * Assigns each unassigned property on this object to the value
     * of the same property on the provided source object.
     * @param [source] The object to be merged into this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelGraphics.html#merge">Online Documentation</a>
     */
    fun merge(source: LabelGraphics)
}

inline fun LabelGraphics(
    block: LabelGraphics.() -> Unit,
): LabelGraphics =
    LabelGraphics().apply(block)
