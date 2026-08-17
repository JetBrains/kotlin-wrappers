// Automatically generated - do not modify!

package js.decorators

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface DecoratorContextKind {
    sealed interface `class` : DecoratorContextKind
    sealed interface method : DecoratorContextKind
    sealed interface getter : DecoratorContextKind
    sealed interface setter : DecoratorContextKind
    sealed interface accessor : DecoratorContextKind
    sealed interface field : DecoratorContextKind
}

inline val DecoratorContextKind.Companion.`class`: DecoratorContextKind.`class`
    get() = unsafeCast("class")

inline val DecoratorContextKind.Companion.method: DecoratorContextKind.method
    get() = unsafeCast("method")

inline val DecoratorContextKind.Companion.getter: DecoratorContextKind.getter
    get() = unsafeCast("getter")

inline val DecoratorContextKind.Companion.setter: DecoratorContextKind.setter
    get() = unsafeCast("setter")

inline val DecoratorContextKind.Companion.accessor: DecoratorContextKind.accessor
    get() = unsafeCast("accessor")

inline val DecoratorContextKind.Companion.field: DecoratorContextKind.field
    get() = unsafeCast("field")
