// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Describes a polyline. The first two positions define a line segment,
 * and each additional position defines a line segment from the previous position. The segments
 * can be linear connected points, great arcs, or clamped to terrain.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGraphics.html">Online Documentation</a>
 */
external class PolylineGraphics {
    /**
     * Gets the event that is raised whenever a property or sub-property is changed or modified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGraphics.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets or sets the boolean Property specifying the visibility of the polyline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGraphics.html#show">Online Documentation</a>
     */
    var show: Property?

    /**
     * Gets or sets the Property specifying the array of [Cartesian3]
     * positions that define the line strip.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGraphics.html#positions">Online Documentation</a>
     */
    var positions: Property?

    /**
     * Gets or sets the numeric Property specifying the width in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGraphics.html#width">Online Documentation</a>
     */
    var width: Property?

    /**
     * Gets or sets the numeric Property specifying the angular distance between each latitude and longitude if arcType is not ArcType.NONE and clampToGround is false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGraphics.html#granularity">Online Documentation</a>
     */
    var granularity: Property?

    /**
     * Gets or sets the Property specifying the material used to draw the polyline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGraphics.html#material">Online Documentation</a>
     */
    var material: MaterialProperty

    /**
     * Gets or sets the Property specifying the material used to draw the polyline when it fails the depth test.
     *
     * Requires the EXT_frag_depth WebGL extension to render properly. If the extension is not supported,
     * there may be artifacts.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGraphics.html#depthFailMaterial">Online Documentation</a>
     */
    var depthFailMaterial: MaterialProperty

    /**
     * Gets or sets the [ArcType] Property specifying whether the line segments should be great arcs, rhumb lines or linearly connected.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGraphics.html#arcType">Online Documentation</a>
     */
    var arcType: Property?

    /**
     * Gets or sets the boolean Property specifying whether the polyline
     * should be clamped to the ground.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGraphics.html#clampToGround">Online Documentation</a>
     */
    var clampToGround: Property?

    /**
     * Get or sets the enum Property specifying whether the polyline
     * casts or receives shadows from light sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGraphics.html#shadows">Online Documentation</a>
     */
    var shadows: Property?

    /**
     * Gets or sets the [DistanceDisplayCondition] Property specifying at what distance from the camera that this polyline will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGraphics.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: Property?

    /**
     * Gets or sets the [ClassificationType] Property specifying whether this polyline will classify terrain, 3D Tiles, or both when on the ground.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGraphics.html#classificationType">Online Documentation</a>
     */
    var classificationType: Property?

    /**
     * Gets or sets the zIndex Property specifying the ordering of the polyline. Only has an effect if `clampToGround` is true and polylines on terrain is supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGraphics.html#zIndex">Online Documentation</a>
     */
    var zIndex: ConstantProperty?

    /**
     * Duplicates this instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGraphics.html#clone">Online Documentation</a>
     */
    fun clone(result: PolylineGraphics? = definedExternally): PolylineGraphics

    /**
     * Assigns each unassigned property on this object to the value
     * of the same property on the provided source object.
     * @param [source] The object to be merged into this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGraphics.html#merge">Online Documentation</a>
     */
    fun merge(source: PolylineGraphics)
}

inline fun PolylineGraphics(
    block: PolylineGraphics.() -> Unit,
): PolylineGraphics =
    PolylineGraphics().apply(block)
