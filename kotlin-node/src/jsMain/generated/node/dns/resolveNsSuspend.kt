package node.dns

import js.promise.await


suspend fun resolveNs(hostname: String): js.core.ReadonlyArray<String> =
    resolveNsAsync(
        hostname
    ).await()
