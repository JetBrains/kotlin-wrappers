// Automatically generated - do not modify!

package web.authn

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface AuthenticatorSelectionCriteria {
    var authenticatorAttachment: AuthenticatorAttachment?
    var requireResidentKey: Boolean?
    var residentKey: ResidentKeyRequirement?
    var userVerification: UserVerificationRequirement?
}
