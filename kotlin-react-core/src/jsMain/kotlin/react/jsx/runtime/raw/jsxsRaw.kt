@file:JsModule("react/jsx-runtime")

package react.jsx.runtime.raw

import react.ElementType
import react.Key
import react.Props
import react.ReactElement

/**
 * [Online Documentation](https://react.dev/reference/react)
 */
@JsName("jsxs")
external fun <P : Props> jsxsRaw(
    type: ElementType<P>,
    props: P,
    key: Key? = definedExternally,
): ReactElement<P>
