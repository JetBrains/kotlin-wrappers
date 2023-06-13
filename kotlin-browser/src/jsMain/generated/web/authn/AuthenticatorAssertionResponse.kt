// Automatically generated - do not modify!

package web.authn

import js.buffer.ArrayBuffer

sealed external class AuthenticatorAssertionResponse :
    AuthenticatorResponse {
    val authenticatorData: ArrayBuffer
    val signature: ArrayBuffer
    val userHandle: ArrayBuffer?
}
