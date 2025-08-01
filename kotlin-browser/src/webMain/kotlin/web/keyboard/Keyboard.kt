package web.keyboard

import js.array.ReadonlyArray
import js.core.Void
import js.promise.Promise
import js.promise.await
import web.experimental.ExperimentalWebApi
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Keyboard)
 */
@ExperimentalWebApi
open external class Keyboard
private constructor() {

    @JsName("getLayoutMap")
    fun getLayoutMapAsync(): Promise<KeyboardLayoutMap>

    @JsName("lock")
    fun lockAsync(
        keyCodes: ReadonlyArray<KeyCode> = definedExternally,
    ): Promise<Void>

    fun unlock()
}

@ExperimentalWebApi
suspend inline fun Keyboard.getLayoutMap(): KeyboardLayoutMap {
    return getLayoutMapAsync().await()
}

@ExperimentalWebApi
suspend inline fun Keyboard.lock() {
    lockAsync().await()
}

@ExperimentalWebApi
suspend inline fun Keyboard.lock(
    keyCodes: ReadonlyArray<KeyCode>,
) {
    lockAsync(
        keyCodes = keyCodes,
    ).await()
}
