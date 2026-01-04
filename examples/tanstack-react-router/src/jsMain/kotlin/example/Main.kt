package example

import react.create
import react.dom.client.createRoot
import web.dom.document
import web.html.HtmlTagName.div

suspend fun main() {
    val container = document.createElement(div)
    document.body.appendChild(container)

    createRoot(container)
        .render(App.create())
}
