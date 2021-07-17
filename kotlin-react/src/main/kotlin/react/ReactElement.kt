@file:JsModule("react")
@file:JsNonModule

package react

external interface ReactElement : ReactNode {
    val props: RProps
}

external fun <P : RProps> createElement(
    type: String,
    props: P = definedExternally,
    vararg child: Any?,
): ReactElement

external fun <P : RProps> createElement(
    type: ComponentType<P>,
    props: P = definedExternally,
    vararg child: Any?,
): ReactElement

external fun <P : RProps> cloneElement(
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
