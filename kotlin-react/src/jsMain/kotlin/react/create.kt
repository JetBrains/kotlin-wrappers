package react

import js.objects.unsafeJso
import react.jsx.runtime.jsx

inline fun <P : Props> ElementType<P>.create(): ReactElement<P> =
    jsx(this)

fun <P : Props> ElementType<P>.create(
    block: @ReactDsl P.() -> Unit,
): ReactElement<P> =
    jsx(
        type = this,
        props = unsafeJso(block),
    )
