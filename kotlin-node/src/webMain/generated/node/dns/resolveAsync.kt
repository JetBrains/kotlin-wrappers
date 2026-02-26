// Automatically generated - do not modify!

@file:JsModule("node:dns/promises")

package node.dns

/**
 * Uses the DNS protocol to resolve a host name (e.g. `'nodejs.org'`) into an array
 * of the resource records. When successful, the `Promise` is resolved with an
 * array of resource records. The type and structure of individual results vary
 * based on `rrtype`:
 *
 * <omitted>
 *
 * On error, the `Promise` is rejected with an [`Error`](https://nodejs.org/docs/latest-v20.x/api/errors.html#class-error) object, where `err.code`
 * is one of the [DNS error codes](https://nodejs.org/docs/latest-v20.x/api/dns.html#error-codes).
 * @since v10.6.0
 * @param hostname Host name to resolve.
 * @param [rrtype='A'] Resource record type.
 */
@JsName("resolve")
external fun resolveAsync(hostname: String): js.promise.Promise<js.array.ReadonlyArray<String>>

@JsName("resolve")
external fun resolveAsync(
    hostname: String,
    rrtype: ResourceRecordType.StringRecord,
): js.promise.Promise<js.array.ReadonlyArray<String>>

@JsName("resolve")
external fun resolveAsync(
    hostname: String,
    rrtype: ResourceRecordType.ANY,
): js.promise.Promise<js.array.ReadonlyArray<AnyRecord>>

@JsName("resolve")
external fun resolveAsync(
    hostname: String,
    rrtype: ResourceRecordType.CAA,
): js.promise.Promise<js.array.ReadonlyArray<CaaRecord>>

@JsName("resolve")
external fun resolveAsync(
    hostname: String,
    rrtype: ResourceRecordType.MX,
): js.promise.Promise<js.array.ReadonlyArray<MxRecord>>

@JsName("resolve")
external fun resolveAsync(
    hostname: String,
    rrtype: ResourceRecordType.NAPTR,
): js.promise.Promise<js.array.ReadonlyArray<NaptrRecord>>

@JsName("resolve")
external fun resolveAsync(
    hostname: String,
    rrtype: ResourceRecordType.SOA,
): js.promise.Promise<SoaRecord>

@JsName("resolve")
external fun resolveAsync(
    hostname: String,
    rrtype: ResourceRecordType.SRV,
): js.promise.Promise<js.array.ReadonlyArray<SrvRecord>>

@JsName("resolve")
external fun resolveAsync(
    hostname: String,
    rrtype: ResourceRecordType.TLSA,
): js.promise.Promise<js.array.ReadonlyArray<TlsaRecord>>

@JsName("resolve")
external fun resolveAsync(
    hostname: String,
    rrtype: ResourceRecordType.TXT,
): js.promise.Promise<js.array.ReadonlyArray<js.array.ReadonlyArray<String>>>

@JsName("resolve")
external fun resolveAsync(
    hostname: String,
    rrtype: String,
): js.promise.Promise<Any /* string[] | CaaRecord[] | MxRecord[] | NaptrRecord[] | SoaRecord | SrvRecord[] | TlsaRecord[] | string[][] | AnyRecord[] */>
