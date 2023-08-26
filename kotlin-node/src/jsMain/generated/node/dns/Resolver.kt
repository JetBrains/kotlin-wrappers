@file:JsModule("node:dns")

package node.dns


/**
 * An independent resolver for DNS requests.
 *
 * Creating a new resolver uses the default server settings. Setting
 * the servers used for a resolver using `resolver.setServers()` does not affect
 * other resolvers:
 *
 * ```js
 * const { Resolver } = require('dns');
 * const resolver = new Resolver();
 * resolver.setServers(['4.4.4.4']);
 *
 * // This request will use the server at 4.4.4.4, independent of global settings.
 * resolver.resolve4('example.org', (err, addresses) => {
 *   // ...
 * });
 * ```
 *
 * The following methods from the `dns` module are available:
 *
 * * `resolver.getServers()`
 * * `resolver.resolve()`
 * * `resolver.resolve4()`
 * * `resolver.resolve6()`
 * * `resolver.resolveAny()`
 * * `resolver.resolveCaa()`
 * * `resolver.resolveCname()`
 * * `resolver.resolveMx()`
 * * `resolver.resolveNaptr()`
 * * `resolver.resolveNs()`
 * * `resolver.resolvePtr()`
 * * `resolver.resolveSoa()`
 * * `resolver.resolveSrv()`
 * * `resolver.resolveTxt()`
 * * `resolver.reverse()`
 * * `resolver.setServers()`
 * @since v8.3.0
 */

external class Resolver {
    constructor (options: ResolverOptions = definedExternally)

    /**
     * Cancel all outstanding DNS queries made by this resolver. The corresponding
     * callbacks will be called with an error with code `ECANCELLED`.
     * @since v8.3.0
     */
    fun cancel(): Unit
    var getServers: () -> js.core.ReadonlyArray<String>
    var resolve: Any?
    var resolve4: Any?
    var resolve6: Any?
    var resolveAny: Any?
    var resolveCaa: Any?
    var resolveCname: Any?
    var resolveMx: Any?
    var resolveNaptr: Any?
    var resolveNs: Any?
    var resolvePtr: Any?
    var resolveSoa: Any?
    var resolveSrv: Any?
    var resolveTxt: Any?
    var reverse: (ip: String, callback: (err: Any?, hostnames: js.core.ReadonlyArray<String>) -> Unit) -> Unit

    /**
     * The resolver instance will send its requests from the specified IP address.
     * This allows programs to specify outbound interfaces when used on multi-homed
     * systems.
     *
     * If a v4 or v6 address is not specified, it is set to the default, and the
     * operating system will choose a local address automatically.
     *
     * The resolver will use the v4 local address when making requests to IPv4 DNS
     * servers, and the v6 local address when making requests to IPv6 DNS servers.
     * The `rrtype` of resolution requests has no impact on the local address used.
     * @since v15.1.0, v14.17.0
     * @param [ipv4='0.0.0.0'] A string representation of an IPv4 address.
     * @param [ipv6='::0'] A string representation of an IPv6 address.
     */
    fun setLocalAddress(ipv4: String = definedExternally, ipv6: String = definedExternally): Unit
    var setServers: (servers: Array<out String>) -> Unit
}
