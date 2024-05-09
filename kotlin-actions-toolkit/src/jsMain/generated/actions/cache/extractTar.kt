// Automatically generated - do not modify!

package actions.cache
suspend fun extractTar(
    archivePath: String,
    compressionMethod: CompressionMethod,
) {
    extractTarAsync(
        archivePath = archivePath,
        compressionMethod = compressionMethod,
    ).await()
}
