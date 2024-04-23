# Common

1.
    - Q: Why should I avoid `unsafeCast/asDynamic` when working with Wrappers?
    - A: Some types instances cannot be created by constructor invocation or interface implementation. For such types,
      we provide a strict factory function.
      Example: `ClassName`. If there is no strict factory function for a type of this kind, please, create an issue.
      Otherwise, when you use `unsafeCast/asDynamic`, the type can be incorrect when a library updates.
2.
    - Q: `sealed external interface`. What is it?
    - A:  In most cases, it’s for `JavaScript Object` (EventInit, Options, Props). `JSO` deviates from other things in
      the absence of methods
3.
    - Q: How to create `JSO` instances?
    - A: `const jsObject = { key: 'value'}` === `val jsObject = jso { key: "value" }`

# React

1.
    - Q: How to add data attribute to HTMLElement’s properties?
    -
        1. If the attribute is not specific to the HTMLElement - common for every HTMLElement, need to create an
           extension function (e.g., `HTMLAttributes.dataAttribute`)
        2. Otherwise, use Element’s props interface as a receiver (opaque interface, union interfaces, e.g.,
           InputHTMLAttributes - `InputHTMLAttributes.dataAttribute`)
