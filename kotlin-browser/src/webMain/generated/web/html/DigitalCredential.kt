// Automatically generated - do not modify!

package web.html

import web.credentials.Credential
import kotlin.js.JsAny

/**
 * Available only in secure contexts.
 */
open external class DigitalCredential
private constructor() :
    Credential {
    val data: JsAny?
    val protocol: String
    fun toJSON(): JsAny

    companion object {
        fun userAgentAllowsProtocol(protocol: String): Boolean
    }
}
