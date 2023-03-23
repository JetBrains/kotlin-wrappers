// Automatically generated - do not modify!

package mui.base

@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{keyboard: 'keyboard', mouse: 'mouse', auto: 'auto'}/*union*/)""")
sealed external interface AutocompleteHighlightChangeReason {
    companion object {
        val keyboard: AutocompleteHighlightChangeReason
        val mouse: AutocompleteHighlightChangeReason
        val auto: AutocompleteHighlightChangeReason
    }
}

@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{createOption: 'createOption', selectOption: 'selectOption', removeOption: 'removeOption', clear: 'clear', blur: 'blur'}/*union*/)""")
sealed external interface AutocompleteChangeReason {
    companion object {
        val createOption: AutocompleteChangeReason
        val selectOption: AutocompleteChangeReason
        val removeOption: AutocompleteChangeReason
        val clear: AutocompleteChangeReason
        val blur: AutocompleteChangeReason
    }
}

@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{createOption: 'createOption', toggleInput: 'toggleInput', escape: 'escape', selectOption: 'selectOption', removeOption: 'removeOption', blur: 'blur'}/*union*/)""")
sealed external interface AutocompleteCloseReason {
    companion object {
        val createOption: AutocompleteCloseReason
        val toggleInput: AutocompleteCloseReason
        val escape: AutocompleteCloseReason
        val selectOption: AutocompleteCloseReason
        val removeOption: AutocompleteCloseReason
        val blur: AutocompleteCloseReason
    }
}

@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{input: 'input', reset: 'reset', clear: 'clear'}/*union*/)""")
sealed external interface AutocompleteInputChangeReason {
    companion object {
        val input: AutocompleteInputChangeReason
        val reset: AutocompleteInputChangeReason
        val clear: AutocompleteInputChangeReason
    }
}

@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{any: 'any', start: 'start'}/*union*/)""")
sealed external interface MatchFrom {
    companion object {
        val any: MatchFrom
        val start: MatchFrom
    }
}

@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{touch: 'touch', mouse: 'mouse', true: true, false: false}/*union*/)""")
sealed external interface BlurOnSelect {
    companion object {
        val touch: BlurOnSelect
        val mouse: BlurOnSelect
        val `true`: BlurOnSelect
        val `false`: BlurOnSelect
    }
}
