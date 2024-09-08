package wrappers.example.app

import react.FC
import react.Props
import tanstack.query.core.QueryClient
import tanstack.react.query.QueryClientProvider
import wrappers.example.components.Header
import wrappers.example.components.LoadingIndicator
import wrappers.example.components.UserInfo

private val QueryClient = QueryClient()

internal val App = FC<Props> {
    QueryClientProvider {
        client = QueryClient

        Header()
        LoadingIndicator()
        UserInfo()
    }
}
