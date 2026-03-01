package floating.ui.react.dom

import floating.ui.utils.Padding
import kotlinx.js.JsPlainObject
import web.dom.Element

@JsPlainObject
external interface ArrowOptions {
    /**
     * The arrow element to be positioned.
     * @default undefined
     */
    val element: Element? /* | RefObject<Element?> */

    /**
     * The padding between the arrow element and the floating element edges.
     * Useful when the floating element has rounded corners.
     * @default 0
     */
    val padding: Padding?
}

