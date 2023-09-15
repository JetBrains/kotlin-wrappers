package node.dns

import js.promise.await


suspend fun resolveSoa(hostname: String): SoaRecord =
    resolveSoaAsync(
        hostname
    ).await()
