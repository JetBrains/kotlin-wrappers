// Automatically generated - do not modify!

package web.canvas

import dom.Element

sealed external interface CanvasUserInterface {
    fun drawFocusIfNeeded(element: Element)
    fun drawFocusIfNeeded(
        path: Path2D,
        element: Element,
    )
}
