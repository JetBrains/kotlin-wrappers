package react

import js.objects.unsafeJso
import react.jsx.runtime.jsx
import react.jsx.runtime.jsxs

fun <P : Props> ElementType<P>.create(): ReactElement<P> =
    jsx(this, unsafeJso())

fun <P : Props> ElementType<P>.create(
    block: @ReactDsl P.() -> Unit,
): ReactElement<P> =
    jsxs(
        type = this,
        props = unsafeJso(block),
    )
