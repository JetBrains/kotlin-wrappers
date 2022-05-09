// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Describe an ellipsoid or sphere.  The center position and orientation are determined by the containing [Entity].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGraphics.html">Online Documentation</a>
 */
external class EllipsoidGraphics {
    /**
     * Gets the event that is raised whenever a property or sub-property is changed or modified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGraphics.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets or sets the boolean Property specifying the visibility of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGraphics.html#show">Online Documentation</a>
     */
    var show: Property?

    /**
     * Gets or sets the [Cartesian3] [Property] specifying the radii of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGraphics.html#radii">Online Documentation</a>
     */
    var radii: Property?

    /**
     * Gets or sets the [Cartesian3] [Property] specifying the inner radii of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGraphics.html#innerRadii">Online Documentation</a>
     */
    var innerRadii: Property?

    /**
     * Gets or sets the Property specifying the minimum clock angle of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGraphics.html#minimumClock">Online Documentation</a>
     */
    var minimumClock: Property?

    /**
     * Gets or sets the Property specifying the maximum clock angle of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGraphics.html#maximumClock">Online Documentation</a>
     */
    var maximumClock: Property?

    /**
     * Gets or sets the Property specifying the minimum cone angle of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGraphics.html#minimumCone">Online Documentation</a>
     */
    var minimumCone: Property?

    /**
     * Gets or sets the Property specifying the maximum cone angle of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGraphics.html#maximumCone">Online Documentation</a>
     */
    var maximumCone: Property?

    /**
     * Gets or sets the Property specifying the [HeightReference].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGraphics.html#heightReference">Online Documentation</a>
     */
    var heightReference: Property?

    /**
     * Gets or sets the boolean Property specifying whether the ellipsoid is filled with the provided material.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGraphics.html#fill">Online Documentation</a>
     */
    var fill: Property?

    /**
     * Gets or sets the Property specifying the material used to fill the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGraphics.html#material">Online Documentation</a>
     */
    var material: MaterialProperty

    /**
     * Gets or sets the Property specifying whether the ellipsoid is outlined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGraphics.html#outline">Online Documentation</a>
     */
    var outline: Property?

    /**
     * Gets or sets the Property specifying the [Color] of the outline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGraphics.html#outlineColor">Online Documentation</a>
     */
    var outlineColor: Property?

    /**
     * Gets or sets the numeric Property specifying the width of the outline.
     *
     * Note: This property will be ignored on all major browsers on Windows platforms. For details, see (@link https://github.com/CesiumGS/cesium/issues/40}.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGraphics.html#outlineWidth">Online Documentation</a>
     */
    var outlineWidth: Property?

    /**
     * Gets or sets the Property specifying the number of stacks.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGraphics.html#stackPartitions">Online Documentation</a>
     */
    var stackPartitions: Property?

    /**
     * Gets or sets the Property specifying the number of radial slices per 360 degrees.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGraphics.html#slicePartitions">Online Documentation</a>
     */
    var slicePartitions: Property?

    /**
     * Gets or sets the Property specifying the number of samples per outline ring, determining the granularity of the curvature.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGraphics.html#subdivisions">Online Documentation</a>
     */
    var subdivisions: Property?

    /**
     * Get or sets the enum Property specifying whether the ellipsoid
     * casts or receives shadows from light sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGraphics.html#shadows">Online Documentation</a>
     */
    var shadows: Property?

    /**
     * Gets or sets the [DistanceDisplayCondition] Property specifying at what distance from the camera that this ellipsoid will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGraphics.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: Property?

    /**
     * Duplicates this instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGraphics.html#clone">Online Documentation</a>
     */
    fun clone(result: EllipsoidGraphics? = definedExternally): EllipsoidGraphics

    /**
     * Assigns each unassigned property on this object to the value
     * of the same property on the provided source object.
     * @param [source] The object to be merged into this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGraphics.html#merge">Online Documentation</a>
     */
    fun merge(source: EllipsoidGraphics)
}

inline fun EllipsoidGraphics(
    block: EllipsoidGraphics.() -> Unit,
): EllipsoidGraphics =
    EllipsoidGraphics().apply(block)
