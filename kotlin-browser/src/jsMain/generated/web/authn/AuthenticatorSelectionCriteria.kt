// Automatically generated - do not modify!

package web.authn

sealed external interface AuthenticatorSelectionCriteria {
    var authenticatorAttachment: AuthenticatorAttachment?
    var requireResidentKey: Boolean?
    var residentKey: ResidentKeyRequirement?
    var userVerification: UserVerificationRequirement?
}
