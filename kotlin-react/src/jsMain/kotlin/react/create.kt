package react

import js.objects.unsafeJso
import react.jsx.runtime.raw.jsxRaw
import react.jsx.runtime.raw.jsxsRaw

fun <P : Props> ElementType<P>.create(): ReactElement<P> =
    jsxRaw(this, unsafeJso())

fun <P : Props> ElementType<P>.create(
    block: @ReactDsl P.() -> Unit,
): ReactElement<P> =
    jsxsRaw(
        type = this,
        props = unsafeJso(block),
    )
