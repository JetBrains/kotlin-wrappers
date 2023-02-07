// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.keyboard

sealed external interface ModifierKeyCode

inline fun ModifierKeyCode(
    code: String,
): ModifierKeyCode =
    code.unsafeCast<ModifierKeyCode>()
