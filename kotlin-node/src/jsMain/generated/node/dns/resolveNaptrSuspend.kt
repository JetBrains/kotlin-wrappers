package node.dns

import js.promise.await


suspend fun resolveNaptr(hostname: String): js.core.ReadonlyArray<NaptrRecord> =
    resolveNaptrAsync(
        hostname
    ).await()
