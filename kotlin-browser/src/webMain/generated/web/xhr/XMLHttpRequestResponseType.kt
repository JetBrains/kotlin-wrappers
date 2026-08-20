// Automatically generated - do not modify!

package web.xhr

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/responseType)
 */
@JsUnion
sealed /* union */
external interface XMLHttpRequestResponseType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/responseType#sect)
 */
inline val XMLHttpRequestResponseType.Companion.none: XMLHttpRequestResponseType
    get() = unsafeCast("")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/responseType#arraybuffer)
 */
inline val XMLHttpRequestResponseType.Companion.arraybuffer: XMLHttpRequestResponseType
    get() = unsafeCast("arraybuffer")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/responseType#blob)
 */
inline val XMLHttpRequestResponseType.Companion.blob: XMLHttpRequestResponseType
    get() = unsafeCast("blob")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/responseType#document)
 */
inline val XMLHttpRequestResponseType.Companion.document: XMLHttpRequestResponseType
    get() = unsafeCast("document")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/responseType#json)
 */
inline val XMLHttpRequestResponseType.Companion.json: XMLHttpRequestResponseType
    get() = unsafeCast("json")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/responseType#text)
 */
inline val XMLHttpRequestResponseType.Companion.text: XMLHttpRequestResponseType
    get() = unsafeCast("text")
