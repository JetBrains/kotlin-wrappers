package canvas

import org.w3c.dom.CanvasTextBaseline

typealias CanvasTextBaseline = CanvasTextBaseline

inline val CanvasTextBaseline.Companion.TOP: CanvasTextBaseline
    get() = "top".unsafeCast<CanvasTextBaseline>()

inline val CanvasTextBaseline.Companion.HANGING: CanvasTextBaseline
    get() = "hanging".unsafeCast<CanvasTextBaseline>()

inline val CanvasTextBaseline.Companion.MIDDLE: CanvasTextBaseline
    get() = "middle".unsafeCast<CanvasTextBaseline>()

inline val CanvasTextBaseline.Companion.ALPHABETIC: CanvasTextBaseline
    get() = "alphabetic".unsafeCast<CanvasTextBaseline>()

inline val CanvasTextBaseline.Companion.IDEOGRAPHIC: CanvasTextBaseline
    get() = "ideographic".unsafeCast<CanvasTextBaseline>()

inline val CanvasTextBaseline.Companion.BOTTOM: CanvasTextBaseline
    get() = "bottom".unsafeCast<CanvasTextBaseline>()
