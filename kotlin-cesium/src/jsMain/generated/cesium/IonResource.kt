// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

import js.core.ReadonlyArray
import kotlin.js.Promise

/**
 * A [Resource] instance that encapsulates Cesium ion asset access.
 * This object is normally not instantiated directly, use [IonResource.fromAssetId].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonResource.html">Online Documentation</a>
 *
 * @constructor
 * @param [endpoint] The result of the Cesium ion asset endpoint service.
 * @param [endpointResource] The resource used to retrieve the endpoint.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonResource.html">Online Documentation</a>
 */
external class IonResource(
    endpoint: Any,
    endpointResource: Resource,
) {
    /**
     * Gets the credits required for attribution of the asset.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonResource.html#credits">Online Documentation</a>
     */
    val credits: ReadonlyArray<Credit>

    /**
     * Duplicates a Resource instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Resource instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonResource.html#clone">Online Documentation</a>
     */
    fun clone(result: Resource? = definedExternally): Resource

    /**
     * Asynchronously loads the given image resource.  Returns a promise that will resolve to
     * an [ImageBitmap](https://developer.mozilla.org/en-US/docs/Web/API/ImageBitmap) if `preferImageBitmap` is true and the browser supports `createImageBitmap` or otherwise an
     * [Image](https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement) once loaded, or reject if the image failed to load.
     * ```
     * // load a single image asynchronously
     * resource.fetchImage().then(function(image) {
     *     // use the loaded image
     * }).catch(function(error) {
     *     // an error occurred
     * });
     *
     * // load several images in parallel
     * Promise.all([resource1.fetchImage(), resource2.fetchImage()]).then(function(images) {
     *     // images is an array containing all the loaded images
     * });
     * ```
     * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonResource.html#fetchImage">Online Documentation</a>
     */
    fun fetchImage(options: FetchImageOptions? = definedExternally): dynamic

    /**
     * @property [preferBlob] If true, we will load the image via a blob.
     *   Default value - `false`
     * @property [preferImageBitmap] If true, image will be decoded during fetch and an `ImageBitmap` is returned.
     *   Default value - `false`
     * @property [flipY] If true, image will be vertically flipped during decode. Only applies if the browser supports `createImageBitmap`.
     *   Default value - `false`
     * @property [skipColorSpaceConversion] If true, any custom gamma or color profiles in the image will be ignored. Only applies if the browser supports `createImageBitmap`.
     *   Default value - `false`
     */
    interface FetchImageOptions {
        var preferBlob: Boolean?
        var preferImageBitmap: Boolean?
        var flipY: Boolean?
        var skipColorSpaceConversion: Boolean?
    }

    companion object {
        /**
         * Asynchronously creates an instance.
         * ```
         * // Load a Cesium3DTileset with asset ID of 124624234
         * try {
         *   const resource = await IonResource.fromAssetId(124624234);
         *   const tileset = await Cesium3DTileset.fromUrl(resource);
         *   scene.primitives.add(tileset);
         * } catch (error) {
         *   console.error(`Error creating tileset: ${error}`);
         * }
         * ```
         * ```
         * //Load a CZML file with asset ID of 10890
         * IonResource.fromAssetId(10890)
         *   .then(function (resource) {
         *     viewer.dataSources.add(CzmlDataSource.load(resource));
         *   });
         * ```
         * @param [assetId] The Cesium ion asset id.
         * @return A Promise to am instance representing the Cesium ion Asset.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonResource.html#.fromAssetId">Online Documentation</a>
         */
        fun fromAssetId(
            assetId: Int,
            options: FromAssetIdOptions? = definedExternally,
        ): Promise<IonResource>

        /**
         * @property [accessToken] The access token to use.
         *   Default value - [Ion.defaultAccessToken]
         * @property [server] The resource to the Cesium ion API server.
         *   Default value - [Ion.defaultServer]
         */
        interface FromAssetIdOptions {
            var accessToken: String?
            var server: Resource?
        }
    }
}
