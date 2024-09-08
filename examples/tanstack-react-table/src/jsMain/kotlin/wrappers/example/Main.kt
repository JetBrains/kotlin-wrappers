package wrappers.example

import react.create
import react.dom.client.createRoot
import web.dom.document
import web.html.HTML.div
import wrappers.example.app.App

fun main() {
    val container = document.createElement(div)
    document.body.appendChild(container)

    createRoot(container)
        .render(App.create())
}
