// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import kotlinx.js.JsPlainObject

/**
 * Describes a polyline defined as the path made by an [Entity] as it moves over time.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PathGraphics.html">Online Documentation</a>
 */
open external class PathGraphics(
    options: ConstructorOptions? = definedExternally,
) {
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
     * Fractional positive values are allowed; in PORTIONS materialMode, non-positive values fall back to the default resolution of 60 seconds.
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
     * Gets or sets the frame in which to visualize the path. Use another entity's id to visualize the path relative to that entity, or use the string values "FIXED" or "INERTIAL" to visualize the path in those reference frames.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PathGraphics.html#relativeTo">Online Documentation</a>
     */
    var relativeTo: Property?

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

    /**
     * Initialization options for the PathGraphics constructor
     * @property [show] A boolean Property specifying the visibility of the path.
     *   Default value - `true`
     * @property [leadTime] A Property specifying the number of seconds in front the object to show.
     * @property [trailTime] A Property specifying the number of seconds behind of the object to show.
     * @property [width] A numeric Property specifying the width in pixels.
     *   Default value - `1.0`
     * @property [resolution] A numeric Property specifying the maximum number of seconds to step when sampling the position. Fractional positive values are allowed; in PORTIONS materialMode, non-positive values fall back to the default resolution of 60 seconds.
     *   Default value - `60`
     * @property [material] A Property specifying the material used to draw the path.
     *   Default value - [Color.WHITE]
     * @property [distanceDisplayCondition] A Property specifying at what distance from the camera that this path will be displayed.
     * @property [relativeTo] A Property specifying the frame in which to visualize the path. Use another entity's id to visualize the path relative to that entity, or use the string values "FIXED" or "INERTIAL" to visualize the path in those reference frames.
     * @property [materialMode] A Property specifying how material properties are applied along the path.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PathGraphics.html#.ConstructorOptions">Online Documentation</a>
     */
    @JsPlainObject
    interface ConstructorOptions {
        val show: JsAny /* Property | boolean */?
        val leadTime: JsAny /* Property | number */?
        val trailTime: JsAny /* Property | number */?
        val width: JsAny /* Property | number */?
        val resolution: JsAny /* Property | number */?
        val material: JsAny /* MaterialProperty | Color */?
        val distanceDisplayCondition: JsAny /* Property | DistanceDisplayCondition */?
        val relativeTo: JsAny /* Property | string */?
        val materialMode: JsAny /* Property | PathMode */?
    }
}
