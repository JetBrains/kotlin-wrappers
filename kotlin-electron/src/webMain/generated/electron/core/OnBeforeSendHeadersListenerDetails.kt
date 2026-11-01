// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface OnBeforeSendHeadersListenerDetails {
    var id: Double
    var url: String
    var method: String
    var webContentsId: Double?
    var webContents: WebContents?

    /**
     * Requesting frame. May be `null` if accessed after the frame has either navigated
     * or been destroyed.
     */
    var frame: WebFrameMain?

    /**
     * The origin that issued the request (for example `https://example.com`, or `null`
     * for an opaque origin). Kept from the original request across redirects; absent
     * for requests the browser started itself.
     */
    var initiatorOrigin: String?

    /**
     * Can be `mainFrame`, `subFrame`, `stylesheet`, `script`, `image`, `font`,
     * `object`, `xhr`, `ping`, `cspReport`, `media`, `webSocket` or `other`.
     */
    var resourceType: (OnBeforeSendHeadersListenerDetailsResourceType)
    var referrer: String
    var timestamp: Double
    var uploadData: js.array.ReadonlyArray<UploadData>?
    var requestHeaders: js.objects.ReadonlyRecord<String, String>
}
