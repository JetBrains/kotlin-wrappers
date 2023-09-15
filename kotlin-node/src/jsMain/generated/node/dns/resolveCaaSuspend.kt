package node.dns

import js.promise.await


suspend fun resolveCaa(hostname: String): js.core.ReadonlyArray<CaaRecord> =
    resolveCaaAsync(
        hostname
    ).await()
