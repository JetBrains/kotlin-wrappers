// Automatically generated - do not modify!

package electron.core

import node.buffer.Buffer

@kotlinx.js.JsPlainObject
external interface UploadRawData {
// Docs: https://electronjs.org/docs/api/structures/upload-raw-data
    /**
     * Data to be uploaded.
     */
    var bytes: Buffer<*>

    /**
     * `rawData`.
     */
    var type: String // 'rawData'
}
