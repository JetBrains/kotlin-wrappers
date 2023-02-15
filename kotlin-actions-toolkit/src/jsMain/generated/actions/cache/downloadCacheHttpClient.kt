// Automatically generated - do not modify!

package actions.cache

import kotlinx.coroutines.await

suspend fun downloadCacheHttpClient(
    archiveLocation: String,
    archivePath: String,
) {
    downloadCacheHttpClientAsync(
        archiveLocation = archiveLocation,
        archivePath = archivePath,
    ).await()
}
