package electron


external interface AuthInfo {
    var isProxy: Boolean
    var scheme: String
    var host: String
    var port: Double
    var realm: String
}
