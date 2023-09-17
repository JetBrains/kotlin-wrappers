package node.crypto


sealed external interface ScryptOptions {
    var cost: Double?
    var blockSize: Double?
    var parallelization: Double?
    var N: Double?
    var r: Double?
    var p: Double?
    var maxmem: Double?
}
