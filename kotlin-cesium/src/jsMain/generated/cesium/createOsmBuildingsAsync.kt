// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

import js.promise.Promise

/**
 * Creates a [Cesium3DTileset] instance for the
 * [Cesium OSM Buildings](https://cesium.com/content/cesium-osm-buildings/)
 * tileset.
 * ```
 * // Create Cesium OSM Buildings with default styling
 * const viewer = new Viewer("cesiumContainer");
 * try {
 *   const tileset = await createOsmBuildingsAsync();
 *   viewer.scene.primitives.add(tileset));
 * } catch (error) {
 *   console.log(`Error creating tileset: ${error}`);
 * }
 * ```
 * ```
 * // Create Cesium OSM Buildings with a custom style highlighting
 * // schools and hospitals.
 * const viewer = new Viewer("cesiumContainer");
 * try {
 *   const tileset = await createOsmBuildingsAsync({
 *     style: new Cesium3DTileStyle({
 *       color: {
 *         conditions: [
 *           ["${feature['building']} === 'hospital'", "color('#0000FF')"],
 *           ["${feature['building']} === 'school'", "color('#00FF00')"],
 *           [true, "color('#ffffff')"]
 *         ]
 *       }
 *     })
 *   });
 *   viewer.scene.primitives.add(tileset));
 * } catch (error) {
 *   console.log(`Error creating tileset: ${error}`);
 * }
 * ```
 * @param [options] Construction options. Any options allowed by the [Cesium3DTileset] constructor
 *   may be specified here. In addition to those, the following properties are supported:
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#createOsmBuildingsAsync">Online Documentation</a>
 */
external fun createOsmBuildingsAsync(options: CreateOsmBuildingsAsyncOptions? = definedExternally): Promise<Cesium3DTileset>

/**
 * @property [defaultColor] The default color to use for buildings
 *   that do not have a color. This parameter is ignored if `options.style` is specified.
 *   Default value - [Color.WHITE]
 * @property [style] The style to use with the tileset. If not
 *   specified, a default style is used which gives each building or building part a
 *   color inferred from its OpenStreetMap `tags`. If no color can be inferred,
 *   `options.defaultColor` is used.
 * @property [enableShowOutline] If true, enable rendering outlines. This can be set to false to avoid the additional processing of geometry at load time.
 *   Default value - `true`
 * @property [showOutline] Whether to show outlines around buildings. When true,
 *   outlines are displayed. When false, outlines are not displayed.
 *   Default value - `true`
 */
external interface CreateOsmBuildingsAsyncOptions {
    var defaultColor: Color?
    var style: Cesium3DTileStyle?
    var enableShowOutline: Boolean?
    var showOutline: Boolean?
}
