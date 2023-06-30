package electron


external interface MessageEvent {
    var data: Any?
    var ports: js.core.ReadonlyArray<MessagePortMain>
}
