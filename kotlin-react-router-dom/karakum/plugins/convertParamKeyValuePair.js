const ts = require("typescript");

module.exports = function (node) {
    if (
        ts.isTypeAliasDeclaration(node)
        && node.name.text === "ParamKeyValuePair"
    ) {
        return `typealias ParamKeyValuePair = JsTuple2<String, String>`
    }
    return null
}
