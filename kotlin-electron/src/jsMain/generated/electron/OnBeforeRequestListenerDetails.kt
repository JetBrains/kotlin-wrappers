package electron


external interface OnBeforeRequestListenerDetails {
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
    var resourceType: (OnBeforeRequestListenerDetailsResourceType)
    var referrer: String
    var timestamp: Double
    var uploadData: js.core.ReadonlyArray<UploadData>
}
