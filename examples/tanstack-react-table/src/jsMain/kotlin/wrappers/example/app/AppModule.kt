package wrappers.example.app

import react.FC
import react.PropsWithChildren
import react.use.useConstant
import tanstack.query.core.QueryClient
import tanstack.react.query.QueryClientProvider
import wrappers.example.selection.SelectionModule

internal val AppModule = FC<PropsWithChildren> { props ->
    val queryClient = useConstant(::QueryClient)

    QueryClientProvider {
        client = queryClient

        SelectionModule {
            +props.children
        }
    }
}
