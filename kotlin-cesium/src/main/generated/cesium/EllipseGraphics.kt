// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Describes an ellipse defined by a center point and semi-major and semi-minor axes.
 * The ellipse conforms to the curvature of the globe and can be placed on the surface or
 * at altitude and can optionally be extruded into a volume.
 * The center point is determined by the containing [Entity].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html">Online Documentation</a>
 */
external class EllipseGraphics {
    /**
     * Gets the event that is raised whenever a property or sub-property is changed or modified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: Event

    /**
     * Gets or sets the boolean Property specifying the visibility of the ellipse.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html#show">Online Documentation</a>
     */
    var show: Property?

    /**
     * Gets or sets the numeric Property specifying the semi-major axis.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html#semiMajorAxis">Online Documentation</a>
     */
    var semiMajorAxis: Property?

    /**
     * Gets or sets the numeric Property specifying the semi-minor axis.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html#semiMinorAxis">Online Documentation</a>
     */
    var semiMinorAxis: Property?

    /**
     * Gets or sets the numeric Property specifying the altitude of the ellipse.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html#height">Online Documentation</a>
     */
    var height: Property?

    /**
     * Gets or sets the Property specifying the [HeightReference].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html#heightReference">Online Documentation</a>
     */
    var heightReference: Property?

    /**
     * Gets or sets the numeric Property specifying the altitude of the ellipse extrusion.
     * Setting this property creates volume starting at height and ending at this altitude.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html#extrudedHeight">Online Documentation</a>
     */
    var extrudedHeight: Property?

    /**
     * Gets or sets the Property specifying the extruded [HeightReference].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html#extrudedHeightReference">Online Documentation</a>
     */
    var extrudedHeightReference: Property?

    /**
     * Gets or sets the numeric property specifying the rotation of the ellipse counter-clockwise from north.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html#rotation">Online Documentation</a>
     */
    var rotation: Property?

    /**
     * Gets or sets the numeric property specifying the rotation of the ellipse texture counter-clockwise from north.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html#stRotation">Online Documentation</a>
     */
    var stRotation: Property?

    /**
     * Gets or sets the numeric Property specifying the angular distance between points on the ellipse.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html#granularity">Online Documentation</a>
     */
    var granularity: Property?

    /**
     * Gets or sets the boolean Property specifying whether the ellipse is filled with the provided material.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html#fill">Online Documentation</a>
     */
    var fill: Property?

    /**
     * Gets or sets the Property specifying the material used to fill the ellipse.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html#material">Online Documentation</a>
     */
    var material: MaterialProperty?

    /**
     * Gets or sets the Property specifying whether the ellipse is outlined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html#outline">Online Documentation</a>
     */
    var outline: Property?

    /**
     * Gets or sets the Property specifying the [Color] of the outline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html#outlineColor">Online Documentation</a>
     */
    var outlineColor: Property?

    /**
     * Gets or sets the numeric Property specifying the width of the outline.
     *
     * Note: This property will be ignored on all major browsers on Windows platforms. For details, see (@link https://github.com/CesiumGS/cesium/issues/40}.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html#outlineWidth">Online Documentation</a>
     */
    var outlineWidth: Property?

    /**
     * Gets or sets the numeric Property specifying the number of vertical lines to draw along the perimeter for the outline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html#numberOfVerticalLines">Online Documentation</a>
     */
    var numberOfVerticalLines: Property?

    /**
     * Get or sets the enum Property specifying whether the ellipse
     * casts or receives shadows from light sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html#shadows">Online Documentation</a>
     */
    var shadows: Property?

    /**
     * Gets or sets the [DistanceDisplayCondition] Property specifying at what distance from the camera that this ellipse will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: Property?

    /**
     * Gets or sets the [ClassificationType] Property specifying whether this ellipse will classify terrain, 3D Tiles, or both when on the ground.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html#classificationType">Online Documentation</a>
     */
    var classificationType: Property?

    /**
     * Gets or sets the zIndex Property specifying the ellipse ordering.  Only has an effect if the ellipse is constant and neither height or extrudedHeight are specified
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html#zIndex">Online Documentation</a>
     */
    var zIndex: ConstantProperty?

    /**
     * Duplicates this instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html#clone">Online Documentation</a>
     */
    fun clone(result: EllipseGraphics? = definedExternally): EllipseGraphics

    /**
     * Assigns each unassigned property on this object to the value
     * of the same property on the provided source object.
     * @param [source] The object to be merged into this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGraphics.html#merge">Online Documentation</a>
     */
    fun merge(source: EllipseGraphics)
}

inline fun EllipseGraphics(
    block: EllipseGraphics.() -> Unit,
): EllipseGraphics =
    EllipseGraphics().apply(block)
