// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

import kotlin.js.Promise

/**
 * Creates an [IonImageryProvider] instance for ion's default global base imagery layer, currently Bing Maps.
 * ```
 * // Create a Cesium World Imagery base layer with default settings
 * try {
 *   const imageryProvider = await createWorldImageryAsync();
 * } catch (error) {
 *   console.log(`There was an error creating world imagery: ${error}`);
 * }
 * ```
 * ```
 * // Create Cesium World Imagery with different style
 * try {
 *   const imageryProvider = await createWorldImageryAsync({
 *         style: IonWorldImageryStyle.AERIAL_WITH_LABELS
 *   });
 * } catch (error) {
 *   console.log(`There was an error creating world imagery: ${error}`);
 * }
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/createWorldImageryAsync.html">Online Documentation</a>
 */
external fun createWorldImageryAsync(options: CreateWorldImageryAsyncOptions? = definedExternally): Promise<IonImageryProvider>

/**
 * @property [style] The style of base imagery, only AERIAL, AERIAL_WITH_LABELS, and ROAD are currently supported.
 *   Default value - [IonWorldImageryStyle]
 */
external interface CreateWorldImageryAsyncOptions {
    var style: IonWorldImageryStyle?
}
