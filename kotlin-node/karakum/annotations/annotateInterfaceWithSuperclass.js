import ts from "typescript"

const interfacesWithSuperclass = [
    "CipherCCM",
    "CipherGCM",
    "CipherOCB",
    "DecipherCCM",
    "DecipherGCM",
    "DecipherOCB",
]

export default (node) => {
    if (
        ts.isInterfaceDeclaration(node)
        && interfacesWithSuperclass.some(name => node.name.text === name)
    ) {
        return `@Suppress("INTERFACE_WITH_SUPERCLASS")`
    }

    return null
}
