// Automatically generated - do not modify!

package electron.core

external interface ClientCertRequestParams {
    /**
     * the hostname of the site requiring a client certificate
     */
    var hostname: String

    /**
     * the token (or slot) name of the cryptographic device
     */
    var tokenName: String

    /**
     * whether there have been previous failed attempts at prompting the password
     */
    var isRetry: Boolean
}
