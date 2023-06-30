package electron.core


external interface OnSendHeadersListenerDetails {
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
    var resourceType: (OnSendHeadersListenerDetailsResourceType)
    var referrer: String
    var timestamp: Double
    var requestHeaders: js.core.ReadonlyRecord<String, String>
}
