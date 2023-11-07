// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

import js.promise.Promise

/**
 * Creates a [Cesium3DTileset] instance for the Google Photorealistic 3D Tiles tileset.
 * ```
 * const viewer = new Viewer("cesiumContainer");
 *
 * try {
 *   const tileset = await createGooglePhotorealistic3DTileset();
 *   viewer.scene.primitives.add(tileset));
 * } catch (error) {
 *   console.log(`Error creating tileset: ${error}`);
 * }
 * ```
 * ```
 * // Use your own Google Maps API key
 * GoogleMaps.defaultApiKey = "your-api-key";
 *
 * const viewer = new Viewer("cesiumContainer");
 *
 * try {
 *   const tileset = await createGooglePhotorealistic3DTileset();
 *   viewer.scene.primitives.add(tileset));
 * } catch (error) {
 *   console.log(`Error creating tileset: ${error}`);
 * }
 * ```
 * @param [key] Your API key to access Google Photorealistic 3D Tiles. See [https://developers.google.com/maps/documentation/javascript/get-api-key] for instructions on how to create your own key.
 *   Default value - [GoogleMaps.defaultApiKey]
 * @param [options] An object describing initialization options.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#createGooglePhotorealistic3DTileset">Online Documentation</a>
 */
external fun createGooglePhotorealistic3DTileset(
    key: String? = definedExternally,
    options: Cesium3DTileset.ConstructorOptions? = definedExternally,
): Promise<Cesium3DTileset>
