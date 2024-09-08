package team.karakum

import react.FC
import react.Props
import react.create
import react.dom.client.createRoot
import tanstack.query.core.QueryClient
import tanstack.react.query.QueryClientProvider
import team.karakum.components.Header
import team.karakum.components.LoadingIndicator
import team.karakum.components.UserInfo
import web.dom.document
import web.html.HTML.div

fun main() {
    val root = document.createElement(div)
    document.body.appendChild(root)

    createRoot(root)
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
