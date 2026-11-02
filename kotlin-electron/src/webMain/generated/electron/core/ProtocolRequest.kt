// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface ProtocolRequest {
    // Docs: https://electronjs.org/docs/api/structures/protocol-request
    var headers: js.objects.ReadonlyRecord<String, String>

    /**
     * The origin that issued the request (for example `https://example.com`, or `null`
     * for an opaque origin). Absent for requests the browser started itself. Unlike
     * `referrer`, this is not controlled by the requesting page.
     */
    var initiatorOrigin: String?
    var method: String
    var referrer: String
    var uploadData: js.array.ReadonlyArray<UploadData>?
    var url: String
}
