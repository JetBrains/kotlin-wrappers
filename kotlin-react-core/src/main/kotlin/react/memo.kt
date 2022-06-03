@file:JsModule("react")
@file:JsNonModule

package react

// Memo (16.6+)
external fun <P : Props> memo(
    type: ComponentType<P>,
    propsAreEqual: (P, P) -> Boolean = definedExternally,
): FC<P>
