package web.css.painting

import js.collections.MapLike
import js.core.JsAny
import web.cssom.CustomPropertyName
import web.experimental.ExperimentalWebApi

@ExperimentalWebApi
external interface Paint {
    fun paint(
        context: PaintRenderingContext2D,
        size: PaintSize,
        properties: MapLike<CustomPropertyName<*>, JsAny>,
    )
}
