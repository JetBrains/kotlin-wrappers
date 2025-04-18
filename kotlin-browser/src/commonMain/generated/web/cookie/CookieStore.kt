// Automatically generated - do not modify!

package web.cookie

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.events.JsEvent
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`CookieStore`** interface of the Cookie Store API provides methods for getting and setting cookies asynchronously from either a page or a service worker.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore)
 */
external class CookieStore
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/change_event)
     */
    var onchange: EventHandler<CookieChangeEvent, CookieStore, CookieStore>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/delete)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun delete(name: String)

    @JsName("delete")
    fun deleteAsync(name: String): Promise<Void>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun delete(options: CookieStoreDeleteOptions)

    @JsName("delete")
    fun deleteAsync(options: CookieStoreDeleteOptions): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/get)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun get(name: String): CookieListItem?

    @JsName("get")
    fun getAsync(name: String): Promise<CookieListItem?>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun get(options: CookieStoreGetOptions = definedExternally): CookieListItem?

    @JsName("get")
    fun getAsync(options: CookieStoreGetOptions = definedExternally): Promise<CookieListItem?>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/getAll)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun getAll(name: String): CookieList

    @JsName("getAll")
    fun getAllAsync(name: String): Promise<CookieList>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun getAll(options: CookieStoreGetOptions = definedExternally): CookieList

    @JsName("getAll")
    fun getAllAsync(options: CookieStoreGetOptions = definedExternally): Promise<CookieList>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/set)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun set(
        name: String,
        value: String,
    )

    @JsName("set")
    fun setAsync(
        name: String,
        value: String,
    ): Promise<Void>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun set(options: CookieInit)

    @JsName("set")
    fun setAsync(options: CookieInit): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/change_event)
     */
    @JsEvent("change")
    val changeEvent: EventInstance<CookieChangeEvent, CookieStore /* this */, CookieStore /* this */>
}
