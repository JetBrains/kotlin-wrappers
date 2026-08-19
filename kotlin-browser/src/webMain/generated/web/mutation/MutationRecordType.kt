// Automatically generated - do not modify!

package web.mutation

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/type)
 */
@JsUnion
sealed /* union */
external interface MutationRecordType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/type#attributes)
 */
inline val MutationRecordType.Companion.attributes: MutationRecordType
    get() = unsafeCast("attributes")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/type#characterData)
 */
inline val MutationRecordType.Companion.characterData: MutationRecordType
    get() = unsafeCast("characterData")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/type#childList)
 */
inline val MutationRecordType.Companion.childList: MutationRecordType
    get() = unsafeCast("childList")
