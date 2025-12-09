package web.keyboard

import js.collections.ReadonlyMap
import web.experimental.ExperimentalWebApi
import kotlin.js.JsString

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardLayoutMap)
 */
@ExperimentalWebApi
sealed /* final */
external class KeyboardLayoutMap
private constructor() :
    ReadonlyMap<KeyCode, JsString>
