package karakum.browser

import karakum.common.UnionConstant
import karakum.common.sealedExtendedUnion
import karakum.common.unionBody

// Remaining interfaces annotated with @JsValue

private val UNION_TYPES = listOf(
    UnionData(
        name = "LastChunkHandling",
        values = listOf(
            "loose",
            "strict",
            "stop-before-partial",
        ),
        pkg = "js.typedarrays",
    ),
    UnionData(
        name = "Alphabet",
        values = listOf(
            "base64",
            "base64url",
        ),
        pkg = "js.typedarrays",
    ),
    UnionData(
        name = "Overflow",
        values = listOf(
            "constrain",
            "reject"
        ),
        pkg = "js.temporal",
    ),
    UnionData(
        name = "RoundingMode",
        values = listOf(
            "ceil",
            "floor",
            "expand",
            "trunc",
            "halfCeil",
            "halfFloor",
            "halfExpand",
            "halfTrunc",
            "halfEven"
        ),
        pkg = "js.temporal",
    ),
    UnionData(
        name = "Disambiguation",
        values = listOf(
            "compatible",
            "earlier",
            "later",
            "reject"
        ),
        pkg = "js.temporal",
    ),
    UnionData(
        name = "PrimitiveHint",
        values = listOf(
            "number",
            "string",
            "default"
        ),
        pkg = "js.symbol",
    ),
)

private val EXTENDED_TYPES = listOf(
    UnionData(
        name = "DateUnit",
        values = listOf("year", "month", "week", "day"),
        pkg = "js.temporal",
        extendedTypes = listOf("DateTimeUnit<T>"),
        isExtended = true,
    ),
    UnionData(
        name = "TimeUnit",
        values = listOf("hour", "minute", "second", "millisecond", "microsecond", "nanosecond"),
        pkg = "js.temporal",
        extendedTypes = listOf("DateTimeUnit<T>"),
        isExtended = true,
    ),
)

private val PLURAL_UNIT_VALUES = listOf(
    UnionConstant("years", "years", "PluralUnit<DateUnit.year>"),
    UnionConstant("months", "months", "PluralUnit<DateUnit.month>"),
    UnionConstant("weeks", "weeks", "PluralUnit<DateUnit.week>"),
    UnionConstant("days", "days", "PluralUnit<DateUnit.day>"),
    UnionConstant("hours", "hours", "PluralUnit<TimeUnit.hour>"),
    UnionConstant("minutes", "minutes", "PluralUnit<TimeUnit.minute>"),
    UnionConstant("seconds", "seconds", "PluralUnit<TimeUnit.second>"),
    UnionConstant("milliseconds", "milliseconds", "PluralUnit<TimeUnit.millisecond>"),
    UnionConstant("microseconds", "microseconds", "PluralUnit<TimeUnit.microsecond>"),
    UnionConstant("nanoseconds", "nanoseconds", "PluralUnit<TimeUnit.nanosecond>"),
)

internal fun jsUnions(): List<ConversionResult> =
    UNION_TYPES.map {
        ConversionResult(
            name = it.name,
            body = unionBody(it.name, it.values),
            pkg = it.pkg,
        )
    } + EXTENDED_TYPES.map {
        ConversionResult(
            name = it.name,
            body = sealedExtendedUnion(
                name = it.name,
                partOfTypes = it.extendedTypes,
                values = it.values.map { value ->
                    UnionConstant(
                        name = value,
                        value = value
                    )
                },
                typeParameter = "out T : ${it.name}<T>",
            ),
            pkg = it.pkg,
        )
    } + listOf(
        ConversionResult(
            name = "PluralUnit",
            body = sealedExtendedUnion(
                name = "PluralUnit",
                partOfTypes = listOf("LargestUnit<T>", "SmallestUnit<T>", "TotalUnit<T>"),
                values = PLURAL_UNIT_VALUES,
                typeParameter = "T : DateTimeUnit<T>",
                generateSealedInterfaces = false
            ),
            pkg = "js.temporal",
        )
    )
