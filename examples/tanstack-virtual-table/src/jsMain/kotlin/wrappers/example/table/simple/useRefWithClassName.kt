package wrappers.example.table.simple

import react.RefObject
import react.useEffectOnce
import react.useRef
import web.html.HTMLElement

internal fun useRefWithClassName(
    name: String,
): RefObject<HTMLElement> {
    val ref = useRef<HTMLElement>()

    useEffectOnce {
        val container = ref.current
            ?: return@useEffectOnce

        container.className = name
    }

    return ref
}
