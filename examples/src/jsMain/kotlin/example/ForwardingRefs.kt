package example

import react.*
import react.dom.html.ReactHTML.input
import web.html.HTMLElement
import web.html.HTMLInputElement

external interface Focusable {
    fun focus()
}

private class SimpleFocusable(
    private val element: HTMLElement,
) : Focusable {
    override fun focus() {
        element.focus()
    }
}

external interface FancyInputProps : PropsWithRef<Focusable>

val FancyInput = ForwardRef<_, FancyInputProps> { props ->
    val inputRef = useRef<HTMLInputElement>()

    useImperativeHandle(props.ref, inputRef) {
        inputRef.current?.let(::SimpleFocusable)
    }

    input {
        ref = inputRef
    }
}

val ForwardingRefsApp = VFC {
    val fancyInputRef = useRef<Focusable>()

    useEffectOnce {
        fancyInputRef.current?.focus()
    }

    FancyInput {
        ref = fancyInputRef
    }
}
