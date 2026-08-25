// Automatically generated - do not modify!

package electron.core

@js.union.JsUnion
sealed external interface SessionFileSystemAccessRestrictedListenerCallbackAction

inline val SessionFileSystemAccessRestrictedListenerCallbackAction.Companion.allow: SessionFileSystemAccessRestrictedListenerCallbackAction
    get() = js.reflect.unsafeCast("allow")

inline val SessionFileSystemAccessRestrictedListenerCallbackAction.Companion.deny: SessionFileSystemAccessRestrictedListenerCallbackAction
    get() = js.reflect.unsafeCast("deny")

inline val SessionFileSystemAccessRestrictedListenerCallbackAction.Companion.tryAgain: SessionFileSystemAccessRestrictedListenerCallbackAction
    get() = js.reflect.unsafeCast("tryAgain")
