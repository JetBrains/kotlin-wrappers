package canvas

import org.w3c.dom.CanvasTextAlign

typealias CanvasTextAlign = CanvasTextAlign

inline val CanvasTextAlign.Companion.START: CanvasTextAlign
    get() = "start".unsafeCast<CanvasTextAlign>()

inline val CanvasTextAlign.Companion.END: CanvasTextAlign
    get() = "end".unsafeCast<CanvasTextAlign>()

inline val CanvasTextAlign.Companion.LEFT: CanvasTextAlign
    get() = "left".unsafeCast<CanvasTextAlign>()

inline val CanvasTextAlign.Companion.RIGHT: CanvasTextAlign
    get() = "right".unsafeCast<CanvasTextAlign>()

inline val CanvasTextAlign.Companion.CENTER: CanvasTextAlign
    get() = "center".unsafeCast<CanvasTextAlign>()
