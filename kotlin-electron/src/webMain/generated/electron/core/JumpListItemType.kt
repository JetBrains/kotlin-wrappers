// Automatically generated - do not modify!

package electron.core

@js.union.JsUnion
sealed external interface JumpListItemType

inline val JumpListItemType.Companion.task: JumpListItemType
    get() = js.reflect.unsafeCast("task")

inline val JumpListItemType.Companion.separator: JumpListItemType
    get() = js.reflect.unsafeCast("separator")

inline val JumpListItemType.Companion.file: JumpListItemType
    get() = js.reflect.unsafeCast("file")
