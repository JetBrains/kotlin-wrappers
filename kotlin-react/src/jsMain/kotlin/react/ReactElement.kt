@file:JsModule("react")

package react

sealed external interface ReactElement<P : Props> :
    ReactNode {
    val type: ElementType<P>
    val props: P
    val key: Key?
}
