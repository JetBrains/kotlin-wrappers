// Automatically generated - do not modify!

package actions.cache

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface UploadOptions {
    /**
     * Number of parallel cache upload
     *
     * @default 4
     */
    var uploadConcurrency: Number?

    /**
     * Maximum chunk size in bytes for cache upload
     *
     * @default 32MB
     */
    var uploadChunkSize: Number?
}
