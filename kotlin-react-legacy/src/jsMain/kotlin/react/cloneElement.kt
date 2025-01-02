@file:JsModule("react")

package react

external fun <P : Props> cloneElement(
    element: ReactElement<P>,
    props: P? = definedExternally,
    vararg children: ReactNode?,
): ReactElement<P>
