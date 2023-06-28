// Automatically generated - do not modify!

package actions.glob

import js.promise.await

suspend fun create(
    patterns: String,
): Globber =
    createAsync(
        patterns = patterns,
    ).await()

suspend fun create(
    patterns: String,
    options: GlobOptions,
): Globber =
    createAsync(
        patterns = patterns,
        options = options,
    ).await()
