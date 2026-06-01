// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface SelectWebauthnAccountDetails {
    /**
     * The relying party identifier from the WebAuthn request.
     */
    var relyingPartyId: String
    var accounts: js.array.ReadonlyArray<WebAuthnAccount>

    /**
     * The frame initiating this event. May be `null` if accessed after the frame has
     * either navigated or been destroyed.
     */
    var frame: WebFrameMain?
}
