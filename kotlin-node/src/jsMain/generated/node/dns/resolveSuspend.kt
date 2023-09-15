package node.dns

import js.promise.await


suspend fun resolve(hostname: String): js.core.ReadonlyArray<String> =
    resolveAsync(
        hostname
    ).await()


suspend fun resolve(hostname: String, rrtype: ResourceRecordType.A): js.core.ReadonlyArray<String> =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(hostname: String, rrtype: ResourceRecordType.AAAA): js.core.ReadonlyArray<String> =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(hostname: String, rrtype: ResourceRecordType.ANY): js.core.ReadonlyArray<AnyRecord> =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(hostname: String, rrtype: ResourceRecordType.CAA): js.core.ReadonlyArray<CaaRecord> =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(hostname: String, rrtype: ResourceRecordType.CNAME): js.core.ReadonlyArray<String> =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(hostname: String, rrtype: ResourceRecordType.MX): js.core.ReadonlyArray<MxRecord> =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(hostname: String, rrtype: ResourceRecordType.NAPTR): js.core.ReadonlyArray<NaptrRecord> =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(hostname: String, rrtype: ResourceRecordType.NS): js.core.ReadonlyArray<String> =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(hostname: String, rrtype: ResourceRecordType.PTR): js.core.ReadonlyArray<String> =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(hostname: String, rrtype: ResourceRecordType.SOA): SoaRecord =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(hostname: String, rrtype: ResourceRecordType.SRV): js.core.ReadonlyArray<SrvRecord> =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(hostname: String, rrtype: ResourceRecordType.TXT): js.core.ReadonlyArray<js.core.ReadonlyArray<String>> =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(hostname: String, rrtype: String): Any /* string[] | MxRecord[] | NaptrRecord[] | SoaRecord | SrvRecord[] | string[][] | AnyRecord[] */ =
    resolveAsync(
        hostname, rrtype
    ).await()
