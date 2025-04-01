import ts from "typescript";

function isConflictingOverload(node) {
    return ts.isIdentifier(node.name) && (
        (
            node.name.text === "applyCodeActionCommand"

            && (
                (
                    node.parameters[0]
                    && ts.isUnionTypeNode(node.parameters[0].type)
                )
                || (
                    node.parameters[1]
                    && ts.isUnionTypeNode(node.parameters[1].type)
                )
            )
        )
    )
}

export default function (node, context, render) {
    if (
        ts.isMethodSignature(node)
        && isConflictingOverload(node)
    ) {
        return ""
    }

    if (
        ts.isCallSignatureDeclaration(node)
        && node.parent
        && ts.isInterfaceDeclaration(node.parent)
        && node.parent.name.text === "NodesVisitor"

        && node.typeParameters
        && node.typeParameters.length === 3
    ) {
        return ""
    }

    if (
        ts.isFunctionDeclaration(node)
        && node.name
        && node.name.text === "visitNodes"

        && node.typeParameters
        && node.typeParameters.length === 3
    ) {
        return ""
    }

    return null
}
