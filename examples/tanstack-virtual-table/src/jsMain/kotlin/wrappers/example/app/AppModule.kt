package wrappers.example.app

import react.FC
import react.PropsWithChildren
import react.use.useConstant
import tanstack.query.core.QueryClient
import tanstack.react.query.QueryClientProvider

internal val AppModule = FC<PropsWithChildren> { props ->
    val queryClient = useConstant(::QueryClient)

    QueryClientProvider {
        client = queryClient

        +props.children
    }
}
