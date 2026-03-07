package js.numbers

import js.array.ReadonlyArray
import js.intl.Localizable
import js.intl.NumberFormatOptions
import js.intl.UnicodeBCP47LocaleIdentifier
import kotlin.js.JsAny
import kotlin.js.JsName
import kotlin.js.JsQualifier
import kotlin.js.definedExternally

@JsName("Number")
private external class JsNumber :
    Localizable<NumberFormatOptions> {

    constructor(value: Int)
    constructor(value: Double)

    fun toExponential(fractionDigits: Int = definedExternally): String
    fun toFixed(digits: Int = definedExternally): String
    fun toPrecision(precision: Int = definedExternally): String
}

@JsQualifier("Number")
external val MAX_SAFE_INTEGER: Double

@JsQualifier("Number")
external val MIN_SAFE_INTEGER: Double

@JsQualifier("Number")
external fun isFinite(number: JsAny?): Boolean

@JsQualifier("Number")
external fun isInteger(number: JsAny?): Boolean

@JsQualifier("Number")
external fun isNaN(number: JsAny?): Boolean

@JsQualifier("Number")
external fun isSafeInteger(number: JsAny?): Boolean

fun Int.toExponential(): String =
    JsNumber(this).toExponential()

fun Int.toExponential(fractionDigits: Int): String =
    JsNumber(this).toExponential(fractionDigits)

fun Double.toExponential(): String =
    JsNumber(this).toExponential()

fun Double.toExponential(fractionDigits: Int): String =
    JsNumber(this).toExponential(fractionDigits)

fun Int.toFixed(): String =
    JsNumber(this).toFixed()

fun Int.toFixed(digits: Int): String =
    JsNumber(this).toFixed(digits)

fun Double.toFixed(): String =
    JsNumber(this).toFixed()

fun Double.toFixed(digits: Int): String =
    JsNumber(this).toFixed(digits)

fun Int.toLocaleString(): String =
    JsNumber(this).toLocaleString()

fun Int.toLocaleString(locales: UnicodeBCP47LocaleIdentifier): String =
    JsNumber(this).toLocaleString(locales)

fun Int.toLocaleString(
    locales: UnicodeBCP47LocaleIdentifier,
    options: NumberFormatOptions,
): String =
    JsNumber(this).toLocaleString(locales, options)

fun Int.toLocaleString(locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier>): String =
    JsNumber(this).toLocaleString(locales)

fun Int.toLocaleString(
    locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier>,
    options: NumberFormatOptions,
): String =
    JsNumber(this).toLocaleString(locales, options)

fun Double.toLocaleString(): String =
    JsNumber(this).toLocaleString()

fun Double.toLocaleString(locales: UnicodeBCP47LocaleIdentifier): String =
    JsNumber(this).toLocaleString(locales)

fun Double.toLocaleString(
    locales: UnicodeBCP47LocaleIdentifier,
    options: NumberFormatOptions,
): String =
    JsNumber(this).toLocaleString(locales, options)

fun Double.toLocaleString(locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier>): String =
    JsNumber(this).toLocaleString(locales)

fun Double.toLocaleString(
    locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier>,
    options: NumberFormatOptions,
): String =
    JsNumber(this).toLocaleString(locales, options)

fun Int.toPrecision(): String =
    JsNumber(this).toPrecision()

fun Int.toPrecision(precision: Int): String =
    JsNumber(this).toPrecision(precision)

fun Double.toPrecision(): String =
    JsNumber(this).toPrecision()

fun Double.toPrecision(precision: Int): String =
    JsNumber(this).toPrecision(precision)
