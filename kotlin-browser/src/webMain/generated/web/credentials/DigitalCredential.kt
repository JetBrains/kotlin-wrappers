// Automatically generated - do not modify!

package web.credentials

/**
 * Available only in secure contexts.
 */
open external class DigitalCredential
private constructor() :
    Credential {
    open val data: JsAny?
    open val protocol: DigitalCredentialPresentationProtocol
    open fun toJSON(): JsAny

    companion object {
        fun userAgentAllowsProtocol(protocol: String): Boolean
    }
}
