package web.css.painting

import js.globals.GlobalScope
import js.reflect.JsClass

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaintWorkletGlobalScope)
 */
external class PaintWorkletGlobalScope
private constructor() :
    GlobalScope {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaintWorkletGlobalScope/registerPaint)
     */
    fun registerPaint(
        name: String,
        paintCtor: JsClass<Paint>,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaintWorkletGlobalScope/devicePixelRatio)
     */
    val devicePixelRatio: Double
}
