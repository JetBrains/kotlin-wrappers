// Automatically generated - do not modify!

package web.rtc

import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/createOffer#options)
 */
@JsPlainObject
external interface RTCOfferOptions :
    RTCOfferAnswerOptions {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/createOffer#icerestart)
     */
    var iceRestart: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/createOffer#offertoreceiveaudio)
     */
    var offerToReceiveAudio: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/createOffer#offertoreceivevideo)
     */
    var offerToReceiveVideo: Boolean?
}
