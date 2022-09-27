// Automatically generated - do not modify!

package webrtc

external class RTCDTMFSender : org.w3c.dom.events.EventTarget {
    val canInsertDTMF: Boolean
    var ontonechange: ((event: RTCDTMFToneChangeEvent) -> Unit)?
    val toneBuffer: String
    fun insertDTMF(
        tones: String,
        duration: Number = definedExternally,
        interToneGap: Number = definedExternally,
    )
    // addEventListener<K extends keyof RTCDTMFSenderEventMap>(type: K, listener: (this: RTCDTMFSender, ev: RTCDTMFSenderEventMap[K]) => any, options?: boolean | AddEventListenerOptions): void
    // addEventListener(type: string, listener: EventListenerOrEventListenerObject, options?: boolean | AddEventListenerOptions): void
    // removeEventListener<K extends keyof RTCDTMFSenderEventMap>(type: K, listener: (this: RTCDTMFSender, ev: RTCDTMFSenderEventMap[K]) => any, options?: boolean | EventListenerOptions): void
    // removeEventListener(type: string, listener: EventListenerOrEventListenerObject, options?: boolean | EventListenerOptions): void
}
