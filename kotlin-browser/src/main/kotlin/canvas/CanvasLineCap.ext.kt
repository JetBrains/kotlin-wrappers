package canvas

import org.w3c.dom.CanvasLineCap

inline val CanvasLineCap.Companion.BUTT: CanvasLineCap
    get() = "butt".unsafeCast<CanvasLineCap>()

inline val CanvasLineCap.Companion.ROUND: CanvasLineCap
    get() = "round".unsafeCast<CanvasLineCap>()

inline val CanvasLineCap.Companion.SQUARE: CanvasLineCap
    get() = "square".unsafeCast<CanvasLineCap>()
