package react.redux

import react.RBuilder
import react.RHandler
import redux.Store

fun RBuilder.provider(store: Store<*, *, *>, handler: RHandler<ProviderProps>) =
        child<ProviderProps, Provider> {
            attrs.store = store
            handler()
        }
