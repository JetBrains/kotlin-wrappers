// Automatically generated - do not modify!

package web.xhr

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface XMLHttpRequestResponseType

inline val XMLHttpRequestResponseType.Companion.none: XMLHttpRequestResponseType
    get() = unsafeCast("")

inline val XMLHttpRequestResponseType.Companion.arraybuffer: XMLHttpRequestResponseType
    get() = unsafeCast("arraybuffer")

inline val XMLHttpRequestResponseType.Companion.blob: XMLHttpRequestResponseType
    get() = unsafeCast("blob")

inline val XMLHttpRequestResponseType.Companion.document: XMLHttpRequestResponseType
    get() = unsafeCast("document")

inline val XMLHttpRequestResponseType.Companion.json: XMLHttpRequestResponseType
    get() = unsafeCast("json")

inline val XMLHttpRequestResponseType.Companion.text: XMLHttpRequestResponseType
    get() = unsafeCast("text")
