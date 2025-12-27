// Automatically generated - do not modify!

package node.dns

@seskar.js.JsAsync
external suspend fun resolve(hostname: String): js.array.ReadonlyArray<String>

@seskar.js.JsAsync
external suspend fun resolve(
    hostname: String,
    rrtype: ResourceRecordType.StringRecord,
): js.array.ReadonlyArray<String>

@seskar.js.JsAsync
external suspend fun resolve(
    hostname: String,
    rrtype: ResourceRecordType.ANY,
): js.array.ReadonlyArray<AnyRecord>

@seskar.js.JsAsync
external suspend fun resolve(
    hostname: String,
    rrtype: ResourceRecordType.CAA,
): js.array.ReadonlyArray<CaaRecord>

@seskar.js.JsAsync
external suspend fun resolve(
    hostname: String,
    rrtype: ResourceRecordType.MX,
): js.array.ReadonlyArray<MxRecord>

@seskar.js.JsAsync
external suspend fun resolve(
    hostname: String,
    rrtype: ResourceRecordType.NAPTR,
): js.array.ReadonlyArray<NaptrRecord>

@seskar.js.JsAsync
external suspend fun resolve(
    hostname: String,
    rrtype: ResourceRecordType.SOA,
): SoaRecord

@seskar.js.JsAsync
external suspend fun resolve(
    hostname: String,
    rrtype: ResourceRecordType.SRV,
): js.array.ReadonlyArray<SrvRecord>

@seskar.js.JsAsync
external suspend fun resolve(
    hostname: String,
    rrtype: ResourceRecordType.TLSA,
): js.array.ReadonlyArray<TlsaRecord>

@seskar.js.JsAsync
external suspend fun resolve(
    hostname: String,
    rrtype: ResourceRecordType.TXT,
): js.array.ReadonlyArray<js.array.ReadonlyArray<String>>

@seskar.js.JsAsync
external suspend fun resolve(
    hostname: String,
    rrtype: String,
): Any // string[] | CaaRecord[] | MxRecord[] | NaptrRecord[] | SoaRecord | SrvRecord[] | TlsaRecord[] | string[][] | AnyRecord[]
