package web.css.painting

import js.collections.MapLike
import web.experimental.ExperimentalWebApi
import kotlin.js.JsAny

@ExperimentalWebApi
external interface Paint {
    fun paint(
        context: PaintRenderingContext2D,
        size: PaintSize,
        properties: MapLike<JsAny /* PropertyName<*> | CustomPropertyName<*> */, JsAny>,
    )
}
