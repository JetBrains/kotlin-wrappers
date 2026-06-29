package karakum.browser

import karakum.common.CommonUnionConverter.unionBodyByConstants
import karakum.common.UnionConstant

internal const val KEY_CODE = "KeyCode"

private val KEY_CODES = listOf(
    // Alphanumeric Section
    "Backquote",
    "Backslash",
    "Backspace",
    "BracketLeft",
    "BracketRight",
    "Comma",
    "Digit0",
    "Digit1",
    "Digit2",
    "Digit3",
    "Digit4",
    "Digit5",
    "Digit6",
    "Digit7",
    "Digit8",
    "Digit9",
    "Equal",
    "IntlBackslash",
    "IntlRo",
    "IntlYen",
    "KeyA",
    "KeyB",
    "KeyC",
    "KeyD",
    "KeyE",
    "KeyF",
    "KeyG",
    "KeyH",
    "KeyI",
    "KeyJ",
    "KeyK",
    "KeyL",
    "KeyM",
    "KeyN",
    "KeyO",
    "KeyP",
    "KeyQ",
    "KeyR",
    "KeyS",
    "KeyT",
    "KeyU",
    "KeyV",
    "KeyW",
    "KeyX",
    "KeyY",
    "KeyZ",
    "Minus",
    "Period",
    "Quote",
    "Semicolon",
    "Slash",

    // Functional Keys
    "AltLeft",
    "AltRight",
    "CapsLock",
    "ContextMenu",
    "ControlLeft",
    "ControlRight",
    "Enter",
    "MetaLeft",
    "MetaRight",
    "ShiftLeft",
    "ShiftRight",
    "Space",
    "Tab",

    "Convert",
    "KanaMode",
    "Lang1",
    "Lang2",
    "Lang3",
    "Lang4",
    "Lang5",
    "NonConvert",

    // Firefox on Mac
    "OSLeft",
    "OSRight",

    // Control Pad Section
    "Delete",
    "End",
    "Help",
    "Home",
    "Insert",
    "PageDown",
    "PageUp",

    // Arrow Pad Section
    "ArrowDown",
    "ArrowLeft",
    "ArrowRight",
    "ArrowUp",

    // Numpad Section
    "NumLock",
    "Numpad0",
    "Numpad1",
    "Numpad2",
    "Numpad3",
    "Numpad4",
    "Numpad5",
    "Numpad6",
    "Numpad7",
    "Numpad8",
    "Numpad9",
    "NumpadAdd",
    "NumpadBackspace",
    "NumpadClear",
    "NumpadClearEntry",
    "NumpadComma",
    "NumpadDecimal",
    "NumpadDivide",
    "NumpadEnter",
    "NumpadEqual",
    "NumpadHash",
    "NumpadMemoryAdd",
    "NumpadMemoryClear",
    "NumpadMemoryRecall",
    "NumpadMemoryStore",
    "NumpadMemorySubtract",
    "NumpadMultiply",
    "NumpadParenLeft",
    "NumpadParenRight",
    "NumpadStar",
    "NumpadSubtract",

    // Function Section
    "Escape",
    "F1",
    "F2",
    "F3",
    "F4",
    "F5",
    "F6",
    "F7",
    "F8",
    "F9",
    "F10",
    "F11",
    "F12",
    "F13",
    "F14",
    "F15",
    "Fn",
    "FnLock",
    "PrintScreen",
    "ScrollLock",
    "Pause",

    // Media Keys
    "BrowserBack",
    "BrowserFavorites",
    "BrowserForward",
    "BrowserHome",
    "BrowserRefresh",
    "BrowserSearch",
    "BrowserStop",
    "Eject",
    "LaunchApp1",
    "LaunchApp2",
    "LaunchMail",
    "MediaPlayPause",
    "MediaSelect",
    "MediaStop",
    "MediaTrackNext",
    "MediaTrackPrevious",
    "Power",
    "Sleep",
    "AudioVolumeDown",
    "AudioVolumeMute",
    "AudioVolumeUp",
    "WakeUp",

    // International
    "Hiragana",
    "Katakana",

    // Special
    "Unidentified",
)

internal const val MODIFIER_KEY_CODE = "ModifierKeyCode"

private val MODIFIER_KEY_CODES = listOf(
    "Alt",
    "AltGraph",
    "CapsLock",
    "Control",
    "Fn",
    "FnLock",
    "Meta",
    "NumLock",
    "ScrollLock",
    "Shift",
    "Symbol",
    "SymbolLock",
)

internal fun keyboardTypes(): Sequence<ConversionResult> {
    return sequenceOf(
        keyboardUnion(
            name = KEY_CODE,
            values = KEY_CODES,
            mdnApiUrl = "UI_Events/Keyboard_event_code_values",
        ),
        keyboardUnion(
            MODIFIER_KEY_CODE,
            MODIFIER_KEY_CODES,
            "KeyboardEvent/getModifierState",
        ),
    )
}

private fun keyboardUnion(
    name: String,
    values: List<String>,
    mdnApiUrl: String,
): ConversionResult {
    fun getKDoc(
        value: String? = null,
    ): String {
        val hash = if (value != null)
            "#:~:text=%22$value%22"
        else ""

        return """
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/$mdnApiUrl$hash)
         */
        """.trimIndent()
    }

    val constants = values.map { value ->
        UnionConstant(
            name = value,
            value = value,
            comment = getKDoc(value),
        )
    }

    val body = getKDoc() + "\n" +
            unionBodyByConstants(name, constants)

    return ConversionResult(
        name = name,
        body = body,
        pkg = "web.keyboard",
    )
}
