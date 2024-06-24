import ts from "typescript";
import * as karakum from "karakum";

export default (node) => {
    if (
        node.parent
        && ts.isTypePredicateNode(node.parent)

        && node.parent.parent
        && ts.isFunctionDeclaration(node.parent.parent)
        && ts.isIdentifier(node.parent.parent.name)
        && (node.parent.parent.type === node.parent)
    ) {
        const parentName = node.parent.parent.name.text

        return `${karakum.capitalize(parentName)}ResultPredicate`
    }

    return null
}
