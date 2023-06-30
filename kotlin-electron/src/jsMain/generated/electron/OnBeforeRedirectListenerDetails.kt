package electron


external interface OnBeforeRedirectListenerDetails {
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
    var resourceType: (OnBeforeRedirectListenerDetailsResourceType)
    var referrer: String
    var timestamp: Double
    var redirectURL: String
    var statusCode: Double
    var statusLine: String

    /**
     * The server IP address that the request was actually sent to.
     */
    var ip: String?
    var fromCache: Boolean
    var responseHeaders: js.core.ReadonlyRecord<String, js.core.ReadonlyArray<String>>?
}
