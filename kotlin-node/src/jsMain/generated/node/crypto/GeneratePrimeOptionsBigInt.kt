package node.crypto


sealed external interface GeneratePrimeOptionsBigInt : GeneratePrimeOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
