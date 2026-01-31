package example.react

import react.create
import react.dom.client.createRoot
import web.dom.document
import web.html.HtmlTagName.div

fun main() {
    val container = document.createElement(div)
    document.body.appendChild(container)

    createRoot(container)
        .render(View.create())
}
