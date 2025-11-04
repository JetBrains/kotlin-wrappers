@file:JsModule("react/jsx-runtime")

package react.jsx.runtime

import react.ElementType
import react.Key
import react.Props
import react.ReactElement

/**
 * [Online Documentation](https://react.dev/reference/react)
 */
external fun <P : Props> jsx(
    type: ElementType<P>,
    props: P,
    key: Key? = definedExternally,
): ReactElement<P>
