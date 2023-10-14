package node.readline


sealed external interface Key {
    var sequence: String?
    var name: String?
    var ctrl: Boolean?
    var meta: Boolean?
    var shift: Boolean?
}
