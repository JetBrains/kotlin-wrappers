import ts from "typescript";

export default function (node, context, render) {
    if (
        node.parent
        && ts.isPropertySignature(node.parent)

        && ts.isIdentifier(node.parent.name)
        && node.parent.name.text === "encType"
        && node === node.parent.type
    ) {
        return "web.form.FormEncType"
    }

    return null
}
