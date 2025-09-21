package example

import web.dnd.DRAG_OVER
import web.dnd.DragEvent
import web.dom.Document
import web.dom.document
import web.dom.dragOverEvent
import web.events.addEventHandler
import web.events.addHandler

private fun preventDefaultExample_handler() {
    document.addEventHandler(DragEvent.DRAG_OVER) { event ->
        val doc: Document = event.currentTarget

        event.preventDefault()

        println(doc === document)
    }
}

private fun preventDefaultExample_instance() {
    document.dragOverEvent.addHandler { event ->
        val doc: Document = event.currentTarget

        event.preventDefault()

        println(doc === document)
    }
}
