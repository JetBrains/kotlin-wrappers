// Automatically generated - do not modify!

package actions.tool.cache

import js.core.ReadonlyArray
import js.promise.await

suspend fun getManifestFromRepo(
    owner: String,
    repo: String,
): ReadonlyArray<IToolRelease> =
    getManifestFromRepoAsync(
        owner = owner,
        repo = repo,
    ).await()

suspend fun getManifestFromRepo(
    owner: String,
    repo: String,
    auth: String,
): ReadonlyArray<IToolRelease> =
    getManifestFromRepoAsync(
        owner = owner,
        repo = repo,
        auth = auth,
    ).await()

suspend fun getManifestFromRepo(
    owner: String,
    repo: String,
    auth: String,
    branch: String,
): ReadonlyArray<IToolRelease> =
    getManifestFromRepoAsync(
        owner = owner,
        repo = repo,
        auth = auth,
        branch = branch,
    ).await()
