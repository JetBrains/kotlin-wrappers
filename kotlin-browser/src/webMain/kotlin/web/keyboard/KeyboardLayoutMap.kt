package web.keyboard

import js.collections.ReadonlyMap
import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardLayoutMap)
 */
@ExperimentalWebApi
open external class KeyboardLayoutMap
private constructor() :
    ReadonlyMap.Mixin<KeyCode, JsString>
