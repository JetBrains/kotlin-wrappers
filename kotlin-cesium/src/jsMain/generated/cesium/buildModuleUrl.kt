// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * Given a relative URL under the Cesium base URL, returns an absolute URL.
 * ```
 * const viewer = new Viewer("cesiumContainer", {
 *   baseLayer: ImageryLayer.fromProviderAsync(
 *     TileMapServiceImageryProvider.fromUrl(
 *       buildModuleUrl("Assets/Textures/NaturalEarthII"),
 *     )),
 *   baseLayerPicker: false,
 * });
 * ```
 * @param [relativeUrl] The relative path.
 * @return The absolutely URL representation of the provided path.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#buildModuleUrl">Online Documentation</a>
 */
external fun buildModuleUrl(relativeUrl: String): String
