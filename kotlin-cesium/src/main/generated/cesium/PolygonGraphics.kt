// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Describes a polygon defined by an hierarchy of linear rings which make up the outer shape and any nested holes.
 * The polygon conforms to the curvature of the globe and can be placed on the surface or
 * at altitude and can optionally be extruded into a volume.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html">Online Documentation</a>
 */
external class PolygonGraphics {
    /**
     * Gets the event that is raised whenever a property or sub-property is changed or modified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets or sets the boolean Property specifying the visibility of the polygon.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#show">Online Documentation</a>
     */
    var show: Property?

    /**
     * Gets or sets the Property specifying the [PolygonHierarchy].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#hierarchy">Online Documentation</a>
     */
    var hierarchy: Property?

    /**
     * Gets or sets the numeric Property specifying the constant altitude of the polygon.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#height">Online Documentation</a>
     */
    var height: Property?

    /**
     * Gets or sets the Property specifying the [HeightReference].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#heightReference">Online Documentation</a>
     */
    var heightReference: Property?

    /**
     * Gets or sets the numeric Property specifying the altitude of the polygon extrusion.
     * If [PolygonGraphics.perPositionHeight] is false, the volume starts at [PolygonGraphics.height] and ends at this altitude.
     * If [PolygonGraphics.perPositionHeight] is true, the volume starts at the height of each [PolygonGraphics.hierarchy] position and ends at this altitude.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#extrudedHeight">Online Documentation</a>
     */
    var extrudedHeight: Property?

    /**
     * Gets or sets the Property specifying the extruded [HeightReference].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#extrudedHeightReference">Online Documentation</a>
     */
    var extrudedHeightReference: Property?

    /**
     * Gets or sets the numeric property specifying the rotation of the polygon texture counter-clockwise from north. Only has an effect if textureCoordinates is not defined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#stRotation">Online Documentation</a>
     */
    var stRotation: Property?

    /**
     * Gets or sets the numeric Property specifying the angular distance between points on the polygon.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#granularity">Online Documentation</a>
     */
    var granularity: Property?

    /**
     * Gets or sets the boolean Property specifying whether the polygon is filled with the provided material.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#fill">Online Documentation</a>
     */
    var fill: Property?

    /**
     * Gets or sets the Property specifying the material used to fill the polygon.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#material">Online Documentation</a>
     */
    var material: MaterialProperty

    /**
     * Gets or sets the Property specifying whether the polygon is outlined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#outline">Online Documentation</a>
     */
    var outline: Property?

    /**
     * Gets or sets the Property specifying the [Color] of the outline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#outlineColor">Online Documentation</a>
     */
    var outlineColor: Property?

    /**
     * Gets or sets the numeric Property specifying the width of the outline.
     *
     * Note: This property will be ignored on all major browsers on Windows platforms. For details, see (@link https://github.com/CesiumGS/cesium/issues/40}.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#outlineWidth">Online Documentation</a>
     */
    var outlineWidth: Property?

    /**
     * Gets or sets the boolean specifying whether or not the the height of each position is used.
     * If true, the shape will have non-uniform altitude defined by the height of each [PolygonGraphics.hierarchy] position.
     * If false, the shape will have a constant altitude as specified by [PolygonGraphics.height].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#perPositionHeight">Online Documentation</a>
     */
    var perPositionHeight: Property?

    /**
     * Gets or sets a boolean specifying whether or not the top of an extruded polygon is included.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#closeTop">Online Documentation</a>
     */
    var closeTop: Property?

    /**
     * Gets or sets a boolean specifying whether or not the bottom of an extruded polygon is included.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#closeBottom">Online Documentation</a>
     */
    var closeBottom: Property?

    /**
     * Gets or sets the [ArcType] Property specifying the type of lines the polygon edges use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#arcType">Online Documentation</a>
     */
    var arcType: Property?

    /**
     * Get or sets the enum Property specifying whether the polygon
     * casts or receives shadows from light sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#shadows">Online Documentation</a>
     */
    var shadows: Property?

    /**
     * Gets or sets the [DistanceDisplayCondition] Property specifying at what distance from the camera that this polygon will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: Property?

    /**
     * Gets or sets the [ClassificationType] Property specifying whether this polygon will classify terrain, 3D Tiles, or both when on the ground.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#classificationType">Online Documentation</a>
     */
    var classificationType: Property?

    /**
     * Gets or sets the zIndex Prperty specifying the ordering of ground geometry.  Only has an effect if the polygon is constant and neither height or extrudedHeight are specified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#zIndex">Online Documentation</a>
     */
    var zIndex: ConstantProperty?

    /**
     * A Property specifying texture coordinates as a [PolygonHierarchy] of [Cartesian2] points. Has no effect for ground primitives.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#textureCoordinates">Online Documentation</a>
     */
    var textureCoordinates: Property?

    /**
     * Duplicates this instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#clone">Online Documentation</a>
     */
    fun clone(result: PolygonGraphics? = definedExternally): PolygonGraphics

    /**
     * Assigns each unassigned property on this object to the value
     * of the same property on the provided source object.
     * @param [source] The object to be merged into this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGraphics.html#merge">Online Documentation</a>
     */
    fun merge(source: PolygonGraphics)
}

inline fun PolygonGraphics(
    block: PolygonGraphics.() -> Unit,
): PolygonGraphics =
    PolygonGraphics().apply(block)
