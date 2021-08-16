// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

package react.query

external val useQueryClient: () -> QueryClient

external interface QueryClientProviderProps : react.PropsWithChildren {
    var client: QueryClient
    var contextSharing: Boolean
}

external val QueryClientProvider: react.FC<QueryClientProviderProps>
