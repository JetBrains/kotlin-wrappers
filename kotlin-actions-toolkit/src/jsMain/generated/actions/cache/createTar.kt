// Automatically generated - do not modify!

package actions.cache

import js.core.ReadonlyArray
import kotlinx.coroutines.await

suspend fun createTar(
    archiveFolder: String,
    sourceDirectories: ReadonlyArray<String>,
    compressionMethod: CompressionMethod,
) {
    createTarAsync(
        archiveFolder = archiveFolder,
        sourceDirectories = sourceDirectories,
        compressionMethod = compressionMethod,
    ).await()
}
