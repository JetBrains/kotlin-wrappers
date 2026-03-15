package floating.ui.dom

import floating.ui.utils.ClientRectObject
import js.array.ReadonlyArray
import web.dom.Element

/**
 * Custom positioning reference element.
 *
 * [API Docs](https://floating-ui.com/docs/virtual-elements)
 */
external interface VirtualElement {
    fun getBoundingClientRect(): ClientRectObject
    val getClientRects: (() -> ReadonlyArray<ClientRectObject>)?
    val contextElement: Element?
}
