package electron.core


external interface OnResponseStartedListenerDetails {
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
    var resourceType: (OnResponseStartedListenerDetailsResourceType)
    var referrer: String
    var timestamp: Double
    var responseHeaders: js.core.ReadonlyRecord<String, js.core.ReadonlyArray<String>>?

    /**
     * Indicates whether the response was fetched from disk cache.
     */
    var fromCache: Boolean
    var statusCode: Double
    var statusLine: String
}
