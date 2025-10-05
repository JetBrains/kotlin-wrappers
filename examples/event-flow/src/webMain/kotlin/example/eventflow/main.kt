package example.eventflow

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.plus
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

    parent.clickEvent()
        // or `subscribe` as shorthand
        .onEach { println("Click is propagated to parent!") }
        .launchIn(this + Dispatchers.Unconfined)

    val child = document.createElement(button)
    child.innerText = "Click me!"
    parent.append(child)

    child.clickEvent()
        .onEach { println("Button is clicked!") }
        .filter { propagationToggle.checked }
        // or `subscribe` as shorthand
        .onEach { it.stopPropagation() }
        .launchIn(this + Dispatchers.Unconfined)

    eventFlowTest()
}
