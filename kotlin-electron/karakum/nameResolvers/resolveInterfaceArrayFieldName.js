import ts from "typescript";
import * as karakum from "karakum";

const propertyNames = {
    modifiers: "modifier",
    properties: "property",
    mediaTypes: "mediaType",
    protectedClasses: "protectedClass",
    types: "type",
    storages: "storage",
    quotas: "quota",
}

export default (node) => {
    if (
        node.parent
        && ts.isTypeReferenceNode(node.parent)
        && ts.isIdentifier(node.parent.typeName)
        && node.parent.typeName.text === "Array"

        && node.parent.parent
        && ts.isPropertySignature(node.parent.parent)
        && ts.isIdentifier(node.parent.parent.name)
        &&  node.parent.parent.name.text in propertyNames

        && node.parent.parent.parent
        && ts.isInterfaceDeclaration(node.parent.parent.parent)
        && node.parent.parent.parent.name !== undefined
    ) {
        const propertyName = node.parent.parent.name.text
        const parentName = node.parent.parent.parent.name.text

        return `${karakum.capitalize(parentName)}${karakum.capitalize(propertyNames[propertyName])}`
    }

    return null
}
