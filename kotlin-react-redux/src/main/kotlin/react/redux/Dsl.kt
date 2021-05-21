package react.redux

import react.*
import redux.*

fun RBuilder.provider(store: Store<*, *, *>, context: RContext<*>? = null, handler: RHandler<ProviderProps>) =
    child<ProviderProps, Provider> {
        attrs.store = store
        if (context != null) attrs.context = context
        handler()
    }
