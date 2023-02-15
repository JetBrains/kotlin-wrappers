// Automatically generated - do not modify!

package actions.artifact

import js.core.ReadonlyArray
import kotlinx.coroutines.await

suspend fun createEmptyFilesForArtifact(
    emptyFilesToCreate: ReadonlyArray<String>,
) {
    createEmptyFilesForArtifactAsync(
        emptyFilesToCreate = emptyFilesToCreate,
    ).await()
}
