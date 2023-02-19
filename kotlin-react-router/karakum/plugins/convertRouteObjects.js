const ts = require("typescript");
const karakum = require("karakum");

module.exports = function (node, context, render) {
    if (
        ts.isInterfaceDeclaration(node)
        && node.name.text.endsWith("RouteObject")
    ) {
        const name = render(node.name)

        const heritageClauses = node.heritageClauses
            ?.map(heritageClause => render(heritageClause))
            ?.join(", ")

        let members = node.members
            .map(member => render(member))
            .join("\n")

        const parentType = "RouteObject"

        return `
external interface ${name} : ${parentType}${karakum.ifPresent(heritageClauses, it => `, ${it}`)} {
${members}
}
        `
    }
    return null
}
