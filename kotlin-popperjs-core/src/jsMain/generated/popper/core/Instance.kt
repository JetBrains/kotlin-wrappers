// Automatically generated - do not modify!

package popper.core

import js.promise.Promise

external interface Instance {
    var state: State
    var destroy: () -> Unit
    var forceUpdate: () -> Unit
    var update: () -> Promise<State>
    var setOptions: (SetAction<OptionsGeneric<*>>) -> Promise<State>
}
