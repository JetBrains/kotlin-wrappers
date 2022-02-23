// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Describes a graphical point located at the position of the containing [Entity].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointGraphics.html">Online Documentation</a>
 */
external class PointGraphics {
    /**
     * Gets the event that is raised whenever a property or sub-property is changed or modified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointGraphics.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: Event

    /**
     * Gets or sets the boolean Property specifying the visibility of the point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointGraphics.html#show">Online Documentation</a>
     */
    var show: Property?

    /**
     * Gets or sets the numeric Property specifying the size in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointGraphics.html#pixelSize">Online Documentation</a>
     */
    var pixelSize: Property?

    /**
     * Gets or sets the Property specifying the [HeightReference].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointGraphics.html#heightReference">Online Documentation</a>
     */
    var heightReference: Property?

    /**
     * Gets or sets the Property specifying the [Color] of the point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointGraphics.html#color">Online Documentation</a>
     */
    var color: Property?

    /**
     * Gets or sets the Property specifying the [Color] of the outline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointGraphics.html#outlineColor">Online Documentation</a>
     */
    var outlineColor: Property?

    /**
     * Gets or sets the numeric Property specifying the the outline width in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointGraphics.html#outlineWidth">Online Documentation</a>
     */
    var outlineWidth: Property?

    /**
     * Gets or sets the [NearFarScalar] Property used to scale the point based on distance.
     * If undefined, a constant size is used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointGraphics.html#scaleByDistance">Online Documentation</a>
     */
    var scaleByDistance: Property?

    /**
     * Gets or sets [NearFarScalar] Property specifying the translucency of the point based on the distance from the camera.
     * A point's translucency will interpolate between the [NearFarScalar.nearValue] and
     * [NearFarScalar.farValue] while the camera distance falls within the lower and upper bounds
     * of the specified [NearFarScalar.near] and [NearFarScalar.far].
     * Outside of these ranges the points's translucency remains clamped to the nearest bound.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointGraphics.html#translucencyByDistance">Online Documentation</a>
     */
    var translucencyByDistance: Property?

    /**
     * Gets or sets the [DistanceDisplayCondition] Property specifying at what distance from the camera that this point will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointGraphics.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: Property?

    /**
     * Gets or sets the distance from the camera at which to disable the depth test to, for example, prevent clipping against terrain.
     * When set to zero, the depth test is always applied. When set to Number.POSITIVE_INFINITY, the depth test is never applied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointGraphics.html#disableDepthTestDistance">Online Documentation</a>
     */
    var disableDepthTestDistance: Property?

    /**
     * Duplicates this instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointGraphics.html#clone">Online Documentation</a>
     */
    fun clone(result: PointGraphics? = definedExternally): PointGraphics

    /**
     * Assigns each unassigned property on this object to the value
     * of the same property on the provided source object.
     * @param [source] The object to be merged into this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointGraphics.html#merge">Online Documentation</a>
     */
    fun merge(source: PointGraphics)
}

inline fun PointGraphics(
    block: PointGraphics.() -> Unit,
): PointGraphics =
    PointGraphics().apply(block)
