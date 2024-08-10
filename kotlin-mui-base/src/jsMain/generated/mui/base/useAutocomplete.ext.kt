// Automatically generated - do not modify!

package mui.base

import seskar.js.JsValue

sealed external interface AutocompleteHighlightChangeReason {
    companion object {
        @JsValue("keyboard")
        val keyboard: AutocompleteHighlightChangeReason

        @JsValue("mouse")
        val mouse: AutocompleteHighlightChangeReason

        @JsValue("auto")
        val auto: AutocompleteHighlightChangeReason

        @JsValue("touch")
        val touch: AutocompleteHighlightChangeReason
    }
}

sealed external interface AutocompleteChangeReason {
    companion object {
        @JsValue("createOption")
        val createOption: AutocompleteChangeReason

        @JsValue("selectOption")
        val selectOption: AutocompleteChangeReason

        @JsValue("removeOption")
        val removeOption: AutocompleteChangeReason

        @JsValue("clear")
        val clear: AutocompleteChangeReason

        @JsValue("blur")
        val blur: AutocompleteChangeReason
    }
}

sealed external interface AutocompleteCloseReason {
    companion object {
        @JsValue("createOption")
        val createOption: AutocompleteCloseReason

        @JsValue("toggleInput")
        val toggleInput: AutocompleteCloseReason

        @JsValue("escape")
        val escape: AutocompleteCloseReason

        @JsValue("selectOption")
        val selectOption: AutocompleteCloseReason

        @JsValue("removeOption")
        val removeOption: AutocompleteCloseReason

        @JsValue("blur")
        val blur: AutocompleteCloseReason
    }
}

sealed external interface AutocompleteInputChangeReason {
    companion object {
        @JsValue("input")
        val input: AutocompleteInputChangeReason

        @JsValue("reset")
        val reset: AutocompleteInputChangeReason

        @JsValue("clear")
        val clear: AutocompleteInputChangeReason
    }
}

sealed external interface MatchFrom {
    companion object {
        @JsValue("any")
        val any: MatchFrom

        @JsValue("start")
        val start: MatchFrom
    }
}

sealed external interface BlurOnSelect {
    companion object {
        @JsValue("touch")
        val touch: BlurOnSelect

        @JsValue("mouse")
        val mouse: BlurOnSelect

        @JsValue("`true`")
        val `true`: BlurOnSelect

        @JsValue("`false`")
        val `false`: BlurOnSelect
    }
}
