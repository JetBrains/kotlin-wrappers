const ts = require("typescript");

module.exports = function (node) {
    if (
        ts.isTypeAliasDeclaration(node)
        && (
            // Recursive path parser
            node.name.text === "_PathParam"
            || node.name.text === "PathParam"
            || node.name.text === "ParamParseKey"
            // Union type for FetcherStates values
            || node.name.text === "Fetcher"
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
