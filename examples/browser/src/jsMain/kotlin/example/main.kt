package example

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import web.dom.clickEvent
import web.dom.document
import web.events.invoke
import web.html.HtmlTagName.button
import web.html.HtmlTagName.div
import web.html.HtmlTagName.input
import web.html.HtmlTagName.label
import web.html.InputType
import web.html.checkbox

suspend fun main() {
    println("Browser!")

    val body = requireNotNull(document.body)

    val propagationToggleLabel = document.createElement(label)
    propagationToggleLabel.innerText = "Stop propagation"
    body.append(propagationToggleLabel)

    val propagationToggle = document.createElement(input)
    propagationToggle.type = InputType.checkbox
    propagationToggleLabel.prepend(propagationToggle)

    val parent = document.createElement(div)
    body.append(parent)

    val child = document.createElement(button)
    child.innerText = "Click me!"
    parent.append(child)

    coroutineScope {
        launch {
            parent.clickEvent().collect {
                println("Click is propagated to parent!")
            }
        }

        launch {
            child.clickEvent().collect {
                if (propagationToggle.checked) {
                    it.stopPropagation()
                }
                println("Button is clicked!")
            }
        }
    }
}
