import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default (node) => {
    if (
        node.parent
        && ts.isTypeReferenceNode(node.parent)
        && ts.isIdentifier(node.parent.typeName)
        && node.parent.typeName.text === "Promise"

        && node.parent.parent
        && ts.isFunctionDeclaration(node.parent.parent)
        && ts.isIdentifier(node.parent.parent.name)
        && (node.parent.parent.type === node.parent)
    ) {
        const parentName = node.parent.parent.name.text

        return `${karakum.capitalize(parentName)}ResultPayload`
    }

    return null
}
