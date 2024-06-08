// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.buffer.ArrayBuffer
import js.objects.JsPlainObject
import js.promise.Promise
import seskar.js.JsAsync
import web.blob.Blob
import web.canvas.CanvasImageSource
import web.xml.XMLDocument

/**
 * A resource that includes the location and any other parameters we need to retrieve it or create derived resources. It also provides the ability to retry requests.
 * ```
 * function refreshTokenRetryCallback(resource, error) {
 *   if (error.statusCode === 403) {
 *     // 403 status code means a new token should be generated
 *     return getNewAccessToken()
 *       .then(function(token) {
 *         resource.queryParameters.access_token = token;
 *         return true;
 *       })
 *       .catch(function() {
 *         return false;
 *       });
 *   }
 *
 *   return false;
 * }
 *
 * const resource = new Resource({
 *    url: 'http://server.com/path/to/resource.json',
 *    proxy: new DefaultProxy('/proxy/'),
 *    headers: {
 *      'X-My-Header': 'valueOfHeader'
 *    },
 *    queryParameters: {
 *      'access_token': '123-435-456-000'
 *    },
 *    retryCallback: refreshTokenRetryCallback,
 *    retryAttempts: 1
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html">Online Documentation</a>
 *
 * @constructor
 * @param [options] A url or an object describing initialization options
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html">Online Documentation</a>
 */
