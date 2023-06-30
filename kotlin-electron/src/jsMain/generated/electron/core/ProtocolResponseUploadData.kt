package electron.core


external interface ProtocolResponseUploadData {
// Docs: https://electronjs.org/docs/api/structures/protocol-response-upload-data
    /**
     * MIME type of the content.
     */
    var contentType: String

    /**
     * Content to be sent.
     */
    var data: Any /* (string) | (Buffer) */
}
