const ts = require("typescript");
const karakum = require("karakum");

module.exports = function (node, context, render) {
    if (
        ts.isInterfaceDeclaration(node)
        && node.name.text.endsWith("Props")
    ) {
        const name = render(node.name)

        const heritageClauses = node.heritageClauses
            ?.map(heritageClause => render(heritageClause))
            ?.join(", ")

        const members = node.members
            .map(member => render(member))
            .join("\n")

        return `
external interface ${name} : react.Props${karakum.ifPresent(heritageClauses, it => `, ${it}`)} {
${members}
}
        `
    }
    return null
}
