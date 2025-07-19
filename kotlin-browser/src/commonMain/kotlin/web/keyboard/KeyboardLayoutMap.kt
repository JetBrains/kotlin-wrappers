package web.keyboard

import js.collections.ReadonlyMap
import js.core.JsString
import js.promise.Promise
import web.experimental.ExperimentalWebApi
import kotlin.js.JsName

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardLayoutMap)
 */
@ExperimentalWebApi
sealed /* final */
external class KeyboardLayoutMap
protected /* private */ constructor() :
    ReadonlyMap<KeyCode, JsString> {

    @JsName("getLayoutMap")
    fun getLayoutMapAsync(): Promise<KeyboardLayoutMap>
}
