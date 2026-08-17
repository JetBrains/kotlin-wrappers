// Automatically generated - do not modify!

package web.parsing

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface DOMParserSupportedType

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
