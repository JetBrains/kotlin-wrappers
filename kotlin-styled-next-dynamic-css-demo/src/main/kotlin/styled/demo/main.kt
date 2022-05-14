package styled.demo

import kotlinx.browser.document
import kotlinx.browser.window
import react.Props
import react.create
import react.dom.client.createRoot
import react.dom.span
import react.fc

fun main() {
    window.onload = {
        createRoot(document.getElementById("root")!!)
            .render(demoComponent.create())
    }
}

private val demoComponent = fc<Props> {
    span {
        +"Hello there!"
    }
}
