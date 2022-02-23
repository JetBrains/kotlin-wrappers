// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Describes a two dimensional wall defined as a line strip and optional maximum and minimum heights.
 * The wall conforms to the curvature of the globe and can be placed along the surface or at altitude.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WallGraphics.html">Online Documentation</a>
 */
external class WallGraphics {
    /**
     * Gets the event that is raised whenever a property or sub-property is changed or modified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WallGraphics.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: Event

    /**
     * Gets or sets the boolean Property specifying the visibility of the wall.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WallGraphics.html#show">Online Documentation</a>
     */
    var show: Property?

    /**
     * Gets or sets the Property specifying the array of [Cartesian3] positions which define the top of the wall.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WallGraphics.html#positions">Online Documentation</a>
     */
    var positions: Property?

    /**
     * Gets or sets the Property specifying an array of heights to be used for the bottom of the wall instead of the surface of the globe.
     * If defined, the array must be the same length as [Wall.positions].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WallGraphics.html#minimumHeights">Online Documentation</a>
     */
    var minimumHeights: Property?

    /**
     * Gets or sets the Property specifying an array of heights to be used for the top of the wall instead of the height of each position.
     * If defined, the array must be the same length as [Wall.positions].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WallGraphics.html#maximumHeights">Online Documentation</a>
     */
    var maximumHeights: Property?

    /**
     * Gets or sets the numeric Property specifying the angular distance between points on the wall.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WallGraphics.html#granularity">Online Documentation</a>
     */
    var granularity: Property?

    /**
     * Gets or sets the boolean Property specifying whether the wall is filled with the provided material.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WallGraphics.html#fill">Online Documentation</a>
     */
    var fill: Property?

    /**
     * Gets or sets the Property specifying the material used to fill the wall.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WallGraphics.html#material">Online Documentation</a>
     */
    var material: MaterialProperty

    /**
     * Gets or sets the Property specifying whether the wall is outlined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WallGraphics.html#outline">Online Documentation</a>
     */
    var outline: Property?

    /**
     * Gets or sets the Property specifying the [Color] of the outline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WallGraphics.html#outlineColor">Online Documentation</a>
     */
    var outlineColor: Property?

    /**
     * Gets or sets the numeric Property specifying the width of the outline.
     *
     * Note: This property will be ignored on all major browsers on Windows platforms. For details, see (@link https://github.com/CesiumGS/cesium/issues/40}.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WallGraphics.html#outlineWidth">Online Documentation</a>
     */
    var outlineWidth: Property?

    /**
     * Get or sets the enum Property specifying whether the wall
     * casts or receives shadows from light sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WallGraphics.html#shadows">Online Documentation</a>
     */
    var shadows: Property?

    /**
     * Gets or sets the [DistanceDisplayCondition] Property specifying at what distance from the camera that this wall will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WallGraphics.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: Property?

    /**
     * Duplicates this instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WallGraphics.html#clone">Online Documentation</a>
     */
    fun clone(result: WallGraphics? = definedExternally): WallGraphics

    /**
     * Assigns each unassigned property on this object to the value
     * of the same property on the provided source object.
     * @param [source] The object to be merged into this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WallGraphics.html#merge">Online Documentation</a>
     */
    fun merge(source: WallGraphics)
}

inline fun WallGraphics(
    block: WallGraphics.() -> Unit,
): WallGraphics =
    WallGraphics().apply(block)
