package react.redux

import react.Context
import react.RBuilder
import react.RHandler
import react.child
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
