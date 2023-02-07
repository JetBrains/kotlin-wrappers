// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Describes a two dimensional icon located at the position of the containing [Entity].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html">Online Documentation</a>
 */
external class BillboardGraphics {
    /**
     * Gets the event that is raised whenever a property or sub-property is changed or modified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets or sets the boolean Property specifying the visibility of the billboard.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html#show">Online Documentation</a>
     */
    var show: Property?

    /**
     * Gets or sets the Property specifying the Image, URI, or Canvas to use for the billboard.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html#image">Online Documentation</a>
     */
    var image: Property?

    /**
     * Gets or sets the numeric Property specifying the uniform scale to apply to the image.
     * A scale greater than `1.0` enlarges the billboard while a scale less than `1.0` shrinks it.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html#scale">Online Documentation</a>
     */
    var scale: Property?

    /**
     * Gets or sets the [Cartesian2] Property specifying the billboard's pixel offset in screen space
     * from the origin of this billboard.  This is commonly used to align multiple billboards and labels at
     * the same position, e.g., an image and text.  The screen space origin is the top, left corner of the
     * canvas; `x` increases from left to right, and `y` increases from top to bottom.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html#pixelOffset">Online Documentation</a>
     */
    var pixelOffset: Property?

    /**
     * Gets or sets the [Cartesian3] Property specifying the billboard's offset in eye coordinates.
     * Eye coordinates is a left-handed coordinate system, where `x` points towards the viewer's
     * right, `y` points up, and `z` points into the screen.
     *
     * An eye offset is commonly used to arrange multiple billboards or objects at the same position, e.g., to
     * arrange a billboard above its corresponding 3D model.
     *
     * Below, the billboard is positioned at the center of the Earth but an eye offset makes it always
     * appear on top of the Earth regardless of the viewer's or Earth's orientation.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html#eyeOffset">Online Documentation</a>
     */
    var eyeOffset: Property?

    /**
     * Gets or sets the Property specifying the [HorizontalOrigin].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html#horizontalOrigin">Online Documentation</a>
     */
    var horizontalOrigin: Property?

    /**
     * Gets or sets the Property specifying the [VerticalOrigin].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html#verticalOrigin">Online Documentation</a>
     */
    var verticalOrigin: Property?

    /**
     * Gets or sets the Property specifying the [HeightReference].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html#heightReference">Online Documentation</a>
     */
    var heightReference: Property?

    /**
     * Gets or sets the Property specifying the [Color] that is multiplied with the `image`.
     * This has two common use cases.  First, the same white texture may be used by many different billboards,
     * each with a different color, to create colored billboards. Second, the color's alpha component can be
     * used to make the billboard translucent as shown below. An alpha of `0.0` makes the billboard
     * transparent, and `1.0` makes the billboard opaque.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html#color">Online Documentation</a>
     */
    var color: Property?

    /**
     * Gets or sets the numeric Property specifying the rotation of the image
     * counter clockwise from the `alignedAxis`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html#rotation">Online Documentation</a>
     */
    var rotation: Property?

    /**
     * Gets or sets the [Cartesian3] Property specifying the unit vector axis of rotation
     * in the fixed frame. When set to Cartesian3.ZERO the rotation is from the top of the screen.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html#alignedAxis">Online Documentation</a>
     */
    var alignedAxis: Property?

    /**
     * Gets or sets the boolean Property specifying if this billboard's size will be measured in meters.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html#sizeInMeters">Online Documentation</a>
     */
    var sizeInMeters: Property?

    /**
     * Gets or sets the numeric Property specifying the width of the billboard in pixels.
     * When undefined, the native width is used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html#width">Online Documentation</a>
     */
    var width: Property?

    /**
     * Gets or sets the numeric Property specifying the height of the billboard in pixels.
     * When undefined, the native height is used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html#height">Online Documentation</a>
     */
    var height: Property?

    /**
     * Gets or sets [NearFarScalar] Property specifying the scale of the billboard based on the distance from the camera.
     * A billboard's scale will interpolate between the [NearFarScalar.nearValue] and
     * [NearFarScalar.farValue] while the camera distance falls within the lower and upper bounds
     * of the specified [NearFarScalar.near] and [NearFarScalar.far].
     * Outside of these ranges the billboard's scale remains clamped to the nearest bound.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html#scaleByDistance">Online Documentation</a>
     */
    var scaleByDistance: Property?

    /**
     * Gets or sets [NearFarScalar] Property specifying the translucency of the billboard based on the distance from the camera.
     * A billboard's translucency will interpolate between the [NearFarScalar.nearValue] and
     * [NearFarScalar.farValue] while the camera distance falls within the lower and upper bounds
     * of the specified [NearFarScalar.near] and [NearFarScalar.far].
     * Outside of these ranges the billboard's translucency remains clamped to the nearest bound.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html#translucencyByDistance">Online Documentation</a>
     */
    var translucencyByDistance: Property?

    /**
     * Gets or sets [NearFarScalar] Property specifying the pixel offset of the billboard based on the distance from the camera.
     * A billboard's pixel offset will interpolate between the [NearFarScalar.nearValue] and
     * [NearFarScalar.farValue] while the camera distance falls within the lower and upper bounds
     * of the specified [NearFarScalar.near] and [NearFarScalar.far].
     * Outside of these ranges the billboard's pixel offset remains clamped to the nearest bound.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html#pixelOffsetScaleByDistance">Online Documentation</a>
     */
    var pixelOffsetScaleByDistance: Property?

    /**
     * Gets or sets the Property specifying a [BoundingRectangle] that defines a
     * sub-region of the `image` to use for the billboard, rather than the entire image,
     * measured in pixels from the bottom-left.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html#imageSubRegion">Online Documentation</a>
     */
    var imageSubRegion: Property?

    /**
     * Gets or sets the [DistanceDisplayCondition] Property specifying at what distance from the camera that this billboard will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: Property?

    /**
     * Gets or sets the distance from the camera at which to disable the depth test to, for example, prevent clipping against terrain.
     * When set to zero, the depth test is always applied. When set to Number.POSITIVE_INFINITY, the depth test is never applied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html#disableDepthTestDistance">Online Documentation</a>
     */
    var disableDepthTestDistance: Property?

    /**
     * Duplicates this instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html#clone">Online Documentation</a>
     */
    fun clone(result: BillboardGraphics? = definedExternally): BillboardGraphics

    /**
     * Assigns each unassigned property on this object to the value
     * of the same property on the provided source object.
     * @param [source] The object to be merged into this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardGraphics.html#merge">Online Documentation</a>
     */
    fun merge(source: BillboardGraphics)
}

inline fun BillboardGraphics(
    block: BillboardGraphics.() -> Unit,
): BillboardGraphics =
    BillboardGraphics().apply(block)
