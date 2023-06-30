package electron.core


external interface MessageEvent {
    var data: Any?
    var ports: js.core.ReadonlyArray<MessagePortMain>
}
