package floating.ui.utils

import js.array.ReadonlyArray

/**
 * Custom positioning reference element.
 *
 * [API Docs](https://floating-ui.com/docs/virtual-elements)
 */
external interface VirtualElement {
    fun getBoundingClientRect(): ClientRectObject
    val getClientRects: (() -> ReadonlyArray<ClientRectObject>)?
    val contextElement: Any?
}
