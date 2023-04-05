// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * Creates an [IonImageryProvider] instance for ion's default global base imagery layer, currently Bing Maps.
 * ```
 * // Create Cesium World Imagery with default settings
 * const viewer = new Viewer('cesiumContainer', {
 *     imageryProvider : createWorldImagery();
 * });
 * ```
 * ```
 * // Create Cesium World Imagery with a different style
 * const viewer = new Viewer('cesiumContainer', {
 *     imageryProvider : createWorldImagery({
 *         style: IonWorldImageryStyle.AERIAL_WITH_LABELS
 *     })
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/createWorldImagery.html">Online Documentation</a>
 */
external fun createWorldImagery(options: CreateWorldImageryOptions? = definedExternally): IonImageryProvider

/**
 * @property [style] The style of base imagery, only AERIAL, AERIAL_WITH_LABELS, and ROAD are currently supported.
 *   Default value - [IonWorldImageryStyle]
 */
external interface CreateWorldImageryOptions {
    var style: IonWorldImageryStyle?
}
