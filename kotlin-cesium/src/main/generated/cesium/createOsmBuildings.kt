// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Creates a [Cesium3DTileset] instance for the
 * [Cesium OSM Buildings](https://cesium.com/content/cesium-osm-buildings/)
 * tileset.
 * ```
 * // Create Cesium OSM Buildings with default styling
 * const viewer = new Viewer('cesiumContainer');
 * viewer.scene.primitives.add(createOsmBuildings());
 * ```
 * ```
 * // Create Cesium OSM Buildings with a custom style highlighting
 * // schools and hospitals.
 * viewer.scene.primitives.add(createOsmBuildings({
 *   style: new Cesium3DTileStyle({
 *     color: {
 *       conditions: [
 *         ["${feature['building']} === 'hospital'", "color('#0000FF')"],
 *         ["${feature['building']} === 'school'", "color('#00FF00')"],
 *         [true, "color('#ffffff')"]
 *       ]
 *     }
 *   })
 * }));
 * ```
 * @param [options] Construction options. Any options allowed by the [Cesium3DTileset] constructor
 *   may be specified here. In addition to those, the following properties are supported:
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/createOsmBuildings.html">Online Documentation</a>
 */
external fun createOsmBuildings(options: CreateOsmBuildingsOptions? = definedExternally): Cesium3DTileset

/**
 * @property [defaultColor] The default color to use for buildings
 *   that do not have a color. This parameter is ignored if `options.style` is specified.
 *   Default value - [Color.WHITE]
 * @property [style] The style to use with the tileset. If not
 *   specified, a default style is used which gives each building or building part a
 *   color inferred from its OpenStreetMap `tags`. If no color can be inferred,
 *   `options.defaultColor` is used.
 * @property [showOutline] Whether to show outlines around buildings. When true,
 *   outlines are displayed. When false, outlines are not displayed.
 *   Default value - `true`
 */
external interface CreateOsmBuildingsOptions {
    var defaultColor: Color?
    var style: Cesium3DTileStyle?
    var showOutline: Boolean?
}
