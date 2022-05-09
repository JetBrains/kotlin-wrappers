// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Describes a cylinder, truncated cone, or cone defined by a length, top radius, and bottom radius.
 * The center position and orientation are determined by the containing [Entity].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CylinderGraphics.html">Online Documentation</a>
 */
external class CylinderGraphics {
    /**
     * Gets the event that is raised whenever a property or sub-property is changed or modified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CylinderGraphics.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets or sets the boolean Property specifying the visibility of the cylinder.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CylinderGraphics.html#show">Online Documentation</a>
     */
    var show: Property?

    /**
     * Gets or sets the numeric Property specifying the length of the cylinder.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CylinderGraphics.html#length">Online Documentation</a>
     */
    var length: Property?

    /**
     * Gets or sets the numeric Property specifying the radius of the top of the cylinder.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CylinderGraphics.html#topRadius">Online Documentation</a>
     */
    var topRadius: Property?

    /**
     * Gets or sets the numeric Property specifying the radius of the bottom of the cylinder.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CylinderGraphics.html#bottomRadius">Online Documentation</a>
     */
    var bottomRadius: Property?

    /**
     * Gets or sets the Property specifying the [HeightReference].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CylinderGraphics.html#heightReference">Online Documentation</a>
     */
    var heightReference: Property?

    /**
     * Gets or sets the boolean Property specifying whether the cylinder is filled with the provided material.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CylinderGraphics.html#fill">Online Documentation</a>
     */
    var fill: Property?

    /**
     * Gets or sets the Property specifying the material used to fill the cylinder.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CylinderGraphics.html#material">Online Documentation</a>
     */
    var material: MaterialProperty?

    /**
     * Gets or sets the boolean Property specifying whether the cylinder is outlined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CylinderGraphics.html#outline">Online Documentation</a>
     */
    var outline: Property?

    /**
     * Gets or sets the Property specifying the [Color] of the outline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CylinderGraphics.html#outlineColor">Online Documentation</a>
     */
    var outlineColor: Property?

    /**
     * Gets or sets the numeric Property specifying the width of the outline.
     *
     * Note: This property will be ignored on all major browsers on Windows platforms. For details, see (@link https://github.com/CesiumGS/cesium/issues/40}.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CylinderGraphics.html#outlineWidth">Online Documentation</a>
     */
    var outlineWidth: Property?

    /**
     * Gets or sets the Property specifying the number of vertical lines to draw along the perimeter for the outline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CylinderGraphics.html#numberOfVerticalLines">Online Documentation</a>
     */
    var numberOfVerticalLines: Property?

    /**
     * Gets or sets the Property specifying the number of edges around the perimeter of the cylinder.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CylinderGraphics.html#slices">Online Documentation</a>
     */
    var slices: Property?

    /**
     * Get or sets the enum Property specifying whether the cylinder
     * casts or receives shadows from light sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CylinderGraphics.html#shadows">Online Documentation</a>
     */
    var shadows: Property?

    /**
     * Gets or sets the [DistanceDisplayCondition] Property specifying at what distance from the camera that this cylinder will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CylinderGraphics.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: Property?

    /**
     * Duplicates this instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CylinderGraphics.html#clone">Online Documentation</a>
     */
    fun clone(result: CylinderGraphics? = definedExternally): CylinderGraphics

    /**
     * Assigns each unassigned property on this object to the value
     * of the same property on the provided source object.
     * @param [source] The object to be merged into this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CylinderGraphics.html#merge">Online Documentation</a>
     */
    fun merge(source: CylinderGraphics)
}

inline fun CylinderGraphics(
    block: CylinderGraphics.() -> Unit,
): CylinderGraphics =
    CylinderGraphics().apply(block)
