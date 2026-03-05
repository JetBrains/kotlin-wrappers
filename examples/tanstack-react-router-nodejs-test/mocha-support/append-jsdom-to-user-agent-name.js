Object.defineProperty(globalThis.navigator, "userAgent", {
    value: (globalThis.navigator?.userAgent ?? "Node.js") + " jsdom",
    configurable: true
});
