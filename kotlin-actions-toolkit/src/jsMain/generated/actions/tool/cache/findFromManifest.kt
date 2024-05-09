// Automatically generated - do not modify!

package actions.tool.cache

import js.array.ReadonlyArray

suspend fun findFromManifest(
    versionSpec: String,
    stable: Boolean,
    manifest: ReadonlyArray<IToolRelease>,
): IToolRelease? =
    findFromManifestAsync(
        versionSpec = versionSpec,
        stable = stable,
        manifest = manifest,
    ).await()

suspend fun findFromManifest(
    versionSpec: String,
    stable: Boolean,
    manifest: ReadonlyArray<IToolRelease>,
    archFilter: String,
): IToolRelease? =
    findFromManifestAsync(
        versionSpec = versionSpec,
        stable = stable,
        manifest = manifest,
        archFilter = archFilter,
    ).await()
