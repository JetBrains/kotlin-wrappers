// Generated by Karakum - do not modify it manually!

package node.diagnosticsChannel

sealed external interface TracingChannelSubscribersAsyncStartMessage<ContextType : Any> {
    var error: Any?
    var result: Any?

    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
        "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
        "DECLARATION_CANT_BE_INLINED"
    )
    inline val contextType: ContextType
        get() = unsafeCast<ContextType>()
}
