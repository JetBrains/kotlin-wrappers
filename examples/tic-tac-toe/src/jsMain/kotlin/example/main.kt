package example

import js.core.Void
import js.import.importAsync
import react.create
import react.dom.client.createRoot
import web.dom.document
import web.html.HTML.div
import web.html.HTMLElement

fun main() {
    importAsync<Void>("/kotlin/TicTacToe.css")

    val container = createContainer()
    createRoot(container)
        .render(TicTacToeApp.create())
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
