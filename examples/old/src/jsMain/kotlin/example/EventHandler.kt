package example

import web.dom.Document
import web.dom.document
import web.events.addEventHandler
import web.uievents.DragEvent

private fun preventDefaultExample() {
    document.addEventHandler(DragEvent.dragOver()) { event ->
        val doc: Document = event.currentTarget

        event.preventDefault()

        console.log(doc === document)
    }
}
