// Generated by Karakum - do not modify it manually!

package electron.core

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
     * Can be `mainFrame`, `subFrame`, `stylesheet`, `script`, `image`, `font`,
     * `object`, `xhr`, `ping`, `cspReport`, `media`, `webSocket` or `other`.
     */
    var resourceType: (OnBeforeSendHeadersListenerDetailsResourceType)
    var referrer: String
    var timestamp: Double
    var uploadData: js.array.ReadonlyArray<UploadData>?
    var requestHeaders: js.objects.ReadonlyRecord<String, String>
}
