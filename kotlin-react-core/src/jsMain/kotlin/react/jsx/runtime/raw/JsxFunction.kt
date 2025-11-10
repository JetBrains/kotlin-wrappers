package react.jsx.runtime.raw

import react.ElementType
import react.Key
import react.Props
import react.ReactElement

@JsExternalInheritorsOnly
internal external interface JsxFunction {
    operator fun <P : Props> invoke(
        type: ElementType<P>,
        props: P,
        key: Key? = definedExternally,
    ): ReactElement<P>
}
