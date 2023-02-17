const ts = require("typescript");
const karakum = require("karakum");

const propsWithRef = {
    "LinkProps": "HTMLAnchorElement",
    "NavLinkProps": "HTMLAnchorElement",
    "FormProps": "HTMLFormElement",
}

const overriddenProps = {
    "LinkProps": {
        "href": "String",
    },
}

module.exports = function (node, context, render) {
    if (
        ts.isInterfaceDeclaration(node)
        && node.name.text.endsWith("Props")
    ) {
        const name = render(node.name)

        const heritageClauses = node.heritageClauses
            ?.map(heritageClause => render(heritageClause))
            ?.join(", ")

        let members = node.members
            .map(member => render(member))
            .join("\n")

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

        }

        if (name in propsWithRef) {
            parentType = `${parentType}, react.PropsWithRef<${propsWithRef[name]}>`
        }

        if (name in overriddenProps) {
            const additionalMembers = Object.entries(overriddenProps[name])
                .flatMap(([memberName, parentType]) => [
                    `@Deprecated(message = "don't use ${memberName}", level = DeprecationLevel.HIDDEN)`,
                    `override var ${memberName}: ${parentType}?`,
                ])
                .join("\n")

            members = `${members}\n${additionalMembers}`
        }

        return `
external interface ${name} : ${parentType}${karakum.ifPresent(heritageClauses, it => `, ${it}`)} {
${members}
}
        `
    }
    return null
}
