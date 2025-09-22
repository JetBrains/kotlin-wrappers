package example.eventflow

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.onEach
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

suspend fun main(): Unit = coroutineScope {
    val propagationToggleLabel = document.createElement(label)
    propagationToggleLabel.innerText = "Stop propagation"
    document.body.append(propagationToggleLabel)

    val propagationToggle = document.createElement(input)
    propagationToggle.type = InputType.checkbox
    propagationToggleLabel.prepend(propagationToggle)

    val parent = document.createElement(div)
    document.body.append(parent)

    val child = document.createElement(button)
    child.innerText = "Click me!"
    parent.append(child)

    launch {
        parent.clickEvent()
            .collect { println("Click is propagated to parent!") }
    }

    launch {
        child.clickEvent()
            .onEach { println("Button is clicked!") }
            .filter { propagationToggle.checked }
            .collect { it.stopPropagation() }
    }

    eventFlowTest()
}
