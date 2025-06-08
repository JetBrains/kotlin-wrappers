package karakum.popper

import karakum.common.ConversionResult
import karakum.common.sealedUnionBody

internal fun enums(): Sequence<ConversionResult> =
    sequenceOf(
        enum(
            "ModifierPhases",

            "beforeRead",
            "read",
            "afterRead",
            "beforeMain",
            "main",
            "afterMain",
            "beforeWrite",
            "write",
            "afterWrite",
        ),
        enum(
            "Placement",

            "auto",
            "auto-start",
            "auto-end",
            "top",
            "top-start",
            "top-end",
            "bottom",
            "bottom-start",
            "bottom-end",
            "right",
            "right-start",
            "right-end",
            "left",
            "left-start",
            "left-end",
        ),
        enum(
            "PositioningStrategy",

            "absolute",
            "fixed",
        ),
    )

private fun enum(
    name: String,
    vararg values: String,
): ConversionResult =
    ConversionResult(
        name = name,
        body = sealedUnionBody(name, values.toList()),
    )
