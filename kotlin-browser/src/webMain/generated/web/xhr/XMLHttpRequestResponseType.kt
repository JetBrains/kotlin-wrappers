// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.xhr

import js.reflect.unsafeCast

sealed external interface XMLHttpRequestResponseType {
    companion object
}

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
