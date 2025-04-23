package wrappers.example

import react.create
import react.dom.client.createRoot
import web.dom.document
import web.events.once
import web.html.HTML.div
import web.window.window
import wrappers.example.app.App

suspend fun main() {
    window.loadEvent.once()

    val container = document.createElement(div)
    document.body.appendChild(container)

    createRoot(container)
        .render(App.create())
}
