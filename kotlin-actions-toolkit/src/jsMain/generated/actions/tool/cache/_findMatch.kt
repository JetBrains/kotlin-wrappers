// Automatically generated - do not modify!

package actions.tool.cache

import js.core.ReadonlyArray
import kotlinx.coroutines.await

suspend fun _findMatch(
    versionSpec: String,
    stable: Boolean,
    candidates: ReadonlyArray<IToolRelease>,
    archFilter: String,
): IToolRelease? =
    _findMatchAsync(
        versionSpec = versionSpec,
        stable = stable,
        candidates = candidates,
        archFilter = archFilter,
    ).await()
