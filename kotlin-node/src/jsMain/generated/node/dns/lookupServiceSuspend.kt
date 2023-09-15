package node.dns

import js.promise.await


suspend fun lookupService(address: String, port: Double): LookupServiceResultPayload =
    lookupServiceAsync(
        address, port
    ).await()
