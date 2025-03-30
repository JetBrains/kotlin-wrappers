// Automatically generated - do not modify!

package popper.core

import js.objects.JsPlainObject
import js.promise.Promise

@JsPlainObject
external interface Instance {
    val state: State
    val destroy: () -> Unit
    val forceUpdate: () -> Unit
    val update: () -> Promise<State>
    val setOptions: (SetAction<OptionsGeneric<*>>) -> Promise<State>
}
