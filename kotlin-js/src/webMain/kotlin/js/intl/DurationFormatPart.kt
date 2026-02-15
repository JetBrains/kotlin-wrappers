package js.intl

import kotlinx.js.JsPlainObject

/**
 * An object representing the relative time format in parts
 * that can be used for custom locale-aware formatting.
 *
 * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl/DurationFormat/formatToParts).
 */
@JsPlainObject
external interface DurationFormatPart {
    val type: NumberFormatPartType
    val value: String
    val unit: DurationFormatUnitSingular
}
