package electron


external interface Event : GlobalEvent {
    // Docs: https://electronjs.org/docs/api/structures/event
    var preventDefault: (() -> Unit)
}
