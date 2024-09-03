package wrappers.example.main

import react.create
import react.dom.client.createRoot
import web.dom.document
import web.html.HTML.div
import web.html.HTMLElement
import web.prompts.alert
import wrappers.example.app.App

fun main() {
    val container = createContainer()
    createRoot(container)
        .render(App.create())

    alert("Main!!!")
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
