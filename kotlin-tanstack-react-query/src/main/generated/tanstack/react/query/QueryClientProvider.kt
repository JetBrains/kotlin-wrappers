// Automatically generated - do not modify!

@file:JsModule("@tanstack/react-query")
@file:JsNonModule

package tanstack.react.query

import tanstack.query.core.QueryClient

external val defaultContext: react.Context<QueryClient?>

external fun useQueryClient(options: ContextOptions = definedExternally): QueryClient

external interface QueryClientProviderProps : react.PropsWithChildren {
    var client: QueryClient
}

external val QueryClientProvider: react.FC<QueryClientProviderProps>
