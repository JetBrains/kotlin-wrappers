@file:JsModule("react")
@file:JsNonModule

package react

// Memo (16.6+)
external fun <P : Props> memo(
    fc: FC<P>,
    areEqual: (P, P) -> Boolean = definedExternally,
): FC<P>
