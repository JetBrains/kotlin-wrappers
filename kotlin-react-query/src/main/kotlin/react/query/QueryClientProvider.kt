// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

package react.query

import react.ComponentClass

external val useQueryClient: () -> QueryClient

external interface QueryClientProviderProps : react.RProps {
    var client: QueryClient
    var contextSharing: Boolean
}

external val QueryClientProvider: ComponentClass<QueryClientProviderProps>
