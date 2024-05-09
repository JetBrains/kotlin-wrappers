// Automatically generated - do not modify!

package actions.cache
suspend fun downloadCacheHttpClient(
    archiveLocation: String,
    archivePath: String,
) {
    downloadCacheHttpClientAsync(
        archiveLocation = archiveLocation,
        archivePath = archivePath,
    ).await()
}
