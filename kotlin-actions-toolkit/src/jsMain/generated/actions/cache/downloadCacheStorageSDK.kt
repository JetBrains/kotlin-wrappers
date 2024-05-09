// Automatically generated - do not modify!

package actions.cache
suspend fun downloadCacheStorageSDK(
    archiveLocation: String,
    archivePath: String,
    options: DownloadOptions,
) {
    downloadCacheStorageSDKAsync(
        archiveLocation = archiveLocation,
        archivePath = archivePath,
        options = options,
    ).await()
}
