package node.dns

import js.promise.await


suspend fun resolveCname(hostname: String): js.core.ReadonlyArray<String> =
    resolveCnameAsync(
        hostname
    ).await()
