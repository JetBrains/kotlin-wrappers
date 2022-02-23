// Automatically generated - do not modify!

package popper.core

import kotlinx.js.ReadonlyArray
import kotlinx.js.Record

external interface Modifier<Options> {
    var name: ModifierName<Options>
    var enabled: Boolean
    var phase: ModifierPhases
    var requires: ReadonlyArray<String>?
    var requiresIfExists: ReadonlyArray<String>?
    var fn: (ModifierArguments<Options>) -> State?
    var effect: (ModifierArguments<Options>) -> (() -> Unit)?
    var options: Options?
    var data: Record<String, *>?
}
