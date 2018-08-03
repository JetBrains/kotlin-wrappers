@file:JsModule("react-redux")
package react.redux

import react.Component
import react.RProps
import react.RState
import react.ReactElement
import redux.Store

external class Provider : Component<ProviderProps, RState> {
    override fun render(): ReactElement?
}

external interface ProviderProps : RProps {
    var store: Store<*, *, *>
}
