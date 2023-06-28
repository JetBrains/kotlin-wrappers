// Automatically generated - do not modify!

package actions.cache

import js.promise.await

suspend fun extractTar(
    archivePath: String,
    compressionMethod: CompressionMethod,
) {
    extractTarAsync(
        archivePath = archivePath,
        compressionMethod = compressionMethod,
    ).await()
}
