package web.css.painting

import js.objects.JsPlainObject
import web.experimental.ExperimentalWebApi

@JsPlainObject
@ExperimentalWebApi
external interface PaintSize {
    var width: Double
    var height: Double
}
