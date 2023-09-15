@file:JsModule("node:dns/promises")

package node.dns

import js.promise.Promise
import js.promise.await


external class Resolver {
    constructor (options: ResolverOptions = definedExternally)

    fun cancel(): Unit
    var getServers: () -> js.core.ReadonlyArray<String>

    @JsName("resolve")
    fun resolveAsync(hostname: String): Promise<js.core.ReadonlyArray<String>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolve(hostname: String): js.core.ReadonlyArray<String> =
        resolveAsync(
            hostname
        ).await()


    @JsName("resolve")
    fun resolveAsync(hostname: String, rrtype: ResourceRecordType.A): Promise<js.core.ReadonlyArray<String>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolve(hostname: String, rrtype: ResourceRecordType.A): js.core.ReadonlyArray<String> =
        resolveAsync(
            hostname, rrtype
        ).await()


    @JsName("resolve")
    fun resolveAsync(hostname: String, rrtype: ResourceRecordType.AAAA): Promise<js.core.ReadonlyArray<String>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolve(hostname: String, rrtype: ResourceRecordType.AAAA): js.core.ReadonlyArray<String> =
        resolveAsync(
            hostname, rrtype
        ).await()


    @JsName("resolve")
    fun resolveAsync(hostname: String, rrtype: ResourceRecordType.ANY): Promise<js.core.ReadonlyArray<AnyRecord>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolve(hostname: String, rrtype: ResourceRecordType.ANY): js.core.ReadonlyArray<AnyRecord> =
        resolveAsync(
            hostname, rrtype
        ).await()


    @JsName("resolve")
    fun resolveAsync(hostname: String, rrtype: ResourceRecordType.CAA): Promise<js.core.ReadonlyArray<CaaRecord>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolve(hostname: String, rrtype: ResourceRecordType.CAA): js.core.ReadonlyArray<CaaRecord> =
        resolveAsync(
            hostname, rrtype
        ).await()


    @JsName("resolve")
    fun resolveAsync(hostname: String, rrtype: ResourceRecordType.CNAME): Promise<js.core.ReadonlyArray<String>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolve(hostname: String, rrtype: ResourceRecordType.CNAME): js.core.ReadonlyArray<String> =
        resolveAsync(
            hostname, rrtype
        ).await()


    @JsName("resolve")
    fun resolveAsync(hostname: String, rrtype: ResourceRecordType.MX): Promise<js.core.ReadonlyArray<MxRecord>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolve(hostname: String, rrtype: ResourceRecordType.MX): js.core.ReadonlyArray<MxRecord> =
        resolveAsync(
            hostname, rrtype
        ).await()


    @JsName("resolve")
    fun resolveAsync(hostname: String, rrtype: ResourceRecordType.NAPTR): Promise<js.core.ReadonlyArray<NaptrRecord>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolve(hostname: String, rrtype: ResourceRecordType.NAPTR): js.core.ReadonlyArray<NaptrRecord> =
        resolveAsync(
            hostname, rrtype
        ).await()


    @JsName("resolve")
    fun resolveAsync(hostname: String, rrtype: ResourceRecordType.NS): Promise<js.core.ReadonlyArray<String>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolve(hostname: String, rrtype: ResourceRecordType.NS): js.core.ReadonlyArray<String> =
        resolveAsync(
            hostname, rrtype
        ).await()


    @JsName("resolve")
    fun resolveAsync(hostname: String, rrtype: ResourceRecordType.PTR): Promise<js.core.ReadonlyArray<String>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolve(hostname: String, rrtype: ResourceRecordType.PTR): js.core.ReadonlyArray<String> =
        resolveAsync(
            hostname, rrtype
        ).await()


    @JsName("resolve")
    fun resolveAsync(hostname: String, rrtype: ResourceRecordType.SOA): Promise<SoaRecord>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolve(hostname: String, rrtype: ResourceRecordType.SOA): SoaRecord =
        resolveAsync(
            hostname, rrtype
        ).await()


    @JsName("resolve")
    fun resolveAsync(hostname: String, rrtype: ResourceRecordType.SRV): Promise<js.core.ReadonlyArray<SrvRecord>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolve(hostname: String, rrtype: ResourceRecordType.SRV): js.core.ReadonlyArray<SrvRecord> =
        resolveAsync(
            hostname, rrtype
        ).await()


    @JsName("resolve")
    fun resolveAsync(hostname: String, rrtype: ResourceRecordType.TXT): Promise<js.core.ReadonlyArray<js.core.ReadonlyArray<String>>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolve(hostname: String, rrtype: ResourceRecordType.TXT): js.core.ReadonlyArray<js.core.ReadonlyArray<String>> =
        resolveAsync(
            hostname, rrtype
        ).await()


    @JsName("resolve")
    fun resolveAsync(hostname: String, rrtype: String): Promise<Any /* string[] | SoaRecord | AnyRecord[] | MxRecord[] | NaptrRecord[] | SrvRecord[] | string[][] */>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolve(hostname: String, rrtype: String): Any /* string[] | SoaRecord | AnyRecord[] | MxRecord[] | NaptrRecord[] | SrvRecord[] | string[][] */ =
        resolveAsync(
            hostname, rrtype
        ).await()


    @JsName("resolve4")
    fun resolve4Async(hostname: String): Promise<js.core.ReadonlyArray<String>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolve4(hostname: String): js.core.ReadonlyArray<String> =
        resolve4Async(
            hostname
        ).await()


    @JsName("resolve4")
    fun resolve4Async(hostname: String, options: ResolveWithTtlOptions): Promise<js.core.ReadonlyArray<RecordWithTtl>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolve4(hostname: String, options: ResolveWithTtlOptions): js.core.ReadonlyArray<RecordWithTtl> =
        resolve4Async(
            hostname, options
        ).await()


    @JsName("resolve4")
    fun resolve4Async(hostname: String, options: ResolveOptions): Promise<Any /* string[] | RecordWithTtl[] */>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolve4(hostname: String, options: ResolveOptions): Any /* string[] | RecordWithTtl[] */ =
        resolve4Async(
            hostname, options
        ).await()


    @JsName("resolve6")
    fun resolve6Async(hostname: String): Promise<js.core.ReadonlyArray<String>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolve6(hostname: String): js.core.ReadonlyArray<String> =
        resolve6Async(
            hostname
        ).await()


    @JsName("resolve6")
    fun resolve6Async(hostname: String, options: ResolveWithTtlOptions): Promise<js.core.ReadonlyArray<RecordWithTtl>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolve6(hostname: String, options: ResolveWithTtlOptions): js.core.ReadonlyArray<RecordWithTtl> =
        resolve6Async(
            hostname, options
        ).await()


    @JsName("resolve6")
    fun resolve6Async(hostname: String, options: ResolveOptions): Promise<Any /* string[] | RecordWithTtl[] */>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolve6(hostname: String, options: ResolveOptions): Any /* string[] | RecordWithTtl[] */ =
        resolve6Async(
            hostname, options
        ).await()


    @JsName("resolveAny")
    fun resolveAnyAsync(hostname: String): Promise<js.core.ReadonlyArray<AnyRecord>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolveAny(hostname: String): js.core.ReadonlyArray<AnyRecord> =
        resolveAnyAsync(
            hostname
        ).await()


    @JsName("resolveCname")
    fun resolveCnameAsync(hostname: String): Promise<js.core.ReadonlyArray<String>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolveCname(hostname: String): js.core.ReadonlyArray<String> =
        resolveCnameAsync(
            hostname
        ).await()


    @JsName("resolveMx")
    fun resolveMxAsync(hostname: String): Promise<js.core.ReadonlyArray<MxRecord>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolveMx(hostname: String): js.core.ReadonlyArray<MxRecord> =
        resolveMxAsync(
            hostname
        ).await()


    @JsName("resolveNaptr")
    fun resolveNaptrAsync(hostname: String): Promise<js.core.ReadonlyArray<NaptrRecord>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolveNaptr(hostname: String): js.core.ReadonlyArray<NaptrRecord> =
        resolveNaptrAsync(
            hostname
        ).await()


    @JsName("resolveNs")
    fun resolveNsAsync(hostname: String): Promise<js.core.ReadonlyArray<String>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolveNs(hostname: String): js.core.ReadonlyArray<String> =
        resolveNsAsync(
            hostname
        ).await()


    @JsName("resolvePtr")
    fun resolvePtrAsync(hostname: String): Promise<js.core.ReadonlyArray<String>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolvePtr(hostname: String): js.core.ReadonlyArray<String> =
        resolvePtrAsync(
            hostname
        ).await()


    @JsName("resolveSoa")
    fun resolveSoaAsync(hostname: String): Promise<SoaRecord>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolveSoa(hostname: String): SoaRecord =
        resolveSoaAsync(
            hostname
        ).await()


    @JsName("resolveSrv")
    fun resolveSrvAsync(hostname: String): Promise<js.core.ReadonlyArray<SrvRecord>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolveSrv(hostname: String): js.core.ReadonlyArray<SrvRecord> =
        resolveSrvAsync(
            hostname
        ).await()


    @JsName("resolveTxt")
    fun resolveTxtAsync(hostname: String): Promise<js.core.ReadonlyArray<js.core.ReadonlyArray<String>>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun resolveTxt(hostname: String): js.core.ReadonlyArray<js.core.ReadonlyArray<String>> =
        resolveTxtAsync(
            hostname
        ).await()


    @JsName("reverse")
    fun reverseAsync(ip: String): Promise<js.core.ReadonlyArray<String>>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
    )
    suspend inline fun reverse(ip: String): js.core.ReadonlyArray<String> =
        reverseAsync(
            ip
        ).await()

    fun setLocalAddress(ipv4: String = definedExternally, ipv6: String = definedExternally): Unit
    var setServers: (servers: Array<out String>) -> Unit
}
