package wrappers.example

import react.FC
import react.Props
import react.create
import react.dom.client.createRoot
import tanstack.query.core.QueryClient
import tanstack.react.query.QueryClientProvider
import web.dom.document
import web.html.HTML.div
import wrappers.example.components.Header
import wrappers.example.components.LoadingIndicator
import wrappers.example.components.UserInfo

fun main() {
    val container = document.createElement(div)
    document.body.appendChild(container)

    createRoot(container)
        .render(App.create())
}

private val QueryClient = QueryClient()

private val App = FC<Props> {
    QueryClientProvider {
        client = QueryClient

        Header()
        LoadingIndicator()
        UserInfo()
    }
}
