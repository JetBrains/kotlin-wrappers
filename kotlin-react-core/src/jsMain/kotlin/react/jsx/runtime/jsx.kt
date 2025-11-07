package react.jsx.runtime

import js.objects.unsafeJso
import react.ElementType
import react.Props
import react.ReactElement
import react.jsx.runtime.raw.jsxRaw

fun <P : Props> jsx(
    type: ElementType<P>,
): ReactElement<P> =
    jsxRaw(
        type = type,
        props = unsafeJso(),
    )
