package react

import js.objects.unsafeJso
import react.jsx.runtime.jsx
import react.jsx.runtime.raw.jsxsRaw

inline fun <P : Props> ElementType<P>.create(): ReactElement<P> =
    jsx(this)

fun <P : Props> ElementType<P>.create(
    block: @ReactDsl P.() -> Unit,
): ReactElement<P> =
    jsxsRaw(
        type = this,
        props = unsafeJso(block),
    )
