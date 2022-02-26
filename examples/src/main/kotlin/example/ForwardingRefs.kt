package example

import kotlinx.js.jso
import org.w3c.dom.HTMLInputElement
import react.*
import react.dom.html.ReactHTML.input

external interface Focusable {
    var focus: () -> Unit
}

typealias FancyInputProps = PropsWithRef<Focusable>

val FancyInput = rawForwardRef<Focusable, FancyInputProps> { _, forwardedRef ->
    val inputRef = useRef<HTMLInputElement>()

    useImperativeHandle(forwardedRef, inputRef) {
        jso {
            focus = {
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
        fancyInputRef.current?.focus?.invoke()
    }

    FancyInput {
        ref = fancyInputRef
    }
}
