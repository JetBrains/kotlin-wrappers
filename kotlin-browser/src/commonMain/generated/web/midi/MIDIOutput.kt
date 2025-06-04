// Automatically generated - do not modify!

package web.midi

import js.array.ReadonlyArray
import js.core.JsDouble
import web.time.DOMHighResTimeStamp
import kotlin.js.definedExternally

/**
 * The **`MIDIOutput`** interface of the Web MIDI API provides methods to add messages to the queue of an output device, and to clear the queue of messages.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIOutput)
 */
external class MIDIOutput
private constructor() :
    MIDIPort {
    /**
     * The **`send()`** method of the MIDIOutput interface queues messages for the corresponding MIDI port.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIOutput/send)
     */
    fun send(
        data: ReadonlyArray<JsDouble>,
        timestamp: DOMHighResTimeStamp = definedExternally,
    )
}
