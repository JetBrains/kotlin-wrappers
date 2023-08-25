package node.dgram


sealed external interface BindOptions {
    var port: Double?
    var address: String?
    var exclusive: Boolean?
    var fd: Double?
}
