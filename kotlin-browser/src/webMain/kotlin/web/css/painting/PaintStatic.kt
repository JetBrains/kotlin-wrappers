package web.css.painting

import js.array.ReadonlyArray
import web.experimental.ExperimentalWebApi

@ExperimentalWebApi
internal external interface PaintStatic {
    var inputProperties: ReadonlyArray<JsAny /* PropertyName<*> | CustomPropertyName<*> */>?
    var inputArguments: ReadonlyArray<JsString>?
    var contextOptions: PaintRenderingContext2DSettings?
}
