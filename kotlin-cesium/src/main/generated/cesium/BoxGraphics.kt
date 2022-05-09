// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Describes a box. The center position and orientation are determined by the containing [Entity].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxGraphics.html">Online Documentation</a>
 */
external class BoxGraphics {
    /**
     * Gets the event that is raised whenever a property or sub-property is changed or modified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxGraphics.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets or sets the boolean Property specifying the visibility of the box.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxGraphics.html#show">Online Documentation</a>
     */
    var show: Property?

    /**
     * Gets or sets [Cartesian3] Property property specifying the length, width, and height of the box.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxGraphics.html#dimensions">Online Documentation</a>
     */
    var dimensions: Property?

    /**
     * Gets or sets the Property specifying the [HeightReference].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxGraphics.html#heightReference">Online Documentation</a>
     */
    var heightReference: Property?

    /**
     * Gets or sets the boolean Property specifying whether the box is filled with the provided material.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxGraphics.html#fill">Online Documentation</a>
     */
    var fill: Property?

    /**
     * Gets or sets the material used to fill the box.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxGraphics.html#material">Online Documentation</a>
     */
    var material: MaterialProperty?

    /**
     * Gets or sets the Property specifying whether the box is outlined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxGraphics.html#outline">Online Documentation</a>
     */
    var outline: Property?

    /**
     * Gets or sets the Property specifying the [Color] of the outline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxGraphics.html#outlineColor">Online Documentation</a>
     */
    var outlineColor: Property?

    /**
     * Gets or sets the numeric Property specifying the width of the outline.
     *
     * Note: This property will be ignored on all major browsers on Windows platforms. For details, see (@link https://github.com/CesiumGS/cesium/issues/40}.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxGraphics.html#outlineWidth">Online Documentation</a>
     */
    var outlineWidth: Property?

    /**
     * Get or sets the enum Property specifying whether the box
     * casts or receives shadows from light sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxGraphics.html#shadows">Online Documentation</a>
     */
    var shadows: Property?

    /**
     * Gets or sets the [DistanceDisplayCondition] Property specifying at what distance from the camera that this box will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxGraphics.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: Property?

    /**
     * Duplicates this instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxGraphics.html#clone">Online Documentation</a>
     */
    fun clone(result: BoxGraphics? = definedExternally): BoxGraphics

    /**
     * Assigns each unassigned property on this object to the value
     * of the same property on the provided source object.
     * @param [source] The object to be merged into this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxGraphics.html#merge">Online Documentation</a>
     */
    fun merge(source: BoxGraphics)
}

inline fun BoxGraphics(
    block: BoxGraphics.() -> Unit,
): BoxGraphics =
    BoxGraphics().apply(block)
