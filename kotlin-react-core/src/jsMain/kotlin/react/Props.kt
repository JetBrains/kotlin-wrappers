@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
)

package react

import js.objects.Object

@JsExternalInheritorsOnly
external interface Props {
    var key: Key?

    inline operator fun Props?.unaryPlus() {
        Object.assign(this@Props, this)
    }
}
