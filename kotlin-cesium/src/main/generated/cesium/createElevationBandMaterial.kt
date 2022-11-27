// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import js.core.ReadonlyArray

/**
 * Creates a [Material] that combines multiple layers of color/gradient bands and maps them to terrain heights.
 *
 * The shader does a binary search over all the heights to find out which colors are above and below a given height, and
 * interpolates between them for the final color. This material supports hundreds of entries relatively cheaply.
 * ```
 * scene.globe.material = createElevationBandMaterial({
 *     scene : scene,
 *     layers : [{
 *         entries : [{
 *             height : 4200.0,
 *             color : new Color(0.0, 0.0, 0.0, 1.0)
 *         }, {
 *             height : 8848.0,
 *             color : new Color(1.0, 1.0, 1.0, 1.0)
 *         }],
 *         extendDownwards : true,
 *         extendUpwards : true,
 *     }, {
 *         entries : [{
 *             height : 7000.0,
 *             color : new Color(1.0, 0.0, 0.0, 0.5)
 *         }, {
 *             height : 7100.0,
 *             color : new Color(1.0, 0.0, 0.0, 0.5)
 *         }]
 *     }]
 * });
 * ```
 * @return A new [Material] instance.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/createElevationBandMaterial.html">Online Documentation</a>
 */
external fun createElevationBandMaterial(options: CreateElevationBandMaterialOptions): Material

/**
 * @property [scene] The scene where the visualization is taking place.
 * @property [layers] A list of bands ordered from lowest to highest precedence.
 */
external interface CreateElevationBandMaterialOptions {
    var scene: Scene
    var layers: ReadonlyArray<createElevationBandMaterialBand>
}
