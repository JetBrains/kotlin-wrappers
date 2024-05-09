// Automatically generated - do not modify!

package actions.cache
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
