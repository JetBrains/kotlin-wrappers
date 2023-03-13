const ts = require("typescript");
const karakum = require("karakum");

module.exports = function (node, context, render) {
    if (
        ts.isInterfaceDeclaration(node)
        && node.name.text.endsWith("Props")
    ) {
        const inheritanceModifierService = context.lookupService(karakum.inheritanceModifierServiceKey)

        const name = render(node.name)

        const inheritanceModifier = inheritanceModifierService?.resolveInheritanceModifier(node, context)

        const heritageClauses = node.heritageClauses
            ?.map(heritageClause => render(heritageClause))
            ?.join(", ")

        let members

        let parentType = "react.Props"

        if (node.members.some(member => (
            ts.isIdentifier(member.name)
            && member.name.text === "children"

            && member.type
            && ts.isTypeReferenceNode(member.type)
            && ts.isQualifiedName(member.type.typeName)
            && ts.isIdentifier(member.type.typeName.left)
            && member.type.typeName.left.text === "React"
            && member.type.typeName.right.text === "ReactNode"
        ))) {
            members = node.members
                .filter(member => !(
                    ts.isIdentifier(member.name)
                    && member.name.text === "children"
                ))
                .map(member => render(member))
                .join("\n")

            parentType = "react.PropsWithChildren"
        } else {
            members = node.members
                .map(member => render(member))
                .join("\n")
        }

        return `
${karakum.ifPresent(inheritanceModifier, it => `${it} `)}external interface ${name} : ${parentType}${karakum.ifPresent(heritageClauses, it => `, ${it}`)} {
${members}
}
        `
    }
    return null
}
