package example

import example.app.App
import kotlinx.coroutines.flow.first
import react.create
import react.dom.client.createRoot
import web.dom.document
import web.html.HtmlTagName.div
import web.window.loadEvent
import web.window.window

suspend fun main() {
    window.loadEvent.first()

    val container = document.createElement(div)
    document.body.appendChild(container)

    createRoot(container)
        .render(App.create())
}
