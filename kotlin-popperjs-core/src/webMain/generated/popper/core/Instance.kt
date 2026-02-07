// Automatically generated - do not modify!

package popper.core

import js.promise.Promise
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface Instance {
    val state: State
    val destroy: () -> Unit
    val forceUpdate: () -> Unit
    val update: () -> Promise<State>
    val setOptions: (SetAction<OptionsGeneric<*>>) -> Promise<State>
}
