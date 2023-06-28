// Automatically generated - do not modify!

package actions.cache

import js.promise.await

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
