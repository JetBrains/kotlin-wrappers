package node.dns

import js.promise.await


suspend fun resolveAny(hostname: String): js.core.ReadonlyArray<AnyRecord> =
    resolveAnyAsync(
        hostname
    ).await()
