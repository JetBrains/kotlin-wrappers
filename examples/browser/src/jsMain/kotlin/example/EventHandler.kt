package example

import web.console.console
import web.dom.Document
import web.dom.document
import web.events.addEventHandler
import web.events.addHandler
import web.uievents.DRAG_OVER
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
