@file:JsModule("node:dns/promises")

package node.dns

import js.promise.Promise

/**
 * Uses the DNS protocol to resolve a host name (e.g. `'nodejs.org'`) into an array
 * of the resource records. When successful, the `Promise` is resolved with an
 * array of resource records. The type and structure of individual results vary
 * based on `rrtype`:
 *
 * <omitted>
 *
 * On error, the `Promise` is rejected with an `Error` object, where `err.code`is one of the `DNS error codes`.
 * @since v10.6.0
 * @param hostname Host name to resolve.
 * @param [rrtype='A'] Resource record type.
 */

@JsName("resolve")
external fun resolveAsync(hostname: String): Promise<js.core.ReadonlyArray<String>>


@JsName("resolve")
external fun resolveAsync(hostname: String, rrtype: ResourceRecordType.A): Promise<js.core.ReadonlyArray<String>>


@JsName("resolve")
external fun resolveAsync(hostname: String, rrtype: ResourceRecordType.AAAA): Promise<js.core.ReadonlyArray<String>>


@JsName("resolve")
external fun resolveAsync(hostname: String, rrtype: ResourceRecordType.ANY): Promise<js.core.ReadonlyArray<AnyRecord>>


@JsName("resolve")
external fun resolveAsync(hostname: String, rrtype: ResourceRecordType.CAA): Promise<js.core.ReadonlyArray<CaaRecord>>


@JsName("resolve")
external fun resolveAsync(hostname: String, rrtype: ResourceRecordType.CNAME): Promise<js.core.ReadonlyArray<String>>


@JsName("resolve")
external fun resolveAsync(hostname: String, rrtype: ResourceRecordType.MX): Promise<js.core.ReadonlyArray<MxRecord>>


@JsName("resolve")
external fun resolveAsync(hostname: String, rrtype: ResourceRecordType.NAPTR): Promise<js.core.ReadonlyArray<NaptrRecord>>


@JsName("resolve")
external fun resolveAsync(hostname: String, rrtype: ResourceRecordType.NS): Promise<js.core.ReadonlyArray<String>>


@JsName("resolve")
external fun resolveAsync(hostname: String, rrtype: ResourceRecordType.PTR): Promise<js.core.ReadonlyArray<String>>


@JsName("resolve")
external fun resolveAsync(hostname: String, rrtype: ResourceRecordType.SOA): Promise<SoaRecord>


@JsName("resolve")
external fun resolveAsync(hostname: String, rrtype: ResourceRecordType.SRV): Promise<js.core.ReadonlyArray<SrvRecord>>


@JsName("resolve")
external fun resolveAsync(hostname: String, rrtype: ResourceRecordType.TXT): Promise<js.core.ReadonlyArray<js.core.ReadonlyArray<String>>>


@JsName("resolve")
external fun resolveAsync(hostname: String, rrtype: String): Promise<Any /* string[] | MxRecord[] | NaptrRecord[] | SoaRecord | SrvRecord[] | string[][] | AnyRecord[] */>
