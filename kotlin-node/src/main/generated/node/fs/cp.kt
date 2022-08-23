// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await

suspend fun cp(
    source: Any, /* string | URL */
    destination: Any, /* string | URL */
) {
    cpAsync(
        source = source,
        destination = destination,
    ).await()
}

suspend fun cp(
    source: Any, /* string | URL */
    destination: Any, /* string | URL */
    opts: CopyOptions,
) {
    cpAsync(
        source = source,
        destination = destination,
        opts = opts,
    ).await()
}
