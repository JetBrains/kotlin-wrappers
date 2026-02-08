// Automatically generated - do not modify!

package electron.core

sealed external interface JumpListItemType {
    companion object
}

inline val JumpListItemType.Companion.task: JumpListItemType
    get() = js.reflect.unsafeCast("task")

inline val JumpListItemType.Companion.separator: JumpListItemType
    get() = js.reflect.unsafeCast("separator")

inline val JumpListItemType.Companion.file: JumpListItemType
    get() = js.reflect.unsafeCast("file")
