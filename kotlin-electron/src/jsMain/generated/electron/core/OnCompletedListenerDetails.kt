package electron.core


external interface OnCompletedListenerDetails {
    var id: Double
    var url: String
    var method: String
    var webContentsId: Double?
    var webContents: WebContents?
    var frame: WebFrameMain?

    /**
     * Can be `mainFrame`, `subFrame`, `stylesheet`, `script`, `image`, `font`,
     * `object`, `xhr`, `ping`, `cspReport`, `media`, `webSocket` or `other`.
     */
    var resourceType: (OnCompletedListenerDetailsResourceType)
    var referrer: String
    var timestamp: Double
    var responseHeaders: js.core.ReadonlyRecord<String, js.core.ReadonlyArray<String>>?
    var fromCache: Boolean
    var statusCode: Double
    var statusLine: String
    var error: String
}
