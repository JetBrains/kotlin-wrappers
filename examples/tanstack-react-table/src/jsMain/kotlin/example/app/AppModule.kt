package example.app

import example.selection.SelectionModule
import react.FC
import react.PropsWithChildren
import react.invoke
import react.unaryPlus
import react.use.useConstant
import tanstack.query.core.QueryClient
import tanstack.react.query.QueryClientProvider

internal val AppModule = FC<PropsWithChildren> { props ->
    val queryClient = useConstant(::QueryClient)

    QueryClientProvider {
        client = queryClient

        SelectionModule {
            +props.children
        }
    }
}
