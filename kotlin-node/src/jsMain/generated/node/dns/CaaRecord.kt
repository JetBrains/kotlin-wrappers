package node.dns


sealed external interface CaaRecord {
    var critical: Double
    var issue: String?
    var issuewild: String?
    var iodef: String?
    var contactemail: String?
    var contactphone: String?
}
