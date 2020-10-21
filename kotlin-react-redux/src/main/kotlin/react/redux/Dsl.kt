package react.redux

import react.RBuilder
import react.RContext
import react.RHandler
import redux.Store

fun RBuilder.provider(store: Store<*, *, *>, context: RContext<*>? = null, handler: RHandler<ProviderProps>) =
    child<ProviderProps, Provider> {
        attrs.store = store
        if (context != null) attrs.context = context
        handler()
    }
