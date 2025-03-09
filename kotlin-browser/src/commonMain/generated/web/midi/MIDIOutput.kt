// Automatically generated - do not modify!

package web.midi

import js.array.ReadonlyArray
import web.time.DOMHighResTimeStamp

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIOutput)
 */
external class MIDIOutput
private constructor() :
    MIDIPort {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIOutput/send)
     */
    fun send(
        data: ReadonlyArray<Double>,
        timestamp: DOMHighResTimeStamp = definedExternally,
    )
}
