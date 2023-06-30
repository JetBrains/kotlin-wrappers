package electron.core

import kotlin.js.Promise


external interface Net {
// Docs: https://electronjs.org/docs/api/net
    /**
     * Whether there is currently internet connection.
     *
     * A return value of `false` is a pretty strong indicator that the user won't be
     * able to connect to remote sites. However, a return value of `true` is
     * inconclusive; even if some link is up, it is uncertain whether a particular
     * connection attempt to a particular remote site will be successful.
     */
    fun isOnline(): Boolean

    /**
     * Creates a `ClientRequest` instance using the provided `options` which are
     * directly forwarded to the `ClientRequest` constructor. The `net.request` method
     * would be used to issue both secure and insecure HTTP requests according to the
     * specified protocol scheme in the `options` object.
     */
    fun request(options: (ClientRequestConstructorOptions)): ClientRequest

    fun request(options: (String)): ClientRequest

    /**
     * Resolves with the resolved IP addresses for the `host`.
     *
     * This method will resolve hosts from the default session. To resolve a host from
     * another session, use ses.resolveHost().
     */
    fun resolveHost(host: String, options: ResolveHostOptions = definedExternally): Promise<electron.ResolvedHost>

    /**
     * A `boolean` property. Whether there is currently internet connection.
     *
     * A return value of `false` is a pretty strong indicator that the user won't be
     * able to connect to remote sites. However, a return value of `true` is
     * inconclusive; even if some link is up, it is uncertain whether a particular
     * connection attempt to a particular remote site will be successful.
     *
     */
    val online: Boolean
}
