// Automatically generated - do not modify!

package web.credentials

/**
 * Available only in secure contexts.
 */
open external class DigitalCredential
private constructor() :
    Credential {
    val data: JsAny?
    val protocol: DigitalCredentialPresentationProtocol
    fun toJSON(): JsAny

    companion object {
        fun userAgentAllowsProtocol(protocol: String): Boolean
    }
}
