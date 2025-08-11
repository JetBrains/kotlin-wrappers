package web.css.painting

import js.reflect.JsClass
import web.experimental.ExperimentalWebApi
import web.worklets.WorkletGlobalScope

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaintWorkletGlobalScope)
 */
@ExperimentalWebApi
external class PaintWorkletGlobalScope
private constructor() :
    WorkletGlobalScope {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaintWorkletGlobalScope/registerPaint)
     */
    fun registerPaint(
        name: PaintName,
        paintCtor: JsClass<Paint>,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaintWorkletGlobalScope/devicePixelRatio)
     */
    val devicePixelRatio: Double
}
