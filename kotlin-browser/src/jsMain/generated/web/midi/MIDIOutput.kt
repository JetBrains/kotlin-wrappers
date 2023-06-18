// Automatically generated - do not modify!

package web.midi

import js.core.DOMHighResTimeStamp
import js.core.ReadonlyArray

sealed external class MIDIOutput :
    MIDIPort {
    fun send(
        data: ReadonlyArray<Double>,
        timestamp: DOMHighResTimeStamp = definedExternally,
    )
}
