// Automatically generated - do not modify!

package node.buffer

sealed external interface BlobOptions {
    /**
     * @default 'utf8'
     */
    var encoding: BufferEncoding?

    /**
     * The Blob content-type. The intent is for `type` to convey
     * the MIME media type of the data, however no validation of the type format
     * is performed.
     */
    var type: String?
}
