// Automatically generated - do not modify!

package web.authn

import js.objects.JsPlainObject

@JsPlainObject
external interface AuthenticatorSelectionCriteria {
    val authenticatorAttachment: AuthenticatorAttachment?
    val requireResidentKey: Boolean?
    val residentKey: ResidentKeyRequirement?
    val userVerification: UserVerificationRequirement?
}
