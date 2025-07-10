// Automatically generated - do not modify!

package web.serviceworker

import js.promise.Promise
import js.promise.await
import web.dom.DocumentVisibilityState
import web.url.URL
import kotlin.js.JsName

/**
 * The `WindowClient` interface of the ServiceWorker API represents the scope of a service worker client that is a document in a browsing context, controlled by an active worker.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient)
 */
external class WindowClient
private constructor() :
    Client {
    /**
     * The **`focused`** read-only property of the the current client has focus.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient/focused)
     */
    val focused: Boolean

    /**
     * The **`visibilityState`** read-only property of the This value can be one of `'hidden'`, `'visible'`, or `'prerender'`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient/visibilityState)
     */
    val visibilityState: DocumentVisibilityState

    /**
     * The **`focus()`** method of the WindowClient interface gives user input focus to the current client and returns a ```js-nolint focus() ``` None.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient/focus)
     */
    @JsName("focus")
    fun focusAsync(): Promise<WindowClient>

    /**
     * The **`navigate()`** method of the WindowClient interface loads a specified URL into a controlled client page then returns a ```js-nolint navigate(url) ``` - `url` - : The location to navigate to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient/navigate)
     */
    @JsName("navigate")
    fun navigateAsync(url: String): Promise<WindowClient?>

    @JsName("navigate")
    fun navigateAsync(url: URL): Promise<WindowClient?>
}

/**
 * The **`focus()`** method of the WindowClient interface gives user input focus to the current client and returns a ```js-nolint focus() ``` None.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient/focus)
 */
suspend inline fun WindowClient.focus(): WindowClient {
    return focusAsync().await()
}

/**
 * The **`navigate()`** method of the WindowClient interface loads a specified URL into a controlled client page then returns a ```js-nolint navigate(url) ``` - `url` - : The location to navigate to.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient/navigate)
 */
suspend inline fun WindowClient.navigate(url: String): WindowClient? {
    return navigateAsync(url = url).await()
}

suspend inline fun WindowClient.navigate(url: URL): WindowClient? {
    return navigateAsync(url = url).await()
}
