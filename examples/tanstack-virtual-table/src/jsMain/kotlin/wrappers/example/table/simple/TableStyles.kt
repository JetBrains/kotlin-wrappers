package wrappers.example.table.simple

import react.FC
import react.PropsWithValue
import react.dom.html.ReactHTML
import react.useInsertionEffect
import react.useRef
import web.html.HTMLStyleElement

internal const val CONTAINER_CLASS_NAME = "table-body-container"
internal val ROW_CLASS_NAME: (String) -> String = { id -> "row-$id" }

internal val TableStyles: FC<PropsWithValue<String>> = FC { props ->
    val styleRef = useRef<HTMLStyleElement>()
    val styles = props.value

    useInsertionEffect(styles, styleRef) {
        val container = styleRef.current
            ?: return@useInsertionEffect

        container.innerHTML = styles
    }

    ReactHTML.style {
        ref = styleRef
    }
}
