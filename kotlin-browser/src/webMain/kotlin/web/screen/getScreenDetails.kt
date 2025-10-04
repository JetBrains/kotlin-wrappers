package web.screen

import js.promise.Promise
import js.promise.await
import web.experimental.ExperimentalWebApi
import kotlin.js.JsName

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/getScreenDetails)
 */
@ExperimentalWebApi
@JsName("getScreenDetails")
external fun getScreenDetailsAsync(): Promise<ScreenDetails>

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/getScreenDetails)
 */
@ExperimentalWebApi
suspend inline fun getScreenDetails(): ScreenDetails =
    getScreenDetailsAsync().await()
