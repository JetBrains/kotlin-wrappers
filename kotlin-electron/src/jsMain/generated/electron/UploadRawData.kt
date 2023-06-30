package electron

import node.buffer.Buffer


external interface UploadRawData {
// Docs: https://electronjs.org/docs/api/structures/upload-raw-data
    /**
     * Data to be uploaded.
     */
    var bytes: Buffer

    /**
     * `rawData`.
     */
    var type: String /* 'rawData' */
}
