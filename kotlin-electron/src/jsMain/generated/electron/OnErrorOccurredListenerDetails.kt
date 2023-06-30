package electron


external interface OnErrorOccurredListenerDetails {
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
    var resourceType: (OnErrorOccurredListenerDetailsResourceType)
    var referrer: String
    var timestamp: Double
    var fromCache: Boolean

    /**
     * The error description.
     */
    var error: String
}
