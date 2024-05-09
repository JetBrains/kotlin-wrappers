// Automatically generated - do not modify!

package actions.cache
suspend fun listTar(
    archivePath: String,
    compressionMethod: CompressionMethod,
) {
    listTarAsync(
        archivePath = archivePath,
        compressionMethod = compressionMethod,
    ).await()
}
