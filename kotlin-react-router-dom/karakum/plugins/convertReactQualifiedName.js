const ts = require("typescript");

function convertReactDomQualifiedName(node, context, render) {
    if (
        ts.isIdentifier(node)
        && (
            node.text === "AnchorHTMLAttributes"
            || node.text === "FormHTMLAttributes"
        )
    ) {
        return `react.dom.html.${render(node)}`
    }

    if (
        ts.isIdentifier(node)
        && (
            node.text === "FormEventHandler"
            || node.text === "MouseEvent"
        )
    ) {
        return `react.dom.events.${render(node)}`
    }

    return null
}

module.exports = function (node, context, render) {
    if (
        ts.isQualifiedName(node)
        && ts.isIdentifier(node.left)
        && node.left.text === "React"
    ) {
        const result = convertReactDomQualifiedName(node.right, context, render)
        if (result !== null) return result

        return `react.${render(node.right)}`
    }

    if (
        ts.isPropertyAccessExpression(node)
        && ts.isIdentifier(node.expression)
        && node.expression.text === "React"
    ) {
        const result = convertReactDomQualifiedName(node.name, context, render)
        if (result !== null) return result

        return `react.${render(node.name)}`
    }

    return null
}
