@file:JsModule("react")
@file:JsNonModule

package react

external interface ReactElement : ReactNode {
    val props: Props
}

external fun <P : Props> createElement(
    type: String,
    props: P = definedExternally,
    vararg child: Any?,
): ReactElement

external fun <P : Props> createElement(
    type: ElementType<P>,
    props: P = definedExternally,
    vararg child: Any?,
): ReactElement

external fun <P : Props> cloneElement(
    element: ReactElement,
    props: P = definedExternally,
    vararg child: Any?,
): ReactElement

external fun cloneElement(
    element: dynamic,
    props: dynamic = definedExternally,
    vararg child: Any?,
): ReactElement

external fun isValidElement(
    element: Any,
): Boolean
