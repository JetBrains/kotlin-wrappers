const ts = require("typescript");

module.exports = function (node) {
    if (
        ts.isTypeAliasDeclaration(node)
        && (
            node.name.text === "_PathParam"
            || node.name.text === "PathParam"
            || node.name.text === "ParamParseKey"
        )
    ) {
        return ""
    }
    if (
        ts.isInterfaceDeclaration(node)
        && node.name.text === "TrackedPromise"
    ) {
        return ""
    }
    return null
}
