// Automatically generated - do not modify!

package actions.cache

import kotlinx.coroutines.await

suspend fun listTar(
    archivePath: String,
    compressionMethod: CompressionMethod,
) {
    listTarAsync(
        archivePath = archivePath,
        compressionMethod = compressionMethod,
    ).await()
}
