// Automatically generated - do not modify!

package web.midi

import js.collections.ReadonlyMap
import js.core.JsString

/**
 * The **`MIDIOutputMap`** read-only interface of the Web MIDI API provides the set of MIDI output ports that are currently available.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIOutputMap)
 */
sealed /* final */
external class MIDIOutputMap
protected /* private */ constructor() :
    ReadonlyMap<JsString, MIDIOutput>
