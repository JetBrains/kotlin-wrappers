// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Describes a polyline defined as the path made by an [Entity] as it moves over time.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PathGraphics.html">Online Documentation</a>
 */
external class PathGraphics {
    /**
     * Gets the event that is raised whenever a property or sub-property is changed or modified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PathGraphics.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets or sets the boolean Property specifying the visibility of the path.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PathGraphics.html#show">Online Documentation</a>
     */
    var show: Property?

    /**
     * Gets or sets the Property specifying the number of seconds in front of the object to show.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PathGraphics.html#leadTime">Online Documentation</a>
     */
    var leadTime: Property?

    /**
     * Gets or sets the Property specifying the number of seconds behind the object to show.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PathGraphics.html#trailTime">Online Documentation</a>
     */
    var trailTime: Property?

    /**
     * Gets or sets the numeric Property specifying the width in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PathGraphics.html#width">Online Documentation</a>
     */
    var width: Property?

    /**
     * Gets or sets the Property specifying the maximum number of seconds to step when sampling the position.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PathGraphics.html#resolution">Online Documentation</a>
     */
    var resolution: Property?

    /**
     * Gets or sets the Property specifying the material used to draw the path.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PathGraphics.html#material">Online Documentation</a>
     */
    var material: MaterialProperty

    /**
     * Gets or sets the [DistanceDisplayCondition] Property specifying at what distance from the camera that this path will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PathGraphics.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: Property?

    /**
     * Duplicates this instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PathGraphics.html#clone">Online Documentation</a>
     */
    fun clone(result: PathGraphics? = definedExternally): PathGraphics

    /**
     * Assigns each unassigned property on this object to the value
     * of the same property on the provided source object.
     * @param [source] The object to be merged into this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PathGraphics.html#merge">Online Documentation</a>
     */
    fun merge(source: PathGraphics)
}

inline fun PathGraphics(
    block: PathGraphics.() -> Unit,
): PathGraphics =
    PathGraphics().apply(block)
