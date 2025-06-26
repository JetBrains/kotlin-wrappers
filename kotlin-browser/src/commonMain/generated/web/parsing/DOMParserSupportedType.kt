// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.parsing

import js.reflect.unsafeCast

sealed external interface DOMParserSupportedType {
    companion object
}

inline val DOMParserSupportedType.Companion.applicationXhtmlXml: DOMParserSupportedType
    get() = unsafeCast("application/xhtml+xml")

inline val DOMParserSupportedType.Companion.applicationXml: DOMParserSupportedType
    get() = unsafeCast("application/xml")

inline val DOMParserSupportedType.Companion.imageSvgXml: DOMParserSupportedType
    get() = unsafeCast("image/svg+xml")

inline val DOMParserSupportedType.Companion.textHtml: DOMParserSupportedType
    get() = unsafeCast("text/html")

inline val DOMParserSupportedType.Companion.textXml: DOMParserSupportedType
    get() = unsafeCast("text/xml")
