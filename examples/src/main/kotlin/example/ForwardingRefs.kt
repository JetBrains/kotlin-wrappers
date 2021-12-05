package example

import org.w3c.dom.HTMLInputElement
import react.*
import react.dom.html.ReactHTML.input

external interface Focusable {
    fun focus()
}

external interface FancyInputProps : PropsWithRef<Focusable>

val FancyInput = forwardRef<Focusable, FancyInputProps> { _, forwardedRef ->
    val inputRef = useRef<HTMLInputElement>()

    useImperativeHandle(forwardedRef, inputRef) {
        object : Focusable {
            override fun focus() {
                inputRef.current?.focus()
            }
        }
    }

    input {
        attrs {
            ref = inputRef
        }
    }
}

val App = fc<Props> {
    val fancyInputRef = useRef<Focusable>()

    useEffectOnce {
        fancyInputRef.current?.focus()
    }

    FancyInput {
        attrs {
            ref = fancyInputRef
        }
    }
}
