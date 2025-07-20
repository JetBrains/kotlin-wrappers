package web.keyboard

import js.collections.ReadonlyMap
import js.core.JsString
import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardLayoutMap)
 */
@ExperimentalWebApi
sealed /* final */
external class KeyboardLayoutMap
protected /* private */ constructor() :
    ReadonlyMap<KeyCode, JsString>
