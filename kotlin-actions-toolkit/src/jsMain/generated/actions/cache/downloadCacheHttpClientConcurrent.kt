// Automatically generated - do not modify!

package actions.cache

import js.promise.await

suspend fun downloadCacheHttpClientConcurrent(
    archiveLocation: String,
    archivePath: node.fs.PathLike,
    options: DownloadOptions,
) {
    downloadCacheHttpClientConcurrentAsync(
        archiveLocation = archiveLocation,
        archivePath = archivePath,
        options = options,
    ).await()
}
