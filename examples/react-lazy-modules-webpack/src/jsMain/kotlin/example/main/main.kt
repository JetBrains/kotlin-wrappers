package example.main

import example.app.App
import react.create
import react.dom.client.createRoot
import web.dom.document
import web.html.HtmlTagName.div
import web.html.HTMLElement

fun main() {
    val container = createContainer()
    createRoot(container)
        .render(App.create())
}

private fun createContainer(): HTMLElement {
    val container = document.createElement(div)
    container.style.apply {
        background = "red"
        width = "100%"
        height = "100%"
    }
    document.body.appendChild(container)
    return container
}
