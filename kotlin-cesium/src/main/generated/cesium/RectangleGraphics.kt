// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Describes graphics for a [Rectangle].
 * The rectangle conforms to the curvature of the globe and can be placed on the surface or
 * at altitude and can optionally be extruded into a volume.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGraphics.html">Online Documentation</a>
 */
external class RectangleGraphics {
    /**
     * Gets the event that is raised whenever a property or sub-property is changed or modified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGraphics.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: Event<*>

    /**
     * Gets or sets the boolean Property specifying the visibility of the rectangle.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGraphics.html#show">Online Documentation</a>
     */
    var show: Property?

    /**
     * Gets or sets the Property specifying the [Rectangle].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGraphics.html#coordinates">Online Documentation</a>
     */
    var coordinates: Property?

    /**
     * Gets or sets the numeric Property specifying the altitude of the rectangle.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGraphics.html#height">Online Documentation</a>
     */
    var height: Property?

    /**
     * Gets or sets the Property specifying the [HeightReference].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGraphics.html#heightReference">Online Documentation</a>
     */
    var heightReference: Property?

    /**
     * Gets or sets the numeric Property specifying the altitude of the rectangle extrusion.
     * Setting this property creates volume starting at height and ending at this altitude.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGraphics.html#extrudedHeight">Online Documentation</a>
     */
    var extrudedHeight: Property?

    /**
     * Gets or sets the Property specifying the extruded [HeightReference].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGraphics.html#extrudedHeightReference">Online Documentation</a>
     */
    var extrudedHeightReference: Property?

    /**
     * Gets or sets the numeric property specifying the rotation of the rectangle clockwise from north.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGraphics.html#rotation">Online Documentation</a>
     */
    var rotation: Property?

    /**
     * Gets or sets the numeric property specifying the rotation of the rectangle texture counter-clockwise from north.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGraphics.html#stRotation">Online Documentation</a>
     */
    var stRotation: Property?

    /**
     * Gets or sets the numeric Property specifying the angular distance between points on the rectangle.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGraphics.html#granularity">Online Documentation</a>
     */
    var granularity: Property?

    /**
     * Gets or sets the boolean Property specifying whether the rectangle is filled with the provided material.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGraphics.html#fill">Online Documentation</a>
     */
    var fill: Property?

    /**
     * Gets or sets the Property specifying the material used to fill the rectangle.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGraphics.html#material">Online Documentation</a>
     */
    var material: MaterialProperty

    /**
     * Gets or sets the Property specifying whether the rectangle is outlined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGraphics.html#outline">Online Documentation</a>
     */
    var outline: Property?

    /**
     * Gets or sets the Property specifying the [Color] of the outline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGraphics.html#outlineColor">Online Documentation</a>
     */
    var outlineColor: Property?

    /**
     * Gets or sets the numeric Property specifying the width of the outline.
     *
     * Note: This property will be ignored on all major browsers on Windows platforms. For details, see (@link https://github.com/CesiumGS/cesium/issues/40}.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGraphics.html#outlineWidth">Online Documentation</a>
     */
    var outlineWidth: Property?

    /**
     * Get or sets the enum Property specifying whether the rectangle
     * casts or receives shadows from light sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGraphics.html#shadows">Online Documentation</a>
     */
    var shadows: Property?

    /**
     * Gets or sets the [DistanceDisplayCondition] Property specifying at what distance from the camera that this rectangle will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGraphics.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: Property?

    /**
     * Gets or sets the [ClassificationType] Property specifying whether this rectangle will classify terrain, 3D Tiles, or both when on the ground.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGraphics.html#classificationType">Online Documentation</a>
     */
    var classificationType: Property?

    /**
     * Gets or sets the zIndex Property specifying the ordering of the rectangle.  Only has an effect if the rectangle is constant and neither height or extrudedHeight are specified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGraphics.html#zIndex">Online Documentation</a>
     */
    var zIndex: ConstantProperty?

    /**
     * Duplicates this instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGraphics.html#clone">Online Documentation</a>
     */
    fun clone(result: RectangleGraphics? = definedExternally): RectangleGraphics

    /**
     * Assigns each unassigned property on this object to the value
     * of the same property on the provided source object.
     * @param [source] The object to be merged into this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGraphics.html#merge">Online Documentation</a>
     */
    fun merge(source: RectangleGraphics)
}

inline fun RectangleGraphics(
    block: RectangleGraphics.() -> Unit,
): RectangleGraphics =
    RectangleGraphics().apply(block)
