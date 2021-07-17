package react.redux

import react.*
import redux.Store

fun RBuilder.provider(
    store: Store<*, *, *>,
    context: Context<*>? = null,
    handler: RHandler<ProviderProps>,
) {
    child<ProviderProps, Provider> {
        attrs.store = store
        if (context != null) attrs.context = context
        handler()
    }
}

