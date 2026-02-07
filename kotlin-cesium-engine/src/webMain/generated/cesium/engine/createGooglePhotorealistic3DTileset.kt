// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.promise.Promise
import kotlinx.js.JsPlainObject
import seskar.js.JsAsync

/**
 * Creates a [Cesium3DTileset] instance for the Google Photorealistic 3D
 * Tiles tileset.
 *
 * Google Photorealistic 3D Tiles can only be used with the Google geocoder.  To
 * confirm that you are aware of this restriction pass
 * `usingOnlyWithGoogleGeocoder: true` to the apiOptions.  Otherwise a one time
 * warning will be displayed when this function is called.
 * ```
 * const viewer = new Viewer("cesiumContainer", {
 *   geocoder: IonGeocodeProviderType.GOOGLE
 * });
 *
 * try {
 *   const tileset = await createGooglePhotorealistic3DTileset({
 *      onlyUsingWithGoogleGeocoder: true,
 *   });
 *   viewer.scene.primitives.add(tileset));
 * } catch (error) {
 *   console.log(`Error creating tileset: ${error}`);
 * }
 * ```
 * ```
 * // Use your own Google Maps API key
 * GoogleMaps.defaultApiKey = "your-api-key";
 *
 * const viewer = new Viewer("cesiumContainer". {
 *   geocoder: IonGeocodeProviderType.GOOGLE
 * });
 *
 * try {
 *   const tileset = await createGooglePhotorealistic3DTileset({
 *      onlyUsingWithGoogleGeocoder: true,
 *   });
 *   viewer.scene.primitives.add(tileset));
 * } catch (error) {
 *   console.log(`Error creating tileset: ${error}`);
 * }
 * ```
 * @param [apiOptions.key] Your API key to access Google Photorealistic 3D Tiles. See [https://developers.google.com/maps/documentation/javascript/get-api-key] for instructions on how to create your own key.
 *   Default value - [GoogleMaps.defaultApiKey]
 * @param [apiOptions.onlyUsingWithGoogleGeocoder] Confirmation that this tileset will only be used with the Google geocoder.
 * @param [tilesetOptions] An object describing initialization options.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#createGooglePhotorealistic3DTileset">Online Documentation</a>
 */
@JsAsync
@Suppress("WRONG_EXTERNAL_DECLARATION")
external suspend fun createGooglePhotorealistic3DTileset(
    apiOptions: CreateGooglePhotorealistic3DTilesetOptions? = definedExternally,
    tilesetOptions: Cesium3DTileset.ConstructorOptions? = definedExternally,
): Cesium3DTileset

@JsName("createGooglePhotorealistic3DTileset")
external fun createGooglePhotorealistic3DTilesetAsync(
    apiOptions: CreateGooglePhotorealistic3DTilesetOptions? = definedExternally,
    tilesetOptions: Cesium3DTileset.ConstructorOptions? = definedExternally,
): Promise<Cesium3DTileset>

@JsPlainObject
external interface CreateGooglePhotorealistic3DTilesetOptions {
    val key: String?
    val onlyUsingWithGoogleGeocoder: JsAny /* true */?
}
