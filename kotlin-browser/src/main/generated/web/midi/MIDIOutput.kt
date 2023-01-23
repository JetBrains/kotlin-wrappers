// Automatically generated - do not modify!

package web.midi

import js.core.HighResTimeStamp
import js.core.ReadonlyArray

sealed external class MIDIOutput :
    MIDIPort {
    fun send(
        data: ReadonlyArray<Double>,
        timestamp: HighResTimeStamp = definedExternally,
    )
}
