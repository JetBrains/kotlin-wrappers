// Automatically generated - do not modify!

package popper.core

external interface Instance {
    var state: State
    var destroy: () -> Unit
    var forceUpdate: () -> Unit
    var update: () -> kotlin.js.Promise<State>
    var setOptions: (OptionsGeneric<*>) -> kotlin.js.Promise<State>
}
