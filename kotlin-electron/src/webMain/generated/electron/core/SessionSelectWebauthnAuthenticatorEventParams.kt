// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface SessionSelectWebauthnAuthenticatorEventParams {
    /**
     * The relying party identifier from the WebAuthn request.
     */
    var relyingPartyId: String

    /**
     * The available authenticator names. Possible values are `'touchID'` and
     * `'platformPasskeys'`.
     */
    var authenticators: js.array.ReadonlyArray<String>

    /**
     * The frame initiating this event. May be `null` if accessed after the frame has
     * either navigated or been destroyed.
     */
    var frame: WebFrameMain?
}
