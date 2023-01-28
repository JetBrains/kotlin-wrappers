// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Describes a corridor, which is a shape defined by a centerline and width that
 * conforms to the curvature of the globe. It can be placed on the surface or at altitude
 * and can optionally be extruded into a volume.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGraphics.html">Online Documentation</a>
 */
external class CorridorGraphics {
    /**
     * Gets the event that is raised whenever a property or sub-property is changed or modified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGraphics.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets or sets the boolean Property specifying the visibility of the corridor.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGraphics.html#show">Online Documentation</a>
     */
    var show: Property?

    /**
     * Gets or sets a Property specifying the array of [Cartesian3] positions that define the centerline of the corridor.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGraphics.html#positions">Online Documentation</a>
     */
    var positions: Property?

    /**
     * Gets or sets the numeric Property specifying the width of the outline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGraphics.html#width">Online Documentation</a>
     */
    var width: Property?

    /**
     * Gets or sets the numeric Property specifying the altitude of the corridor.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGraphics.html#height">Online Documentation</a>
     */
    var height: Property?

    /**
     * Gets or sets the Property specifying the [HeightReference].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGraphics.html#heightReference">Online Documentation</a>
     */
    var heightReference: Property?

    /**
     * Gets or sets the numeric Property specifying the altitude of the corridor extrusion.
     * Setting this property creates a corridor shaped volume starting at height and ending
     * at this altitude.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGraphics.html#extrudedHeight">Online Documentation</a>
     */
    var extrudedHeight: Property?

    /**
     * Gets or sets the Property specifying the extruded [HeightReference].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGraphics.html#extrudedHeightReference">Online Documentation</a>
     */
    var extrudedHeightReference: Property?

    /**
     * Gets or sets the [CornerType] Property specifying how corners are styled.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGraphics.html#cornerType">Online Documentation</a>
     */
    var cornerType: Property?

    /**
     * Gets or sets the numeric Property specifying the sampling distance between each latitude and longitude point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGraphics.html#granularity">Online Documentation</a>
     */
    var granularity: Property?

    /**
     * Gets or sets the boolean Property specifying whether the corridor is filled with the provided material.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGraphics.html#fill">Online Documentation</a>
     */
    var fill: Property?

    /**
     * Gets or sets the Property specifying the material used to fill the corridor.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGraphics.html#material">Online Documentation</a>
     */
    var material: MaterialProperty?

    /**
     * Gets or sets the Property specifying whether the corridor is outlined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGraphics.html#outline">Online Documentation</a>
     */
    var outline: Property?

    /**
     * Gets or sets the Property specifying the [Color] of the outline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGraphics.html#outlineColor">Online Documentation</a>
     */
    var outlineColor: Property?

    /**
     * Gets or sets the numeric Property specifying the width of the outline.
     *
     * Note: This property will be ignored on all major browsers on Windows platforms. For details, see (@link https://github.com/CesiumGS/cesium/issues/40}.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGraphics.html#outlineWidth">Online Documentation</a>
     */
    var outlineWidth: Property?

    /**
     * Get or sets the enum Property specifying whether the corridor
     * casts or receives shadows from light sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGraphics.html#shadows">Online Documentation</a>
     */
    var shadows: Property?

    /**
     * Gets or sets the [DistanceDisplayCondition] Property specifying at what distance from the camera that this corridor will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGraphics.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: Property?

    /**
     * Gets or sets the [ClassificationType] Property specifying whether this corridor will classify terrain, 3D Tiles, or both when on the ground.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGraphics.html#classificationType">Online Documentation</a>
     */
    var classificationType: Property?

    /**
     * Gets or sets the zIndex Property specifying the ordering of the corridor.  Only has an effect if the coridor is static and neither height or exturdedHeight are specified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGraphics.html#zIndex">Online Documentation</a>
     */
    var zIndex: ConstantProperty?

    /**
     * Duplicates this instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGraphics.html#clone">Online Documentation</a>
     */
    fun clone(result: CorridorGraphics? = definedExternally): CorridorGraphics

    /**
     * Assigns each unassigned property on this object to the value
     * of the same property on the provided source object.
     * @param [source] The object to be merged into this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGraphics.html#merge">Online Documentation</a>
     */
    fun merge(source: CorridorGraphics)
}

inline fun CorridorGraphics(
    block: CorridorGraphics.() -> Unit,
): CorridorGraphics =
    CorridorGraphics().apply(block)
