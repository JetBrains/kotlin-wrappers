// Automatically generated - do not modify!

package actions.io

import kotlinx.coroutines.await

suspend fun exists(
    fsPath: String,
): Boolean =
    existsAsync(
        fsPath = fsPath,
    ).await()
