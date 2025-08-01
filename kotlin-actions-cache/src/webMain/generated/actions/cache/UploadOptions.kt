// Automatically generated - do not modify!

package actions.cache

import js.objects.JsPlainObject

@JsPlainObject
external interface UploadOptions {
    /**
     * Indicates whether to use the Azure Blob SDK to download caches
     * that are stored on Azure Blob Storage to improve reliability and
     * performance
     *
     * @default false
     */
    val useAzureSdk: Boolean?

    /**
     * Number of parallel cache upload
     *
     * @default 4
     */
    val uploadConcurrency: Number?

    /**
     * Maximum chunk size in bytes for cache upload
     *
     * @default 32MB
     */
    val uploadChunkSize: Number?

    /**
     * Archive size in bytes
     */
    val archiveSizeBytes: Number?
}
