plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinPopperjsCore)
    jsMainApi(projects.kotlinReactCore)

    jsMainApi(npmv("react-popper"))
}
