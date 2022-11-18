// Automatically generated - do not modify!

package webrtc

external class RTCDTMFSender : web.events.EventTarget {
    val canInsertDTMF: Boolean
    var ontonechange: ((event: RTCDTMFToneChangeEvent) -> Unit)?
    val toneBuffer: String
    fun insertDTMF(
        tones: String,
        duration: Number = definedExternally,
        interToneGap: Number = definedExternally,
    )
}
