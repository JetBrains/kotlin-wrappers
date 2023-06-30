package electron


external interface OnHeadersReceivedListenerDetails {
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
    var resourceType: (OnHeadersReceivedListenerDetailsResourceType)
    var referrer: String
    var timestamp: Double
    var statusLine: String
    var statusCode: Double
    var responseHeaders: js.core.ReadonlyRecord<String, js.core.ReadonlyArray<String>>?
}
