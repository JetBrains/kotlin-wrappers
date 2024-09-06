package example

import web.dom.Document
import web.dom.document
import web.dom.dragOverEvent
import web.events.addEventHandler
import web.events.addHandler
import web.uievents.DragEvent

private fun preventDefaultExample_handler() {
    document.addEventHandler(DragEvent.DRAG_OVER) { event ->
        val doc: Document = event.currentTarget

        event.preventDefault()

        console.log(doc === document)
    }
}

private fun preventDefaultExample_instance() {
    document.dragOverEvent.addHandler { event ->
        val doc: Document = event.currentTarget

        event.preventDefault()

        console.log(doc === document)
    }
}
