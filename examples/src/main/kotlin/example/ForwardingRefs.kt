package example

import org.w3c.dom.HTMLInputElement
import react.*
import react.dom.html.ReactHTML.input

external interface Focusable {
    fun focus()
}

typealias FancyInputProps = PropsWithRef<Focusable>

val FancyInput = rawForwardRef<Focusable, FancyInputProps> { _, forwardedRef ->
    val inputRef = useRef<HTMLInputElement>()

    useImperativeHandle(forwardedRef, inputRef) {
        object : Focusable {
            override fun focus() {
                inputRef.current?.focus()
            }
        }
    }

    input.create {
        ref = inputRef
    }
}

val ForwardingRefsApp = FC<Props> {
    val fancyInputRef = useRef<Focusable>()

    useEffectOnce {
        fancyInputRef.current?.focus()
    }

    FancyInput {
        ref = fancyInputRef
    }
}
