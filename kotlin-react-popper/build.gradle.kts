plugins {
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(projects.kotlinPopper)
    jsMainApi(projects.kotlinReactCore)

    jsMainApi(npmv("react-popper"))
}
