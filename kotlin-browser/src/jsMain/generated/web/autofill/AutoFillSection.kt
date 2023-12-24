// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.autofill

sealed interface AutoFillSection

inline fun AutoFillSection(
    value: String,
): AutoFillSection =
    "section-$value".unsafeCast<AutoFillSection>()
