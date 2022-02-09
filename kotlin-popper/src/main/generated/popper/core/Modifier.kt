// Automatically generated - do not modify!

package popper.core

external interface Modifier<Options> {
    var name: ModifierName<Options>
    var enabled: Boolean
    var phase: ModifierPhases
    var requires: kotlinx.js.ReadonlyArray<String>?
    var requiresIfExists: kotlinx.js.ReadonlyArray<String>?
    var fn: (ModifierArguments<Options>) -> State?
    var effect: (ModifierArguments<Options>) -> (() -> Unit)?
    var options: Options?
    var data: kotlinx.js.Record<String, *>?
}
