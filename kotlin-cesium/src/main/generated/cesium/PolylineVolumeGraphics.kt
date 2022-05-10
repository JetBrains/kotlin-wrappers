// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Describes a polyline volume defined as a line strip and corresponding two dimensional shape which is extruded along it.
 * The resulting volume conforms to the curvature of the globe.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGraphics.html">Online Documentation</a>
 */
external class PolylineVolumeGraphics {
    /**
     * Gets the event that is raised whenever a property or sub-property is changed or modified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGraphics.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets or sets the boolean Property specifying the visibility of the volume.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGraphics.html#show">Online Documentation</a>
     */
    var show: Property?

    /**
     * Gets or sets the Property specifying the array of [Cartesian3] positions which define the line strip.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGraphics.html#positions">Online Documentation</a>
     */
    var positions: Property?

    /**
     * Gets or sets the Property specifying the array of [Cartesian2] positions which define the shape to be extruded.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGraphics.html#shape">Online Documentation</a>
     */
    var shape: Property?

    /**
     * Gets or sets the [CornerType] Property specifying the style of the corners.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGraphics.html#cornerType">Online Documentation</a>
     */
    var cornerType: Property?

    /**
     * Gets or sets the numeric Property specifying the angular distance between points on the volume.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGraphics.html#granularity">Online Documentation</a>
     */
    var granularity: Property?

    /**
     * Gets or sets the boolean Property specifying whether the volume is filled with the provided material.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGraphics.html#fill">Online Documentation</a>
     */
    var fill: Property?

    /**
     * Gets or sets the Property specifying the material used to fill the volume.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGraphics.html#material">Online Documentation</a>
     */
    var material: MaterialProperty

    /**
     * Gets or sets the Property specifying whether the volume is outlined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGraphics.html#outline">Online Documentation</a>
     */
    var outline: Property?

    /**
     * Gets or sets the Property specifying the [Color] of the outline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGraphics.html#outlineColor">Online Documentation</a>
     */
    var outlineColor: Property?

    /**
     * Gets or sets the numeric Property specifying the width of the outline.
     *
     * Note: This property will be ignored on all major browsers on Windows platforms. For details, see (@link https://github.com/CesiumGS/cesium/issues/40}.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGraphics.html#outlineWidth">Online Documentation</a>
     */
    var outlineWidth: Property?

    /**
     * Get or sets the enum Property specifying whether the volume
     * casts or receives shadows from light sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGraphics.html#shadows">Online Documentation</a>
     */
    var shadows: Property?

    /**
     * Gets or sets the [DistanceDisplayCondition] Property specifying at what distance from the camera that this volume will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGraphics.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: Property?

    /**
     * Duplicates this instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGraphics.html#clone">Online Documentation</a>
     */
    fun clone(result: PolylineVolumeGraphics? = definedExternally): PolylineVolumeGraphics

    /**
     * Assigns each unassigned property on this object to the value
     * of the same property on the provided source object.
     * @param [source] The object to be merged into this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGraphics.html#merge">Online Documentation</a>
     */
    fun merge(source: PolylineVolumeGraphics)
}

inline fun PolylineVolumeGraphics(
    block: PolylineVolumeGraphics.() -> Unit,
): PolylineVolumeGraphics =
    PolylineVolumeGraphics().apply(block)
