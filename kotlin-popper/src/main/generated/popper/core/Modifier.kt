// Automatically generated - do not modify!

package popper.core

external interface Modifier<Options> {
    var name: ModifierName<Options>
    var enabled: Boolean
    var phase: ModifierPhases
    var requires: kotlinext.js.ReadonlyArray<String>?
    var requiresIfExists: kotlinext.js.ReadonlyArray<String>?
    var fn: (ModifierArguments<Options>) -> State?
    var effect: (ModifierArguments<Options>) -> (() -> Unit)?
    var options: Options?
    var data: kotlinext.js.Record<String, *>?
}