external class Resource(
    options: Any, /* string | Resource.ConstructorOptions */
) {
    /**
     * Additional HTTP headers that will be sent with the request.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#headers">Online Documentation</a>
     */
    var headers: Any

    /**
     * A Request object that will be used. Intended for internal use only.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#request">Online Documentation</a>
     */
    var request: Request

    /**
     * A proxy to be used when loading the resource.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#proxy">Online Documentation</a>
     */
    var proxy: Proxy

    /**
     * Function to call when a request for this resource fails. If it returns true or a Promise that resolves to true, the request will be retried.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#retryCallback">Online Documentation</a>
     */
    var retryCallback: Function<*>

    /**
     * The number of times the retryCallback should be called before giving up.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#retryAttempts">Online Documentation</a>
     */
    var retryAttempts: Int

    /**
     * Query parameters appended to the url.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#queryParameters">Online Documentation</a>
     */
    val queryParameters: Any

    /**
     * The key/value pairs used to replace template parameters in the url.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#templateValues">Online Documentation</a>
     */
    val templateValues: Any

    /**
     * The url to the resource with template values replaced, query string appended and encoded by proxy if one was set.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#url">Online Documentation</a>
     */
    var url: String

    /**
     * The file extension of the resource.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#extension">Online Documentation</a>
     */
    val extension: String

    /**
     * True if the Resource refers to a data URI.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#isDataUri">Online Documentation</a>
     */
    var isDataUri: Boolean

    /**
     * True if the Resource refers to a blob URI.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#isBlobUri">Online Documentation</a>
     */
    var isBlobUri: Boolean

    /**
     * True if the Resource refers to a cross origin URL.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#isCrossOriginUrl">Online Documentation</a>
     */
    var isCrossOriginUrl: Boolean

    /**
     * True if the Resource has request headers. This is equivalent to checking if the headers property has any keys.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#hasHeaders">Online Documentation</a>
     */
    var hasHeaders: Boolean

    /**
     * Returns the url, optional with the query string and processed by a proxy.
     * @param [query] If true, the query string is included.
     *   Default value - `false`
     * @param [proxy] If true, the url is processed by the proxy object, if defined.
     *   Default value - `false`
     * @return The url with all the requested components.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#getUrlComponent">Online Documentation</a>
     */
    fun getUrlComponent(
        query: Boolean? = definedExternally,
        proxy: Boolean? = definedExternally,
    ): String

    /**
     * Combines the specified object and the existing query parameters. This allows you to add many parameters at once,
     *  as opposed to adding them one at a time to the queryParameters property. If a value is already set, it will be replaced with the new value.
     * @param [params] The query parameters
     * @param [useAsDefault] If true the params will be used as the default values, so they will only be set if they are undefined.
     *   Default value - `false`
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#setQueryParameters">Online Documentation</a>
     */
    fun setQueryParameters(
        params: Any,
        useAsDefault: Boolean? = definedExternally,
    )

    /**
     * Combines the specified object and the existing query parameters. This allows you to add many parameters at once,
     *  as opposed to adding them one at a time to the queryParameters property.
     * @param [params] The query parameters
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#appendQueryParameters">Online Documentation</a>
     */
    fun appendQueryParameters(params: Any)

    /**
     * Combines the specified object and the existing template values. This allows you to add many values at once,
     *  as opposed to adding them one at a time to the templateValues property. If a value is already set, it will become an array and the new value will be appended.
     * @param [template] The template values
     * @param [useAsDefault] If true the values will be used as the default values, so they will only be set if they are undefined.
     *   Default value - `false`
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#setTemplateValues">Online Documentation</a>
     */
    fun setTemplateValues(
        template: Any,
        useAsDefault: Boolean? = definedExternally,
    )

    /**
     * Returns a resource relative to the current instance. All properties remain the same as the current instance unless overridden in options.
     * @param [options] An object with the following properties
     * @return The resource derived from the current one.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#getDerivedResource">Online Documentation</a>
     */
    fun getDerivedResource(options: GetDerivedResourceOptions): Resource

    /**
     * @property [url] The url that will be resolved relative to the url of the current instance.
     * @property [queryParameters] An object containing query parameters that will be combined with those of the current instance.
     * @property [templateValues] Key/Value pairs that are used to replace template values (eg. {x}). These will be combined with those of the current instance.
     * @property [headers] Additional HTTP headers that will be sent.
     *   Default value - `{}`
     * @property [proxy] A proxy to be used when loading the resource.
     * @property [retryCallback] The function to call when loading the resource fails.
     * @property [retryAttempts] The number of times the retryCallback should be called before giving up.
     * @property [request] A Request object that will be used. Intended for internal use only.
     * @property [preserveQueryParameters] If true, this will keep all query parameters from the current resource and derived resource. If false, derived parameters will replace those of the current resource.
     *   Default value - `false`
     */
    @JsPlainObject
    sealed interface GetDerivedResourceOptions {
        var url: String?
        var queryParameters: Any?
        var templateValues: Any?
        var headers: Any?
        var proxy: Proxy?
        var retryCallback: RetryCallback?
        var retryAttempts: Int?
        var request: Request?
        var preserveQueryParameters: Boolean?
    }

    /**
     * Duplicates a Resource instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Resource instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#clone">Online Documentation</a>
     */
    fun clone(result: Resource? = definedExternally): Resource

    /**
     * Returns the base path of the Resource.
     * @param [includeQuery] Whether or not to include the query string and fragment form the uri
     *   Default value - `false`
     * @return The base URI of the resource
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#getBaseUri">Online Documentation</a>
     */
    fun getBaseUri(includeQuery: Boolean? = definedExternally): String

    /**
     * Appends a forward slash to the URL.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#appendForwardSlash">Online Documentation</a>
     */
    fun appendForwardSlash()

    /**
     * Asynchronously loads the resource as raw binary data.  Returns a promise that will resolve to
     * an ArrayBuffer once loaded, or reject if the resource failed to load.  The data is loaded
     * using XMLHttpRequest, which means that in order to make requests to another origin,
     * the server must have Cross-Origin Resource Sharing (CORS) headers enabled.
     * ```
     * // load a single URL asynchronously
     * resource.fetchArrayBuffer().then(function(arrayBuffer) {
     *     // use the data
     * }).catch(function(error) {
     *     // an error occurred
     * });
     * ```
     * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#fetchArrayBuffer">Online Documentation</a>
     */
    @JsAsync(optional = true)
    suspend fun fetchArrayBuffer(): ArrayBuffer?

    @JsName("fetchArrayBuffer")
    fun fetchArrayBufferAsync(): Promise<ArrayBuffer>?

    /**
     * Asynchronously loads the given resource as a blob.  Returns a promise that will resolve to
     * a Blob once loaded, or reject if the resource failed to load.  The data is loaded
     * using XMLHttpRequest, which means that in order to make requests to another origin,
     * the server must have Cross-Origin Resource Sharing (CORS) headers enabled.
     * ```
     * // load a single URL asynchronously
     * resource.fetchBlob().then(function(blob) {
     *     // use the data
     * }).catch(function(error) {
     *     // an error occurred
     * });
     * ```
     * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#fetchBlob">Online Documentation</a>
     */
    @JsAsync(optional = true)
    suspend fun fetchBlob(): Blob?

    @JsName("fetchBlob")
    fun fetchBlobAsync(): Promise<Blob>?

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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#fetchImage">Online Documentation</a>
     */
    @JsAsync(optional = true)
    suspend fun fetchImage(options: FetchImageOptions? = definedExternally): CanvasImageSource?

    @JsName("fetchImage")
    fun fetchImageAsync(options: FetchImageOptions? = definedExternally): Promise<CanvasImageSource>?

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
    @JsPlainObject
    sealed interface FetchImageOptions {
        var preferBlob: Boolean?
        var preferImageBitmap: Boolean?
        var flipY: Boolean?
        var skipColorSpaceConversion: Boolean?
    }

    /**
     * Asynchronously loads the given resource as text.  Returns a promise that will resolve to
     * a String once loaded, or reject if the resource failed to load.  The data is loaded
     * using XMLHttpRequest, which means that in order to make requests to another origin,
     * the server must have Cross-Origin Resource Sharing (CORS) headers enabled.
     * ```
     * // load text from a URL, setting a custom header
     * const resource = new Resource({
     *   url: 'http://someUrl.com/someJson.txt',
     *   headers: {
     *     'X-Custom-Header' : 'some value'
     *   }
     * });
     * resource.fetchText().then(function(text) {
     *     // Do something with the text
     * }).catch(function(error) {
     *     // an error occurred
     * });
     * ```
     * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#fetchText">Online Documentation</a>
     */
    @JsAsync(optional = true)
    suspend fun fetchText(): String?

    @JsName("fetchText")
    fun fetchTextAsync(): Promise<String>?

    /**
     * Asynchronously loads the given resource as JSON.  Returns a promise that will resolve to
     * a JSON object once loaded, or reject if the resource failed to load.  The data is loaded
     * using XMLHttpRequest, which means that in order to make requests to another origin,
     * the server must have Cross-Origin Resource Sharing (CORS) headers enabled. This function
     * adds 'Accept: application/json,&#42;&#47;&#42;;q=0.01' to the request headers, if not
     * already specified.
     * ```
     * resource.fetchJson().then(function(jsonData) {
     *     // Do something with the JSON object
     * }).catch(function(error) {
     *     // an error occurred
     * });
     * ```
     * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#fetchJson">Online Documentation</a>
     */
    @JsAsync(optional = true)
    suspend fun fetchJson(): Any?

    @JsName("fetchJson")
    fun fetchJsonAsync(): Promise<Any>?

    /**
     * Asynchronously loads the given resource as XML.  Returns a promise that will resolve to
     * an XML Document once loaded, or reject if the resource failed to load.  The data is loaded
     * using XMLHttpRequest, which means that in order to make requests to another origin,
     * the server must have Cross-Origin Resource Sharing (CORS) headers enabled.
     * ```
     * // load XML from a URL, setting a custom header
     * loadXML('http://someUrl.com/someXML.xml', {
     *   'X-Custom-Header' : 'some value'
     * }).then(function(document) {
     *     // Do something with the document
     * }).catch(function(error) {
     *     // an error occurred
     * });
     * ```
     * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#fetchXML">Online Documentation</a>
     */
    @JsAsync(optional = true)
    suspend fun fetchXML(): XMLDocument?

    @JsName("fetchXML")
    fun fetchXMLAsync(): Promise<XMLDocument>?

    /**
     * Requests a resource using JSONP.
     * ```
     * // load a data asynchronously
     * resource.fetchJsonp().then(function(data) {
     *     // use the loaded data
     * }).catch(function(error) {
     *     // an error occurred
     * });
     * ```
     * @param [callbackParameterName] The callback parameter name that the server expects.
     *   Default value - `'callback'`
     * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#fetchJsonp">Online Documentation</a>
     */
    @JsAsync(optional = true)
    suspend fun fetchJsonp(callbackParameterName: String? = definedExternally): Any?

    @JsName("fetchJsonp")
    fun fetchJsonpAsync(callbackParameterName: String? = definedExternally): Promise<Any>?

    /**
     * Asynchronously loads the given resource.  Returns a promise that will resolve to
     * the result once loaded, or reject if the resource failed to load.  The data is loaded
     * using XMLHttpRequest, which means that in order to make requests to another origin,
     * the server must have Cross-Origin Resource Sharing (CORS) headers enabled. It's recommended that you use
     * the more specific functions eg. fetchJson, fetchBlob, etc.
     * ```
     * resource.fetch()
     *   .then(function(body) {
     *       // use the data
     *   }).catch(function(error) {
     *       // an error occurred
     *   });
     * ```
     * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#fetch">Online Documentation</a>
     */
    @JsAsync(optional = true)
    suspend fun fetch(options: FetchOptions? = definedExternally): Any?

    @JsName("fetch")
    fun fetchAsync(options: FetchOptions? = definedExternally): Promise<Any>?

    /**
     * @property [responseType] The type of response.  This controls the type of item returned.
     * @property [headers] Additional HTTP headers to send with the request, if any.
     * @property [overrideMimeType] Overrides the MIME type returned by the server.
     */
    @JsPlainObject
    sealed interface FetchOptions {
        var responseType: String?
        var headers: Any?
        var overrideMimeType: String?
    }

    /**
     * Asynchronously deletes the given resource.  Returns a promise that will resolve to
     * the result once loaded, or reject if the resource failed to load.  The data is loaded
     * using XMLHttpRequest, which means that in order to make requests to another origin,
     * the server must have Cross-Origin Resource Sharing (CORS) headers enabled.
     * ```
     * resource.delete()
     *   .then(function(body) {
     *       // use the data
     *   }).catch(function(error) {
     *       // an error occurred
     *   });
     * ```
     * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#delete">Online Documentation</a>
     */
    @JsAsync(optional = true)
    suspend fun delete(options: DeleteOptions? = definedExternally): Any?

    @JsName("delete")
    fun deleteAsync(options: DeleteOptions? = definedExternally): Promise<Any>?

    /**
     * @property [responseType] The type of response.  This controls the type of item returned.
     * @property [headers] Additional HTTP headers to send with the request, if any.
     * @property [overrideMimeType] Overrides the MIME type returned by the server.
     */
    @JsPlainObject
    sealed interface DeleteOptions {
        var responseType: String?
        var headers: Any?
        var overrideMimeType: String?
    }

    /**
     * Asynchronously gets headers the given resource.  Returns a promise that will resolve to
     * the result once loaded, or reject if the resource failed to load.  The data is loaded
     * using XMLHttpRequest, which means that in order to make requests to another origin,
     * the server must have Cross-Origin Resource Sharing (CORS) headers enabled.
     * ```
     * resource.head()
     *   .then(function(headers) {
     *       // use the data
     *   }).catch(function(error) {
     *       // an error occurred
     *   });
     * ```
     * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#head">Online Documentation</a>
     */
    @JsAsync(optional = true)
    suspend fun head(options: HeadOptions? = definedExternally): Any?

    @JsName("head")
    fun headAsync(options: HeadOptions? = definedExternally): Promise<Any>?

    /**
     * @property [responseType] The type of response.  This controls the type of item returned.
     * @property [headers] Additional HTTP headers to send with the request, if any.
     * @property [overrideMimeType] Overrides the MIME type returned by the server.
     */
    @JsPlainObject
    sealed interface HeadOptions {
        var responseType: String?
        var headers: Any?
        var overrideMimeType: String?
    }

    /**
     * Asynchronously gets options the given resource.  Returns a promise that will resolve to
     * the result once loaded, or reject if the resource failed to load.  The data is loaded
     * using XMLHttpRequest, which means that in order to make requests to another origin,
     * the server must have Cross-Origin Resource Sharing (CORS) headers enabled.
     * ```
     * resource.options()
     *   .then(function(headers) {
     *       // use the data
     *   }).catch(function(error) {
     *       // an error occurred
     *   });
     * ```
     * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#options">Online Documentation</a>
     */
    @JsAsync(optional = true)
    suspend fun options(options: OptionsOptions? = definedExternally): Any?

    @JsName("options")
    fun optionsAsync(options: OptionsOptions? = definedExternally): Promise<Any>?

    /**
     * @property [responseType] The type of response.  This controls the type of item returned.
     * @property [headers] Additional HTTP headers to send with the request, if any.
     * @property [overrideMimeType] Overrides the MIME type returned by the server.
     */
    @JsPlainObject
    sealed interface OptionsOptions {
        var responseType: String?
        var headers: Any?
        var overrideMimeType: String?
    }

    /**
     * Asynchronously posts data to the given resource.  Returns a promise that will resolve to
     * the result once loaded, or reject if the resource failed to load.  The data is loaded
     * using XMLHttpRequest, which means that in order to make requests to another origin,
     * the server must have Cross-Origin Resource Sharing (CORS) headers enabled.
     * ```
     * resource.post(data)
     *   .then(function(result) {
     *       // use the result
     *   }).catch(function(error) {
     *       // an error occurred
     *   });
     * ```
     * @param [data] Data that is posted with the resource.
     * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#post">Online Documentation</a>
     */
    @JsAsync(optional = true)
    suspend fun post(
        data: Any,
        options: PostOptions? = definedExternally,
    ): Any?

    @JsName("post")
    fun postAsync(
        data: Any,
        options: PostOptions? = definedExternally,
    ): Promise<Any>?

    /**
     * @property [data] Data that is posted with the resource.
     * @property [responseType] The type of response.  This controls the type of item returned.
     * @property [headers] Additional HTTP headers to send with the request, if any.
     * @property [overrideMimeType] Overrides the MIME type returned by the server.
     */
    @JsPlainObject
    sealed interface PostOptions {
        var data: Any?
        var responseType: String?
        var headers: Any?
        var overrideMimeType: String?
    }

    /**
     * Asynchronously puts data to the given resource.  Returns a promise that will resolve to
     * the result once loaded, or reject if the resource failed to load.  The data is loaded
     * using XMLHttpRequest, which means that in order to make requests to another origin,
     * the server must have Cross-Origin Resource Sharing (CORS) headers enabled.
     * ```
     * resource.put(data)
     *   .then(function(result) {
     *       // use the result
     *   }).catch(function(error) {
     *       // an error occurred
     *   });
     * ```
     * @param [data] Data that is posted with the resource.
     * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#put">Online Documentation</a>
     */
    @JsAsync(optional = true)
    suspend fun put(
        data: Any,
        options: PutOptions? = definedExternally,
    ): Any?

    @JsName("put")
    fun putAsync(
        data: Any,
        options: PutOptions? = definedExternally,
    ): Promise<Any>?

    /**
     * @property [responseType] The type of response.  This controls the type of item returned.
     * @property [headers] Additional HTTP headers to send with the request, if any.
     * @property [overrideMimeType] Overrides the MIME type returned by the server.
     */
    @JsPlainObject
    sealed interface PutOptions {
        var responseType: String?
        var headers: Any?
        var overrideMimeType: String?
    }

    /**
     * Asynchronously patches data to the given resource.  Returns a promise that will resolve to
     * the result once loaded, or reject if the resource failed to load.  The data is loaded
     * using XMLHttpRequest, which means that in order to make requests to another origin,
     * the server must have Cross-Origin Resource Sharing (CORS) headers enabled.
     * ```
     * resource.patch(data)
     *   .then(function(result) {
     *       // use the result
     *   }).catch(function(error) {
     *       // an error occurred
     *   });
     * ```
     * @param [data] Data that is posted with the resource.
     * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#patch">Online Documentation</a>
     */
    @JsAsync(optional = true)
    suspend fun patch(
        data: Any,
        options: PatchOptions? = definedExternally,
    ): Any?

    @JsName("patch")
    fun patchAsync(
        data: Any,
        options: PatchOptions? = definedExternally,
    ): Promise<Any>?

    /**
     * @property [responseType] The type of response.  This controls the type of item returned.
     * @property [headers] Additional HTTP headers to send with the request, if any.
     * @property [overrideMimeType] Overrides the MIME type returned by the server.
     */
    @JsPlainObject
    sealed interface PatchOptions {
        var responseType: String?
        var headers: Any?
        var overrideMimeType: String?
    }

    /**
     * Initialization options for the Resource constructor
     * @property [url] The url of the resource.
     * @property [queryParameters] An object containing query parameters that will be sent when retrieving the resource.
     * @property [templateValues] Key/Value pairs that are used to replace template values (eg. {x}).
     * @property [headers] Additional HTTP headers that will be sent.
     *   Default value - `{}`
     * @property [proxy] A proxy to be used when loading the resource.
     * @property [retryCallback] The Function to call when a request for this resource fails. If it returns true, the request will be retried.
     * @property [retryAttempts] The number of times the retryCallback should be called before giving up.
     *   Default value - `0`
     * @property [request] A Request object that will be used. Intended for internal use only.
     * @property [parseUrl] If true, parse the url for query parameters; otherwise store the url without change
     *   Default value - `true`
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#.ConstructorOptions">Online Documentation</a>
     */
    @JsPlainObject
    sealed interface ConstructorOptions {
        var url: String
        var queryParameters: Any?
        var templateValues: Any?
        var headers: Any?
        var proxy: Proxy?
        var retryCallback: RetryCallback?
        var retryAttempts: Int?
        var request: Request?
        var parseUrl: Boolean?
    }

    companion object {
        /**
         * Returns true if blobs are supported.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#.isBlobSupported">Online Documentation</a>
         */
        val isBlobSupported: Boolean

        /**
         * Creates a Resource and calls fetchArrayBuffer() on it.
         * @param [options] A url or an object with the following properties
         * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#.fetchArrayBuffer">Online Documentation</a>
         */
        @JsAsync(optional = true)
        suspend fun fetchArrayBuffer(options: FetchArrayBufferOptions): ArrayBuffer?

        @JsName("fetchArrayBuffer")
        fun fetchArrayBufferAsync(options: FetchArrayBufferOptions): Promise<ArrayBuffer>?

        /**
         * @property [url] The url of the resource.
         * @property [queryParameters] An object containing query parameters that will be sent when retrieving the resource.
         * @property [templateValues] Key/Value pairs that are used to replace template values (eg. {x}).
         * @property [headers] Additional HTTP headers that will be sent.
         *   Default value - `{}`
         * @property [proxy] A proxy to be used when loading the resource.
         * @property [retryCallback] The Function to call when a request for this resource fails. If it returns true, the request will be retried.
         * @property [retryAttempts] The number of times the retryCallback should be called before giving up.
         *   Default value - `0`
         * @property [request] A Request object that will be used. Intended for internal use only.
         */
        @JsPlainObject
        sealed interface FetchArrayBufferOptions {
            var url: String
            var queryParameters: Any?
            var templateValues: Any?
            var headers: Any?
            var proxy: Proxy?
            var retryCallback: RetryCallback?
            var retryAttempts: Int?
            var request: Request?
        }

        /**
         * Creates a Resource and calls fetchBlob() on it.
         * @param [options] A url or an object with the following properties
         * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#.fetchBlob">Online Documentation</a>
         */
        @JsAsync(optional = true)
        suspend fun fetchBlob(options: FetchBlobOptions): Blob?

        @JsName("fetchBlob")
        fun fetchBlobAsync(options: FetchBlobOptions): Promise<Blob>?

        /**
         * @property [url] The url of the resource.
         * @property [queryParameters] An object containing query parameters that will be sent when retrieving the resource.
         * @property [templateValues] Key/Value pairs that are used to replace template values (eg. {x}).
         * @property [headers] Additional HTTP headers that will be sent.
         *   Default value - `{}`
         * @property [proxy] A proxy to be used when loading the resource.
         * @property [retryCallback] The Function to call when a request for this resource fails. If it returns true, the request will be retried.
         * @property [retryAttempts] The number of times the retryCallback should be called before giving up.
         *   Default value - `0`
         * @property [request] A Request object that will be used. Intended for internal use only.
         */
        @JsPlainObject
        sealed interface FetchBlobOptions {
            var url: String
            var queryParameters: Any?
            var templateValues: Any?
            var headers: Any?
            var proxy: Proxy?
            var retryCallback: RetryCallback?
            var retryAttempts: Int?
            var request: Request?
        }

        /**
         * Creates a Resource and calls fetchImage() on it.
         * @param [options] A url or an object with the following properties
         * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#.fetchImage">Online Documentation</a>
         */
        @JsAsync(optional = true)
        suspend fun fetchImage(options: FetchImageOptions): CanvasImageSource?

        @JsName("fetchImage")
        fun fetchImageAsync(options: FetchImageOptions): Promise<CanvasImageSource>?

        /**
         * @property [url] The url of the resource.
         * @property [queryParameters] An object containing query parameters that will be sent when retrieving the resource.
         * @property [templateValues] Key/Value pairs that are used to replace template values (eg. {x}).
         * @property [headers] Additional HTTP headers that will be sent.
         *   Default value - `{}`
         * @property [proxy] A proxy to be used when loading the resource.
         * @property [flipY] Whether to vertically flip the image during fetch and decode. Only applies when requesting an image and the browser supports `createImageBitmap`.
         *   Default value - `false`
         * @property [retryCallback] The Function to call when a request for this resource fails. If it returns true, the request will be retried.
         * @property [retryAttempts] The number of times the retryCallback should be called before giving up.
         *   Default value - `0`
         * @property [request] A Request object that will be used. Intended for internal use only.
         * @property [preferBlob] If true, we will load the image via a blob.
         *   Default value - `false`
         * @property [preferImageBitmap] If true, image will be decoded during fetch and an `ImageBitmap` is returned.
         *   Default value - `false`
         * @property [skipColorSpaceConversion] If true, any custom gamma or color profiles in the image will be ignored. Only applies when requesting an image and the browser supports `createImageBitmap`.
         *   Default value - `false`
         */
        @JsPlainObject
        sealed interface FetchImageOptions {
            var url: String
            var queryParameters: Any?
            var templateValues: Any?
            var headers: Any?
            var proxy: Proxy?
            var flipY: Boolean?
            var retryCallback: RetryCallback?
            var retryAttempts: Int?
            var request: Request?
            var preferBlob: Boolean?
            var preferImageBitmap: Boolean?
            var skipColorSpaceConversion: Boolean?
        }

        /**
         * Creates a Resource and calls fetchText() on it.
         * @param [options] A url or an object with the following properties
         * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#.fetchText">Online Documentation</a>
         */
        @JsAsync(optional = true)
        suspend fun fetchText(options: FetchTextOptions): String?

        @JsName("fetchText")
        fun fetchTextAsync(options: FetchTextOptions): Promise<String>?

        /**
         * @property [url] The url of the resource.
         * @property [queryParameters] An object containing query parameters that will be sent when retrieving the resource.
         * @property [templateValues] Key/Value pairs that are used to replace template values (eg. {x}).
         * @property [headers] Additional HTTP headers that will be sent.
         *   Default value - `{}`
         * @property [proxy] A proxy to be used when loading the resource.
         * @property [retryCallback] The Function to call when a request for this resource fails. If it returns true, the request will be retried.
         * @property [retryAttempts] The number of times the retryCallback should be called before giving up.
         *   Default value - `0`
         * @property [request] A Request object that will be used. Intended for internal use only.
         */
        @JsPlainObject
        sealed interface FetchTextOptions {
            var url: String
            var queryParameters: Any?
            var templateValues: Any?
            var headers: Any?
            var proxy: Proxy?
            var retryCallback: RetryCallback?
            var retryAttempts: Int?
            var request: Request?
        }

        /**
         * Creates a Resource and calls fetchJson() on it.
         * @param [options] A url or an object with the following properties
         * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#.fetchJson">Online Documentation</a>
         */
        @JsAsync(optional = true)
        suspend fun fetchJson(options: FetchJsonOptions): Any?

        @JsName("fetchJson")
        fun fetchJsonAsync(options: FetchJsonOptions): Promise<Any>?

        /**
         * @property [url] The url of the resource.
         * @property [queryParameters] An object containing query parameters that will be sent when retrieving the resource.
         * @property [templateValues] Key/Value pairs that are used to replace template values (eg. {x}).
         * @property [headers] Additional HTTP headers that will be sent.
         *   Default value - `{}`
         * @property [proxy] A proxy to be used when loading the resource.
         * @property [retryCallback] The Function to call when a request for this resource fails. If it returns true, the request will be retried.
         * @property [retryAttempts] The number of times the retryCallback should be called before giving up.
         *   Default value - `0`
         * @property [request] A Request object that will be used. Intended for internal use only.
         */
        @JsPlainObject
        sealed interface FetchJsonOptions {
            var url: String
            var queryParameters: Any?
            var templateValues: Any?
            var headers: Any?
            var proxy: Proxy?
            var retryCallback: RetryCallback?
            var retryAttempts: Int?
            var request: Request?
        }

        /**
         * Creates a Resource and calls fetchXML() on it.
         * @param [options] A url or an object with the following properties
         * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#.fetchXML">Online Documentation</a>
         */
        @JsAsync(optional = true)
        suspend fun fetchXML(options: FetchXMLOptions): XMLDocument?

        @JsName("fetchXML")
        fun fetchXMLAsync(options: FetchXMLOptions): Promise<XMLDocument>?

        /**
         * @property [url] The url of the resource.
         * @property [queryParameters] An object containing query parameters that will be sent when retrieving the resource.
         * @property [templateValues] Key/Value pairs that are used to replace template values (eg. {x}).
         * @property [headers] Additional HTTP headers that will be sent.
         *   Default value - `{}`
         * @property [proxy] A proxy to be used when loading the resource.
         * @property [retryCallback] The Function to call when a request for this resource fails. If it returns true, the request will be retried.
         * @property [retryAttempts] The number of times the retryCallback should be called before giving up.
         *   Default value - `0`
         * @property [request] A Request object that will be used. Intended for internal use only.
         */
        @JsPlainObject
        sealed interface FetchXMLOptions {
            var url: String
            var queryParameters: Any?
            var templateValues: Any?
            var headers: Any?
            var proxy: Proxy?
            var retryCallback: RetryCallback?
            var retryAttempts: Int?
            var request: Request?
        }

        /**
         * Creates a Resource from a URL and calls fetchJsonp() on it.
         * @param [options] A url or an object with the following properties
         * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#.fetchJsonp">Online Documentation</a>
         */
        @JsAsync(optional = true)
        suspend fun fetchJsonp(options: FetchJsonpOptions): Any?

        @JsName("fetchJsonp")
        fun fetchJsonpAsync(options: FetchJsonpOptions): Promise<Any>?

        /**
         * @property [url] The url of the resource.
         * @property [queryParameters] An object containing query parameters that will be sent when retrieving the resource.
         * @property [templateValues] Key/Value pairs that are used to replace template values (eg. {x}).
         * @property [headers] Additional HTTP headers that will be sent.
         *   Default value - `{}`
         * @property [proxy] A proxy to be used when loading the resource.
         * @property [retryCallback] The Function to call when a request for this resource fails. If it returns true, the request will be retried.
         * @property [retryAttempts] The number of times the retryCallback should be called before giving up.
         *   Default value - `0`
         * @property [request] A Request object that will be used. Intended for internal use only.
         * @property [callbackParameterName] The callback parameter name that the server expects.
         *   Default value - `'callback'`
         */
        @JsPlainObject
        sealed interface FetchJsonpOptions {
            var url: String
            var queryParameters: Any?
            var templateValues: Any?
            var headers: Any?
            var proxy: Proxy?
            var retryCallback: RetryCallback?
            var retryAttempts: Int?
            var request: Request?
            var callbackParameterName: String?
        }

        /**
         * Creates a Resource from a URL and calls fetch() on it.
         * @param [options] A url or an object with the following properties
         * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#.fetch">Online Documentation</a>
         */
        @JsAsync(optional = true)
        suspend fun fetch(options: FetchOptions): Any?

        @JsName("fetch")
        fun fetchAsync(options: FetchOptions): Promise<Any>?

        /**
         * @property [url] The url of the resource.
         * @property [queryParameters] An object containing query parameters that will be sent when retrieving the resource.
         * @property [templateValues] Key/Value pairs that are used to replace template values (eg. {x}).
         * @property [headers] Additional HTTP headers that will be sent.
         *   Default value - `{}`
         * @property [proxy] A proxy to be used when loading the resource.
         * @property [retryCallback] The Function to call when a request for this resource fails. If it returns true, the request will be retried.
         * @property [retryAttempts] The number of times the retryCallback should be called before giving up.
         *   Default value - `0`
         * @property [request] A Request object that will be used. Intended for internal use only.
         * @property [responseType] The type of response.  This controls the type of item returned.
         * @property [overrideMimeType] Overrides the MIME type returned by the server.
         */
        @JsPlainObject
        sealed interface FetchOptions {
            var url: String
            var queryParameters: Any?
            var templateValues: Any?
            var headers: Any?
            var proxy: Proxy?
            var retryCallback: RetryCallback?
            var retryAttempts: Int?
            var request: Request?
            var responseType: String?
            var overrideMimeType: String?
        }

        /**
         * Creates a Resource from a URL and calls delete() on it.
         * @param [options] A url or an object with the following properties
         * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#.delete">Online Documentation</a>
         */
        @JsAsync(optional = true)
        suspend fun delete(options: DeleteOptions): Any?

        @JsName("delete")
        fun deleteAsync(options: DeleteOptions): Promise<Any>?

        /**
         * @property [url] The url of the resource.
         * @property [data] Data that is posted with the resource.
         * @property [queryParameters] An object containing query parameters that will be sent when retrieving the resource.
         * @property [templateValues] Key/Value pairs that are used to replace template values (eg. {x}).
         * @property [headers] Additional HTTP headers that will be sent.
         *   Default value - `{}`
         * @property [proxy] A proxy to be used when loading the resource.
         * @property [retryCallback] The Function to call when a request for this resource fails. If it returns true, the request will be retried.
         * @property [retryAttempts] The number of times the retryCallback should be called before giving up.
         *   Default value - `0`
         * @property [request] A Request object that will be used. Intended for internal use only.
         * @property [responseType] The type of response.  This controls the type of item returned.
         * @property [overrideMimeType] Overrides the MIME type returned by the server.
         */
        @JsPlainObject
        sealed interface DeleteOptions {
            var url: String
            var data: Any?
            var queryParameters: Any?
            var templateValues: Any?
            var headers: Any?
            var proxy: Proxy?
            var retryCallback: RetryCallback?
            var retryAttempts: Int?
            var request: Request?
            var responseType: String?
            var overrideMimeType: String?
        }

        /**
         * Creates a Resource from a URL and calls head() on it.
         * @param [options] A url or an object with the following properties
         * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#.head">Online Documentation</a>
         */
        @JsAsync(optional = true)
        suspend fun head(options: HeadOptions): Any?

        @JsName("head")
        fun headAsync(options: HeadOptions): Promise<Any>?

        /**
         * @property [url] The url of the resource.
         * @property [queryParameters] An object containing query parameters that will be sent when retrieving the resource.
         * @property [templateValues] Key/Value pairs that are used to replace template values (eg. {x}).
         * @property [headers] Additional HTTP headers that will be sent.
         *   Default value - `{}`
         * @property [proxy] A proxy to be used when loading the resource.
         * @property [retryCallback] The Function to call when a request for this resource fails. If it returns true, the request will be retried.
         * @property [retryAttempts] The number of times the retryCallback should be called before giving up.
         *   Default value - `0`
         * @property [request] A Request object that will be used. Intended for internal use only.
         * @property [responseType] The type of response.  This controls the type of item returned.
         * @property [overrideMimeType] Overrides the MIME type returned by the server.
         */
        @JsPlainObject
        sealed interface HeadOptions {
            var url: String
            var queryParameters: Any?
            var templateValues: Any?
            var headers: Any?
            var proxy: Proxy?
            var retryCallback: RetryCallback?
            var retryAttempts: Int?
            var request: Request?
            var responseType: String?
            var overrideMimeType: String?
        }

        /**
         * Creates a Resource from a URL and calls options() on it.
         * @param [options] A url or an object with the following properties
         * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#.options">Online Documentation</a>
         */
        @JsAsync(optional = true)
        suspend fun options(options: OptionsOptions): Any?

        @JsName("options")
        fun optionsAsync(options: OptionsOptions): Promise<Any>?

        /**
         * @property [url] The url of the resource.
         * @property [queryParameters] An object containing query parameters that will be sent when retrieving the resource.
         * @property [templateValues] Key/Value pairs that are used to replace template values (eg. {x}).
         * @property [headers] Additional HTTP headers that will be sent.
         *   Default value - `{}`
         * @property [proxy] A proxy to be used when loading the resource.
         * @property [retryCallback] The Function to call when a request for this resource fails. If it returns true, the request will be retried.
         * @property [retryAttempts] The number of times the retryCallback should be called before giving up.
         *   Default value - `0`
         * @property [request] A Request object that will be used. Intended for internal use only.
         * @property [responseType] The type of response.  This controls the type of item returned.
         * @property [overrideMimeType] Overrides the MIME type returned by the server.
         */
        @JsPlainObject
        sealed interface OptionsOptions {
            var url: String
            var queryParameters: Any?
            var templateValues: Any?
            var headers: Any?
            var proxy: Proxy?
            var retryCallback: RetryCallback?
            var retryAttempts: Int?
            var request: Request?
            var responseType: String?
            var overrideMimeType: String?
        }

        /**
         * Creates a Resource from a URL and calls post() on it.
         * @param [options] A url or an object with the following properties
         * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#.post">Online Documentation</a>
         */
        @JsAsync(optional = true)
        suspend fun post(options: PostOptions): Any?

        @JsName("post")
        fun postAsync(options: PostOptions): Promise<Any>?

        /**
         * @property [url] The url of the resource.
         * @property [data] Data that is posted with the resource.
         * @property [queryParameters] An object containing query parameters that will be sent when retrieving the resource.
         * @property [templateValues] Key/Value pairs that are used to replace template values (eg. {x}).
         * @property [headers] Additional HTTP headers that will be sent.
         *   Default value - `{}`
         * @property [proxy] A proxy to be used when loading the resource.
         * @property [retryCallback] The Function to call when a request for this resource fails. If it returns true, the request will be retried.
         * @property [retryAttempts] The number of times the retryCallback should be called before giving up.
         *   Default value - `0`
         * @property [request] A Request object that will be used. Intended for internal use only.
         * @property [responseType] The type of response.  This controls the type of item returned.
         * @property [overrideMimeType] Overrides the MIME type returned by the server.
         */
        @JsPlainObject
        sealed interface PostOptions {
            var url: String
            var data: Any
            var queryParameters: Any?
            var templateValues: Any?
            var headers: Any?
            var proxy: Proxy?
            var retryCallback: RetryCallback?
            var retryAttempts: Int?
            var request: Request?
            var responseType: String?
            var overrideMimeType: String?
        }

        /**
         * Creates a Resource from a URL and calls put() on it.
         * @param [options] A url or an object with the following properties
         * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#.put">Online Documentation</a>
         */
        @JsAsync(optional = true)
        suspend fun put(options: PutOptions): Any?

        @JsName("put")
        fun putAsync(options: PutOptions): Promise<Any>?

        /**
         * @property [url] The url of the resource.
         * @property [data] Data that is posted with the resource.
         * @property [queryParameters] An object containing query parameters that will be sent when retrieving the resource.
         * @property [templateValues] Key/Value pairs that are used to replace template values (eg. {x}).
         * @property [headers] Additional HTTP headers that will be sent.
         *   Default value - `{}`
         * @property [proxy] A proxy to be used when loading the resource.
         * @property [retryCallback] The Function to call when a request for this resource fails. If it returns true, the request will be retried.
         * @property [retryAttempts] The number of times the retryCallback should be called before giving up.
         *   Default value - `0`
         * @property [request] A Request object that will be used. Intended for internal use only.
         * @property [responseType] The type of response.  This controls the type of item returned.
         * @property [overrideMimeType] Overrides the MIME type returned by the server.
         */
        @JsPlainObject
        sealed interface PutOptions {
            var url: String
            var data: Any
            var queryParameters: Any?
            var templateValues: Any?
            var headers: Any?
            var proxy: Proxy?
            var retryCallback: RetryCallback?
            var retryAttempts: Int?
            var request: Request?
            var responseType: String?
            var overrideMimeType: String?
        }

        /**
         * Creates a Resource from a URL and calls patch() on it.
         * @param [options] A url or an object with the following properties
         * @return a promise that will resolve to the requested data when loaded. Returns undefined if `request.throttle` is true and the request does not have high enough priority.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#.patch">Online Documentation</a>
         */
        @JsAsync(optional = true)
        suspend fun patch(options: PatchOptions): Any?

        @JsName("patch")
        fun patchAsync(options: PatchOptions): Promise<Any>?

        /**
         * @property [url] The url of the resource.
         * @property [data] Data that is posted with the resource.
         * @property [queryParameters] An object containing query parameters that will be sent when retrieving the resource.
         * @property [templateValues] Key/Value pairs that are used to replace template values (eg. {x}).
         * @property [headers] Additional HTTP headers that will be sent.
         *   Default value - `{}`
         * @property [proxy] A proxy to be used when loading the resource.
         * @property [retryCallback] The Function to call when a request for this resource fails. If it returns true, the request will be retried.
         * @property [retryAttempts] The number of times the retryCallback should be called before giving up.
         *   Default value - `0`
         * @property [request] A Request object that will be used. Intended for internal use only.
         * @property [responseType] The type of response.  This controls the type of item returned.
         * @property [overrideMimeType] Overrides the MIME type returned by the server.
         */
        @JsPlainObject
        sealed interface PatchOptions {
            var url: String
            var data: Any
            var queryParameters: Any?
            var templateValues: Any?
            var headers: Any?
            var proxy: Proxy?
            var retryCallback: RetryCallback?
            var retryAttempts: Int?
            var request: Request?
            var responseType: String?
            var overrideMimeType: String?
        }

        /**
         * A resource instance initialized to the current browser location
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#.DEFAULT">Online Documentation</a>
         */
        val DEFAULT: Resource
    }
}
