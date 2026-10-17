// Automatically generated - do not modify!

package web.midi

import js.buffer.ArrayBuffer
import js.typedarrays.Uint8Array
import kotlinx.js.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIMessageEvent/MIDIMessageEvent#options)
 */
@JsPlainObject
external interface MIDIMessageEventInit :
    EventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIMessageEvent/MIDIMessageEvent#data)
     */
    var data: Uint8Array<ArrayBuffer>?
}
