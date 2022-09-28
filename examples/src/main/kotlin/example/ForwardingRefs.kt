package example

import dom.html.HTMLElement
import dom.html.HTMLInputElement
import react.*
import react.dom.html.ReactHTML.input

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

typealias FancyInputProps = PropsWithRef<Focusable>

val FancyInput = ForwardRef<Focusable, FancyInputProps> { _, forwardedRef ->
    val inputRef = useRef<HTMLInputElement>()

    useImperativeHandle(forwardedRef, inputRef) {
        inputRef.current?.let(::SimpleFocusable)
    }

    input.create {
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
