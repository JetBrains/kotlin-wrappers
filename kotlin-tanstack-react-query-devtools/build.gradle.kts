plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinReactCore)

    jsMainApi(npmv("@tanstack/react-query-devtools"))
}
