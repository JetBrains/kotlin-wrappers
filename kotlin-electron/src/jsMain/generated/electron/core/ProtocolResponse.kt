package electron.core


external interface ProtocolResponse {
// Docs: https://electronjs.org/docs/api/structures/protocol-response
    /**
     * The charset of response body, default is `"utf-8"`.
     */
    var charset: String?

    /**
     * The response body. When returning stream as response, this is a Node.js readable
     * stream representing the response body. When returning `Buffer` as response, this
     * is a `Buffer`. When returning `string` as response, this is a `string`. This is
     * ignored for other types of responses.
     */
    var data: Any /* (Buffer) | (string) | (NodeJS.ReadableStream) */?

    /**
     * When assigned, the `request` will fail with the `error` number . For the
     * available error numbers you can use, please see the net error list.
     */
    var error: Double?

    /**
     * An object containing the response headers. The keys must be string, and values
     * must be either string or Array of string.
     */
    var headers: js.core.ReadonlyRecord<String, Any /* (string) | (string[]) */>?

    /**
     * The HTTP `method`. This is only used for file and URL responses.
     */
    var method: String?

    /**
     * The MIME type of response body, default is `"text/html"`. Setting `mimeType`
     * would implicitly set the `content-type` header in response, but if
     * `content-type` is already set in `headers`, the `mimeType` would be ignored.
     */
    var mimeType: String?

    /**
     * Path to the file which would be sent as response body. This is only used for
     * file responses.
     */
    var path: String?

    /**
     * The `referrer` URL. This is only used for file and URL responses.
     */
    var referrer: String?

    /**
     * The session used for requesting URL, by default the HTTP request will reuse the
     * current session. Setting `session` to `null` would use a random independent
     * session. This is only used for URL responses.
     */
    var session: Session?

    /**
     * The HTTP response code, default is 200.
     */
    var statusCode: Double?

    /**
     * The data used as upload data. This is only used for URL responses when `method`
     * is `"POST"`.
     */
    var uploadData: ProtocolResponseUploadData?

    /**
     * Download the `url` and pipe the result as response body. This is only used for
     * URL responses.
     */
    var url: String?
}
