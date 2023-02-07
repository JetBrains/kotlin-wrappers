// Automatically generated - do not modify!

package actions.cache

sealed external interface DownloadOptions {
    /**
     * Indicates whether to use the Azure Blob SDK to download caches
     * that are stored on Azure Blob Storage to improve reliability and
     * performance
     *
     * @default true
     */
    var useAzureSdk: Boolean?

    /**
     * Number of parallel downloads (this option only applies when using
     * the Azure SDK)
     *
     * @default 8
     */
    var downloadConcurrency: Number?

    /**
     * Maximum time for each download request, in milliseconds (this
     * option only applies when using the Azure SDK)
     *
     * @default 30000
     */
    var timeoutInMs: Number?

    /**
     * Time after which a segment download should be aborted if stuck
     *
     * @default 3600000
     */
    var segmentTimeoutInMs: Number?
}
