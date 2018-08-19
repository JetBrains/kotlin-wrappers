package react.redux

import react.*
import redux.*

fun RBuilder.provider(store: Store<*, *, *>, handler: RHandler<ProviderProps>) =
    child<ProviderProps, Provider> {
        attrs.store = store
        handler()
    }
