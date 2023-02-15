// Automatically generated - do not modify!

package actions.cache

import kotlinx.coroutines.await

suspend fun downloadCache(
    archiveLocation: String,
    archivePath: String,
) {
    downloadCacheAsync(
        archiveLocation = archiveLocation,
        archivePath = archivePath,
    ).await()
}

suspend fun downloadCache(
    archiveLocation: String,
    archivePath: String,
    options: DownloadOptions,
) {
    downloadCacheAsync(
        archiveLocation = archiveLocation,
        archivePath = archivePath,
        options = options,
    ).await()
}
