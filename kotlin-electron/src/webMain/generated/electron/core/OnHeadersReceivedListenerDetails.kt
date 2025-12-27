// Automatically generated - do not modify!

package electron.core

external interface OnHeadersReceivedListenerDetails {
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
     * Can be `mainFrame`, `subFrame`, `stylesheet`, `script`, `image`, `font`,
     * `object`, `xhr`, `ping`, `cspReport`, `media`, `webSocket` or `other`.
     */
    var resourceType: (OnHeadersReceivedListenerDetailsResourceType)
    var referrer: String
    var timestamp: Double
    var statusLine: String
    var statusCode: Double
    var responseHeaders: js.objects.ReadonlyRecord<String, js.array.ReadonlyArray<String>>?
}
