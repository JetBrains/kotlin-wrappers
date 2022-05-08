// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Describes a plane. The center position and orientation are determined by the containing [Entity].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneGraphics.html">Online Documentation</a>
 */
external class PlaneGraphics {
    /**
     * Gets the event that is raised whenever a property or sub-property is changed or modified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneGraphics.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: Event<*>

    /**
     * Gets or sets the boolean Property specifying the visibility of the plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneGraphics.html#show">Online Documentation</a>
     */
    var show: Property?

    /**
     * Gets or sets the [Plane] Property specifying the normal and distance of the plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneGraphics.html#plane">Online Documentation</a>
     */
    var plane: Property?

    /**
     * Gets or sets the [Cartesian2] Property specifying the width and height of the plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneGraphics.html#dimensions">Online Documentation</a>
     */
    var dimensions: Property?

    /**
     * Gets or sets the boolean Property specifying whether the plane is filled with the provided material.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneGraphics.html#fill">Online Documentation</a>
     */
    var fill: Property?

    /**
     * Gets or sets the material used to fill the plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneGraphics.html#material">Online Documentation</a>
     */
    var material: MaterialProperty

    /**
     * Gets or sets the Property specifying whether the plane is outlined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneGraphics.html#outline">Online Documentation</a>
     */
    var outline: Property?

    /**
     * Gets or sets the Property specifying the [Color] of the outline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneGraphics.html#outlineColor">Online Documentation</a>
     */
    var outlineColor: Property?

    /**
     * Gets or sets the numeric Property specifying the width of the outline.
     *
     * Note: This property will be ignored on all major browsers on Windows platforms. For details, see (@link https://github.com/CesiumGS/cesium/issues/40}.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneGraphics.html#outlineWidth">Online Documentation</a>
     */
    var outlineWidth: Property?

    /**
     * Get or sets the enum Property specifying whether the plane
     * casts or receives shadows from light sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneGraphics.html#shadows">Online Documentation</a>
     */
    var shadows: Property?

    /**
     * Gets or sets the [DistanceDisplayCondition] Property specifying at what distance from the camera that this plane will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneGraphics.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: Property?

    /**
     * Duplicates this instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneGraphics.html#clone">Online Documentation</a>
     */
    fun clone(result: PlaneGraphics? = definedExternally): PlaneGraphics

    /**
     * Assigns each unassigned property on this object to the value
     * of the same property on the provided source object.
     * @param [source] The object to be merged into this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneGraphics.html#merge">Online Documentation</a>
     */
    fun merge(source: PlaneGraphics)
}

inline fun PlaneGraphics(
    block: PlaneGraphics.() -> Unit,
): PlaneGraphics =
    PlaneGraphics().apply(block)
